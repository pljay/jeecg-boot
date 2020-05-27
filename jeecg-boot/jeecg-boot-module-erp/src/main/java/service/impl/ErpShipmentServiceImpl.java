package service.impl;

import entity.ErpShipment;
import mapper.ErpShipmentMapper;
import org.jeecg.modules.demo.shipmentTest.entity.ErpShipment;
import org.jeecg.modules.demo.shipmentTest.mapper.ErpShipmentMapper;
import org.jeecg.modules.demo.shipmentTest.service.IErpShipmentService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import service.IErpShipmentService;

/**
 * @Description: 运单表
 * @Author: jeecg-boot
 * @Date:   2020-05-26
 * @Version: V1.0
 */
@Service
public class ErpShipmentServiceImpl extends ServiceImpl<ErpShipmentMapper, ErpShipment> implements IErpShipmentService {

}
