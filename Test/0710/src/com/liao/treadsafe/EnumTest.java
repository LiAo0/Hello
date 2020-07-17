package com.liao.treadsafe;

public class EnumTest {

    public static void main(String[] args) {

        // 返回Enum中所有的实例
        for (SeasonEnum e : SeasonEnum.values()) {
            System.out.println(e);
        }

        jude(SeasonEnum.FALL);

        // 与指定的枚举对象比较顺序
        System.out.println(SeasonEnum.FALL.compareTo(SeasonEnum.SPRING));

        // 返回枚举对象的名称
        System.out.println(SeasonEnum.SPRING.name());

        // 返回枚举对象的索引值 从0开始
        System.out.println(SeasonEnum.SPRING.ordinal());
    }

    public static void jude(SeasonEnum seasonEnum) {
        switch (seasonEnum) {
            case SPRING:
                System.out.println("春暖花开");
                break;
            case SUMMER:
                System.out.println("夏日炎炎");
                break;
            case FALL:
                System.out.println("秋高气爽");
                break;
            case WINTER:
                System.out.println("冬日暖阳");
                break;
        }
    }
}