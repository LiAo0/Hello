package com.liao.treadsafe;

/**
 * TODO: 使用finalize方法复活自身
 *
 * @author LiAo
 * @date 2020/7/14 10:23
 */
public class FinalizeTest {
    private static FinalizeTest finalizeTest = null;

    public void info() {
        System.out.println("测试资源清理的finalize方法");
    }

    public static void main(String[] args) {
        // 创建FinalizeTest对象立即进入可恢复状态
        new FinalizeTest();
        // 通知系统进行资源回收
        System.gc();
        // 强制垃圾回收机制调用可恢复对象的finalize方法
        System.runFinalization();
        finalizeTest.info();
    }

    public void finalize() {
        // 可恢复对象变成可达
        finalizeTest = this;
    }
}