package com.ajstudy.designpatterns.PrototypePattern;

import com.ajstudy.designpatterns.PrototypePattern.depthClone.QiTianDaSheng;
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
//        testSimpleClone();

        /**
         * 深度克隆
         * 我们换一个场景，大家都知道齐天大圣。首先它是一只猴子，有七十二般变化，把一根
         * 毫毛就可以吹出千万个泼猴，手里还拿着金箍棒，金箍棒可以变大变小。这就是我们耳
         * 熟能详的原型模式的经典体现
         */
//        testDeepClone();

        /*克隆破坏单例模式
        如果我们克隆的目标的对象是单例对象，那意味着，深克隆就会破坏单例。实际上防止
        克隆破坏单例解决思路非常简单，禁止深克隆便可。要么你我们的单例类不实现
        Cloneable 接口；要么我们重写clone()方法，在clone 方法中返回单例对象即可
        我们常用的ArrayList 就实现了Cloneable 接口(浅克隆)
        */
    }

    private static void testDeepClone() {

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng)qiTianDaSheng.clone();
            System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        } catch (Exception e) {
            e.printStackTrace();
        }
        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.jinGuBang == n.jinGuBang));
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
