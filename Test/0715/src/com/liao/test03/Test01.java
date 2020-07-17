package com.liao.test03;

/**
 * 
 * TODO:
 * @author LiAo
 * @date 2020/7/16 15:53
 */
public class Test01 {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        new Thread(runnable).start();
    }
}