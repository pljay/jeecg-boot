package org.jeecg.modules.demo.erp.service.impl;

import org.jeecg.modules.demo.erp.entity.ErpFreightCostSet;
import org.jeecg.modules.demo.erp.mapper.ErpFreightCostSetMapper;
import org.jeecg.modules.demo.erp.service.IErpFreightCostSetService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 运费成本配置表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
@Service
public class ErpFreightCostSetServiceImpl extends ServiceImpl<ErpFreightCostSetMapper, ErpFreightCostSet> implements IErpFreightCostSetService {
	
	@Autowired
	private ErpFreightCostSetMapper erpFreightCostSetMapper;
	
	@Override
	public List<ErpFreightCostSet> selectByMainId(String mainId) {
		return erpFreightCostSetMapper.selectByMainId(mainId);
	}
}
