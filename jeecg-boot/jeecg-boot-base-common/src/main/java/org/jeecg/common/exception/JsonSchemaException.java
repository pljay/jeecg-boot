package org.jeecg.common.exception;

/**
 * @author PLJay
 * @date 2020年4月28日
 * @version v1.0
 * @apiNote jsonschema 校验异常
 */
public class JsonSchemaException extends RuntimeException {

    private static final long serialVersionUID = -3608667856397125671L;

    public JsonSchemaException(String message) {
        super(message);
    }
}
