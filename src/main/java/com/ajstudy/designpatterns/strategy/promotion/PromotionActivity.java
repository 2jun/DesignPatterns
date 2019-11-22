package com.ajstudy.designpatterns.strategy.promotion;

/**
 * @ClassName: PromotionActivity
 * @Author: aiJun
 * @Description: TODO 优惠活动
 * @date: 2019-11-22  17:10
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }
}
