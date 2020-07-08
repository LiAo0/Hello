package com.liao.test;

class Animal{
    private void beat(){
        System.out.println("心脏跳动");
    }

    public void breath(){
        beat();
        System.out.println("Animal呼吸");
    }
}

class Bird{
    private Animal a;

    public Bird(Animal a){
        this.a = a;
    }

    public void breath(){
        a.breath();
    }

    public void fly(){
        System.out.println("B飞翔");
    }
}

class Wolf{
    private Animal a;

    public Wolf(Animal a){
        this.a = a;
    }

    public void breath(){
        a.breath();
    }

    public void fly(){
        System.out.println("W奔跑");
    }
}
public class CompositeTest {
    public static void main(String[] args){
        Animal animal = new Animal();
        Bird bird = new Bird(animal);
        bird.breath();
        bird.fly();

        Wolf wolf = new Wolf(animal);
        wolf.breath();
        wolf.fly();

        
        System.out.println();
    }
}