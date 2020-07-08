package com.liao.test;

public class WrapperClassCompare {
    public static void main(String[] args) {
        /*Integer ina = 2;
        Integer inb = 2;
        System.out.println(ina == inb);// true

        Integer inc = 300;
        Integer ind = 301;
        System.out.println(inc == ind);// false

        String a = "abc";
        String b = "abc";
        System.out.println(b.equals(""));*/

        // 基本类型比较数值
        int it = 69;
        float f1 = 69.0f;
        System.out.println(it == f1);// true

        char ch = 'E';
        System.out.println(it == ch);// true ASCII 编码

        // 引用数据类型比较是否是相同对象
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);// false
        System.out.println(str1.equals(str2));// true

        System.out.println("hello" == new String("Hello"));// true

    }
}