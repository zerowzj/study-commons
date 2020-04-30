package study.exception.business;

/**
 * 错误异常
 *
 * @author wangzhj
 */
public class ErrorException extends BusinessException {

    private static final String ERROR_CODE = "2003";

    public ErrorException(String objName) {
        super(ERROR_CODE, String.format("[{}]错误", objName));
    }
}
