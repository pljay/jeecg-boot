package org.jeecg.modules.demo.erp.service;

import org.jeecg.modules.demo.erp.entity.ErpPartitionSet;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 分区配置表
 * @Author: jeecg-boot
 * @Date:   2020-04-29
 * @Version: V1.0
 */
public interface IErpPartitionSetService extends IService<ErpPartitionSet> {

	public List<ErpPartitionSet> selectByMainId(String mainId);
}
