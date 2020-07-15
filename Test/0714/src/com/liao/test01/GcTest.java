package com.liao.test01;

/**
 *
 * TODO: 强制垃圾回收
 * @author LiAo
 * @date 2020/7/14 9:57
 */
public class GcTest {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new GcTest();
            // System.gc();
            Runtime.getRuntime().gc();
        }
    }

    public void finalize(){
        System.out.println("系统正在清理GcTest对象资源");
    }
}