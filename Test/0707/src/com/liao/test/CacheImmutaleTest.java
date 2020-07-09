package com.liao.test;


/**
 *
 * TODO: 缓存池
 * @author LiAo
 * @date 2020/7/7 20:42
 */
class CacheImmutale {
    private static int MAX_SIZE = 10;
    // 使用数组缓存已有实例
    private static CacheImmutale[] cacheImmutales = new CacheImmutale[MAX_SIZE];

    // 用来记录实例在缓存中的位置
    private static int pos = 0;

    private final String name;

    public CacheImmutale(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static CacheImmutale valueOf(String name){
        // 遍历缓存的对象
        for (int i = 0; i < MAX_SIZE; i++) {
            // 如果有相同实例，则直接返回缓存的实例
            if (cacheImmutales[i] != null && cacheImmutales[i].getName().equals(name)){
                return cacheImmutales[i];
            }
        }
        // 如果缓存池已满
        if (pos == MAX_SIZE){
            // 把刚刚缓存的对象放在第一个位置
            cacheImmutales[0] = new CacheImmutale(name);
            // 把pot 改为1
            pos = 1;
        }else {
            // 把新建的缓存对象缓存起来。pst + 1
            cacheImmutales[pos++] = new CacheImmutale(name);
        }
        return cacheImmutales[pos -1];
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj != null && obj.getClass() ==  CacheImmutale.class){
            CacheImmutale cale = (CacheImmutale)obj;
            return name.equals(cale.getName());
        }
        return false;
    }

    public int hashCode(){
        return name.hashCode();
    }

}

public class CacheImmutaleTest{
    public static void main(String[] args) {
        /*CacheImmutale c1 =  CacheImmutale.valueOf("hello");
        CacheImmutale c2 =  CacheImmutale.valueOf("hello");
        System.out.println(c1 == c2);*/

        Integer int1 = new Integer(6);
        Integer int2 = Integer.valueOf(6);
        // 直接从缓存中取出Integer对象
        Integer int3 = Integer.valueOf(6);

        System.out.println(int1 == int2);
        System.out.println(int2 == int3);

        // 只会缓存 -127 - 128的
        Integer int4 = Integer.valueOf(129);
        Integer int5 = Integer.valueOf(129);
        System.out.println(int4 == int5);
    }
}




















