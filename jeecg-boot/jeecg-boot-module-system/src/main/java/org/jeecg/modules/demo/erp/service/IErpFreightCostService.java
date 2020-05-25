package org.jeecg.modules.demo.erp.service;

import org.jeecg.modules.demo.erp.entity.ErpFreightCostSet;
import org.jeecg.modules.demo.erp.entity.ErpFreightCost;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 运费成本表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
public interface IErpFreightCostService extends IService<ErpFreightCost> {

	/**
	 * 删除一对多
	 */
	public void delMain(String id);

	/**
	 * 批量删除一对多
	 */
	public void delBatchMain(Collection <? extends Serializable> idList);


}
