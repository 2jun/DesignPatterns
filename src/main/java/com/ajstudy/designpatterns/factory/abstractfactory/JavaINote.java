package com.ajstudy.designpatterns.factory.abstractfactory;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 18:19
 * @Version 1.0
 */
public class JavaINote implements INote {
    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
