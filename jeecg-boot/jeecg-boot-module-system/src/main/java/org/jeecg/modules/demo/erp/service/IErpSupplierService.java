package org.jeecg.modules.demo.erp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.modules.demo.erp.entity.ErpChannel;
import org.jeecg.modules.demo.erp.entity.ErpSupplier;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 供应商表
 * @Author: jeecg-boot
 * @Date:   2020-03-24
 * @Version: V1.0
 */
public interface IErpSupplierService extends IService<ErpSupplier> {

	/**
	 * 添加一对多
	 *
	 */
	public void saveMain(ErpSupplier erpSupplier, List <ErpChannel> erpChannelList) ;

	/**
	 * 修改一对多
	 *
	 */
	public void updateMain(ErpSupplier erpSupplier, List <ErpChannel> erpChannelList);

	/**
	 * 删除一对多
	 */
	public void delMain(String id);

	/**
	 * 批量删除一对多
	 */
	public void delBatchMain(Collection <? extends Serializable> idList);


}
