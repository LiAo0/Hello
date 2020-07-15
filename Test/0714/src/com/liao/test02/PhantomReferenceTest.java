package com.liao.test02;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
    public static void main(String[] args) {
        String str = new String("疯狂的Java讲义");

        // 创建一个引用队列
        ReferenceQueue rq = new ReferenceQueue();

        // 创建一个虚引用
        PhantomReference pr = new PhantomReference(str,rq);

        System.out.println(pr.get());

        // 切断连接
        str = null;

        // 取出虚引用对象
        System.out.println(pr.get());

        // 强制垃圾回收
        System.gc();
        System.runFinalization();
        System.out.println(rq.poll() == pr);
    }
}