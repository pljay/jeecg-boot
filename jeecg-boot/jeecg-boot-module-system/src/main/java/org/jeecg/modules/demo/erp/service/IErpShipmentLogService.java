package org.jeecg.modules.demo.erp.service;

import org.jeecg.common.entity.HkdBootConstant;
import org.jeecg.modules.demo.erp.entity.ErpShipmentLog;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.scheduling.annotation.Async;

/**
 * @Description: 订单日志表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
public interface IErpShipmentLogService extends IService<ErpShipmentLog> {
    /**
     * 订单日志
     * 异步执行
     * @param shipment_id
     * @param parcel_id
     * @param shipment_status
     * @param statusDes
     * @param cnContent
     * @param enContent
     */
    @Async(HkdBootConstant.ASYNC_POOL)
    void  createShipmentLog(String shipment_id, String shipment_status, String statusDes,String cnContent,String enContent);
}
