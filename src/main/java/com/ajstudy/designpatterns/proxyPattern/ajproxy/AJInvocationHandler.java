package com.ajstudy.designpatterns.proxyPattern.ajproxy;

import java.lang.reflect.Method;

/**
 * @ClassName: AJInvocationHandler
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-19  14:21
 */
public interface AJInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
