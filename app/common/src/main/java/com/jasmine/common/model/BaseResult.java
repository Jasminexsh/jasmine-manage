package com.jasmine.common.model;

/**
 * BaseResult定义
 *
 * @author xieshanghan
 * @version BaseResult.java, v 0.1 2023年08月06日 22:41 xieshanghan
 */
public class BaseResult<T> {

    private Boolean success;

    private String resultCode;

    private String resultMsg;

    private T data;

    private BaseResult(Boolean success, String resultCode, String resultMsg, T data) {
        this.success = success;
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.data = data;
    }

    /**
     * 静态build方法
     *
     * @param <T>
     * @param success
     * @param errorCode
     * @param message
     * @param data
     * @return
     */
    public static <T> BaseResult build(boolean success, ErrorCode errorCode,
                                       String message, T data) {
        return new BaseResult(success, errorCode.getCode(),
                message == null || message.length() == 0 ? errorCode.getMessage() : message, data);
    }

}