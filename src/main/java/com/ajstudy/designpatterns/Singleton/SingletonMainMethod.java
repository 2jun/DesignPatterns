package com.ajstudy.designpatterns.Singleton;

import com.ajstudy.designpatterns.Singleton.HungrySingleton.HungrySingleton;
import com.ajstudy.designpatterns.Singleton.LazyDoubleCheckSingleton.DoubleCheckSingletonExectorThread;
import com.ajstudy.designpatterns.Singleton.LazyInnerClassSingleton.LazyInnerClassSingleton;
import com.ajstudy.designpatterns.Singleton.LazyInnerClassSingleton.LazytInnerClassSingletonExectorThread;
import com.ajstudy.designpatterns.Singleton.LazySimpleSingleton.ExectorThread;
import com.ajstudy.designpatterns.Singleton.SeriableSingleton.SeriableSingleton;
import com.ajstudy.designpatterns.Singleton.registeSingleton.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
//        testDestroySingleton();

//        /**
//         * 序列化破坏单例
//         * 当我们将一个单例对象创建好，有时候需要将对象序列化然后写入到磁盘，下次使用时
//         * 再从磁盘中读取到对象，反序列化转化为内存对象。反序列化后的对象会重新分配内存，
//         * 即重新创建。那如果序列化的目标的对象为单例对象，就违背了单例模式的初衷，相当
//         * 于破坏了单例，
//         */
//        testSeriableSingleton();

        /**
         * 注册式单例
         * 注册式单例又称为登记式单例，就是将每一个实例都登记到某一个地方，使用唯一的标
         * 识获取实例。注册式单例有两种写法：一种为容器缓存，一种为枚举登记。先来看枚举
         * 式单例的写法
         */
//        testEnumSingleton();

        /*
        测试枚举破坏      枚举
        ？枚举式单例也是《Effective Java》书中推荐的一种单例实现写法。在JDK 枚举的语法特殊性，以及反射也为枚举保
        驾护航，让枚举式单例成为一种比较优雅的实现。
         */
        testRefEnumSingleton();
    }

    private static void testRefEnumSingleton() throws Exception {

        Class clazz = EnumSingleton.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        declaredConstructor.newInstance();
    }

    private static void testEnumSingleton() throws Exception {

        try {
            EnumSingleton instance1 = null;
            EnumSingleton instance2 = EnumSingleton.getInstance();
            instance2.setData(new Object());
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();
            ois.close();
            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            System.out.println(instance1.getData() == instance2.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testSeriableSingleton() {
        SeriableSingleton s1;
        SeriableSingleton s2 = SeriableSingleton.getInstance();
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton) ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
