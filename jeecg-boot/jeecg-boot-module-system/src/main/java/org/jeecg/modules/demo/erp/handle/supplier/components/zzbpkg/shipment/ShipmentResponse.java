package org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.shipment;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PLJay
 * @date  2020年4月27日
 */
@NoArgsConstructor
@Data
public class ShipmentResponse {

    /**
     * status : 1
     * info : 请求成功的完成
     * time : 1529458913
     * data : {"shipment":{"shipment_id":"10000060"}}
     */

    private int status;
    private String info;
    private int time;
    private DataBean data;

    @NoArgsConstructor
    @Data
    public static class DataBean {
        /**
         * shipment : {"shipment_id":"10000060"}
         */

        private ShipmentBean shipment;

        @NoArgsConstructor
        @Data
        public static class ShipmentBean {
            /**
             * shipment_id : 10000060
             */

            private String shipment_id;
        }
    }
}
