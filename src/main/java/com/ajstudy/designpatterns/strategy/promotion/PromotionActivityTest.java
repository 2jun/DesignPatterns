package com.ajstudy.designpatterns.strategy.promotion;

/**
 * @ClassName: PromotionActivityTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-22  17:14
 */
public class PromotionActivityTest {
//    public static void main(String[] args) {
//
//        PromotionActivity promotionActivity618 = new PromotionActivity(new CashbackStrategy());
//        PromotionActivity promotionActivity1212 = new PromotionActivity(new CouponStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new EmptyStrategy());
//        promotionActivity618.execute();
//        promotionActivity1111.execute();
//        promotionActivity1212.execute();
//
//    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String activity = "GROUPBUY";
//        if (Objects.equals(activity, "COUPON")) {
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        } else if (Objects.equals(activity, "CASHBACK")) {
//            promotionActivity = new PromotionActivity(new CashbackStrategy());
//        } else if (Objects.equals(activity, "GROUPBUY")) {
//            promotionActivity = new PromotionActivity(new GroupbuyStrategy());
//        } else if (Objects.equals(activity, "EMPTY")) {
//            promotionActivity = new PromotionActivity(new EmptyStrategy());
//        }
//        promotionActivity.execute();
//    }

    public static void main(String[] args) {
        String promotionKey = "CASHBACK";
        PromotionActivity promotionActivity = new
                PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }

}
