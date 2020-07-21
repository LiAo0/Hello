package com.liao.waitAndNotify01;

/**
 * TODO: 包子铺 生产者类
 *
 * @author LiAo
 * @date 2020/7/20 11:07
 */
public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu (BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        // 生产数量
        int sum = 0;
        // 循环执行
        while (true){
            synchronized (bz) {
                if (bz.isFlag()) {
                    // 有包子 无需生产 进入等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 唤醒之后生产包子
                if (sum % 2 == 0) {
                    bz.setPi("薄皮");
                    bz.setXian("猪肉馅");
                } else {
                    bz.setPi("厚皮");
                    bz.setXian("洋葱馅");
                }
                System.out.println("------>开始生产" + bz.getPi() + bz.getXian() + "包子");
                try {
                    // 生产
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("------>生产好了" + bz.getPi() + bz.getXian() + "包子");
                // 数量加一
                sum++;
                // 状态改为有包子
                bz.setFlag(true);
                // 唤醒消费者线程
                bz.notify();
            }
        }
    }
}