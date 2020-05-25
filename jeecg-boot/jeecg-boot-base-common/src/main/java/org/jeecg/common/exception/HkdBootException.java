package org.jeecg.common.exception;

/**
 * FEBS系统内部异常
 *
 * @author MrBird
 */
public class HkdBootException extends RuntimeException  {

    private static final long serialVersionUID = -994962710559017255L;

    public HkdBootException(String message) {
        super(message);
    }
}
