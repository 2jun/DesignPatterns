package com.ajstudy.designpatterns.proxyPattern;

import com.ajstudy.designpatterns.proxyPattern.dynamicproxy.Customer;
import com.ajstudy.designpatterns.proxyPattern.dynamicproxy.JDKMeipo;
import com.ajstudy.designpatterns.proxyPattern.dynamicproxy.OrderServiceDynamicProxy;
import com.ajstudy.designpatterns.proxyPattern.staticproxy.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: PrototypePatternMainMethod
 * @Author: aiJun
 * @Description: 代理模式（ProxyPattern）的定义也非常简单，是指为其他对象提供一种代理，以控制对这个对象的访问。
 * 代理对象在客服端和目标对象之间起到中介作用，代理模式属于结构型设计模式。使用
 * 代理模式主要有两个目的：一保护目标对象，二增强目标对象。
 * @date: 2019-11-04  11:15
 */
public class ProxyPatternMainMethod {


    public static void main(String[] args) throws Exception {
//        静态代理模式测试
//        代理类拿到被代理类的对象引用
//        testStaticProxy();

        /*。在分布式业务场景中，我们通常会对数据库进行分库分表，
        分库分表之后使用Java 操作时，就可能需要配置多个数据源，我们通过设置数据源路由
        来动态切换数据源。*/
//        testStaticProxyOfCheckDb();
    //        动态代理和静态对比基本思路是一致的，只不过动态代理功能更加强大，随着业务的扩
    //展适应性更强。如果还以找对象为例，使用动态代理相当于是能够适应复杂的业务场景。
    //不仅仅只是父亲给儿子找对象，如果找对象这项业务发展成了一个产业，进而出现了媒
    //婆、婚介所等这样的形式。那么，此时用静态代理成本就更大了，需要一个更加通用的
    //解决方案，要满足任何单身人士找对象的需求。我们升级一下代码，先来看JDK 实现方
    //式
//        testDynamicProxy();
        /*我们再来看数据源动态路由业务，帮助小伙伴们对动态代理加深一下印象*/
        testDynamicDatasourse();
    }

    private static void testDynamicDatasourse() {
        try {

            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2018/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new
                    OrderService());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testDynamicProxy() {
        try {
            Person instance = (Person) new JDKMeipo().getInstance(new Customer());
            instance.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testStaticProxyOfCheckDb() throws Exception {
        Order order = new Order();
        // Date today = new Date();
        // order.setCreateTime(today.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("2017/02/01");
        order.setCreateTime(date.getTime());
        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        orderService.createOrder(order);

    }

    private static void testStaticProxy() {
        Father father = new Father(new Son());
        father.findLove();
    }

}
