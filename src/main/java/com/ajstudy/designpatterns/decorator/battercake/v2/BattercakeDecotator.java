package com.ajstudy.designpatterns.decorator.battercake.v2;

/**
 * @ClassName: BattercakeDecotator
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  15:07
 */
public class BattercakeDecotator extends BaseBattercake {

    //静态代理，委派
    private Battercake battercake;

    public BattercakeDecotator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
