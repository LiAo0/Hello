package com.liao.waitAndNotify01;

public class Test {
    public static void main(String[] args) {

        BaoZi baoZi = new BaoZi();

        new BaoZiPu(baoZi).start();
        new ChiHuo(baoZi).start();
    }
}