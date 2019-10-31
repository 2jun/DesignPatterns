package com.ajstudy.designpatterns.factory.abstractfactory;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 18:20
 * @Version 1.0
 */
public class PythonINote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
