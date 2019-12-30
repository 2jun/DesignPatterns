package com.ajstudy.designpatterns.decorator.battercake.upgrade;

import com.ajstudy.designpatterns.decorator.battercake.old.ISigninService;
import com.ajstudy.designpatterns.decorator.battercake.old.ResultMsg;

/**
 * @ClassName: ISigninForThirdService
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  16:57
 */
public interface ISigninForThirdService extends ISigninService {
    /**
     * QQ 登录
     *
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     *
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     *
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     *
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);

    /**
     * 注册后自动登录
     *
     * @param username
     * @param passport
     * @return 咕泡出品，必属精品www.gupaoedu.com
     * 12
     */
    ResultMsg loginForRegist(String username, String passport);
}