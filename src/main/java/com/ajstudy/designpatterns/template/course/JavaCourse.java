package com.ajstudy.designpatterns.template.course;

/**
 * @ClassName: JavaCourse
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-27  13:38
 */
public class JavaCourse extends NetworkCourse {
    @Override
    void checkHomework() {
        System.out.println("检查Java的架构课件");
    }
}
