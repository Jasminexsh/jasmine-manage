package com.jasmine.common.model;

/**
 * 默认错误码
 *
 * @author xieshanghan
 * @version DefaultErrorCode.java, v 0.1 2023年08月06日 23:48 xieshanghan
 */
public class DefaultErrorCode implements ErrorCode{

    private final String code;

    private final String message;

    /**
     * constructor
     *
     * @param code
     * @param message
     */
    public DefaultErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 静态构造方法
     *
     * @param code
     * @param message
     * @return
     */
    public static DefaultErrorCode build(String code, String message) {
        return new DefaultErrorCode(code, message);
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}