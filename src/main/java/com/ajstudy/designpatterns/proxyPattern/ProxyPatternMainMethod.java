package com.ajstudy.designpatterns.proxyPattern;

/**
 * @ClassName: PrototypePatternMainMethod
 * @Author: aiJun
 * @Description: 代理模式（ProxyPattern）的定义也非常简单，是指为其他对象提供一种代理，以控制对这个对象的访问。
 * 代理对象在客服端和目标对象之间起到中介作用，代理模式属于结构型设计模式。使用
 * 代理模式主要有两个目的：一保护目标对象，二增强目标对象。
 * @date: 2019-11-04  11:15
 */
public class ProxyPatternMainMethod {


    public static void main(String[] args) {
//        静态代理模式测试
//        代理类拿到被代理类的对象引用
        testStaticProxy();

        /*。在分布式业务场景中，我们通常会对数据库进行分库分表，
        分库分表之后使用Java 操作时，就可能需要配置多个数据源，我们通过设置数据源路由
        来动态切换数据源。*/
        testStaticProxyOfCheckDb();
    }

    private static void testStaticProxyOfCheckDb() {


    }

    private static void testStaticProxy() {
        Father father = new Father(new Son());
        father.findLove();
    }

}
