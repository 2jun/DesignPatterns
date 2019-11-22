package com.ajstudy.designpatterns.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: PromotionStrategyFactory
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-22  17:42
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
    }

    public PromotionStrategyFactory() {
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }

}
