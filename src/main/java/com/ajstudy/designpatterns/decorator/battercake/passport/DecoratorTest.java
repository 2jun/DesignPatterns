package com.ajstudy.designpatterns.decorator.battercake.passport;

import com.ajstudy.designpatterns.decorator.battercake.old.SigninService;
import com.ajstudy.designpatterns.decorator.battercake.upgrade.ISigninForThirdService;
import com.ajstudy.designpatterns.decorator.battercake.upgrade.SigninForThirdService;

/**
 * @ClassName: DecoratorTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2020-01-03  10:16
 */
//装饰者模式最本质的特征是讲原有类的附加功能抽离出来，简化原有类的逻辑。通过这
//样两个案例，我们可以总结出来，其实抽象的装饰者是可有可无的，具体可以根据业务
//模型来选择。
public class DecoratorTest {

    public static void main(String[] args) {
        ISigninForThirdService signinForThirdService = new SigninForThirdService(new SigninService());
        signinForThirdService.loginForQQ("**************************************");
//为某个类实现动态增加或者覆盖原有方法的情况，采用装饰器模式
    }
}
