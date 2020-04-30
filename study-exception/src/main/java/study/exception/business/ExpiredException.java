package study.exception.business;

/**
 * 过期异常
 * （1）过期
 * （2）失效
 *
 * @author wangzhj
 */
public class ExpiredException extends BusinessException {

    private static final String ERROR_CODE = "2002";

    public ExpiredException(String objName) {
        super(ERROR_CODE, String.format("[{}]已过期", objName));
    }
}
