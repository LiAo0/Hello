package com.liao.test;

public class StringCompareTest {

    public static void main(String[] args) {
        String s1 = "我爱Java";
        String s2 = "我爱";
        String s3 = "Java";
        String s4 = "我爱"+"Java";
        String s5 = "我"+"爱"+"Java";

        // 不能直接引用常量池中的字符串
        String s6 = s2 + s3;

        // 重新创建了一个对象
        String s7 = new String("我爱Java");

        System.out.println(s1 == s4);// true
        System.out.println(s1 == s5);// true
        System.out.println(s1 == s6);// false
        System.out.println(s1 == s7);// false
    }


}