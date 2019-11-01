package com.ajstudy.designpatterns.Singleton.LazySimpleSingleton;

/**
 * @Author: aiJun
 * @Date: 2019-11-01 13:23
 * @Version 1.0
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"---->DoubleCheckSingletonExectorThread  instance="+instance);
    }
}
