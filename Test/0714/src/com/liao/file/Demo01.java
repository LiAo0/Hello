package com.liao.file;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {

        /**
         * 路径分隔符
         * 名称分隔符
         */
        /*
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);// ;

        String separator = File.separator;
        System.out.println(separator);// \ */

        /**
         * 获取绝对路径
         */
        /*
        File file1 = new File("E:\\Java\\Hello\\Test\\0714\\src\\com\\liao\\file\\Demo01.java");
        String absolutePath = file1.getAbsolutePath();
        System.out.println(absolutePath);

        File file2 = new File("Demo01.java");
        String absolutePath1 = file2.getAbsolutePath();
        System.out.println(absolutePath1);*/

        /**
         * 输出路径
         */
        /*
        File file1 = new File("E:\\Java\\Hello\\Test\\0714\\src\\com\\liao\\file\\Demo01.java");
        String absolutePath = file1.getPath();
        System.out.println(absolutePath);

        File file2 = new File("Demo01.java");
        String absolutePath1 = file2.getPath();
        System.out.println(absolutePath1);*/

        /**
         * 路径结尾部分
         */
        /*
        File file1 = new File("E:\\Java\\Hello\\Test\\0714\\src\\com\\liao\\file");
        String absolutePath = file1.getName();
        System.out.println(absolutePath);*/

        /**
         * 文件大小
         * 不能获取文件夹
         * 路径不存在返回0
         */
        /*
        File file1 = new File("E:\\图片\\IDEA\\64540bcb4108.jpg");
        long length = file1.length();
        System.out.println(length); // 字节单位*/

        /**
         * 判断文件是否存在
         */
        /*File file1 = new File("E:\\图片\\IDEA\\64540bcb4108.jpg");
        System.out.println(file1.exists()); // true

        File file2 = new File("E:\\图片\\IDEA\\6440bcb4108.jpg");
        System.out.println(file2.exists()); // false

        File file3 = new File(".gitignore");
        System.out.println(file3.exists());*/

        /**
         * 判断是否为目录
         */
        /*File file1 = new File("E:\\图片\\IDEA\\64540bcb4108.jpg");
        System.out.println(file1.isDirectory()); // false*/

        /**
         * 判断是否为文件
         */
        /*File file1 = new File("E:\\图片\\IDEA\\64540bcb4108.jpg");
        System.out.println(file1.isFile()); // true*/

        /**
         * 创建一个新的文件
         * 只能创建文件 不能创建文件夹
         * 路径不存在会抛出异常
         * 不能覆盖文件
         */
        /*try {
            File file = new File("E:\\JavaFile\\a.txt");
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /**
         * 创建多级文件夹
         * 不能创建文件
         */
        /*File file = new File("E:\\JavaFile\\mkdirs\\mkdirs\\a.txt");
        System.out.println(file.mkdirs());*/

        /**
         * 删除文件 && 文件夹
         */
        /*File file = new File("E:\\JavaFile\\a.txt");
        System.out.println(file.delete());*/

        /**
         * 返回文件夹下所有的子文件和目录 list()
         * 如果是文件或路径不存在 会出现空指针异常
         * 可以获取到隐藏文件
         */
        /*File file = new File("D:\\SoftWare");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
            File file1 = new File("D:\\SoftWare\\" + s);
            String[] list1 = file1.list();
            for (String s1 : list1) {
                System.out.println(s + "------>" + s1);
            }
        }*/

        /**
         * listFiles 返回绝对路径
         */
        File file = new File("D:\\SoftWare");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }


    }
}