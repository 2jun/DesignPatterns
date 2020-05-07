package com.ajstudy.designpatterns.observer.advice;

/**
 * @ClassName: ObserverTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2020-01-03  14:19
 */
public class ObserverTest {
    public static void main(String[] args) {
        Zaj zaj = Zaj.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        zaj.addObserver(tom);
        zaj.addObserver(mic);
//业务逻辑代码
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");
        zaj.publishQuestion(question);
    }
}
