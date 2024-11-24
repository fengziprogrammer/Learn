package com.atguigu.function;

/*
3、在Java8中引入了很多新的函数式接口，这些类型非常多，这里用四个代表分析一下：
（1）消费型接口代表
    Consumer<T>  抽象方法 void accept(T t)
                 特点：有一个参数，返回值是void，表示无返回值。
                      调用这个抽象方法时，相当于你要给它一个实参，但是得不到返回值，相当于 有去无回，纯消费行为。
（2）供给型接口代表/奉献型接口代表
    Supplier<T>  抽象方法 T get()
                特点：没有参数，有返回值
                      调用这个抽象方法时，相当于你不用给它传参数，却可以得到一个返回值，相当于 空手套白狼。
（3）判断型接口，断定型接口代表
    Predicate<T>  抽象方法 boolean test(T t)
                特点：有一个参数，返回值类型是固定的boolean
                   调用这个抽象方法时，相当于你给它一个参数之后，它会告诉你这个参数是否满足xx条件，满足就返回true,否则就返回false.
（4）功能型接口代表
    Function<T,R>  抽象方法 R apply(T t)
                特点是：有一个参数，有一个返回值
                   调用这个抽象方法时，相当于你要给它一个实参，同时也 可以得到一个返回值，相当于  礼尚往来

 */
public class TestFunctionInterfaceRepresent {
}
