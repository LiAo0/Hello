package com.liao.test04;

/**
 * TODO: 匿名内部类开启线程
 *
 * @author LiAo
 * @date 2020/7/16 16:01
 */
public class Test01 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("-->" + Thread.currentThread().getName());
            }
        }).start();



        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("-->" + Thread.currentThread().getName());
                }
            }
        }).start();
    }
}