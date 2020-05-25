package org.jeecg.modules.demo.erp.service.impl;

import org.jeecg.modules.demo.erp.entity.ErpPartition;
import org.jeecg.modules.demo.erp.entity.ErpPartitionSet;
import org.jeecg.modules.demo.erp.mapper.ErpPartitionSetMapper;
import org.jeecg.modules.demo.erp.mapper.ErpPartitionMapper;
import org.jeecg.modules.demo.erp.service.IErpPartitionService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Collection;

/**
 * @Description: 分区表
 * @Author: jeecg-boot
 * @Date:   2020-04-29
 * @Version: V1.0
 */
@Service
public class ErpPartitionServiceImpl extends ServiceImpl<ErpPartitionMapper, ErpPartition> implements IErpPartitionService {

	@Autowired
	private ErpPartitionMapper erpPartitionMapper;
	@Autowired
	private ErpPartitionSetMapper erpPartitionSetMapper;
	
	@Override
	@Transactional
	public void delMain(String id) {
		erpPartitionSetMapper.deleteByMainId(id);
		erpPartitionMapper.deleteById(id);
	}

	@Override
	@Transactional
	public void delBatchMain(Collection<? extends Serializable> idList) {
		for(Serializable id:idList) {
			erpPartitionSetMapper.deleteByMainId(id.toString());
			erpPartitionMapper.deleteById(id);
		}
	}
	
}
