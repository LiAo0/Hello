package com.liao.test01;

import java.lang.reflect.Field;

public class TestGetFields extends TestGetFieldsSub implements TestGetFieldsInterface{
    private String privateFieldSelf;
    protected String protectedFieldSelf;
    String defaultFieldSelf;
    public String publicFieldSelf;

    public static void main(String[] args) {

        // 获取所有所有public声明的属性，包括父类和实现的接口中的属性
        System.out.println("------getFields------");
        for (Field field : TestGetFields.class.getFields()) {
            System.out.println(field.getName());
        }

        // 获取本类声明的所有属性
        System.out.println("------getDeclaredFields------");
        for (Field declaredField : TestGetFields.class.getDeclaredFields()) {
            System.out.println(declaredField.getName());
        }
    }
}

class TestGetFieldsSub{
    private String privateField;
    protected String protectedField;
    String defaultField;
    public String publicField;
}

interface TestGetFieldsInterface{
    String interfaceField = "";
}