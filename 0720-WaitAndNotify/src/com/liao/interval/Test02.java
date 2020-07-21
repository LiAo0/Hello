package com.liao.interval;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * TODO: 延迟 循环 执行的线程任务
 *
 * @author LiAo
 * @date 2020/7/20 19:47
 */
public class Test02 {
    public static void main(String[] args) {
        ScheduledExecutorService es = Executors.newScheduledThreadPool(3, (r) -> {
            return new Thread(r, "Mr.Wick");
        });
        // 延迟一秒执行
        // 延迟第一次执行的时间
        // 循环执行的时间 从上个线程开始执行记时
        es.scheduleAtFixedRate(() -> {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }, 1,2, TimeUnit.SECONDS);

        // 延迟一秒执行
        // 延迟第一次执行的时间
        // 循环执行的时间 执行结束后记时
        es.scheduleWithFixedDelay(() -> {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }, 1,2, TimeUnit.SECONDS);
    }
}