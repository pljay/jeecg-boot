package org.jeecg.modules.demo.erp.rule;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import com.alibaba.fastjson.JSONObject;
import org.jeecg.common.handler.IFillRuleHandler;
import org.jeecg.common.util.oConvertUtils;

import java.util.Date;

/**
 * 自定义订单编号
 * PREFIX+年月日时分秒毫秒
 * @author PLJay
 */
public class ErpNoRule implements IFillRuleHandler {

    public static final String PREFIX = "HKD";

    @Override
    public Object execute(JSONObject params, JSONObject formData) {

        String type = "";

        if (formData != null && formData.size() > 0) {
            Object obj = formData.get("type");
            if (oConvertUtils.isNotEmpty(obj)) {
                type = obj.toString();
            }

        } else {
            if (params != null) {
                Object obj = params.get("type");
                if (oConvertUtils.isNotEmpty(obj)) {
                    type = obj.toString();
                }
            }
        }

        String format = DateUtil.format(new Date(), DatePattern.PURE_DATETIME_MS_PATTERN)+ RandomUtil.randomNumbers(3);
        return PREFIX+ type +format;
    }
}
