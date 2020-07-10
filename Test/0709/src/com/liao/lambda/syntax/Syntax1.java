package com.liao.lambda.syntax;

import com.liao.lambda.interfaces.*;

public class Syntax1 {
    public static void main(String[] args) {

        // 无参无返回
        LambdaNoneReturnParameter lambda1 = () -> System.out.println("我是无参无返回");
        lambda1.test();

        //单参无返回
        LambdaNoneReyurnSingleParameter lambda2 = (int a) -> System.out.println("无参单无返回" + a);
        lambda2.test(12);

        //多参 无返回
        LambdNoneReturnMutipleParameter lambda3 = (int a, int b) -> System.out.println(a + b);
        lambda3.test(10, 20);

        // 有返回值无参
        LambdaReturnNoneParameter lambda4 = () -> {
            System.out.println("有返回值无参");
            return 100;
        };
        System.out.println(lambda4.test());

        // 有返回值 单个参数
        LmbdaReturnSingleParameter lambda5 = a -> a;
        System.out.println(lambda5.test(10));

        // 有返回值 多参
        LambdaReturnMutipleParameter lambda6 = (int a, int b) ->{
            System.out.println("有返回值 多参");
            return a + b;
        };
        System.out.println(lambda6.test(10,12));
    }
}