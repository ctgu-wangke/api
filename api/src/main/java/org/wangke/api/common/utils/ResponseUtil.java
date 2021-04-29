package org.wangke.api.common.utils;

import org.wangke.api.common.dto.ResponseCode;
import org.wangke.api.common.dto.RestResponse;
public class ResponseUtil {

    public static<T> RestResponse okResponse(String msg , T body){
        RestResponse response = new RestResponse();
        response.setMsg(msg);
        response.setBody(body);
        response.setCode(ResponseCode.SUCCESS);
        return  response;
    }

    public static RestResponse errResponse(String msg ){
        RestResponse response = new RestResponse();
        response.setMsg(msg);
        //response.setBody(body);
        response.setCode(ResponseCode.ERROR);
        return  response;
    }

    public static RestResponse warnResponse(String msg ){
        RestResponse response = new RestResponse();
        response.setMsg(msg);
        //response.setBody(body);
        response.setCode(ResponseCode.WARN);
        return  response;
    }

}
