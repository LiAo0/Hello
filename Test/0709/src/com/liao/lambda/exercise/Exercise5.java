package com.liao.lambda.exercise;

/**
 *
 * TODO: 使用 Lambda 开启线程
 * @author LiAo
 * @date 2020/7/10 10:17
 */
public class Exercise5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });

        t1.start();
    }
}