package org.jeecg.modules.demo.erp.service.impl;

import cn.hutool.core.convert.Convert;
import com.alibaba.fastjson.JSONObject;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.util.FillRuleUtil;
import org.jeecg.modules.demo.erp.entity.ErpShipment;
import org.jeecg.modules.demo.erp.entity.ErpShipmentParcel;
import org.jeecg.modules.demo.erp.entity.ErpShipmentProduct;
import org.jeecg.modules.demo.erp.mapper.ErpShipmentParcelMapper;
import org.jeecg.modules.demo.erp.mapper.ErpShipmentProductMapper;
import org.jeecg.modules.demo.erp.mapper.ErpShipmentMapper;
import org.jeecg.modules.demo.erp.service.IErpShipmentService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Collection;

/**
 * @Description: 订单表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
@Service
public class ErpShipmentServiceImpl extends ServiceImpl<ErpShipmentMapper, ErpShipment> implements IErpShipmentService {

	@Autowired
	private ErpShipmentMapper erpShipmentMapper;
	@Autowired
	private ErpShipmentParcelMapper erpShipmentParcelMapper;
	@Autowired
	private ErpShipmentProductMapper erpShipmentProductMapper;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveMain(ErpShipment erpShipment, List<ErpShipmentParcel> erpShipmentParcelList,List<ErpShipmentProduct> erpShipmentProductList) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("type","SP");
		// 通过反射执行配置的类里的方法
		erpShipment.setShipmentNo(Convert.toStr(FillRuleUtil.executeRule("erp_no", jsonObject)));
		erpShipmentMapper.insert(erpShipment);
		jsonObject.put("type","PC");
		if(erpShipmentParcelList!=null && erpShipmentParcelList.size()>0) {
			for(ErpShipmentParcel entity:erpShipmentParcelList) {
				//外键设置
				String parcelNo = Convert.toStr(FillRuleUtil.executeRule("erp_no", jsonObject));
				entity.setShipmentId(erpShipment.getId());
				entity.setParcelNo(parcelNo);
				erpShipmentParcelMapper.insert(entity);
			}
		}
		if(erpShipmentProductList!=null && erpShipmentProductList.size()>0) {
			for(ErpShipmentProduct entity:erpShipmentProductList) {
				//外键设置
				entity.setShipmentId(erpShipment.getId());
				erpShipmentProductMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional
	public void updateMain(ErpShipment erpShipment,List<ErpShipmentParcel> erpShipmentParcelList,List<ErpShipmentProduct> erpShipmentProductList) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("type","PC");
		erpShipmentMapper.updateById(erpShipment);
		//1.先删除子表数据
		erpShipmentParcelMapper.deleteByMainId(erpShipment.getId());
		erpShipmentProductMapper.deleteByMainId(erpShipment.getId());

		//2.子表数据重新插入
		if(erpShipmentParcelList!=null && erpShipmentParcelList.size()>0) {
			for(ErpShipmentParcel entity:erpShipmentParcelList) {
				//外键设置
				entity.setShipmentId(erpShipment.getId());
				String parcelNo = Convert.toStr(FillRuleUtil.executeRule("erp_no", jsonObject));
				entity.setShipmentId(erpShipment.getId());
				entity.setParcelNo(parcelNo);
				erpShipmentParcelMapper.insert(entity);
			}
		}
		if(erpShipmentProductList!=null && erpShipmentProductList.size()>0) {
			for(ErpShipmentProduct entity:erpShipmentProductList) {
				//外键设置
				entity.setShipmentId(erpShipment.getId());
				erpShipmentProductMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional
	public void delMain(String id) {
		erpShipmentParcelMapper.deleteByMainId(id);
		erpShipmentProductMapper.deleteByMainId(id);
		erpShipmentMapper.deleteById(id);
	}

	@Override
	@Transactional
	public void delBatchMain(Collection<? extends Serializable> idList) {
		for(Serializable id:idList) {
			erpShipmentParcelMapper.deleteByMainId(id.toString());
			erpShipmentProductMapper.deleteByMainId(id.toString());
			erpShipmentMapper.deleteById(id);
		}
	}


}
