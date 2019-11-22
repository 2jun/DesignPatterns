package com.ajstudy.designpatterns.strategy.promotion;

/**
 * @ClassName: CouponStrategy
 * @Author: aiJun
 * @Description: TODO优惠券
 * @date: 2019-11-22  17:06
 */
public class CouponStrategy implements  PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
