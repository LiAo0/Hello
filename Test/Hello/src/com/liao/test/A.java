package com.liao.test;


class C {

    public C() {
        System.out.println("C类中无参构造");
    }
}

class B extends C {

    public String name = "name";

    public String gae;

    public B() {
        test();
    }

    public B(String name) {
        this();
        System.out.println("B类一个参数构造器" + name);
    }

    public B(String name, String gae) {
        this(name);
        System.out.println("B类两个参数构造器" + name + "-->" + gae);
    }

    public void base() {
        System.out.println("父类普通方法");
    }

    public void test() {
        System.out.println("父类被覆盖的方法");
    }
}

/**
 * TODO: 构造器继承和重载
 *
 * @author LiAo
 * @date 2020/6/23 20:10
 */
public class A extends B {

    public String book = "book";

    public A() {
        super("nameA", "ageA");
    }

    public void sub(){
        System.out.println("子类普通方法");
    }

    public void test(){
        System.out.println("子类覆盖父类方法");
    }

    public static void main(String[] args) {
        A a = new A();
        /*// 构造器继承和重载
        A a = new A();
        System.out.println(a.book);
        a.sub();
        a.test();


        B b = new B();
        System.out.println(b.name);
        b.base();
        b.test();

        // 多态出现
        // 编译时是B 运行时是A 只能使用方法 变量不可以
        B b1 = new A();
        // 从父类继承的方法
        b1.base();
        // 当前类覆盖的方法
        b1.test();
        // 当前类普通方法访问不到
        System.out.println(b1.name);*/

        /*// 引用变量的强制类型转换
        Object o = "Hello";
        *//*String str = (String)o;
        System.out.println(o);*//*

        // 报错
        Object onb = new Integer(5);
        *//*String s = (String) onb;
        System.out.println(s);*//*

        // 使用instanceof 判断是否可以强制转换
        if (onb instanceof String){
            String strs = (String) onb;
            System.out.println(strs);
        }*/


    }
}