package com.liao.test01;

/**
 * TODO: 测试最大值加一
 *
 * @author LiAo
 * @date 2020/8/3 9:43
 */
public class TestMaxValueAddOne {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        System.out.println(i);
        System.out.println(i + 1 < i);
        System.out.println(i + 1);
    }
}