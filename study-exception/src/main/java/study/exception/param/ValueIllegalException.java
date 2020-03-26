package study.exception.param;

/**
 * 值非法异常
 *
 * @author wangzhj
 */
public class ValueIllegalException extends ParamException {

    private static final String ERROR_CODE = "1003";

    public ValueIllegalException(String paramName) {
        super(ERROR_CODE, String.format("参数值非法[{0}]", paramName));
    }
}
