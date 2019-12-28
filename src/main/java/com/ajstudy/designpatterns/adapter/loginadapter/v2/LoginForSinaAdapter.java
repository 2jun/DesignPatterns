package com.ajstudy.designpatterns.adapter.loginadapter.v2;

import com.ajstudy.designpatterns.adapter.loginadapter.v1.ResultMsg;

/**
 * @ClassName: LoginForSinaAdapter
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  22:00
 */
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
