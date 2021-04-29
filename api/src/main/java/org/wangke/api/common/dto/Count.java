package org.wangke.api.common.dto;

/**
 * 计数器类
 */
public class Count {

    private int count = 0  ;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void selfAdd(){

        count ++;
    }
}
