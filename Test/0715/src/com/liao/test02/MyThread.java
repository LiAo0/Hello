package com.liao.test02;

/**
 * TODO: 线程睡眠
 *
 * @author LiAo
 * @date 2020/7/16 15:41
 */
public class MyThread{
    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            System.out.println("----->");
            try {
                // 使线程暂停
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}