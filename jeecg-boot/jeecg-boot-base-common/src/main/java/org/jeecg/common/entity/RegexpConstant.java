package org.jeecg.common.entity;

/**
 * 正则常量
 *
 * @author MrBird
 */
public class RegexpConstant {

    // 简单手机号正则（这里只是简单校验是否为 11位，实际规则更复杂）
    public static final String MOBILE_REG = "[1]\\d{10}";
    //整数
    public static final String NUMBER_REG = "^[1-9]\\d*$";
    //小数点两位
    public static final String NUMERIC2_REG = "^(([1-9]{1}\\d*)|(0{1}))(\\.\\d{1,2})?$";


}
