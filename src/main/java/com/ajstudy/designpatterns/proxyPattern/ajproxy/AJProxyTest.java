package com.ajstudy.designpatterns.proxyPattern.ajproxy;

import com.ajstudy.designpatterns.proxyPattern.dynamicproxy.jdkproxy.Customer;
import com.ajstudy.designpatterns.proxyPattern.staticproxy.Person;

/**
 * @ClassName: AJProxyTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-20  17:26
 */
public class AJProxyTest {
    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new AJMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
