package com.liao.sychronized;

/**
 * TODO: 实现买票
 * 使用同步方法解决 保证线程安全
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
            if (ticket == 0) {
                break;
            }
            payTicket();
        }
    }

    /**
     * 同步方法
     */
    public synchronized void payTicket() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "----->" + ticket);
            ticket--;
        }
    }
}