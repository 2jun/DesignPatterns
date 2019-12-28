package com.ajstudy.designpatterns.adapter.loginadapter.v2;

import com.ajstudy.designpatterns.adapter.loginadapter.v1.ResultMsg;

/**
 * @ClassName: LoginForWechatAdapter
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  22:04
 */
public class LoginForWechatAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
