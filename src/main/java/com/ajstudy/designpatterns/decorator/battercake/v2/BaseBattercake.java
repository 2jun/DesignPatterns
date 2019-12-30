package com.ajstudy.designpatterns.decorator.battercake.v2;

/**
 * @ClassName: BaseBattercake
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  15:04
 */
public class BaseBattercake extends Battercake {
    protected String getMsg() {
        return "煎饼";
    }

    protected int getPrice() {
        return 5;
    }
}
