package com.liao.treadsafe;

/**
 * TODO: 实现买票
 * 使用同步代码块 保证线程安全
 *
 * @author LiAo
 * @date 2020/7/17 10:31
 */
public class RunnableImpl implements Runnable {

    private int ticket = 1000;

    Object obj = new Object();

    // 设置线程任务
    @Override
    public void run() {
        while (true) {
            // 同步代码块
            // 程序会频繁的 判断锁 获取锁 释放锁 降低性能 但可以提高安全
            synchronized (obj) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "----->" + ticket);
                    ticket--;
                }
                if (ticket == 0) {
                    break;
                }
            }
        }
    }
}