package com.ajstudy.designpatterns.decorator.battercake.v2;

/**
 * @ClassName: EggDecorator
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  15:10
 */
public class EggDecorator extends BattercakeDecotator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }
    protected void doSomething() {}
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1 个鸡蛋";
    }
    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }

}
