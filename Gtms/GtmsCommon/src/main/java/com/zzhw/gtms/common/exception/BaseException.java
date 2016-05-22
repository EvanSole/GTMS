package com.zzhw.gtms.common.exception;


public class BaseException extends RuntimeException {
    private String message;
    private String code;
    public BaseException(String message){
        super(message);
        this.message = message;
    }
    public BaseException(String message, String code){
        super(message);
        this.message = message;
        this.code = code;
    }
    public BaseException(String message, Exception e){
        super(message,e);
        this.message = message;

    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
