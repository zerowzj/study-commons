package study.exception;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.Properties;

/**
 * Messages
 *
 * @author wangzhj
 */
public abstract class Messages {

    private static final String MESSAGE_FILE = "message.properties";

    private static final String UTF_8 = "UTF-8";

    private static final Properties prop = new Properties();

    static {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream is = classLoader.getResourceAsStream(MESSAGE_FILE);
            prop.load(new InputStreamReader(is, UTF_8));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 格式化信息
     *
     * @param key
     * @param args
     * @return String
     **/
    public static String format(String key, Object... args) {
        String pattern = prop.getProperty(key);
        MessageFormat msgFormat = new MessageFormat(pattern);
        if (args == null) {
            args = new Object[]{};
        }
        return msgFormat.format(args);
    }
}
