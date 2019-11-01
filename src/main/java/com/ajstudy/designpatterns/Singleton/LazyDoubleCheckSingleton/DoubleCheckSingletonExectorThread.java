package com.ajstudy.designpatterns.Singleton.LazyDoubleCheckSingleton;

/**
 * @Author: aiJun
 * @Date: 2019-11-01 13:23
 * @Version 1.0
 */
public class DoubleCheckSingletonExectorThread implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"---->DoubleCheckSingletonExectorThread  instance="+instance);
    }
}
