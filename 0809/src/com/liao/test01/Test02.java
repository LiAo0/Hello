package com.liao.test01;

import java.util.Scanner;

/**
 * TODO:输入某年某月某日，判断这一天是这一年的第几天？
 *
 * @author LiAo
 * @date 2020/8/9 10:01
 */
public class Test02 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年、月、日，格式为：年,月,日（2015,12,10）");
        String[] dataStr = scanner.next().split("，");
        String year = dataStr[0];
        int month = Integer.valueOf(dataStr[1]);
        String data = dataStr[2];

        switch (month) {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 31;
                break;
            case 3:
                sum = 59;
                break;
            case 4:
                sum = 90;
                break;
            case 5:
                sum = 120;
                break;
            case 6:
                sum = 151;
                break;
            case 7:
                sum = 181;
                break;
            case 8:
                sum = 212;
                break;
            case 9:
                sum = 243;
                break;
            case 10:
                sum = 273;
                break;
            case 11:
                sum = 304;
                break;
            case 12:
                sum = 334;
                break;
        }

    }
}