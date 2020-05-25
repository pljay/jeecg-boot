package org.jeecg.modules.demo.erp.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import org.jeecg.modules.demo.erp.entity.ErpChannel;

import java.util.List;

/**
 * @Description: 渠道列表
 * @Author: jeecg-boot
 * @Date:   2020-03-24
 * @Version: V1.0
 */
public interface IErpChannelService extends IService<ErpChannel> {

	public List<ErpChannel> selectByMainId(String mainId);

	/**
	 * 获取渠道配置信息
	 * @param id 订单id
	 * @return
	 */
	public JSONObject getTokenContent(String id);
}
