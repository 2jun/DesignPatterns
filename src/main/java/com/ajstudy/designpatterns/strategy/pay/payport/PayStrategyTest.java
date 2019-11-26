package com.ajstudy.designpatterns.strategy.pay.payport;

/**
 * @ClassName: PayStrategyTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-26  18:53
 *
 * 策略模式的优缺点
 * 优点：
 * 1、策略模式符合开闭原则。
 * 2、避免使用多重条件转移语句，如if...else...语句、switch 语句
 * 3、使用策略模式可以提高算法的保密性和安全性。
 * 缺点：
 * 1、客户端必须知道所有的策略，并且自行决定使用哪一个策略类。
 * 2、代码中会产生非常多策略类，增加维护难度。
 */
public class PayStrategyTest {
    public static void main(String[] args) {
//省略把商品添加到购物车，再从购物车下单
//直接从点单开始
        Order order = new Order("1", "20180311001000009", 324.45);
//开始支付，选择微信支付、支付宝、银联卡、京东白条、财付通
//每个渠道它支付的具体算法是不一样的
//基本算法固定的
//这个值是在支付的时候才决定用哪个值
        System.out.println(order.pay(PayStrategy.WECHAT_PAY));
    }
}
