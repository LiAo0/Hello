package com.liao.test;

class  Test01A{
    public Test01A(){
        test();
    }

    public void test(){
        System.out.println("父类被重写方法");
    }
}
public class Test01 extends Test01A{
    public String name = "2323";

    public void test(){
        System.out.println("子类重写父类方法"+name);
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
    }
}