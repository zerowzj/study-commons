package study.exception.auth;

import study.exception.BaseException;

/**
 * 认证/授权异常
 *
 * @author wangzhj
 */
public class AuthException extends BaseException {

    public AuthException(String errorCode, String errorDesc) {
        super(errorCode, errorDesc);
    }
}
