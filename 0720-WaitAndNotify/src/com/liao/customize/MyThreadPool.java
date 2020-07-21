package com.liao.customize;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO: 自定义线程池类
 *
 * @author LiAo
 * @date 2020/7/20 16:09
 */
public class MyThreadPool {
    // 创建任务队列 控制线程安全问题
    private List<Runnable> task = Collections.synchronizedList(new LinkedList<>());

    // 当前线程数量
    private int num;

    // 核心线程数量
    private int corePoolSize;

    // 最大线程数
    private int maxSize;

    // 任务队列长度
    private int workSize;

    public MyThreadPool(int corePoolSize, int maxSize, int workSize) {
        this.corePoolSize = corePoolSize;
        this.maxSize = maxSize;
        this.workSize = workSize;
    }

    // 提交任务
    public void submit(Runnable runnable) {
        if (task.size() >= workSize) {
            System.out.println("任务被丢弃");
        } else {
            // 添加进任务队列
            task.add(runnable);
            // 执行任务
            execTack(runnable);
        }
    }

    // 执行任务
    private void execTack(Runnable runnable) {
        // 判断线程池总线程数量是否超出了核心数量
        // 如果超出是否超出最大线程数 没有就创建非核心线程
        if (num < corePoolSize) {
            // 立刻执行
            new MyWork("核心线程" + num, task).start();
            num++;
        }else if(num < maxSize){
            // 创建非核心线程数量 立刻执行
            new MyWork("非核心线程" + num, task).start();
            num++;
        }else {
            System.out.println("任务"+runnable+"被缓存");
        }
    }
}