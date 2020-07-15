package com.liao.test04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 *
 * TODO: System && Runtime
 * @author LiAo
 * @date 2020/7/14 15:05
 */
public class SystemTest {
    public static void main(String[] args) throws IOException {

        // 获取所有的系统环境变量
        Map<String,String> evn = System.getenv();
        for (String name:evn.keySet()) {
            System.out.println(name + "----->"+evn.get(name));
        }

        // 获取指定的环境变量值
        System.out.println(System.getenv("PSModulePath"));

        // 获取所有的系统属性
        Properties properties = System.getProperties();
        // 将所有的属性保存到文件中
        properties.store(new FileOutputStream("props.txt"),"System Properties");

        // 获取指定的系统变量
        System.out.println(properties.getProperty("os.name"));

        Runtime runtime = Runtime.getRuntime();
        // 处理器数量
        System.out.println("处理器数量"+"---->"+runtime.availableProcessors());
        System.out.println("空闲内存数"+"---->"+runtime.freeMemory());
        System.out.println("总内存数"+"---->"+runtime.totalMemory());
        System.out.println("可用最大内存数"+"---->"+runtime.maxMemory());
        // 启动记事本
        runtime.exec("notepad.exe");
    }
}