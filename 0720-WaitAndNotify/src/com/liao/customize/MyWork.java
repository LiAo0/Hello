package com.liao.customize;

import java.util.List;

/**
 *
 * TODO: 线程类
 * @author LiAo
 * @date 2020/7/20 16:03
 */
public class MyWork extends Thread{

    // 线程名字
    private String name;

    private List<Runnable> task;

    public MyWork(String name, List<Runnable> task) {
        super(name);
        this.task = task;
    }

    @Override
    public void run() {
        while (task.size() > 0){
            Runnable runnable = task.remove(0);
            runnable.run();
        }
    }
}