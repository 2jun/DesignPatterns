package com.ajstudy.designpatterns.factory.abstractfactory;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 18:22
 * @Version 1.0
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public IVideo createIVideo() {
        return new PythonIVideo();
    }

    @Override
    public INote createINote() {
        return new PythonINote();
    }
}
