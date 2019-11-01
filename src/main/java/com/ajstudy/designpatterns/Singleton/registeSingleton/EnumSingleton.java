package com.ajstudy.designpatterns.Singleton.registeSingleton;

/**
 * @Author: aiJun
 * @Date: 2019-11-01 17:02
 * 枚举登记。先来看枚举式单例
 * @Version 1.0
 */

public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
