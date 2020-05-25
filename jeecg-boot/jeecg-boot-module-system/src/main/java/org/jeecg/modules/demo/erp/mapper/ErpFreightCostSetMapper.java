package org.jeecg.modules.demo.erp.mapper;

import java.util.List;
import org.jeecg.modules.demo.erp.entity.ErpFreightCostSet;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 运费成本配置表
 * @Author: jeecg-boot
 * @Date:   2020-05-12
 * @Version: V1.0
 */
public interface ErpFreightCostSetMapper extends BaseMapper<ErpFreightCostSet> {

	public boolean deleteByMainId(@Param("mainId") String mainId);
    
	public List<ErpFreightCostSet> selectByMainId(@Param("mainId") String mainId);

}
