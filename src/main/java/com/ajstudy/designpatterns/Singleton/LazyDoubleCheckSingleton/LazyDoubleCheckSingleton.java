package com.ajstudy.designpatterns.Singleton.LazyDoubleCheckSingleton;

/**
 * @Author: aiJun
 * @Date: 2019-11-01 13:49
 * @Version 1.0
 */
public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton() {
    }

    private volatile static LazyDoubleCheckSingleton lazy = null;

    public static LazyDoubleCheckSingleton getInstance() {
        if (null == lazy) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (null == lazy) {
                    lazy = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy 指向刚分配的内存地址
                }
            }
        }

        return lazy;
    }
}
