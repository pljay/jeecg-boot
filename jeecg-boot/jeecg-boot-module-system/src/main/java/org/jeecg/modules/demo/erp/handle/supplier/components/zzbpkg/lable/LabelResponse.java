package org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.lable;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class LabelResponse {

    /**
     * status : 1
     * info : 请求成功的完成
     * time : 1529477135
     * data : {"shipment":{"shipment_id":"10000060","carrier_code":"UPS","tracking_number":"1Z30RF8767868768768","parcels":[{"item_number":"10000060U001","carrier_code":"UPS","tracking_number":"1Z32423482","label_url":"标签文档的 url 地址"},{"item_number":"10000060U002","carrier_code":"UPS","tracking_number":"1Z32423482","label_url":"标签文档的 url 地址"}],"single_pdf":""}}
     */

    private int status;
    private String info;
    private int time;
    private DataBean data;

    @NoArgsConstructor
    @Data
    public static class DataBean {
        /**
         * shipment : {"shipment_id":"10000060","carrier_code":"UPS","tracking_number":"1Z30RF8767868768768","parcels":[{"item_number":"10000060U001","carrier_code":"UPS","tracking_number":"1Z32423482","label_url":"标签文档的 url 地址"},{"item_number":"10000060U002","carrier_code":"UPS","tracking_number":"1Z32423482","label_url":"标签文档的 url 地址"}],"single_pdf":""}
         */

        private ShipmentBean shipment;

        @NoArgsConstructor
        @Data
        public static class ShipmentBean {
            /**
             * shipment_id : 10000060
             * carrier_code : UPS
             * tracking_number : 1Z30RF8767868768768
             * parcels : [{"item_number":"10000060U001","carrier_code":"UPS","tracking_number":"1Z32423482","label_url":"标签文档的 url 地址"},{"item_number":"10000060U002","carrier_code":"UPS","tracking_number":"1Z32423482","label_url":"标签文档的 url 地址"}]
             * single_pdf :
             */

            private String shipment_id;
            private String carrier_code;
            private String tracking_number;
            private String single_pdf;
            private List <ParcelsBean> parcels;

            @NoArgsConstructor
            @Data
            public static class ParcelsBean {
                /**
                 * item_number : 10000060U001
                 * carrier_code : UPS
                 * tracking_number : 1Z32423482
                 * label_url : 标签文档的 url 地址
                 */

                private String item_number;
                private String carrier_code;
                private String tracking_number;
                private String label_url;
            }
        }
    }
}
