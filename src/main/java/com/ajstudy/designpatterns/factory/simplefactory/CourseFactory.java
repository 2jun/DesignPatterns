package com.ajstudy.designpatterns.factory.simplefactory;

import com.ajstudy.designpatterns.factory.simplefactory.service.ICourse;
import com.ajstudy.designpatterns.factory.simplefactory.service.impl.JavaCourse;
import com.ajstudy.designpatterns.factory.simplefactory.service.impl.PythonCourse;
import org.springframework.util.StringUtils;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:15
 * @Version 1.0
 */
public class CourseFactory {
    //    课程名创建
    public static ICourse create(String courseName) {
        if ("java".equals(courseName)) {
            return new JavaCourse();
        } else if ("python".equals(courseName)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }

    //    反射创建
    public static ICourse createByClassName(String className) throws Exception, InstantiationException {
        if (!StringUtils.isEmpty(className)) {
            return (ICourse) Class.forName(className).newInstance();
        }
        return null;
    }

    public static ICourse createByClass(Class<? extends ICourse> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}
