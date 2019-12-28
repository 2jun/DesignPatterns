package com.ajstudy.designpatterns.adapter.loginadapter.v2;

import com.ajstudy.designpatterns.adapter.loginadapter.v1.ResultMsg;

/**
 * @ClassName: LoginForQQAdapter
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  21:56
 */
public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
