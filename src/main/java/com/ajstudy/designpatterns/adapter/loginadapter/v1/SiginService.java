package com.ajstudy.designpatterns.adapter.loginadapter.v1;

import com.ajstudy.designpatterns.template.domain.Member;

/**
 * @ClassName: SiginService
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  21:43
 */
public class SiginService {
    /*** 注册方法 * @param username * @param password * @return */
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    /*** 登录的方法 * @param username * @param password * @return */
    public ResultMsg login(String username, String password) {
        return null;
    }
}
