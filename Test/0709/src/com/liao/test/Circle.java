package com.liao.test;

public class Circle extends Shap{
    private double radius;

    public Circle(String code,double radius){
        super(code);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String getType() {
        return getColor()+"圆形";
    }

    public static void main(String[] args) {
        Shap s1 = new Triangle("黑色",3,4,5);
        Shap s2 = new Circle("黄色",3);
        System.out.println(s1.calPerimeter());
        System.out.println(s1.getType());
        System.out.println(s2.calPerimeter());
        System.out.println(s2.getType());
    }
}