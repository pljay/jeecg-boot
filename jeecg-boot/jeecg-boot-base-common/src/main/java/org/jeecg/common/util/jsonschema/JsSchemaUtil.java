package org.jeecg.common.util.jsonschema;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingMessage;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.imifou.jsonschema.module.addon.AddonModule;
import com.github.victools.jsonschema.generator.OptionPreset;
import com.github.victools.jsonschema.generator.SchemaGenerator;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfig;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder;
import org.jeecg.common.exception.JsonSchemaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author PLJay
 * @date 2020年4月28日
 * @version v1.0
 */
@Component
public class JsSchemaUtil {

    @Autowired
    private ObjectMapper mapper;

    /**
     * 使用jsonSechema校验数据是否正确
     * @param paramJson
     * @param t
     */
    public boolean JsonSchemaValidate(String paramJson, Class t) {
        AddonModule module = new AddonModule();
        List<ProcessingMessage> processingMessages=new ArrayList<>();
        SchemaGeneratorConfigBuilder configBuilder = new SchemaGeneratorConfigBuilder(mapper, OptionPreset.PLAIN_JSON)
                .with(module);
        SchemaGeneratorConfig config = configBuilder.build();
        SchemaGenerator generator = new SchemaGenerator(config);
        JsonNode jsonSchema = generator.generateSchema(t);
        //创建JsonSchema工厂
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        //通过jsonStr字符串获得对应JsonNode对象
        JsonNode dataNode = null;
        try {
            dataNode = JsonLoader.fromString(paramJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //通过jsonSchema的JsonNode对象获得JsonSchema对象
        JsonSchema schema = null;
        try {
            schema = factory.getJsonSchema(jsonSchema);
        } catch (ProcessingException e) {
            e.printStackTrace();
        }
        //使用json-schema-validator中JsonSchema对象的validate方法对数据进行校验
        //获得处理的报告信息
        ProcessingReport processingReport = schema.validateUnchecked(dataNode,true);
        Iterator<ProcessingMessage> iterator = processingReport.iterator();
        while (iterator.hasNext()) {
            ProcessingMessage processingMessage = iterator.next();
            if("error".equals(processingMessage.getLogLevel().toString())){
                processingMessages.add(processingMessage);
            }
        }
        if(!CollectionUtils.isEmpty(processingMessages)){
           throw new JsonSchemaException(JSON.toJSONString(processingMessages,true));
        }
        return  processingReport.isSuccess();
    }

}
