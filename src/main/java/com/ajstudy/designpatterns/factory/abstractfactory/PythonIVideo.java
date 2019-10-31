package com.ajstudy.designpatterns.factory.abstractfactory;

/**
 * @Author: aiJun
 * @Date: 2019-10-31 18:18
 * @Version 1.0
 */
public class PythonIVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
