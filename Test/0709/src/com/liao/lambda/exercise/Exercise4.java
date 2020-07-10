package com.liao.lambda.exercise;

import com.liao.lambda.dada.User;

import java.util.ArrayList;

/**
 *
 * TODO: 删除满足条件的参数
 * @author LiAo
 * @date 2020/7/10 10:01
 */
public class Exercise4 {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        list.add(new User("-->", 12));
        list.add(new User("-->", 19));
        list.add(new User("-->", 78));
        list.add(new User("-->", 35));
        list.add(new User("-->", 21));

        // 使用迭代器删除满足条件的元素
        /*ListIterator<User> iterator = list.listIterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if (user.getAge() > 34){
                iterator.remove();
            }
        }*/

        // 使用Lambda表达式
        list.removeIf(ele -> ele.getAge() > 34);

        // 不使用Lambda表达式
        /*list.removeIf(new Predicate<User>() {
            @Override
            public boolean test(User user) {
                if (user.getAge() > 20){
                    return true;
                }
                return false;
            }
        });*/

        list.forEach(System.out::print);
    }
}