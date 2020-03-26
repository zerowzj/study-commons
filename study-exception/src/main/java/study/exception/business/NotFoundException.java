package study.exception.business;

/**
 * 未找到异常
 *
 * @author wangzhj
 */
public class NotFoundException extends BusinessException {

    private static final String ERROR_CODE = "2002";

    public NotFoundException(String objName) {
        super(ERROR_CODE, String.format("[{}]已存在", objName));
    }
}
