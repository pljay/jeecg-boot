package org.jeecg.modules.demo.erp.mapper;

import java.util.List;
import org.jeecg.modules.demo.erp.entity.ErpShipmentParcel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 包裹表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
public interface ErpShipmentParcelMapper extends BaseMapper<ErpShipmentParcel> {

	public boolean deleteByMainId(@Param("mainId") String mainId);
    
	public List<ErpShipmentParcel> selectByMainId(@Param("mainId") String mainId);
}
