package com.ajstudy.designpatterns.decorator.battercake.old;

/**
 * @ClassName: ISigninService
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  16:50
 */
public interface ISigninService {
    ResultMsg regist(String username, String password);
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    ResultMsg login(String username, String password);
}
