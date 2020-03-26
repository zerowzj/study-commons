package study.exception;

/**
 * 基本异常
 *
 * @author wangzhj
 */
public abstract class BaseException extends RuntimeException {

    /* 错误码 */
    private String errorCode;
    /* 错误描述 */
    private String errorDesc;

    public BaseException() {
        super();
    }

    /**
     * 构造函数
     *
     * @param errorCode 错误码
     * @param errorDesc 错误描述
     */
    public BaseException(String errorCode, String errorDesc) {
        super(errorDesc);
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    /**
     * 构造函数
     *
     * @param errorCode 错误码
     * @param errorDesc 错误描述
     * @param message   异常信息
     */
    public BaseException(String errorCode, String errorDesc, String message) {
        super(message);
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    /**
     * 构造函数
     *
     * @param errorCode 错误码
     * @param errorDesc 错误描述
     * @param cause     异常原因
     */
    public BaseException(String errorCode, String errorDesc, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
