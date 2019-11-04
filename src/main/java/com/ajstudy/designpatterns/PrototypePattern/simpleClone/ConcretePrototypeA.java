package com.ajstudy.designpatterns.PrototypePattern.simpleClone;

import java.util.List;
import java.util.StringJoiner;

/**
 * @ClassName: ConcretePrototypeA
 * @Author: aiJun
 * @Description: TODO
 * @date: 2019-11-04  11:07
 */
public class ConcretePrototypeA implements Prototype {
    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ConcretePrototypeA.class.getSimpleName() + "[", "]")
                .add("age=" + age)
                .add("name='" + name + "'")
                .add("hobbies=" + hobbies)
                .toString();
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setHobbies(this.hobbies);
        return concretePrototypeA;
    }
}
