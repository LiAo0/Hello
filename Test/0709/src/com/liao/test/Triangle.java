package com.liao.test;

public class Triangle extends Shap {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);

    }

    public void setSides(double a, double b, double c) {
        if (a > b + c && b > a + c && c > a + b){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double calPerimeter(){
        return a + b + c;
    }

    public String getType(){
        return "三角形";
    }


}