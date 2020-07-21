package com.liao.interval;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * TODO: 延迟执行的线程任务
 *
 * @author LiAo
 * @date 2020/7/20 19:47
 */
public class Test01 {
    public static void main(String[] args) {
        ScheduledExecutorService es = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 10; i++) {
            // 延迟一秒执行
            es.schedule(() -> {
                System.out.println(Thread.currentThread().getName());
            }, 1, TimeUnit.SECONDS);
        }
    }
}