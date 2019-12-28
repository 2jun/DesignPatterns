package com.ajstudy.designpatterns.adapter.loginadapter.v1;

/**
 * @ClassName: SigninForThirdServiceTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  21:52
 */
public class SigninForThirdServiceTest {
    public static void main(String[] args) {
        SigninForThirdService service = new SigninForThirdService(); //不改变原来的代码，也要能够兼容新的需求 //还可以再加一层策略模式
        service.loginForQQ("sdfgdgfwresdf9123sdf");
    }
}
