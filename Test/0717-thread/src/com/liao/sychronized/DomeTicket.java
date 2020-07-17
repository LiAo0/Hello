package com.liao.sychronized;

/**
 *
 * TODO: 测试卖票
 * @author LiAo
 * @date 2020/7/17 10:36
 */
public class DomeTicket {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        Thread t5 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}