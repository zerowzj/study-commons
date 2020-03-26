package study.exception.param;

import study.exception.BaseException;

/**
 * 参数异常
 *
 * @author wangzhj
 */
public class ParamException extends BaseException {

    public ParamException(String errorCode, String errorDesc) {
        super(errorCode, errorDesc);
    }
}
