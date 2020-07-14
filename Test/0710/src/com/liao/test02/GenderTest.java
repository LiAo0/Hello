package com.liao.test02;

public class GenderTest {
    public static void main(String[] args) {

        // 获取指定枚举类的枚举值
        Gender g = Gender.valueOf("FEMALE");

        //为实例变量赋值
        g.setName("女");
        System.out.println(g +"-->"+g.getName());
    }
}