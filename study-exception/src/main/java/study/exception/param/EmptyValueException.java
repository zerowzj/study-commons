package study.exception.param;

/**
 * 空值异常
 *
 * @author wangzhj
 */
public class EmptyValueException extends ParamException {

    private static final String ERROR_CODE = "1001";

    public EmptyValueException(String paramName) {
        super(ERROR_CODE, String.format("参数值为空[{0}]", paramName));
    }
}
