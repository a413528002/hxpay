package com.globalhua.pay.common.exception;

/**
 * 业务异常基类，所有业务异常都必须继承于此异常 <br>
 * 前四位数为系统模块编号，后4位为错误代码，唯一 <br>
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = -5875371379845326068L;

    /**
     * 参数校验异常
     */
    public static final BizException PARAMETER_VALIDATE_EXCEPTION = new BizException(90010003,"参数校验失败");

    /**
     * 异常信息
     */
    protected String msg;

    /**
     * 异常编码
     */
    protected int code;

    public BizException(int code, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
        this.msg = getMessage();
    }

    public BizException() {
        super();
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    /**
     * 实例化异常
     *
     * @param msgFormat
     * @param args
     * @return
     */
    public BizException newInstance(String msgFormat, Object... args) {
        return new BizException(this.code, msgFormat, args);
    }

    protected BizException(String message, Throwable cause) {
        super(message, cause);
    }

    protected BizException(Throwable cause) {
        super(cause);
    }

    protected BizException(String message) {
        super(message);
    }
}
