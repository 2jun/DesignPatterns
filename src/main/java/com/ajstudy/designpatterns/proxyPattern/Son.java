package com.ajstudy.designpatterns.proxyPattern;

/**
 * @ClassName: Son
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-05  9:10
 */
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子要求：肤白貌美-大长腿。");
    }
}
