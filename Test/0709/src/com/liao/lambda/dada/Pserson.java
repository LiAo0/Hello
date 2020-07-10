package com.liao.lambda.dada;

public class Pserson {
    private String name;

    private String sex;

    public Pserson() {
        System.out.println("无参构造");

    }

    public Pserson(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("有参构造");
    }
}