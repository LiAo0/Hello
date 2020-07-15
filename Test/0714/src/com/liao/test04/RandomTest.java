package com.liao.test04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * TODO: 生成伪随机数
 * @author LiAo
 * @date 2020/7/14 15:42
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        // boolean
        System.out.println(random.nextBoolean());

        // 生成随机数存入数组
        byte[] buffe = new byte[6];
        random.nextBytes(buffe);
        System.out.println(Arrays.toString(buffe));
        // 生成0.0 - 1.0之间的Double伪随机数
        System.out.println(random.nextDouble());
        // 生成0.0 - 1.0之间的Float伪随机数
        System.out.println(random.nextFloat());

        // 生成int 整数取值范围内的数
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(9));

        // 生成long整数取值范围的数
        System.out.println(random.nextLong());

    }
}