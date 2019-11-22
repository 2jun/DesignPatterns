package com.ajstudy.designpatterns.strategy.promotion;

/**
 * @ClassName: CouponStrategy
 * @Author: aiJun
 * @Description: 拼团优惠
 * @date: 2019-11-22  17:06
 */
public class EmptyStrategy implements  PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
