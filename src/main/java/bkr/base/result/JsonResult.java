package bkr.base.result;

/**
 * 返回结果对象格式
 * 
 * @author chengd
 */
public class JsonResult<T> {
    /** code值 */
    private String code;
    /** 消息 */
    private String message;
    /** 内容 */
    private T data;

    /**
     * 构造函数
     * 
     * @return void
     */
    public JsonResult() {
        this.setCode(ResultCode.SUCCESS);
    }

    /**
     * 构造函数
     * 
     * @param code
     *            code枚举对象
     * @param message
     *            消息文本
     * @return void
     */
    public JsonResult(T data) {
        this.setCode(ResultCode.SUCCESS);
        this.setData(data);
    }

    /**
     * 构造函数
     * 
     * @param code
     *            code枚举对象
     * @param message
     *            消息文本
     * @return void
     */
    public JsonResult(ResultCode code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    /**
     * 构造函数
     * 
     * @param code
     *            code枚举对象
     * @param message
     *            消息文本
     * @param data
     *            业务数据
     * @return void
     */
    public JsonResult(ResultCode code, String message, T data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    /**
     * 取得code值
     * 
     * @return code值
     */
    public String getCode() {
        return code;
    }

    /**
     * 设定code枚举对象
     * 
     * @param code
     *            code枚举对象
     */
    public void setCode(ResultCode code) {
        this.code = code.value();
    }

    /**
     * 取得消息文本
     * 
     * @return 消息文本
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设定消息文本
     * 
     * @param message
     *            消息文本
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 取得业务数据
     * 
     * @return 消息文本
     */
    public T getData() {
        return data;
    }

    /**
     * 设定业务数据
     * 
     * @param data
     *            业务数据
     */
    public void setData(T data) {
        this.data = data;
    }
}
