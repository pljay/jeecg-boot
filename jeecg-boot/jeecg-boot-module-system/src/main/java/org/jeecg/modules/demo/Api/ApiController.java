package org.jeecg.modules.demo.Api;

import cn.hutool.core.convert.Convert;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.aspect.annotation.AutoLog;
import org.jeecg.common.util.FillRuleUtil;
import org.jeecg.modules.demo.erp.entity.ErpShipment;
import org.jeecg.modules.demo.erp.handle.shipment.serivce.HandleShipmentService;
import org.jeecg.modules.demo.erp.service.*;
import org.jeecg.modules.demo.erp.vo.ErpShipmentPage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@Slf4j
@RequestMapping("/api/v1/shipment")
public class ApiController {

    @Autowired
    private IErpShipmentService erpShipmentService;
    @Autowired
    private IErpShipmentParcelService erpShipmentParcelService;
    @Autowired
    private IErpShipmentProductService erpShipmentProductService;
    @Autowired
    private IErpShipmentLogService erpShipmentLogService;
    @Autowired
    private IErpShipmentLabelService iErpShipmentLabelService;

    @Autowired
    private HandleShipmentService handleShipmentService;
    @Value(value = "${jeecg.path.upload}")
    private String uploadPath;

    /**
     *   添加
     *
     * @param erpShipmentPage
     * @return
     */
    @AutoLog(value = "api-创建订单")
    @ApiOperation(value="api-创建订单", notes="api-创建订单")
    @PostMapping(value = "/add")
    public Result<?> add(@RequestBody ErpShipmentPage erpShipmentPage) {
        ErpShipment erpShipment = new ErpShipment();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type","SP");
        // 通过反射执行配置的类里的方法
        String shipmentNo = Convert.toStr(FillRuleUtil.executeRule("erp_no", jsonObject));
        erpShipmentPage.setShipmentNo(shipmentNo);
        BeanUtils.copyProperties(erpShipmentPage, erpShipment);
        erpShipmentService.saveMain(erpShipment, erpShipmentPage.getErpShipmentParcelList(),erpShipmentPage.getErpShipmentProductList());
        return this.handleShipmentService.syncPush(erpShipment.getId());
    }
}
