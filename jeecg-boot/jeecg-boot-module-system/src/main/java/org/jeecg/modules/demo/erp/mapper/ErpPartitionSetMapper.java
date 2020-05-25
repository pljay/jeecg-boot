package org.jeecg.modules.demo.erp.mapper;

import java.util.List;
import org.jeecg.modules.demo.erp.entity.ErpPartitionSet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 分区配置表
 * @Author: jeecg-boot
 * @Date:   2020-04-29
 * @Version: V1.0
 */
public interface ErpPartitionSetMapper extends BaseMapper<ErpPartitionSet> {

	public boolean deleteByMainId(@Param("mainId") String mainId);
    
	public List<ErpPartitionSet> selectByMainId(@Param("mainId") String mainId);

}
