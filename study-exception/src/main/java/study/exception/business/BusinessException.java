package study.exception.business;

import study.exception.BaseException;

/**
 * 业务异常
 *
 * @author wangzhj
 */
public class BusinessException extends BaseException {

    public BusinessException(String errorCode, String errorDesc) {
        super(errorCode, errorDesc);
    }
}
