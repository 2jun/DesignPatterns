package com.ajstudy.designpatterns.strategy.pay.payport;

/**
 * @ClassName: AliPay
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-26  18:39
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝a";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900D;
    }
}
