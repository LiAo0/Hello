package com.liao.test01;

public class TestSwitch {
    public static void main(String[] args) {
        int i = 2;
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
                System.out.println(result);
            case 2:
                result = result + i * 2;
                System.out.println(result);
            case 3:
                result = result + i * 3;
                System.out.println(result);
        }
        System.out.println(result);
    }
}