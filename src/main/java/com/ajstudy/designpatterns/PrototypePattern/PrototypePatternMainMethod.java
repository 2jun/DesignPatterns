package com.ajstudy.designpatterns.PrototypePattern;

import com.ajstudy.designpatterns.PrototypePattern.simpleClone.Client;
import com.ajstudy.designpatterns.PrototypePattern.simpleClone.ConcretePrototypeA;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: PrototypePatternMainMethod
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-04  11:15
 */
public class PrototypePatternMainMethod {


    public static void main(String[] args) {
        /**
         *         从测试结果看出hobbies 的引用地址是相同的，意味着复制的不是值，而是引用的地址。
         *             这样的话， 如果我们修改任意一个对象中的属性值， concretePrototype 和
         *            concretePrototypeCone 的hobbies 值都会改变。这就是我们常说的浅克隆。
         */
        testSimpleClone();

    }

    private static void testSimpleClone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        List<String> hobby = new ArrayList<>();
        hobby.add("test1");
        concretePrototypeA.setName("悟空");
        concretePrototypeA.setAge(19);
        concretePrototypeA.setHobbies(hobby);
        Client client = new Client(concretePrototypeA);
        //克隆完之后的对象
        ConcretePrototypeA concretePrototypeB = (ConcretePrototypeA) client.startClone();
        System.out.println("克隆之前的对象引用地址=" + concretePrototypeA.getHobbies());
        System.out.println("克隆之后的对象引用地址=" + concretePrototypeB.getHobbies());
        System.out.println("两次引用的地址相同>>>=" + (concretePrototypeA.getHobbies() == concretePrototypeB.getHobbies()));
        System.out.println("引用的对象地址相同表明这是一次浅克隆");
    }
}
