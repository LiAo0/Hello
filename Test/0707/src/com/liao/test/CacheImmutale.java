package com.liao.test;


/**
 *
 * TODO: 缓存池
 * @author LiAo
 * @date 2020/7/7 20:42
 */
public class CacheImmutale {
    private static int MAX_SIZE = 10;
    // 使用数组缓存已有实例
    private static CacheImmutale[] cacheImmutales = new CacheImmutale[MAX_SIZE];

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
            
        }
    }
}