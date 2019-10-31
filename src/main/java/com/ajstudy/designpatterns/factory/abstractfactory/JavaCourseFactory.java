package com.ajstudy.designpatterns.factory.abstractfactory;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 18:21
 * @Version 1.0
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public IVideo createIVideo() {
        return new JavaIVideo();
    }

    @Override
    public INote createINote() {
        return new JavaINote();
    }
}
