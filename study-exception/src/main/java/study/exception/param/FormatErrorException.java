package study.exception.param;

/**
 * 格式错误异常
 *
 * @author wangzhj
 */
public class FormatErrorException extends ParamException {

    private static final String ERROR_CODE = "1002";

    public FormatErrorException(String paramName) {
        super(ERROR_CODE, String.format("参数值格式错误[{0}]", paramName));
    }
}
