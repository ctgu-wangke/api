package org.wangke.api.common.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RestResponse<T> {
    private ResponseCode code;
    private String msg;
    private T body;

}
