package study.exception.system;

import study.exception.BaseException;

/**
 * 系统异常
 *
 * @author wangzhj
 */
public class SystemException extends BaseException {

    /**
     * 构造系统异常
     *
     * @param errorCode 错误码
     * @param errorDesc 错误描述
     * @param cause     原因
     */
    public SystemException(String errorCode, String errorDesc, Throwable cause) {
        super(errorCode, errorDesc, errorDesc);
    }

    /**
     * 构造系统异常
     *
     * @param errorCode 错误码
     * @param errorDesc 错误描述
     */
    public SystemException(String errorCode, String errorDesc) {
        super(errorCode, errorDesc, errorDesc);
    }
}
