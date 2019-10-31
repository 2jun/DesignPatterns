package com.ajstudy.designpatterns.factory.factorymethod;

import com.ajstudy.designpatterns.factory.simplefactory.service.ICourse;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:48
 * @Version 1.0
 */
/*工厂方法*/
public interface ICourseFactory {
    ICourse create();
}
