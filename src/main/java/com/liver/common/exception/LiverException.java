package com.liver.common.exception;

/**
 * 自定义异常
 *
 * @date 2020/12/29
 */
public class LiverException extends RuntimeException{

    private static final long serialVersionUID = 3699645027662791167L;

    public LiverException() {
        super();
    }

    public LiverException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public LiverException(String message, Throwable cause) {
        super(message, cause);
    }

    public LiverException(String message) {
        super(message);
    }

    public LiverException(Throwable cause) {
        super(cause);
    }
}
