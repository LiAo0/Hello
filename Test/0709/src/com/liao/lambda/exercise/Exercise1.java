package com.liao.lambda.exercise;

import com.liao.lambda.dada.User;

import java.util.ArrayList;

/**
 * TODO: 集合排序
 *
 * @author LiAo
 * @date 2020/7/9 20:59
 */
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("-->", 12));
        users.add(new User("-->", 19));
        users.add(new User("-->", 78));
        users.add(new User("-->", 35));
        users.add(new User("-->", 21));


        // 不使用Lambda表达式
        /*users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        // 使用Lambda表达式
        // 升序
        /*users.sort((User o1, User o2) -> o1.getAge() - o2.getAge());*/

        // 降序
        /*users.sort((User o1, User o2) -> o2.getAge() - o1.getAge());*/

        System.out.println(users.toString());

    }
}