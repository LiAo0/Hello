package com.liao.test;


/**
 *
 * TODO: 重写equals
 * @author LiAo
 * @date 2020/7/7 10:08
 */

class Person{
    private String name;
    private String iDStr;

    public Person() {
    }

    public Person(String name, String iDStr) {
        this.name = name;
        this.iDStr = iDStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiDStr() {
        return iDStr;
    }

    public void setiDStr(String iDStr) {
        this.iDStr = iDStr;
    }

    public boolean equals(Object ojb){
        // 如果两个对象为同一个对象
        if (this == ojb){
            return true;
        }

        // 当ojb 是Person对象
        if(ojb != null && ojb.getClass() == Person.class){
            Person person = (Person)ojb;
            // 并且当前对象的idStr与obj对象的idStr相等时才可以判断两对象相等
            if (this.getiDStr().equals(person.getiDStr())){
                return true;
            }
        }
        return false;
    }
}

public class OverrideEqualsRight {
    public static void main(String[] args) {
        Person p1 = new Person("孙行者","123456");
        Person p2 = new Person("行者孙","654321");
        Person p3 = new Person("者行孙","635241");

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p3));
    }
}