package com.liao.waitAndNotify01;

/**
 * TODO: 消费者
 *
 * @author LiAo
 * @date 2020/7/20 11:19
 */
public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                // 判断有无包子
                if (!bz.isFlag()) {
                    // 没有包子 进入等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 被唤醒 吃包子
                System.out.println("======>开始吃" + bz.getPi() + bz.getXian() + "包子");

                // 修改包子状态
                bz.setFlag(false);
                bz.notify();

                System.out.println("-------------------------------------");
            }
        }
    }
}