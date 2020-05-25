package org.jeecg.modules.demo.erp.mapper;

import java.util.List;
import org.jeecg.modules.demo.erp.entity.ErpShipmentProduct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 产品表
 * @Author: jeecg-boot
 * @Date:   2020-04-07
 * @Version: V1.0
 */
public interface ErpShipmentProductMapper extends BaseMapper<ErpShipmentProduct> {

	public boolean deleteByMainId(@Param("mainId") String mainId);
    
	public List<ErpShipmentProduct> selectByMainId(@Param("mainId") String mainId);
}
