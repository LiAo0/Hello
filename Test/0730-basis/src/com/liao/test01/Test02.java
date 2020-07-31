package com.liao.test01;

/**
 * TODO: 字符串反转
 *
 * @author LiAo
 * @date 2020/7/30 9:05
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "ABCDE";
        System.out.println(reverseString(str));
        System.out.println(reverseStringByStringBuilderApi(str));
        System.out.println(reverseStringByRecursion(str));
    }

    /**
     * 自己实现
     *
     * @param str
     * @return
     */
    public static String reverseString(String str) {
        if (str != null && str.length() > 0) {
            int len = str.length();
            char[] chars = new char[len];
            for (int i = len - 1; i >= 0; i--) {
                chars[len - 1 - i] = str.charAt(i);
            }
            return new String(chars);
        }
        return str;
    }

    /**
     * 使用 StringBuilder 或 StingBuffer 的reverse
     *
     * @param str
     * @return
     */
    public static String reverseStringByStringBuilderApi(String str) {
        if (str != null && str.length() > 0) {
            return new StringBuffer(str).reverse().toString();
        }
        return str;
    }

    /**
     * 递归
     *
     * @param str
     * @return
     */
    public static String reverseStringByRecursion(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseStringByRecursion(str.substring(1)) + str.charAt(0);
    }
}