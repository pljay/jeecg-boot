package org.jeecg.modules.demo.erp.service.impl;

import org.jeecg.modules.demo.erp.entity.ErpFreightCost;
import org.jeecg.modules.demo.erp.entity.ErpFreightCostSet;
import org.jeecg.modules.demo.erp.mapper.ErpFreightCostSetMapper;
import org.jeecg.modules.demo.erp.mapper.ErpFreightCostMapper;
import org.jeecg.modules.demo.erp.service.IErpFreightCostService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Collection;

/**
 * @Description: 运费成本表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
@Service
public class ErpFreightCostServiceImpl extends ServiceImpl<ErpFreightCostMapper, ErpFreightCost> implements IErpFreightCostService {

	@Autowired
	private ErpFreightCostMapper erpFreightCostMapper;
	@Autowired
	private ErpFreightCostSetMapper erpFreightCostSetMapper;
	
	@Override
	@Transactional
	public void delMain(String id) {
		erpFreightCostSetMapper.deleteByMainId(id);
		erpFreightCostMapper.deleteById(id);
	}

	@Override
	@Transactional
	public void delBatchMain(Collection<? extends Serializable> idList) {
		for(Serializable id:idList) {
			erpFreightCostSetMapper.deleteByMainId(id.toString());
			erpFreightCostMapper.deleteById(id);
		}
	}
	
}
