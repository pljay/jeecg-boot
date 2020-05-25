package org.jeecg.modules.demo.erp.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jeecg.modules.demo.erp.entity.ErpChannel;
import org.jeecg.modules.demo.erp.entity.ErpShipment;
import org.jeecg.modules.demo.erp.entity.ErpUserChannel;
import org.jeecg.modules.demo.erp.mapper.ErpChannelMapper;
import org.jeecg.modules.demo.erp.service.IErpChannelService;
import org.jeecg.modules.demo.erp.service.IErpShipmentService;
import org.jeecg.modules.demo.erp.service.IErpUserChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 渠道列表
 * @Author: jeecg-boot
 * @Date:   2020-03-24
 * @Version: V1.0
 */
@Service
public class ErpChannelServiceImpl extends ServiceImpl<ErpChannelMapper, ErpChannel> implements IErpChannelService {

	@Autowired
	private ErpChannelMapper erpChannelMapper;
	@Autowired
	private IErpShipmentService iErpShipmentService;
	@Autowired
	private IErpUserChannelService iErpUserChannelService;



	@Override
	public List<ErpChannel> selectByMainId(String mainId) {
		return erpChannelMapper.selectByMainId(mainId);
	}

	@Override
	public JSONObject getTokenContent(String id) {
		ErpShipment erpShipment = this.iErpShipmentService.getById(id);
		//获取用户渠道信息
		ErpUserChannel erpUserChannel = iErpUserChannelService.getById(erpShipment.getServiceId());
		//获取渠道配置信息
		ErpChannel erpChannel = this.getById(erpUserChannel.getChannelId());
		String content = erpChannel.getContent();
		JSONObject jsonObject = JSON.parseObject(content);
		jsonObject.put("accessToken",erpChannel.getAccessToken());
		jsonObject.put("refreshToken",erpChannel.getRefreshToken());
		jsonObject.put("multipleTickets",erpChannel.getMultipleTickets());
		return jsonObject;
	}
}
