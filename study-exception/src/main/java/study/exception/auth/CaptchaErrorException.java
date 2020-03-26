package study.exception.auth;

/**
 * 验证码错误异常
 *
 * @author wangzhj
 */
public class CaptchaErrorException extends AuthException {

    private static final String ERROR_CODE = "1002";

    public CaptchaErrorException() {
        super(ERROR_CODE, String.format("验证码错误"));
    }
}
