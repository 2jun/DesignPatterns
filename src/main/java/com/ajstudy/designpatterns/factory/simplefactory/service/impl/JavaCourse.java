package com.ajstudy.designpatterns.factory.simplefactory.service.impl;

import com.ajstudy.designpatterns.factory.simplefactory.service.ICourse;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:13
 * @Version 1.0
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Java Study");
    }
}
