package com.liao.withdrawal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TODO: 模拟两个人取款
 *
 * @author LiAo
 * @date 2020/7/21 9:38
 */
public class Test {
    public static void main(String[] args) {

        // 取款金额
        int money = 1000;

        ExecutorService es = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 2; i++) {
            synchronized (Test.class) {
                String finalI = "User" + i;
                int finalMoney = money;
                es.submit(new Thread(() -> {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (finalMoney > 800) {
                        System.out.println(finalI + "---->成功");
                    } else {
                        System.out.println(finalI + "---->失败");
                        System.out.println(finalMoney);
                    }
                }));
                money = money - 800;
            }
        }
    }
}