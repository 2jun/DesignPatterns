package com.ajstudy.designpatterns.decorator.battercake.v2;

/**
 * @ClassName: SausageDecorator
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  15:14
 */
public class SausageDecorator extends BattercakeDecotator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething() {}
    @Override
    protected String getMsg() {
        return super.getMsg() + "+1 根香肠";
    }
    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }


}
