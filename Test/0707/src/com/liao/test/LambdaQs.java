package com.liao.test;

interface Eatable {
    void tate();
}

interface Flyable {
    void fly(String string);
}

interface Addable {
    int add(int a, int b);
}

public class LambdaQs {
    public void eat(Eatable e) {
        System.out.println(e);
        e.tate();
    }

    public void drive(Flyable f) {
        System.out.println("Flyable" + f);
        f.fly("蛟龙岂是池中物");
    }

    public void test(Addable a) {
        System.out.println(a.add(5,3));
    }

    public static void main(String[] args) {
        LambdaQs lambdaQs = new LambdaQs();
        lambdaQs.eat(() -> System.out.println("苹果味道不错"));

        lambdaQs.drive(weather -> {
            System.out.println("--->>" + weather);
            System.out.println("直升机降落平稳");
        });

        lambdaQs.test((a, b) -> a + b);
    }
}