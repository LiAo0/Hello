package com.liao.lambda.syntax;

import com.liao.lambda.dada.Pserson;

public class Syntax3 {


    public static void main(String[] args) {
        PersonCreate person = () -> new Pserson();

        // 对无参构造方法的引用
        PersonCreate person1 = Pserson::new;
        person1.getPserson();

        //对有参构造方法的引用
        PersonCreate2 person2 = Pserson::new;
        Pserson pserson = person2.getPerson("朱文娟","二狗");
    }
}
interface PersonCreate{
    Pserson getPserson();
}

interface PersonCreate2{
    Pserson getPerson(String name ,String sex);
}