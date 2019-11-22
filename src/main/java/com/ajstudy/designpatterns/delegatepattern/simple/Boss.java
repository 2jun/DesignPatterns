package com.ajstudy.designpatterns.delegatepattern.simple;

/**
 * @ClassName: Boss
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-22  14:52
 */
public class Boss {
    //老板让项目经理感觉，项目经理负责具体调度。员工具体干活
    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
