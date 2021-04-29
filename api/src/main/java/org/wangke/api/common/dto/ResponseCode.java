package org.wangke.api.common.dto;

import lombok.ToString;


public enum ResponseCode {

    SUCCESS("ok"), WARN("warn"),ERROR("err");

    private String desc ;

    private ResponseCode(String desc){
        desc = desc;
    }

    @Override
    public String toString() {
        return this.desc;
    }
}
