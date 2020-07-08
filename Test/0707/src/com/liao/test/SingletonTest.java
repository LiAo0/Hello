package com.liao.test;


/**
 *
 * TODO: 单例
 * @author LiAo
 * @date 2020/7/7 17:25
 */
class Singleton{
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance(){
        // 如果singleton为null表明没有创建
        // 如果singleton不为null表明已经创建
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); //true
    }
}