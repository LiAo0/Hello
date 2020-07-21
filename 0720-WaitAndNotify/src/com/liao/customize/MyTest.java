package com.liao.customize;

/**
 *
 * TODO: 创建测试类
 * @author LiAo
 * @date 2020/7/20 16:27
 */
public class MyTest {
    public static void main(String[] args) {
        // 创建线程池对象
        MyThreadPool pool = new MyThreadPool(2,4,20);

        for (int i = 0; i < 100; i++) {
            MyTask task = new MyTask(i);
            pool.submit(task);
        }
    }
}