package org.jeecg.modules.demo.erp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jeecg.modules.demo.erp.entity.ErpChannel;
import org.jeecg.modules.demo.erp.entity.ErpSupplier;
import org.jeecg.modules.demo.erp.mapper.ErpChannelMapper;
import org.jeecg.modules.demo.erp.mapper.ErpSupplierMapper;
import org.jeecg.modules.demo.erp.service.IErpSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 供应商表
 * @Author: jeecg-boot
 * @Date:   2020-03-24
 * @Version: V1.0
 */
@Service
public class ErpSupplierServiceImpl extends ServiceImpl<ErpSupplierMapper, ErpSupplier> implements IErpSupplierService {

	@Autowired
	private ErpSupplierMapper erpSupplierMapper;
	@Autowired
	private ErpChannelMapper erpChannelMapper;

	@Override
	@Transactional
	public void saveMain(ErpSupplier erpSupplier, List<ErpChannel> erpChannelList) {
		erpSupplierMapper.insert(erpSupplier);
		if(erpChannelList!=null && erpChannelList.size()>0) {
			for(ErpChannel entity:erpChannelList) {
				//外键设置
				entity.setSupplierId(erpSupplier.getId());
				erpChannelMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional
	public void updateMain(ErpSupplier erpSupplier,List<ErpChannel> erpChannelList) {
		erpSupplierMapper.updateById(erpSupplier);

		//1.先删除子表数据
		erpChannelMapper.deleteByMainId(erpSupplier.getId());

		//2.子表数据重新插入
		if(erpChannelList!=null && erpChannelList.size()>0) {
			for(ErpChannel entity:erpChannelList) {
				//外键设置
				entity.setSupplierId(erpSupplier.getId());
				erpChannelMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional
	public void delMain(String id) {
		erpChannelMapper.deleteByMainId(id);
		erpSupplierMapper.deleteById(id);
	}

	@Override
	@Transactional
	public void delBatchMain(Collection<? extends Serializable> idList) {
		for(Serializable id:idList) {
			erpChannelMapper.deleteByMainId(id.toString());
			erpSupplierMapper.deleteById(id);
		}
	}

}
