package com.liao.waitAndNotify;

/**
 * TODO: 线程通信
 * Lambda 表达式
 *
 * @author LiAo
 * @date 2020/7/17 11:49
 */
public class WaitAndNotfiy {
    public static void main(String[] args) {
        // 唯一锁对象
        Object obj = new Object();
        // 顾客线程
        new Thread(() -> {
            while (true) {
                synchronized (obj) {
                    try {
                        System.out.println("我要买包子");
                        // 进入等待状态
                        obj.wait();
                        System.out.println("包子真好吃");
                        System.out.println("-----------------------------");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        // 老板线程
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj) {
                    System.out.println("我做好包子了");
                    obj.notify();
                }
            }
        }).start();
    }
}