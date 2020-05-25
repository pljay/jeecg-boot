package org.jeecg.common.constant;

/**
 * @author PLJay
 * @date 2020年5月7日
 * @version v1.1
 */
public interface ShipmentStatusConstant {

    /**
     * 订单创建
     */
    public static final String STATUS_CT = "1";
    /**
     * 订单提交
     */
    public static final String STATUS_MT = "2";
    /**
     * 订单入库
     */
    public static final String STATUS_PK = "3";
    /**
     * 离开集货站
     */
    public static final String STATUS_HO = "4";
    /**
     * 离开港口
     */
    public static final String STATUS_DP = "5";
    /**
     * 运输中
     */
    public static final String STATUS_IT = "6";
    /**
     * 到达港口
     */
    public static final String STATUS_AP = "7";
    /**
     * 目的国海关申报
     */
    public static final String STATUS_CC = "8";
    /**
     * 清关完成
     */
    public static final String STATUS_CR = "9";
    /**
     * 末公里交接完成
     */
    public static final String STATUS_HL = "10";
    /**
     * 到达末端仓库
     */
    public static final String STATUS_LW = "11";
    /**
     * 末端仓库分拣
     */
    public static final String STATUS_LD = "12";
    /**
     * 末端仓库发货
     */
    public static final String STATUS_LS = "13";
    /**
     * 到达配货站
     */
    public static final String STATUS_AT = "14";
    /**
     * 配送中
     */
    public static final String STATUS_OP = "15";
    /**
     * 配送成功
     */
    public static final String STATUS_DL = "16";
    /**
     * 配送失败
     */
    public static final String STATUS_DF = "17";
    /**
     * 订单错误
     */
    public static final String STATUS_EX = "0";
}
