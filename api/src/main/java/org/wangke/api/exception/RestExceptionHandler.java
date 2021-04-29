package org.wangke.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.wangke.api.common.dto.RestResponse;
import org.wangke.api.common.utils.ResponseUtil;

@RestControllerAdvice
public class RestExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ErrException.class)
    @ResponseStatus(value = HttpStatus.OK)
    public RestResponse<Number> HandError(ErrException ex){

        return ResponseUtil.errResponse(ex.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(WarnException.class)
    @ResponseStatus(value = HttpStatus.OK)
    public RestResponse<Number> HandWarn(WarnException ex){

        return ResponseUtil.warnResponse(ex.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public RestResponse<Number> HandAllError(RuntimeException ex){

        return ResponseUtil.errResponse(ex.getMessage());
    }
}
