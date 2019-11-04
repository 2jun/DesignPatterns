package com.ajstudy.designpatterns.PrototypePattern.simpleClone;

/**
 * @ClassName: Client
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-04  11:10
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }
    public Prototype startClone(){
        return prototype.clone();
    }
}
