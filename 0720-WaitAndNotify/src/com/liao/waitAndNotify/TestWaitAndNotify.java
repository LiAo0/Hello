package com.liao.waitAndNotify;

public class TestWaitAndNotify {
    public static void main(String[] args) {
        // 唯一锁对象
        Object obj = new Object();
        // 顾客线程
        new Thread(() -> {
            while (true) {
                synchronized (obj) {
                    try {
                        System.out.println("A------>我要买包子");
                        // 进入等待状态 设置long类型的毫秒数 没人唤醒自动醒来
                        obj.wait();
                        System.out.println("A------>包子真好吃");
                        System.out.println("-----------------------------");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (obj) {
                    try {
                        System.out.println("B------>我要买包子");
                        // 进入等待状态 设置long类型的毫秒数 没人唤醒自动醒来
                        obj.wait();
                        System.out.println("B------>包子真好吃");
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
                    // 随机唤醒一个线程
                    // obj.notify();

                    // 唤醒所有线程
                    obj.notifyAll();
                }
            }
        }).start();
    }
}