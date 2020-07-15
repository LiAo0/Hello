package com.liao.test03;

/**
 *
 * TODO: 克隆
 * @author LiAo
 * @date 2020/7/14 13:53
 */

class Address{
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }
}

class User implements Cloneable{
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        Address address = new Address("LiAo");
    }

    // 克隆User
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(12);

        User u2 = u1.clone();

        System.out.println(u1 == u2);
        System.out.println(u1.address == u2.address);
    }
}




















