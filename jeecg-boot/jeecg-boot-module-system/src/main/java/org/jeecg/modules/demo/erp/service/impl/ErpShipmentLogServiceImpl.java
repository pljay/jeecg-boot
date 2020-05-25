package org.jeecg.modules.demo.erp.service.impl;

import cn.hutool.core.date.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.jeecg.common.exception.JeecgBootException;
import org.jeecg.modules.demo.erp.entity.ErpShipmentLog;
import org.jeecg.modules.demo.erp.mapper.ErpShipmentLogMapper;
import org.jeecg.modules.demo.erp.service.IErpShipmentLogService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 订单日志表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
@Service
public class ErpShipmentLogServiceImpl extends ServiceImpl<ErpShipmentLogMapper, ErpShipmentLog> implements IErpShipmentLogService {

    @Override
    public void createShipmentLog(String shipment_id, String shipment_status, String statusDes, String cnContent, String enContent) {
        ErpShipmentLog erpShipmentLog = new ErpShipmentLog();
        if (!StringUtils.isEmpty(shipment_id)) {
            erpShipmentLog.setShipmentId(shipment_id);
        }else{
            throw  new JeecgBootException("shipment_id必填");
        }
        erpShipmentLog.setShipmentStatus(shipment_status);
        erpShipmentLog.setCnContent(cnContent);
        erpShipmentLog.setEnContent(enContent);
        erpShipmentLog.setStatusDes(statusDes);
        erpShipmentLog.setTime(DateUtil.date());
        this.save(erpShipmentLog);
    }
}
