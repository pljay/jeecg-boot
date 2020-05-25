package org.jeecg.modules.demo.erp.service;

import org.jeecg.modules.demo.erp.entity.ErpPartitionSet;
import org.jeecg.modules.demo.erp.entity.ErpPartition;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 分区表
 * @Author: jeecg-boot
 * @Date:   2020-04-29
 * @Version: V1.0
 */
public interface IErpPartitionService extends IService<ErpPartition> {

	/**
	 * 删除一对多
	 */
	public void delMain(String id);

	/**
	 * 批量删除一对多
	 */
	public void delBatchMain(Collection <? extends Serializable> idList);


}
