package com.itheima.thread_demo;
/*
    线程的实现方式区别
        1 继承Thread类
            优点 : 代码实现方式比较简单 , 可以直接使用Thread类中功能
            缺点 : 扩展性较差 , 只能继承Thread类 , 任务执行完毕没有返回值结果 , 有异常只能捕获
        2 实现Runnable接口
            优点 : 代码实现方式比较简单 , 扩展性较强因为还可以继承其他的类
            缺点 : 不能直接使用Thread类中的功能 ,  任务执行完毕没有返回值结果 , 有异常只能捕获
        3 实现Callable接口
            优点 : 扩展性较强因为还可以继承其他的类 , 任务执行完毕会有一个返回值结果 , 如果任务中出现了异常可以抛也可以捕获
            缺点 : 实现太过复杂 , 不能直接使用Thread类中的功能
 */
public class Demo {
    public static void main(String[] args) {

    }
}
