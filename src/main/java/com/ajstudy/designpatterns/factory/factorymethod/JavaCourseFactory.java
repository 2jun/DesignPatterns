package com.ajstudy.designpatterns.factory.factorymethod;

import com.ajstudy.designpatterns.factory.simplefactory.service.ICourse;
import com.ajstudy.designpatterns.factory.simplefactory.service.impl.JavaCourse;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:51
 * @Version 1.0
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
