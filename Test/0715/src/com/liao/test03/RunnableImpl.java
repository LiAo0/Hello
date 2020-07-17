package com.liao.test03;

/**
 *
 * TODO: 实现Runable 实现线程
 * @author LiAo
 * @date 2020/7/16 15:52
 */
public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}