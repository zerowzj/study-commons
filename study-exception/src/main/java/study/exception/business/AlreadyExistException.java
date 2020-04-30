package study.exception.business;

/**
 * 已存在异常
 * （1）已存在
 * （2）重复
 *
 * @author wangzhj
 */
public class AlreadyExistException extends BusinessException {

    private static final String ERROR_CODE = "2002";

    public AlreadyExistException(String objName) {
        super(ERROR_CODE, String.format("[{}]已存在", objName));
    }
}
