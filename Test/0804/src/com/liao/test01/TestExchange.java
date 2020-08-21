package com.liao.test01;

public class TestExchange {

    String str = new String("1");
    char[] arr = {'a','b','c'};

    public static void main(String[] args) {
        TestExchange te = new TestExchange();
        te.exchange(te.str,te.arr);
        System.out.println(te.str);
        System.out.println(te.arr);
    }

    public void exchange(String str,char arr[]){
        // 属性值被改变 但是仍指向字符串常量缓冲区
        str = "2";
        arr[0] = 'd';
    }
}