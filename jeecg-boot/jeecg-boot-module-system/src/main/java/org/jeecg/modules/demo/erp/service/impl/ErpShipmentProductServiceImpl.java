package org.jeecg.modules.demo.erp.service.impl;

import org.jeecg.modules.demo.erp.entity.ErpShipmentProduct;
import org.jeecg.modules.demo.erp.mapper.ErpShipmentProductMapper;
import org.jeecg.modules.demo.erp.service.IErpShipmentProductService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 产品表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
@Service
public class ErpShipmentProductServiceImpl extends ServiceImpl<ErpShipmentProductMapper, ErpShipmentProduct> implements IErpShipmentProductService {
	
	@Autowired
	private ErpShipmentProductMapper erpShipmentProductMapper;
	
	@Override
	public List<ErpShipmentProduct> selectByMainId(String mainId) {
		return erpShipmentProductMapper.selectByMainId(mainId);
	}
}
