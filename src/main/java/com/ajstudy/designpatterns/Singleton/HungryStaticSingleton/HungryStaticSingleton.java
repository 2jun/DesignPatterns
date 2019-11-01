package com.ajstudy.designpatterns.Singleton.HungryStaticSingleton;

/**
 * @Author: aiJun
 * @Date: 2019-11-01 13:09
 * @Version 1.0
 */

public class HungryStaticSingleton {
    //饿汉式静态代码块单例
    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungrySingleton;
    }
}
