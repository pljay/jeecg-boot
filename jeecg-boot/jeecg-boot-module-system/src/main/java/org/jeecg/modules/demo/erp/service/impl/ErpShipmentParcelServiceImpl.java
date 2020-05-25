package org.jeecg.modules.demo.erp.service.impl;

import org.jeecg.modules.demo.erp.entity.ErpShipmentParcel;
import org.jeecg.modules.demo.erp.mapper.ErpShipmentParcelMapper;
import org.jeecg.modules.demo.erp.service.IErpShipmentParcelService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 包裹表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
@Service
public class ErpShipmentParcelServiceImpl extends ServiceImpl<ErpShipmentParcelMapper, ErpShipmentParcel> implements IErpShipmentParcelService {
	
	@Autowired
	private ErpShipmentParcelMapper erpShipmentParcelMapper;
	
	@Override
	public List<ErpShipmentParcel> selectByMainId(String mainId) {
		return erpShipmentParcelMapper.selectByMainId(mainId);
	}
}
