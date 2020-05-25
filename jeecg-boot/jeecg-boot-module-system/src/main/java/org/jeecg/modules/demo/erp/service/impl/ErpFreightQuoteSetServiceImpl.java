package org.jeecg.modules.demo.erp.service.impl;

import org.jeecg.modules.demo.erp.entity.ErpFreightQuoteSet;
import org.jeecg.modules.demo.erp.mapper.ErpFreightQuoteSetMapper;
import org.jeecg.modules.demo.erp.service.IErpFreightQuoteSetService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 运费报价配置表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
@Service
public class ErpFreightQuoteSetServiceImpl extends ServiceImpl<ErpFreightQuoteSetMapper, ErpFreightQuoteSet> implements IErpFreightQuoteSetService {
	
	@Autowired
	private ErpFreightQuoteSetMapper erpFreightQuoteSetMapper;
	
	@Override
	public List<ErpFreightQuoteSet> selectByMainId(String mainId) {
		return erpFreightQuoteSetMapper.selectByMainId(mainId);
	}
}
