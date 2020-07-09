package com.liao.test;


/**
 *
 * TODO: 抽象类
 * @author LiAo
 * @date 2020/7/9 11:11
 */
public abstract class Shap {
    {
        System.out.println("初始化代码块");
    }

    private String color;

    // 计算周长的方法
    public abstract double calPerimeter();
    // 计算形状
    public abstract String getType();

    public Shap() {
    }

    public Shap(String color) {
        System.out.println("Shap构造器");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}