package com.ajstudy.designpatterns.PrototypePattern.depthClone;

import java.io.Serializable;

/**
 * @ClassName: JinGuBang
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-04  13:15
 */
public class JinGuBang implements Serializable {
    private static final long serialVersionUID = 7750674971912803210L;

    public float h = 100;
    public float d = 10;
    public void big(){
        this.d *= 2;
        this.h *= 2;
    }
    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
