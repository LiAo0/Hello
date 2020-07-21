package com.liao.customize;

/**
 *
 * TODO: 自定义线程池 任务执行类
 * @author LiAo
 * @date 2020/7/20 15:58
 */
public class MyTask implements Runnable{
    private int id;

    public MyTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("------>" + Thread.currentThread().getName() + "--->" + id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "id=" + id +
                '}';
    }
}