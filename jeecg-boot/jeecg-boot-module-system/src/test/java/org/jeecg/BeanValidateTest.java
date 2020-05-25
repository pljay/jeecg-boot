package org.jeecg;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.util.jsonschema.JsSchemaUtil;
import org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.shipment.ShipmentRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BeanValidateTest {
    @Autowired
    private JsSchemaUtil jsSchemaUtil;
    String jsonStr="{\n" +
            "  \"validation\": {\n" +
            "    \"access_token\": \"<ACCESS_TOKEN>\"\n" +
            "  },\n" +
            "  \"shipment\": {\n" +
            "    \"service\": \"FBA-EU \",\n" +
            "    \"store_id\": \"\",\n" +
            "    \"client_reference\": \"\",\n" +
            "    \"parcel_count\": 2,\n" +
            "    \"export_scc\": 0,\n" +
            "    \"import_scc\": 0,\n" +
            "    \"attrs\": [],\n" +
            "    \"vat_number\": \"\",\n" +
            "    \"to_address\": {\n" +
            "      \"name\": \"hugh\",\n" +
            "      \"company\": \"wahaha llc\",\n" +
            "      \"tel\": \"1818181811\",\n" +
            "      \"mobile\": \"\",\n" +
            "      \"address_1\": \"2580 CORPORATE PLACE\",\n" +
            "      \"address_2\": \"SUITE#F107\",\n" +
            "      \"address_3\": \"\",\n" +
            "      \"city\": \"MONTEREY PARK\",\n" +
            "      \"state\": \"CA\",\n" +
            "      \"state_code\": \"CA\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postcode\": \"91754\",\n" +
            "      \"email\": \"\"\n" +
            "    },\n" +
            "    \"from_address\": {\n" +
            "      \"name\": \"hugh\",\n" +
            "      \"company\": \"wahaha llc\",\n" +
            "      \"tel\": \"1818181811\",\n" +
            "      \"mobile\": \"\",\n" +
            "      \"address_1\": \"2580 CORPORATE PLACE\",\n" +
            "      \"address_2\": \"SUITE#F107\",\n" +
            "      \"address_3\": \"\",\n" +
            "      \"city\": \"MONTEREY PARK\",\n" +
            "      \"state\": \"CA\",\n" +
            "      \"state_code\": \"CA\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"postcode\": \"91754\",\n" +
            "      \"email\": \"\"\n" +
            "    },\n" +
//                "    \"parcels\": [\n" +
//                "      {\n" +
//                "        \"number\": \"1\",\n" +
//                "        \"client_weight\": \"2\",\n" +
//                "        \"client_length\": \"3\",\n" +
//                "        \"client_width\": \"4\",\n" +
//                "        \"client_height\": \"5\"\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"number\": \"2\",\n" +
//                "        \"client_weight\": \"2\",\n" +
//                "        \"client_length\": \"3\",\n" +
//                "        \"client_width\": \"4\",\n" +
//                "        \"client_height\": \"5\"\n" +
//                "      }\n" +
//                "    ],\n" +
            "    \"declarations\": [\n" +
            "      {\n" +
            "        \"parcel_number\": \"1\",\n" +
            "        \"sku\": \"testsku\",\n" +
            "        \"name_zh\": \"zhongwenming\",\n" +
            "        \"name_en\": \"yingwenming\",\n" +
            "        \"unit_value\": 11,\n" +
            "        \"qty\": 1,\n" +
            "        \"material\": \"glass\",\n" +
            "        \"usage\": \"play\",\n" +
            "        \"brand\": \"\",\n" +
            "        \"sale_price\": 0,\n" +
            "        \"sale_url\": \"\",\n" +
            "        \"asin\": \"\",\n" +
            "        \"fnsku\": \"fnsku\",\n" +
            "        \"weight\": 0,\n" +
            "        \"size\": \"\",\n" +
            "        \"photo_url\": \"\",\n" +
            "        \"hscode\": 1234567890,\n" +
            "        \"duty_rate\": 0,\n" +
            "        \"photos\": \"\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"parcel_number\": \"2\",\n" +
            "        \"sku\": \"testsku\",\n" +
            "        \"name_zh\": \"zhongwenming\",\n" +
            "        \"name_en\": \"yingwenming\",\n" +
            "        \"unit_value\": 11,\n" +
            "        \"qty\": 1,\n" +
            "        \"material\": \"glass\",\n" +
            "        \"usage\": \"play\",\n" +
            "        \"brand\": \"\",\n" +
            "        \"sale_price\": 0,\n" +
            "        \"sale_url\": \"\",\n" +
            "        \"asin\": \"\",\n" +
            "        \"fnsku\": \"fnsku\",\n" +
            "        \"weight\": 0,\n" +
            "        \"size\": \"\",\n" +
            "        \"photo_url\": \"\",\n" +
            "        \"hscode\": 1234567890,\n" +
            "        \"duty_rate\": 0,\n" +
            "        \"photos\": \"\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"remark\": \"\"\n" +
            "  }\n" +
            "}";
    @Test
    public void testZZbPkgCreateBean() {
        boolean b = jsSchemaUtil.JsonSchemaValidate(jsonStr, ShipmentRequest.class);

    }

}
