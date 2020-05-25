package org.jeecg.modules.demo.erp.service.impl;

import org.jeecg.modules.demo.erp.entity.ErpFreightQuote;
import org.jeecg.modules.demo.erp.entity.ErpFreightQuoteSet;
import org.jeecg.modules.demo.erp.mapper.ErpFreightQuoteSetMapper;
import org.jeecg.modules.demo.erp.mapper.ErpFreightQuoteMapper;
import org.jeecg.modules.demo.erp.service.IErpFreightQuoteService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Collection;

/**
 * @Description: 运费报价表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
@Service
public class ErpFreightQuoteServiceImpl extends ServiceImpl<ErpFreightQuoteMapper, ErpFreightQuote> implements IErpFreightQuoteService {

	@Autowired
	private ErpFreightQuoteMapper erpFreightQuoteMapper;
	@Autowired
	private ErpFreightQuoteSetMapper erpFreightQuoteSetMapper;
	
	@Override
	@Transactional
	public void delMain(String id) {
		erpFreightQuoteSetMapper.deleteByMainId(id);
		erpFreightQuoteMapper.deleteById(id);
	}

	@Override
	@Transactional
	public void delBatchMain(Collection<? extends Serializable> idList) {
		for(Serializable id:idList) {
			erpFreightQuoteSetMapper.deleteByMainId(id.toString());
			erpFreightQuoteMapper.deleteById(id);
		}
	}
	
}
