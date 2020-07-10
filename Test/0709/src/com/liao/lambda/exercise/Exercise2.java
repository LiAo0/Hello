package com.liao.lambda.exercise;

import com.liao.lambda.dada.User;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TODO: Ste 集合
 *
 * @author LiAo
 * @date 2020/7/10 9:37
 */
public class Exercise2 {
    public static void main(String[] args) {

        // 使用Lambda 式实现Ste集合排序不去重
        TreeSet<User> set = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getAge() >= o2.getAge()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        // 不使用Lambda 式实现Ste集合排序不去重
        /*TreeSet<User> set = new TreeSet<>((o1, o2) -> {
            if (o1.getAge() >= o2.getAge()){
                return -1;
            }else {
                return 1;
            }
        });*/

        set.add(new User("-->", 12));
        set.add(new User("-->", 12));
        set.add(new User("-->", 19));
        set.add(new User("-->", 78));
        set.add(new User("-->", 35));
        set.add(new User("-->", 21));

        System.out.println(set);
    }
}