package com.ajstudy.designpatterns.template.course;

/**
 * @ClassName: BigDataCourse
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-27  13:39
 */
public class BigDataCourse extends NetworkCourse {
    private boolean needHomework;

    public BigDataCourse(boolean needHomework) {
        this.needHomework = needHomework;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据的课程");
    }

    @Override
    protected boolean needHomework() {
        return needHomework;
    }
}
