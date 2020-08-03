package com.liao.test01;

/**
 *
 * TODO: 跳出多层循环
 * @author LiAo
 * @date 2020/8/3 10:13
 */
public class TestBreakMulti {
    public static void main(String[] args) {
        A:for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
                if (j == 5){
                    break A;
                }
            }
        }
    }
}