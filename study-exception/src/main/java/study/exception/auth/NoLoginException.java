package study.exception.auth;

/**
 * 未登录异常
 *
 * @author wangzhj
 */
public class NoLoginException extends AuthException {

    private static final String ERROR_CODE = "1002";

    public NoLoginException() {
        super(ERROR_CODE, String.format("未登录"));
    }
}
