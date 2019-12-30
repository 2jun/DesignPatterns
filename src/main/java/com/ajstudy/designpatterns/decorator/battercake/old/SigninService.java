package com.ajstudy.designpatterns.decorator.battercake.old;

/**
 * @ClassName: SigninService
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-30  16:51
 */
public class SigninService implements ISigninService {
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }
}
