package com.ajstudy.designpatterns.Singleton.SeriableSingleton;

import java.io.Serializable;

/**
 * @Author: aiJun
 * @Date: 2019-11-01 16:06
 * @Version 1.0
 */
public class SeriableSingleton implements Serializable {
    private SeriableSingleton() {
    }
    private static final SeriableSingleton INSTANCE =new SeriableSingleton();

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve(){
        return INSTANCE;
    }

}
