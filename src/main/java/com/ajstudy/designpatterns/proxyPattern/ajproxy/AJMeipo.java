package com.ajstudy.designpatterns.proxyPattern.ajproxy;

import java.lang.reflect.Method;

/**
 * @ClassName: AJMeipo
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-20  17:23
 */
public class AJMeipo implements AJInvocationHandler {
    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return AJProxy.newProxyInstance(new AJClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
