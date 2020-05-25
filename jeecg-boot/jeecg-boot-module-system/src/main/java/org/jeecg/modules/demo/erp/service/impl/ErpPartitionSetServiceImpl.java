package org.jeecg.modules.demo.erp.service.impl;

import org.jeecg.modules.demo.erp.entity.ErpPartitionSet;
import org.jeecg.modules.demo.erp.mapper.ErpPartitionSetMapper;
import org.jeecg.modules.demo.erp.service.IErpPartitionSetService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 分区配置表
 * @Author: jeecg-boot
 * @Date:   2020-04-29
 * @Version: V1.0
 */
@Service
public class ErpPartitionSetServiceImpl extends ServiceImpl<ErpPartitionSetMapper, ErpPartitionSet> implements IErpPartitionSetService {
	
	@Autowired
	private ErpPartitionSetMapper erpPartitionSetMapper;
	
	@Override
	public List<ErpPartitionSet> selectByMainId(String mainId) {
		return erpPartitionSetMapper.selectByMainId(mainId);
	}
}
