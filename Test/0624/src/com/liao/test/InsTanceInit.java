package com.liao.test;

public class InsTanceInit {
    int a = 4;
    {
        a = 6;
    }



    public static void main(String[] args) {
        System.out.println(new InsTanceInit().a);
    }
}