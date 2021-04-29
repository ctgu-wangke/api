package org.wangke.api.exception;

/**
 * 业务中出现异常时抛出
 */
public class WarnException extends RuntimeException{

    public WarnException(String message) {
        super(message);
    }
}
