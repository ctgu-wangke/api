package org.wangke.api.exception;

/**
 * 处理报错时抛出此异常
 */
public class ErrException extends RuntimeException {

    public ErrException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "ErrException{} " + super.toString();
    }
}
