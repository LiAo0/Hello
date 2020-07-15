package com.liao.test02;

import java.lang.ref.WeakReference;

/**
 *
 * TODO: 弱引用
 * @author LiAo
 * @date 2020/7/14 13:21
 */
public class ReferenceTest {
    public static void main(String[] args) {

        // 创建一个字符串对象
        String str = new String("疯狂的Java");

        /*//创建一个引用队列
        ReferenceQueue rq = new ReferenceQueue();*/

        // 创建弱引用
        WeakReference wr = new WeakReference(str);

        // 切断str之间的引用
        str = null;

        //去除弱引用对象
        System.out.println(wr.get());//疯狂的Java

        // 强制垃圾回收
        System.gc();
        System.runFinalization();

        // 再次取出弱引用对象
        System.out.println(wr.get());// null
    }
}