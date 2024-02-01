package com.jasmine.common.model;

/**
 * BaseResult定义
 *
 * @author xieshanghan
 * @version BaseResult.java, v 0.1 2023年08月06日 22:41 xieshanghan
 */
public class BaseResult<T> {

    private boolean success;

    private String resultCode;

    private String resultMsg;

    private T data;

    /**
     * 私有无参构造函数
     */
    private BaseResult() {

    }

    /**
     * 私有全参构造函数
     *
     * @param success
     * @param resultCode
     * @param resultMsg
     * @param data
     */
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

    /**
     *
     *
     * @param result
     * @return
     */
    public static BaseResult build(BaseResult result) {
        if (result == null) {
            return null;
        }
        BaseResult newResult = new BaseResult();
        newResult.setData(result.getData());
        newResult.setResultCode(result.getResultCode());
        newResult.setResultMsg(result.getResultMsg());
        newResult.setSuccess(result.isSuccess());
        return newResult;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}