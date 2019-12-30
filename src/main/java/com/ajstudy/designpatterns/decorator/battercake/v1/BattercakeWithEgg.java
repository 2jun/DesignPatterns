package com.ajstudy.designpatterns.decorator.battercake.v1;

/**
 * @ClassName: BattercakeWithEgg
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  14:45
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
