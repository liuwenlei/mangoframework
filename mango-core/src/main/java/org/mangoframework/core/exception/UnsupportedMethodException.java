package org.mangoframework.core.exception;

/**
 * User: zhoujingjie
 * Date: 16/4/22
 * Time: 20:57
 */
public class UnsupportedMethodException extends MangoException {
    public UnsupportedMethodException() {
        super();
    }

    public UnsupportedMethodException(String message) {
        super(message);
    }

    public UnsupportedMethodException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedMethodException(Throwable cause) {
        super(cause);
    }

    protected UnsupportedMethodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);    
    }
}
