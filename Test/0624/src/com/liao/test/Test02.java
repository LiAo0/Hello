package com.liao.test;

class Root {
    static {
        System.out.println("Root静态初始化代码块");
    }

    {
        System.out.println("Root初始化代码块");
    }

    public Root() {
        System.out.println("Root无参");
    }
}

class Mid extends Root{
    static {
        System.out.println("Mid静态初始化代码块");
    }

    {
        System.out.println("Mid初始化代码块");
    }

    public Mid() {
        System.out.println("Mid无参");
    }

    public Mid(String name){
        this();
        System.out.println("Mid带参构造"+name);
    }
}

class Leaf extends Mid{
    static {
        System.out.println("Leaf静态初始化代码块");
    }

    {
        System.out.println("Leaf初始化代码块");
    }

    public Leaf() {
        super("LiAo");
        System.out.println("Leaf无参");
    }

}

public class Test02 {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}