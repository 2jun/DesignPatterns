package com.ajstudy.designpatterns.Singleton.ThreadLocalSingleton;

/**
 * @ClassName: ThreadLocalSingleton
 * @Author: aiJun
 * @Description: 线程单例实现ThreadLocal。ThreadLocal 不能保证其
 * 创建的对象是全局唯一，但是能保证在单个线程中是唯一的，天生的线程安全。
 * @date: 2019-11-04  10:36
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = ThreadLocal.withInitial(ThreadLocalSingleton::new);
    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }
}
