package com.liao.futuretest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * TODO: 异步计算结果
 * @author LiAo
 * @date 2020/7/20 20:21
 */
public class Test01 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        Future<Integer> f = es.submit(()->{
            return change(20);
        });

        // System.out.println("任务取消结果"+f.cancel(true)); //
        System.out.println("任务是否完成"+f.isDone());
        System.out.println("任务是否取消"+f.isCancelled());
        try {
            System.out.println("任务执行的结果"+f.get()); // 一直等待任务的执行 知道完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("任务是否完成"+f.isDone());
        System.out.println("任务是否取消"+f.isCancelled());
    }

    public static int change(int a){
        return 2 * a;
    }
}