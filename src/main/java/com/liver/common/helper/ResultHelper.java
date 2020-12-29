package com.liver.common.helper;

import com.liver.common.exception.LiverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultHelper {

    private static final Logger logger = LoggerFactory.getLogger(ResultHelper.class);

    public static enum Status{
        success,
        error,
        warn;
    };

    private Status status = Status.success;

    private String message;

    private Object data;

    private String code;


    private ResultHelper(Status status) {
        this.status = status;
    }

    private ResultHelper(Status status, String message, Object data, String code) {
        super();
        this.status = status;
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public static ResultHelper success(){
        return new ResultHelper(Status.success).message("operations.success");
    }

    public static ResultHelper warn(){
        return new ResultHelper(Status.warn);
    }

    public static ResultHelper error(){
        return new ResultHelper(Status.error);
    }

    public static ResultHelper error(Throwable e) {
        return error(e, "operations.error");
    }

    public static ResultHelper error(Throwable e,String msg) {

        Throwable target = e;
        while(target != null) {

            if (e instanceof LiverException) {

                return error().message(e.getMessage());
            }
            if(target == e.getCause()) {
                break;
            }
            target = e.getCause();

        }
        return error().message(msg);

    }

    public ResultHelper code(String code) {
        this.code = code;
        return this;
    }

    public ResultHelper data(Object data) {
        this.data = data;
        return this;
    }

    public ResultHelper message(String message) {
        this.message = message;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public String getCode() {
        return code;
    }
}
