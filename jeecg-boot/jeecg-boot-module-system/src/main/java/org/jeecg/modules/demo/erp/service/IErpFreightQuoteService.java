package org.jeecg.modules.demo.erp.service;

import org.jeecg.modules.demo.erp.entity.ErpFreightQuoteSet;
import org.jeecg.modules.demo.erp.entity.ErpFreightQuote;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 运费报价表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
public interface IErpFreightQuoteService extends IService<ErpFreightQuote> {

	/**
	 * 删除一对多
	 */
	public void delMain(String id);

	/**
	 * 批量删除一对多
	 */
	public void delBatchMain(Collection <? extends Serializable> idList);


}
