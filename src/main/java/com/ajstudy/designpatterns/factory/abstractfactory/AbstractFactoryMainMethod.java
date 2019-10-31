package com.ajstudy.designpatterns.factory.abstractfactory;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 17:13
 * @Version 1.0
 */
//   抽象工厂方法调用
public class AbstractFactoryMainMethod {
//    看一个具体的业务场景而且用代码来实现。还是以课程为例，第三期课程有了
//    新的标准，每个课程不仅要提供课程的录播视频，而且还要提供老师的课堂笔记。相当
//    于现在的业务变更为同一个课程不单纯是一个课程信息，要同时包含录播视频、课堂笔
//    记甚至还要提供源码才能构成一个完整的课程。在产品等级中增加两个产品IVideo 录播
//    视频和INote 课堂笔记。
    public static void main(String[] args) throws Exception {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.createINote().edit();
        courseFactory.createIVideo().record();
        System.out.println("--------------------------------------------->>>>");
        courseFactory=new PythonCourseFactory();
        courseFactory.createIVideo().record();
        courseFactory.createINote().edit();

    }
}
