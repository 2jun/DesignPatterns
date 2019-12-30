package com.ajstudy.designpatterns.decorator.battercake.v1;

/**
 * @ClassName: BattercakeWithEggAndSausage
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  14:53
 */
public class BattercakeWithEggAndSausage extends Battercake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1 根香肠";
    }

    @Override
//加一个香肠加2 块钱
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
