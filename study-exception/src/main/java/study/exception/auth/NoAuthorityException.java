package study.exception.auth;

/**
 * 无权限异常
 *
 * @author wangzhj
 */
public class NoAuthorityException extends AuthException {

    private static final String ERROR_CODE = "1002";

    public NoAuthorityException() {
        super(ERROR_CODE, String.format("token过期或错误"));
    }
}
