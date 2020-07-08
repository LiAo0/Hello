package com.liao.test;

/**
 *
 * TODO: 重写equals
 * @author LiAo
 * @date 2020/6/28 19:40
 */
class Person{
    public boolean equals(Object onj){
        return true;
    }
}

class Dog{}
public class OverrideEqualsError {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.equals(new Dog()));
        System.out.println(p.equals(new String("Hello")));
    }
}