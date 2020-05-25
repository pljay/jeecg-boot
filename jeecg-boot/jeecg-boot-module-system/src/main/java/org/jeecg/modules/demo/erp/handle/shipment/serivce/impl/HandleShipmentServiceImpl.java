package org.jeecg.modules.demo.erp.handle.shipment.serivce.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.constant.FreightBillConstant;
import org.jeecg.common.entity.HkdBootConstant;
import org.jeecg.common.exception.JeecgBootException;
import org.jeecg.modules.demo.erp.entity.*;
import org.jeecg.modules.demo.erp.handle.shipment.serivce.HandleShipmentService;
import org.jeecg.modules.demo.erp.handle.supplier.service.HandleSupplierService;
import org.jeecg.modules.demo.erp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author PLJay
 * @date 2020年4月30日
 * @apiNote 实现HandleShipmentService
 */

@Slf4j
@Service
public class HandleShipmentServiceImpl implements HandleShipmentService {

    @Autowired(required = false)
    private Map<String,HandleSupplierService>  handleSupplierServiceMap;
    @Autowired
    private IErpShipmentService iErpShipmentService;
    @Autowired
    private IErpUserChannelService iErpUserChannelService;
    @Autowired
    private IErpShipmentParcelService iErpShipmentParcelService;
    @Autowired
    private IErpChannelService iErpChannelService;
    @Autowired
    private IErpSupplierService iErpSupplierService;
    @Autowired
    private IErpPartitionAreaService iErpPartitionAreaService;
    @Autowired
    private IErpPostcodeService erpPostcodeService;
    @Autowired
    private IErpFreightCostService iErpFreightCostService;
    @Autowired
    private IErpFreightCostSetService iErpFreightCostSetService;
    @Autowired
    private IErpFreightQuoteService iErpFreightQuoteService;
    @Autowired
    private IErpFreightQuoteSetService iErpFreightQuoteSetService;
    @Autowired
    private IErpFreightService iErpFreightService;

    @Override
    public Result<?> syncPush(String id)  {
        HandleSupplierService supplierApiService = this.getSupplierApiService(id);
        return supplierApiService.push(id);
    }

    @Override
    public void push(String id) {
        HandleSupplierService supplierApiService = this.getSupplierApiService(id);
        supplierApiService.push(id);
    }

    @Override
    public void calculateFreight(String id) {
        ErpFreight erpFreight = new ErpFreight();
        erpFreight.setShipmentId(id);
        ErpShipment shipment = this.iErpShipmentService.getById(id);
        ErpUserChannel userChannel = this.iErpUserChannelService.getById(shipment.getServiceId());
        ErpChannel channel = this.iErpChannelService.getById(userChannel.getChannelId());
        //获取邮编对应分区
        ErpPartitionArea erpPartitionArea;
        //第一步获取地址对应id
        QueryWrapper <ErpPostcode> objectQueryWrapper = new QueryWrapper <>();
        objectQueryWrapper.eq("postcode",shipment.getConsigneePostcode());
        objectQueryWrapper.eq("country",shipment.getConsigneeCountry());
        objectQueryWrapper.eq("city",shipment.getConsigneeCity());
        List <ErpPostcode> list = this.erpPostcodeService.list(objectQueryWrapper);
        if(!CollectionUtils.isEmpty(list)){
            ErpPostcode postcode = list.get(0);
            //分区配置id
            String partitionId = channel.getPartitionId();
            QueryWrapper <ErpPartitionArea> queryWrapper = new QueryWrapper <>();
            queryWrapper.eq("partition_id",partitionId);
            queryWrapper.eq("postcode_id",postcode.getId());
            List <ErpPartitionArea> areas = this.iErpPartitionAreaService.list(queryWrapper);
            if(!CollectionUtils.isEmpty(areas)){
                erpPartitionArea = areas.get(0);
            }else {
                throw  new JeecgBootException("验证分区失败");
            }
        }else {
            throw  new JeecgBootException("地址邮编校验失败，请确认国家城市邮编是否正确！");
        }
        String partitionSetId = erpPartitionArea.getPartitionSetId();
        //成本id
        String freightCostId = userChannel.getFreightCostId();
        //报价id
        String freightQuoteId = userChannel.getFreightQuoteId();
        AsyncResult <BigDecimal> asyncCost = this.calculateCost(shipment, freightCostId, partitionSetId);
        AsyncResult <BigDecimal> asyncQuote = this.calculateQuote(shipment, freightQuoteId, partitionSetId);
        //等待异步线程执行完成
        while(true) {
            if(asyncCost.isDone()&&asyncQuote.isDone()){
                try {
                    BigDecimal cost = asyncCost.get();
                    BigDecimal quote = asyncQuote.get();
                    erpFreight.setCostAmount(cost);
                    erpFreight.setQuoteAmount(quote);
                } catch (ExecutionException e) {
                    throw new JeecgBootException(e.getMessage());
                }
                break;
            }
        }
        this.iErpFreightService.save(erpFreight);
    }

    @Override
    public Result <?> submit(String id) {
        HandleSupplierService supplierApiService = this.getSupplierApiService(id);
        return (Result <?>) supplierApiService.submit(id);
    }

    @Override
    public Result <?> delete(String id) {
        HandleSupplierService supplierApiService = this.getSupplierApiService(id);
        return (Result <?>) supplierApiService.delete(id);
    }

    @Override
    public Result <?> track(String id) {
        HandleSupplierService supplierApiService = this.getSupplierApiService(id);
        return (Result <?>) supplierApiService.track(id);
    }

    @Override
    public Result <?> label(String id) {
        return null;
    }

    /**
     * 成本计算
     * @param shipment 订单主体
     * @param freightCostId 成本id
     * @param partitionSetId 分区id
     * @return
     */
    @Async(HkdBootConstant.ASYNC_POOL)
    AsyncResult<BigDecimal> calculateCost(ErpShipment shipment, String freightCostId, String partitionSetId){
        BigDecimal costAmount=new BigDecimal("0");
        ErpFreightCost erpFreightCost = this.iErpFreightCostService.getById(freightCostId);
        Integer billType = erpFreightCost.getBillType();
        //判断是否按箱数计算
        if(billType.equals(FreightBillConstant.BILL_TYPE_BOX)){
            List <ErpShipmentParcel> erpShipmentParcels = this.iErpShipmentParcelService.selectByMainId(shipment.getId());
            QueryWrapper <ErpFreightCostSet> wrapper = new QueryWrapper <>();
            wrapper.eq("freight_cost_id",freightCostId);
            wrapper.eq("param",erpShipmentParcels.size());
            wrapper.eq("partition_set_id",partitionSetId);
            List <ErpFreightCostSet> list = this.iErpFreightCostSetService.list(wrapper);
            if(!CollectionUtils.isEmpty(list)){
                ErpFreightCostSet erpFreightCostSet = list.get(0);
                costAmount=erpFreightCostSet.getValue();
            }else{
                log.error("成本表配置错误");
                throw new JeecgBootException("成本表配置错误");
            }
        }else if (billType.equals(FreightBillConstant.BILL_TYPE_WEIGHT)){
            List <ErpShipmentParcel> erpShipmentParcels = this.iErpShipmentParcelService.selectByMainId(shipment.getId());
            for (ErpShipmentParcel erpShipmentParcel :erpShipmentParcels
                 ) {
                QueryWrapper <ErpFreightCostSet> wrapper = new QueryWrapper <>();
                wrapper.eq("freight_cost_id",freightCostId);
                //实重--体积重 而这取最大
                wrapper.ge("param",(erpShipmentParcel.getWeight().compareTo(erpShipmentParcel.getVolumeWeight())>=0)?erpShipmentParcel.getWeight():erpShipmentParcel.getVolumeWeight());
                wrapper.orderByAsc("param");
                List <ErpFreightCostSet> list = this.iErpFreightCostSetService.list(wrapper);
                if(!CollectionUtils.isEmpty(list)){
                    ErpFreightCostSet erpFreightCostSet = list.get(0);
                    costAmount=costAmount.add(erpFreightCostSet.getValue());
                }else{
                    log.error("成本表配置错误");
                    throw new JeecgBootException("成本表配置错误");
                }
            }
        }
        return new AsyncResult <>(costAmount);
    }

    /**
     * 成本计算
     * @param shipment 订单主体
     * @param freightQuoteId 成本id
     * @param partitionSetId 分区id
     * @return
     */
    @Async(HkdBootConstant.ASYNC_POOL)
    AsyncResult<BigDecimal> calculateQuote(ErpShipment shipment, String freightQuoteId, String partitionSetId){
        BigDecimal costAmount=new BigDecimal("0");
        ErpFreightQuote erpFreightQuote = this.iErpFreightQuoteService.getById(freightQuoteId);
        Integer billType = erpFreightQuote.getBillType();
        //判断是否按箱数计算
        if(billType.equals(FreightBillConstant.BILL_TYPE_BOX)){
            List <ErpShipmentParcel> erpShipmentParcels = this.iErpShipmentParcelService.selectByMainId(shipment.getId());
            QueryWrapper <ErpFreightQuoteSet> wrapper = new QueryWrapper <>();
            wrapper.eq("freight_quote_id",freightQuoteId);
            wrapper.eq("param",erpShipmentParcels.size());
            wrapper.eq("partition_set_id",partitionSetId);
            List <ErpFreightQuoteSet> list = this.iErpFreightQuoteSetService.list(wrapper);
            if(!CollectionUtils.isEmpty(list)){
                ErpFreightQuoteSet erpFreightQuoteSet = list.get(0);
                costAmount=erpFreightQuoteSet.getValue();
            }else{
                log.error("成本表配置错误");
                throw new JeecgBootException("成本表配置错误");
            }
        }else if (billType.equals(FreightBillConstant.BILL_TYPE_WEIGHT)){
            List <ErpShipmentParcel> erpShipmentParcels = this.iErpShipmentParcelService.selectByMainId(shipment.getId());
            for (ErpShipmentParcel erpShipmentParcel :erpShipmentParcels
            ) {
                QueryWrapper <ErpFreightQuoteSet> wrapper = new QueryWrapper <>();
                wrapper.eq("freight_quote_id",freightQuoteId);
                //实重--体积重 而这取最大
                wrapper.ge("param",(erpShipmentParcel.getWeight().compareTo(erpShipmentParcel.getVolumeWeight())>=0)?erpShipmentParcel.getWeight():erpShipmentParcel.getVolumeWeight());
                //递增 取最小值
                wrapper.orderByAsc("param");
                List <ErpFreightQuoteSet> list = this.iErpFreightQuoteSetService.list(wrapper);
                if(!CollectionUtils.isEmpty(list)){
                    ErpFreightQuoteSet erpFreightQuoteSet = list.get(0);
                    costAmount=costAmount.add(erpFreightQuoteSet.getValue());
                }else{
                    log.error("成本表配置错误");
                    throw new JeecgBootException("成本表配置错误");
                }
            }
        }
        return new AsyncResult <>(costAmount);
    }

    /**
     * 按需注入对应供应商实现类
      * @param id
     * @return
     */
    private HandleSupplierService getSupplierApiService(String id){
        ErpShipment erpShipment = this.iErpShipmentService.getById(id);
        ErpUserChannel userChannel = this.iErpUserChannelService.getById(erpShipment.getServiceId());
        ErpChannel channel = this.iErpChannelService.getById(userChannel.getChannelId());
        ErpSupplier supplier = this.iErpSupplierService.getById(channel.getSupplierId());
        return this.handleSupplierServiceMap.get(supplier.getSupplierCode());
    }
}
