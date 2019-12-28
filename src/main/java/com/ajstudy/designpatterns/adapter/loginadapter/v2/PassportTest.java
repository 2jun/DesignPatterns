package com.ajstudy.designpatterns.adapter.loginadapter.v2;

/**
 * @ClassName: PassportTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  22:06
 */
/*
适配器模式的优缺点
        优点：
        1、能提高类的透明性和复用，现有的类复用但不需要改变。
        2、目标类和适配器类解耦，提高程序的扩展性。
        3、在很多业务场景中符合开闭原则。
        缺点：
        1、适配器编写过程需要全面考虑，可能会增加系统的复杂性。
        2、增加代码阅读难度，降低代码可读性，过多使用适配器会使系统代码变得凌乱。*/
public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("");
    }
}
