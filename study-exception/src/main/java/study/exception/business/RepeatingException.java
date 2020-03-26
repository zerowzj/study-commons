package study.exception.business;

/**
 * 重复异常
 *
 * @author wangzhj
 */
public class RepeatingException extends BusinessException {

    private static final String ERROR_CODE = "2002";

    public RepeatingException(String objName) {
        super(ERROR_CODE, String.format("[{}]重复", objName));
    }
}
