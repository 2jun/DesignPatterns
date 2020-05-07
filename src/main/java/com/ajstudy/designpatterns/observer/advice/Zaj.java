package com.ajstudy.designpatterns.observer.advice;

import java.util.Observable;

/**
 * @ClassName: ZAJ
 * @Author: aiJun
 * @Description: TODO
 * @date: 2020-01-03  14:10
 * 观察者模式
 */
public class Zaj extends Observable {
    private String name = "Zaj 生态圈";
    private static Zaj Zaj = null;

    private Zaj() {
    }

    public static Zaj getInstance() {
        if (null == Zaj) {
            Zaj = new Zaj();
        }
        return Zaj;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
