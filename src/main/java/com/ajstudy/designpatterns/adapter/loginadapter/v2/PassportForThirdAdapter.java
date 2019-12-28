package com.ajstudy.designpatterns.adapter.loginadapter.v2;

import com.ajstudy.designpatterns.adapter.loginadapter.v1.ResultMsg;
import com.ajstudy.designpatterns.adapter.loginadapter.v1.SiginService;

/**
 * @ClassName: PassportForThirdAdapter
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  22:05
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }
    public ResultMsg loginForWechat(String id) {
        return processLogin(id,LoginForWechatAdapter.class);
    }
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAdapter.class);
    }
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone,LoginForTelAdapter.class);
    }
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,null);
        return super.login(username,null);
    }
    //这里用到了简单工厂模式及策略模式
    private ResultMsg processLogin(String key,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)) {
                return adapter.login(key, adapter);
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();;
        }
        return null;
    }
}
