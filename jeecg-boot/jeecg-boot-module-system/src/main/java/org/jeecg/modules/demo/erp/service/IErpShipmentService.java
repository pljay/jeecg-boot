package org.jeecg.modules.demo.erp.service;

import org.jeecg.common.api.vo.Result;
import org.jeecg.modules.demo.erp.entity.ErpShipmentParcel;
import org.jeecg.modules.demo.erp.entity.ErpShipmentProduct;
import org.jeecg.modules.demo.erp.entity.ErpShipment;
import com.baomidou.mybatisplus.extension.service.IService;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 订单表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
public interface IErpShipmentService extends IService<ErpShipment> {

	/**
	 * 添加一对多
	 *
	 */
	public void saveMain(ErpShipment erpShipment, List <ErpShipmentParcel> erpShipmentParcelList, List <ErpShipmentProduct> erpShipmentProductList) ;

	/**
	 * 修改一对多
	 *
	 */
	public void updateMain(ErpShipment erpShipment, List <ErpShipmentParcel> erpShipmentParcelList, List <ErpShipmentProduct> erpShipmentProductList);

	/**
	 * 删除一对多
	 */
	public void delMain(String id);

	/**
	 * 批量删除一对多
	 */
	public void delBatchMain(Collection <? extends Serializable> idList);


}
