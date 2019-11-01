package com.ajstudy.designpatterns.Singleton.HungrySingleton;

/**
 * @Author: aiJun
 * @Date: 2019-11-01 13:09
 * @Version 1.0
 */

public class HungrySingleton {
    //饿汉式单例
    private static final HungrySingleton hungrySingleton =new HungrySingleton();
    private HungrySingleton() {
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
