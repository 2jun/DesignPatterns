package com.ajstudy.designpatterns.template.course;

/**
 * @ClassName: NetworkCourseTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-27  13:43
 *
 *
 *
 *
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("创建Java架构课程 start");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();
        System.out.println("创建Java架构课程 end");
        System.out.println("-------------------------");
        System.out.println("创建大数据课程 start");
        BigDataCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
        System.out.println("创建大数据课程   end");

    }
}
