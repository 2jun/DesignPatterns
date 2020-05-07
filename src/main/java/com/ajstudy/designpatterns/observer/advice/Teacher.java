package com.ajstudy.designpatterns.observer.advice;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName: Teacher
 * @Author: aiJun
 * @Description: TODO
 * @date: 2020-01-03  14:16
 */
public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        Zaj Zaj = (Zaj) o;
        Question question = (Question) arg;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + Zaj.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
