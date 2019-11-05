package com.ajstudy.designpatterns.proxyPattern;

/**
 * @ClassName: Father
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-05  9:12
 */
public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }
    public void findLove(){
        System.out.println("父母帮忙物色-->");
        this.son.findLove();
        System.out.println("  同意交往<---");
    }
}
