package com.ajstudy.designpatterns.adapter.loginadapter.v2;

import com.ajstudy.designpatterns.adapter.loginadapter.v1.ResultMsg;

/**
 * @ClassName: LoginAdapter
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  21:54
 */
public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
