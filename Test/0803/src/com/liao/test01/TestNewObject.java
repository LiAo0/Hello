package com.liao.test01;

import java.io.*;

/**
 *
 * TODO: java 创建对象的方式
 * @author LiAo
 * @date 2020/8/3 9:29
 */
public class TestNewObject implements Cloneable, Serializable {
    public TestNewObject() {
        System.out.println("Constructor init");
    }

    public static void main(String[] args) throws Exception {
        TestNewObject o1 = new TestNewObject();
        TestNewObject o2 = TestNewObject.class.newInstance();
        TestNewObject o3 = TestNewObject.class.getConstructor().newInstance();
        TestNewObject o4 = (TestNewObject) o1.clone();

       /* ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(o1);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TestNewObject o5 = (TestNewObject) ois.readObject();*/
    }
}