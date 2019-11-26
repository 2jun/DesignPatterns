package com.ajstudy.designpatterns.strategy.pay.payport;

/**
 * @ClassName: JDPay
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-26  18:41
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 700D;
    }
}
