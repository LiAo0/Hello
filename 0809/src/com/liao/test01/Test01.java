package com.liao.test01;

/**
 *
 * TODO: 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * @author LiAo
 * @date 2020/8/9 9:12
 */
public class Test01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4 ; j++) {
                for (int k = 1; k <=4 ; k++) {
                    if (i != j && i != k && j != k){
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
    }
}