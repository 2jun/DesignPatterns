package com.ajstudy.designpatterns.adapter.loginadapter.v2;

import com.ajstudy.designpatterns.adapter.loginadapter.v1.ResultMsg;

/**
 * @ClassName: LoginForTelAdapter
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  22:02
 */
public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
