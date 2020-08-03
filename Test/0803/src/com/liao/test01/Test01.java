package com.liao.test01;

/**
 * TODO: ++i 和 i++
 *
 * @author LiAo
 * @date 2020/8/3 9:14
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++; // 先赋值 再加一
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int x = 3;
        int y = ++x; // 先加再赋值
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}