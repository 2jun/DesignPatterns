package com.ajstudy.designpatterns.Singleton;

import com.ajstudy.designpatterns.Singleton.HungrySingleton.HungrySingleton;
import com.ajstudy.designpatterns.Singleton.LazyDoubleCheckSingleton.DoubleCheckSingletonExectorThread;
import com.ajstudy.designpatterns.Singleton.LazySimpleSingleton.ExectorThread;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:13
 * @Version 1.0
 */

public class HungrySingletonMainMethod {

    public static void main(String[] args) throws Exception {
        //饿汉式单例方法调用
//        testHungrySingleton();
        //懒汉式单例方法调用--锁方法性能差
//        testLazySimpleSingleton();
        //懒汉式单例方法调用--双重锁校验
        testLazyDoubleCheckSingleton();

    }

    /**
     * //懒汉式单例方法调用--双重锁校验
     */
    private static void testLazyDoubleCheckSingleton() {
        new Thread(new DoubleCheckSingletonExectorThread()).start();
        new Thread(new DoubleCheckSingletonExectorThread()).start();
        System.out.println("testLazyDoubleCheckSingleton   is end ...");
    }

    /**
     * //懒汉式单例方法调用--锁方法性能差
     */
    private static void testLazySimpleSingleton() {
        new Thread(new ExectorThread()).start();
        new Thread(new ExectorThread()).start();
        System.out.println("testLazySimpleSingleton   is end ...");
    }

    /**
     * //    饿汉式单例方法调用
     */
    private static void testHungrySingleton() {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(instance);
    }
}
