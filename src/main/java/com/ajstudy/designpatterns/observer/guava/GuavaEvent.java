package com.ajstudy.designpatterns.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @ClassName: GuavaEvent
 * @Author: aiJun
 * @Description: TODO
 * @date: 2020-01-03  18:19
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
//业务逻辑
        System.out.println("执行subscribe 方法,传入的参数是:" + str);
    }
}
