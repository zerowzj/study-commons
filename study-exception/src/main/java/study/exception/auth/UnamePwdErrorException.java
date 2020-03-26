package study.exception.auth;

/**
 * 用户名/密码错误异常
 *
 * @author wangzhj
 */
public class UnamePwdErrorException extends AuthException {

    private static final String ERROR_CODE = "1002";

    public UnamePwdErrorException() {
        super(ERROR_CODE, String.format("用户名或密码错误"));
    }
}
