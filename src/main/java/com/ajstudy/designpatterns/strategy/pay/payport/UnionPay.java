package com.ajstudy.designpatterns.strategy.pay.payport;

/**
 * @ClassName: UnionPay
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-26  18:42
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付a";
    }

    @Override
    protected double queryBalance(String uid) {
        return 100D;
    }
}
