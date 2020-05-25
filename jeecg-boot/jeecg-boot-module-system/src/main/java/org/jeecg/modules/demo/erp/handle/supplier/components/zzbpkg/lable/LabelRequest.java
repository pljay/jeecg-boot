package org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.lable;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PLJay
 * @date 2020年4月28日
 * @version v1.0
 * @apiNote 获取面单
 */
@NoArgsConstructor
@Data
public class LabelRequest {

    /**
     * validation : {"access_token":"<ACCESS_TOKEN>"}
     * shipment : {"shipment_id":"10000060"}
     */

    private ValidationBean validation;
    private ShipmentBean shipment;

    @NoArgsConstructor
    @Data
    public static class ValidationBean {
        /**
         * access_token : <ACCESS_TOKEN>
         */

        private String access_token;
    }

    @NoArgsConstructor
    @Data
    public static class ShipmentBean {
        /**
         * shipment_id : 10000060
         */

        private String shipment_id;
    }
}
