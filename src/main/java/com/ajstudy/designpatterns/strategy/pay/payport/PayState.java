package com.ajstudy.designpatterns.strategy.pay.payport;

/**
 * @ClassName: PayState
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-22  18:21
 */
public class PayState {
    private int code;
    private Object data;
    private String msg;
    public PayState(int code, String msg,Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public String toString(){
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }
}
