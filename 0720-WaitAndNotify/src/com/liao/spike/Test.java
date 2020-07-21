package com.liao.spike;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * TODO: 商品秒杀
 *
 * @author LiAo
 * @date 2020/7/21 9:05
 */
public class Test {
    public static void main(String[] args) {

        int id = 10;

        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 20, 1, TimeUnit.MINUTES, new LinkedBlockingQueue<>(60));

        /*for (int i = 0; i < 50; i++) {
            MyTask myTask = new MyTask("User"+i);
            pool.submit(myTask);
        }*/
        for (int i = 0; i < 70; i++) {
            synchronized (new Test()) {
                int finalId = id;
                String finalI ="User" + i;
                pool.submit(new Thread(() -> {
                    // 设置休眠
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 判断
                    if (finalId > 0) {
                        System.out.println(finalI + "-->"+Thread.currentThread().getName() + "-------->成功");
                    } else {
                        System.out.println(finalI + "-->"+Thread.currentThread().getName() + "--->失败");
                    }
                }));
                id--;
            }
        }
    }
}