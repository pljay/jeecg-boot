package org.jeecg.modules.demo.erp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.demo.erp.entity.ErpChannel;

import java.util.List;

/**
 * @Description: 渠道列表
 * @Author: jeecg-boot
 * @Date:   2020-03-24
 * @Version: V1.0
 */
public interface ErpChannelMapper extends BaseMapper<ErpChannel> {

	public boolean deleteByMainId(@Param("mainId") String mainId);

	public List<ErpChannel> selectByMainId(@Param("mainId") String mainId);
}
