package com.ajstudy.designpatterns.adapter.objectadapter;

/**
 * @ClassName: ObjectAdapterTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-12-28  21:36
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
