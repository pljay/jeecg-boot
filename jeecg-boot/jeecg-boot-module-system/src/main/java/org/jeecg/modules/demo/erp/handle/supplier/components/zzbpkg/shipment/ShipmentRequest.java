package org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.shipment;

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author PLJay
 * @date 2020年4月27日
 */
@NoArgsConstructor
@Data
public class ShipmentRequest implements Serializable {

    /**
     * validation : {"access_token":"<ACCESS_TOKEN>"}
     * shipment : {"service":"FBA-EU ","store_id":"","client_reference":"","parcel_count":2,"export_scc":0,"import_scc":0,"attrs":[],"vat_number":"","to_address":{"name":"hugh","company":"wahaha llc","tel":"1818181811","mobile":"","address_1":"2580 CORPORATE PLACE","address_2":"SUITE#F107","address_3":"","city":"MONTEREY PARK","state":"CA","state_code":"CA","country":"US","postcode":"91754","email":""},"from_address":{"name":"hugh","company":"wahaha llc","tel":"1818181811","mobile":"","address_1":"2580 CORPORATE PLACE","address_2":"SUITE#F107","address_3":"","city":"MONTEREY PARK","state":"CA","state_code":"CA","country":"US","postcode":"91754","email":""},"parcels":[{"number":"1","client_weight":"2","client_length":"3","client_width":"4","client_height":"5"},{"number":"2","client_weight":"2","client_length":"3","client_width":"4","client_height":"5"}],"declarations":[{"parcel_number":"1","sku":"testsku","name_zh":"zhongwenming","name_en":"yingwenming","unit_value":11,"qty":1,"material":"glass","usage":"play","brand":"","sale_price":0,"sale_url":"","asin":"","fnsku":"fnsku","weight":0,"size":"","photo_url":"","hscode":1234567890,"duty_rate":0,"photos":""},{"parcel_number":"2","sku":"testsku","name_zh":"zhongwenming","name_en":"yingwenming","unit_value":11,"qty":1,"material":"glass","usage":"play","brand":"","sale_price":0,"sale_url":"","asin":"","fnsku":"fnsku","weight":0,"size":"","photo_url":"","hscode":1234567890,"duty_rate":0,"photos":""}],"remark":""}
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
         * service : FBA-EU
         * store_id :
         * client_reference :
         * parcel_count : 2
         * export_scc : 0
         * import_scc : 0
         * attrs : []
         * vat_number :
         * to_address : {"name":"hugh","company":"wahaha llc","tel":"1818181811","mobile":"","address_1":"2580 CORPORATE PLACE","address_2":"SUITE#F107","address_3":"","city":"MONTEREY PARK","state":"CA","state_code":"CA","country":"US","postcode":"91754","email":""}
         * from_address : {"name":"hugh","company":"wahaha llc","tel":"1818181811","mobile":"","address_1":"2580 CORPORATE PLACE","address_2":"SUITE#F107","address_3":"","city":"MONTEREY PARK","state":"CA","state_code":"CA","country":"US","postcode":"91754","email":""}
         * parcels : [{"number":"1","client_weight":"2","client_length":"3","client_width":"4","client_height":"5"},{"number":"2","client_weight":"2","client_length":"3","client_width":"4","client_height":"5"}]
         * declarations : [{"parcel_number":"1","sku":"testsku","name_zh":"zhongwenming","name_en":"yingwenming","unit_value":11,"qty":1,"material":"glass","usage":"play","brand":"","sale_price":0,"sale_url":"","asin":"","fnsku":"fnsku","weight":0,"size":"","photo_url":"","hscode":1234567890,"duty_rate":0,"photos":""},{"parcel_number":"2","sku":"testsku","name_zh":"zhongwenming","name_en":"yingwenming","unit_value":11,"qty":1,"material":"glass","usage":"play","brand":"","sale_price":0,"sale_url":"","asin":"","fnsku":"fnsku","weight":0,"size":"","photo_url":"","hscode":1234567890,"duty_rate":0,"photos":""}]
         * remark :
         */

        @JsonSchema(required = true)
        private String service;
        private String store_id;
        @JsonSchema(required = true)
        private String client_reference;
        @JsonSchema(required = true)
        private int parcel_count;
        @JsonSchema(required = true)
        private int export_scc;
        @JsonSchema(required = true)
        private int import_scc;
        private String vat_number;
        @JsonSchema(required = true,minLength = 1)
        private ToAddressBean to_address;
        @JsonSchema(required = true,minLength = 1)
        private FromAddressBean from_address;
        private String remark;

        private List <?> attrs;

        @JsonSchema(required = true,minLength = 1)
        private List <ParcelsBean> parcels;
        @JsonSchema(required = true,minLength = 1)
        private List <DeclarationsBean> declarations;
        @NoArgsConstructor
        @Data
        public static class ToAddressBean {
            /**
             * name : hugh
             * company : wahaha llc
             * tel : 1818181811
             * mobile :
             * address_1 : 2580 CORPORATE PLACE
             * address_2 : SUITE#F107
             * address_3 :
             * city : MONTEREY PARK
             * state : CA
             * state_code : CA
             * country : US
             * postcode : 91754
             * email :
             */
            @NotEmpty(message = "收件人姓名不能为空")
            private String name;
            @NotEmpty(message = "收件人公司不能为空")
            private String company;
            @NotEmpty(message = "收件人电话不能为空")
            private String tel;
            @NotEmpty(message = "收件人手机号不能为空")
            private String mobile;
            @NotEmpty(message = "收件人地址不能为空")
            private String address_1;
            private String address_2;
            private String address_3;
            @NotEmpty(message = "收件人城市不能为空")
            private String city;
            @NotEmpty(message = "收件人省不能为空")
            private String state;
            private String state_code;
            @NotEmpty(message = "收件人国家不能为空")
            private String country;
            @NotEmpty(message = "收件人邮编不能为空")
            private String postcode;
            @NotEmpty(message = "收件人邮箱不能为空")
            private String email;
        }

        @NoArgsConstructor
        @Data
        public static class FromAddressBean {
            /**
             * name : hugh
             * company : wahaha llc
             * tel : 1818181811
             * mobile :
             * address_1 : 2580 CORPORATE PLACE
             * address_2 : SUITE#F107
             * address_3 :
             * city : MONTEREY PARK
             * state : CA
             * state_code : CA
             * country : US
             * postcode : 91754
             * email :
             */

            @NotEmpty(message = "发件人姓名不能为空")
            private String name;
            @NotEmpty(message = "发件人姓名不能为空")
            private String company;
            @NotEmpty(message = "发件人姓名不能为空")
            private String tel;
            @NotEmpty(message = "发件人姓名不能为空")
            private String mobile;
            @NotEmpty(message = "发件人姓名不能为空")
            private String address_1;
            private String address_2;
            private String address_3;
            @NotEmpty(message = "发件人姓名不能为空")
            private String city;
            @NotEmpty(message = "发件人姓名不能为空")
            private String state;
            private String state_code;
            @NotEmpty(message = "发件人姓名不能为空")
            private String country;
            @NotEmpty(message = "发件人姓名不能为空")
            private String postcode;
            @NotEmpty(message = "发件人姓名不能为空")
            private String email;
        }

        @NoArgsConstructor
        @Data
        public static class ParcelsBean {
            /**
             * number : 1
             * client_weight : 2
             * client_length : 3
             * client_width : 4
             * client_height : 5
             */
            @NotEmpty(message = "货箱列表中箱号不能为空")
            private String number;
            private String client_weight;
            private String client_length;
            private String client_width;
            private String client_height;
        }

        @NoArgsConstructor
        @Data
        public static class DeclarationsBean {
            /**
             * parcel_number : 1
             * sku : testsku
             * name_zh : zhongwenming
             * name_en : yingwenming
             * unit_value : 11
             * qty : 1
             * material : glass
             * usage : play
             * brand :
             * sale_price : 0
             * sale_url :
             * asin :
             * fnsku : fnsku
             * weight : 0
             * size :
             * photo_url :
             * hscode : 1234567890
             * duty_rate : 0
             * photos :
             */
            @NotEmpty(message = "产品列表中箱号不能为空")
            private String parcel_number;
            private String sku;
            @NotEmpty(message = "产品列表中中文名称不能为空")
            private String name_zh;
            @NotEmpty(message = "产品列表中英文名称不能为空")
            private String name_en;
            @NotNull(message = "产品列表中单价不能为空")
            private BigDecimal unit_value;
            @NotEmpty(message = "产品列表中数量不能为空")
            private int qty;
            private String material;
            private String usage;
            private String brand;
            private BigDecimal sale_price;
            private String sale_url;
            private String asin;
            private String fnsku;
            @NotNull(message = "产品列表中重量不能为空")
            private BigDecimal weight;
            private String size;
            private String photo_url;
            private String hscode;
            private String duty_rate;
            private String photos;
        }
    }
}
