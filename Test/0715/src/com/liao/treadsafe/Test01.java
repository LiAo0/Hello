package com.liao.treadsafe;

/**
 *
 * TODO: 多线程  第一种方式
 * @author LiAo
 * @date 2020/7/15 17:41
 */
public class Test01 extends Thread{
    public static void main(String[] args) {

        // 通过构造方法为线程名称赋值
        MyThread myThread = new MyThread("----->");

        /*// 为线程名字赋值
        myThread.setName("---->");*/
        myThread.start();

        new MyThread("name").start();

        System.out.println(Thread.currentThread().getName());
    }
}