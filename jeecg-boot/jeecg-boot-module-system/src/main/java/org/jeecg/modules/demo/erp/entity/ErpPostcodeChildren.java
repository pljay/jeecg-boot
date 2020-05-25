package org.jeecg.modules.demo.erp.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 邮编子表
 * @Author: jeecg-boot
 * @Date:   2020-04-13
 * @Version: V1.0
 */

@Data
public class ErpPostcodeChildren extends ErpPostcode implements Serializable {
    private static final long serialVersionUID = 1L;

    List<ErpPostcode> children;
}
