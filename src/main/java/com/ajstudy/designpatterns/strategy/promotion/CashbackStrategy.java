package com.ajstudy.designpatterns.strategy.promotion;

/**
 * @ClassName: CouponStrategy
 * @Author: aiJun
 * @Description: 返现活动
 * @date: 2019-11-22  17:06
 */
public class CashbackStrategy implements  PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
