package com.ajstudy.designpatterns.proxyPattern.dynamicproxy.jdkproxy;

import com.ajstudy.designpatterns.proxyPattern.staticproxy.Person;

/**
 * @ClassName: Customer
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-18  12:41
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("六块腹肌");
    }
}
