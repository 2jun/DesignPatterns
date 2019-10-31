package com.ajstudy.designpatterns.factory.simplefactory.controller;

import com.ajstudy.designpatterns.factory.simplefactory.CourseFactory;
import com.ajstudy.designpatterns.factory.simplefactory.service.impl.PythonCourse;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:13
 * @Version 1.0
 */
//简单工厂      简单工厂也有它的缺点：工厂类的职责相对过重，不易于扩展过于复杂的产品结构。
public class MainMethod {
    public static void main(String[] args) throws Exception {
//        Objects.requireNonNull(CourseFactory.create("java")).record();
        //反射调用
        CourseFactory.createByClassName("com.ajstudy.designpatterns.factory.simplefactory.service.impl.JavaCourse").record();
//        类调用
        CourseFactory.createByClass(PythonCourse.class).record();
    }
}
