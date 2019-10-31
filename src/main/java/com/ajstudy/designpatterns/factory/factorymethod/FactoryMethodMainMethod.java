package com.ajstudy.designpatterns.factory.factorymethod;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:13
 * @Version 1.0
 */
//    工厂方法调用
public class FactoryMethodMainMethod {

//    工厂方法适用于以下场景：
//            1、创建对象需要大量重复的代码。
//            2、客户端（应用层）不依赖于产品类实例如何被创建、实现等细节。
//            3、一个类通过其子类来指定创建哪个对象。
//    工厂方法也有缺点：
//            1、类的个数容易过多，增加复杂度。
//            2、增加了系统的抽象性和理解难度。
    public static void main(String[] args) throws Exception {
        ICourseFactory factory = new JavaCourseFactory();
        factory.create().record();

        factory=new PythonCourseFactory();
        factory.create().record();
    }
}
