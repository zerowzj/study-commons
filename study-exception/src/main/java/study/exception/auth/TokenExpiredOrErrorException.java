package study.exception.auth;

/**
 * Token过期或错误异常
 *
 * @author wangzhj
 */
public class TokenExpiredOrErrorException extends AuthException {

    private static final String ERROR_CODE = "1002";


    public TokenExpiredOrErrorException() {
        super(ERROR_CODE, String.format("token过期或错误"));
    }
}
