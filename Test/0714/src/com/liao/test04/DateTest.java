package com.liao.test04;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

/**
 *
 * TODO: 时间操作
 * @author LiAo
 * @date 2020/7/14 16:21
 */
public class DateTest {
    public static void main(String[] args) {
       /* Date date1 = new Date();
        // 获取当前时间1000毫秒之后的时间
        Date date2 = new Date(System.currentTimeMillis() + 100);
        System.out.println(date2);
        System.out.println(date1.compareTo(date2));
        System.out.println(date1.before(date2));*/

        Calendar calendar =  Calendar.getInstance();

        // 年月日
        System.out.println(calendar.get(YEAR));
        System.out.println(calendar.get(MONTH));
        System.out.println(calendar.get(DATE));

        // 设置 年 月 日 小时 分钟 秒
        calendar.set(2003,10,23,12,32,33);
        System.out.println(calendar.getTime());

        // 日期向前推
        calendar.roll(MONTH,-6);
        System.out.println(calendar.getTime());

        //add 日期自动进值
        calendar.add(MONTH,12);
        System.out.println(calendar.getTime());

        calendar.add(DATE,20);
        System.out.println(calendar.getTime());

        calendar.set(2003,9,31,12,32,33);
        System.out.println(calendar.getTime());
    }
}