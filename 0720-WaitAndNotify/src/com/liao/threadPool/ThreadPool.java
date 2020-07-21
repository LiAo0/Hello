package com.liao.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * TODO: 线程池
 * @author LiAo
 * @date 2020/7/20 11:51
 */
public class ThreadPool {
    public static void main(String[] args) {
        // 获取线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            System.out.println("---->" +Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("---->" +Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("---->" +Thread.currentThread().getName());
        });

        // 销毁线程池
        executorService.shutdown();

    }

}