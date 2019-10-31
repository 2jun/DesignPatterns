package com.ajstudy.designpatterns.factory.abstractfactory;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 18:15
 * @Version 1.0
 */
public interface CourseFactory {
    IVideo createIVideo();
    INote createINote();
}
