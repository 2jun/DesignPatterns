package com.ajstudy.designpatterns.Singleton;

import com.ajstudy.designpatterns.Singleton.HungrySingleton.HungrySingleton;
import com.ajstudy.designpatterns.Singleton.LazyDoubleCheckSingleton.DoubleCheckSingletonExectorThread;
import com.ajstudy.designpatterns.Singleton.LazyInnerClassSingleton.LazyInnerClassSingleton;
import com.ajstudy.designpatterns.Singleton.LazyInnerClassSingleton.LazytInnerClassSingletonExectorThread;
import com.ajstudy.designpatterns.Singleton.LazySimpleSingleton.ExectorThread;

import java.lang.reflect.Constructor;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:13
 * @Version 1.0
 */

public class SingletonMainMethod {

    public static void main(String[] args) throws Exception {
        //饿汉式单例方法调用
//        testHungrySingleton();

        //懒汉式单例方法调用--锁方法性能差
//        testLazySimpleSingleton();

        //懒汉式单例方法调用--双重锁校验
//        testLazyDoubleCheckSingleton();

//兼顾饿汉式的内存浪费，也兼顾synchronized 性能问题。内部类一定是要在方
//     * 法调用之前初始化，巧妙地避免了线程安全问题。
//        testLazyInnerClassSingleton();

        /********使用反射破坏单例************/
        testDestroySingleton();

    }

    private static void testDestroySingleton() throws Exception {
        //很无聊的情况下，进行破坏
        Class<?> clazz = LazyInnerClassSingleton.class;
        //通过反射拿到私有的构造方法
        Constructor c = clazz.getDeclaredConstructor(null);
        //强制访问
        c.setAccessible(true);
        //暴力初始化
        Object o1 = c.newInstance();
        //调用了两次构造方法，相当于new 了两次
        //犯了原则性问题，
        Object o2 = c.newInstance();
        System.out.println(o1 == o2);
    }

    /**
     * //兼顾饿汉式的内存浪费，也兼顾synchronized 性能问题。内部类一定是要在方
     * 法调用之前初始化，巧妙地避免了线程安全问题。
     */
    private static void testLazyInnerClassSingleton() {
        new Thread(new LazytInnerClassSingletonExectorThread()).start();
        new Thread(new LazytInnerClassSingletonExectorThread()).start();
//        System.out.println("testLazyDoubleCheckSingleton   is end ...");
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
