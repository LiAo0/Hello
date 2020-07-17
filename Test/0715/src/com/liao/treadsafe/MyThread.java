package com.liao.treadsafe;

/**
 *
 * TODO: 创建一个Thread子类 实现线程
 * @author LiAo
 * @date 2020/7/16 15:35
 */
public class MyThread extends Thread{

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 输出名字
        System.out.println(Thread.currentThread().getName());
    }
}