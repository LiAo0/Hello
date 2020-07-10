package com.liao.lambda.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * TODO: 对List遍历
 * @author LiAo
 * @date 2020/7/10 9:48
 */
public class Exercise3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8);

        // 集合遍历
        /*list.forEach(System.out::print);*/

        // 输出结合的偶数
        list.forEach(ele -> {
            if (ele % 2 == 0){
                System.out.print(ele);
            }
        });
    }
}