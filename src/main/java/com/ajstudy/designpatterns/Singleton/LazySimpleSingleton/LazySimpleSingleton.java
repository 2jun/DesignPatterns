package com.ajstudy.designpatterns.Singleton.LazySimpleSingleton;

/**
 * @Author: aiJun
 * @Date: 2019-11-01 13:18
 * @Version 1.0
 */
//懒汉式单例
//在外部需要使用的时候才进行实例化
public class LazySimpleSingleton {
    //静态块，公共内存区域
    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton() {
    }

    /**
     * synchronized 监视锁的运行状态，线程安全的问题便解决了。但是，用
     * synchronized 加锁，在线程数量比较多情况下，如果CPU 分配压力上升，会导致大批
     * 量线程出现阻塞，从而导致程序运行性能大幅下降。
     * @return
     */
    public synchronized static  LazySimpleSingleton getInstance() {
        if (null == lazySimpleSingleton) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
