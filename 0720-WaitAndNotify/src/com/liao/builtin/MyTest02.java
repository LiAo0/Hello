package com.liao.builtin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO: 练习内置线程池
 * newSingleThreadExecutor （单线程） 重载
 *
 * @author LiAo
 * @date 2020/7/20 17:12
 */
public class MyTest02 {
    public static void main(String[] args) {
        // 使用工厂类 获取线程池对象
        /*ExecutorService es = Executors.newSingleThreadExecutor();

        // 提交任务 线程数量不做限制
        for (int i = 0; i < 100; i++) {
            es.submit(() -> {
                System.out.println("------>" + Thread.currentThread().getName());
            });
        }

    }*/
        test01();
    }
    private static void test01() {
        // 使用工厂类 获取线程池对象
        AtomicInteger a = new AtomicInteger(1);
        ExecutorService es = Executors.newSingleThreadExecutor((r) -> {
            return new Thread(r,"Mr.Wick"+ a.getAndIncrement());
        });

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            es.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "------>"+ finalI);
            });
        }
    }
}