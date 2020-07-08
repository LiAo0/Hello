package com.liao.test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * TODO: final 基本类型与引用类型
 * @author LiAo
 * @date 2020/7/7 19:35
 */
class Persons{
    private int age;

    public Persons(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class FinalReferenceTest {
    public static void main(String[] args) {
        /*// final 修饰数组变量
        final int[] iArr = {5,6,12,19};

        System.out.println(Arrays.toString(iArr));
        // 对数组元素进行排序 合法
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        // 操作数组元素合法
        iArr[3] = 18;
        System.out.println(Arrays.toString(iArr));*/

        // 重新赋值报错
        // iArr = null;

        /*// 宏变量
        final int a = 1;
        final double b = 10/5;
        final String str = "LiAo";

        // 不是宏变量
        final String str2 = "LiAo"+String.valueOf(12);*/

        String s1 = "LiAoMrWick";
        String s2 = "LiAo" + "MrWick";

        System.out.println(s1 == s2);
        final String str1 = "LiAo";
        final String str2 = "MrWick";
        String s3 = str1 + str2;
        System.out.println(s1 == s3);
    }
}