package com.liao.lambda.syntax;

import com.liao.lambda.interfaces.LmbdaReturnSingleParameter;

public class Syntax2 {
    public static void main(String[] args) {
        // 方法引用
        LmbdaReturnSingleParameter lambda5 = Syntax2::change;

        System.out.println(lambda5.test(10));


    }

    public static int change(int a){
        return 2 * a;
    }



}