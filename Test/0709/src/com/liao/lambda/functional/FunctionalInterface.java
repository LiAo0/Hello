package com.liao.lambda.functional;

import java.util.function.*;


/**
 *
 * TODO: 系统内置接口
 * @author LiAo
 * @date 2020/7/10 10:33
 */
public class FunctionalInterface {
    public static void main(String[] args) {

        //系统内置的一些函数式接口
        //Predicate<T>：参数T返回值boolean
            //IntPredicate int->boolean
            //LongPredicate long->boolean
            //DoublePredicate double->boolean

        //Consumer<T>：参数T 返回值void
            //Intconsumer int->void
            //LongConsumer long->void
            //DoubleConsumer double->void
        //Function<T，R>：参数T返回值R
            //IntFunction<R>int->R
            //LongFunction<R>long->R
            //DoubleFunction<R> double->R
            //IntTolongFunction int->long
            //IntToDoubleFunction int->double
            //LongToIntFunction long->int LongToDoubleFunction long->double
            //DoubleToIntFunction doublt->int DoubleToLongFunction double->1ong

        //Supplier<T>：参数无返回值T
        //UnaryOperator<T>：参数T返回值T
        //BinaryOperator<T>：参数T，T 返回值T
        //BiFunction<T，U，R>：参数T，U返回值R
        //BiPredicate<T，U>：参数T，U返回值boolean
        //BiConsumer<T，U>：参数T，U返回值void
        //Predicate<T>、Consumer<T>、Function<T，R>、Supplier<>
    }
}