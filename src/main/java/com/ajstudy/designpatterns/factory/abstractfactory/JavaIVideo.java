package com.ajstudy.designpatterns.factory.abstractfactory;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 18:17
 * @Version 1.0
 */
public class JavaIVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Java视频");
    }
}
