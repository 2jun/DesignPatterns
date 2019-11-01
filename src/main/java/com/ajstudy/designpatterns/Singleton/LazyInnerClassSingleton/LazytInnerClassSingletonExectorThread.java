package com.ajstudy.designpatterns.Singleton.LazyInnerClassSingleton;

/**
 * @Author: aiJun
 * @Date: 2019-11-01 13:23
 * @Version 1.0
 */
public class LazytInnerClassSingletonExectorThread implements Runnable {
    @Override
    public void run() {
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"---->LazyInnerClassSingleton  instance="+instance);
    }
}
