package com.ajstudy.designpatterns.decorator.battercake.v1;

/**
 * @ClassName: BattercakeTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  14:55
 */
//未使用装饰者模式
public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + ",总价格：" + battercake.getPrice());
        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价格：" + battercakeWithEgg.getPrice());
        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + ",总价格：" +
                battercakeWithEggAndSausage.getPrice());
    }

}
