package com.liao.desire;

/**
 *
 * TODO:
 * @author LiAo
 * @date 2020/8/10 9:01
 */
public class Desire {
    public static void main(String[] args) {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.exit(1);
        }
    }
}