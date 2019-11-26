package com.ajstudy.designpatterns.strategy.pay.payport;

/**
 * @ClassName: WechatPay
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-26  18:42
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500D;
    }
}
