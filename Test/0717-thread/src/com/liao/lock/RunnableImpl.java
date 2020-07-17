package com.liao.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * TODO: 实现买票
 * 使用Lock 解决线程安全
 *
 * @author LiAo
 * @date 2020/7/17 10:31
 */
public class RunnableImpl implements Runnable {

    private int ticket = 1000;

    Lock lock = new ReentrantLock();

    // 设置线程任务
    @Override
    public void run() {
        while (true) {
            // 在可能出现安全问题之前获取锁
            lock.lock();
            try {
                Thread.sleep(10);
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "----->" + ticket);
                    ticket--;
                }
                if (ticket == 0) {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally{
                // 在可能出现安全问题之后释放锁
                // 无论是否出现异常 都会释放锁
                lock.unlock();
            }
        }
    }

    /**
     * 同步方法
     */
    public synchronized void payTicket() {

    }
}