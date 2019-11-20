package com.ajstudy.designpatterns.PrototypePattern.depthClone;


import java.util.Date;

/**
 * @ClassName: Monkey
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-04  13:11
 */
public class Monkey {
    public int height;
    public int weight;
    public Date birthday;

    public Monkey(int height, int weight, Date birthday) {
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
    }
}
