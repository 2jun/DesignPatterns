package com.ajstudy.designpatterns.observer.advice;

/**
 * @ClassName: Question
 * @Author: aiJun
 * @Description: TODO
 * @date: 2020-01-03  14:12
 */
public class Question {
    private String userName;
    private String content;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
