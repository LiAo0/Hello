package com.liao.threadPool;

/**
 *
 * TODO: Runnable 实现类
 * @author LiAo
 * @date 2020/7/20 14:53
 */
public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "------------->");
    }
}