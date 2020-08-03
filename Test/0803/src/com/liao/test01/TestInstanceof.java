package com.liao.test01;

/**
 *
 * TODO: instanceof 判断右边是否为左边的父类
 * @author LiAo
 * @date 2020/8/3 9:18
 */
public class TestInstanceof {
    public static void main(String[] args) {
        A a = new A();
        AA aa = new AA();
        AAA aaa = new AAA();

        System.out.println(a instanceof A);     //true
        System.out.println(a instanceof AA);    //false
        System.out.println(aa instanceof AAA);  //false
        System.out.println(aaa instanceof A);   //true
    }
}

class A{

}
class AA extends A{

}

class AAA extends AA{

}