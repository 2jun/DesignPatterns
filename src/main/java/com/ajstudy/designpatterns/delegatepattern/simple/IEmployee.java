package com.ajstudy.designpatterns.delegatepattern.simple;

/**
 * @ClassName: IEmployee
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-22  14:43
 */
public interface IEmployee {
    void doing(String command);

    public static void main(String[] args) {
        String s="1";
        System.out.println(s.equals(null));
    }
}
