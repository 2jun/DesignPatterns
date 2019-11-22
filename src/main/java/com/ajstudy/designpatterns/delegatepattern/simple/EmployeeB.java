package com.ajstudy.designpatterns.delegatepattern.simple;

/**
 * @ClassName: EmployeeA
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-22  14:45
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "工作");
    }
}
