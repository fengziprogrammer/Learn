package com.itheima.thread_demo;

import java.text.SimpleDateFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
    实现线程的第三种方式 : 实现Callable接口
 */
public class MyThread03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 3 创建Callable实现类对象
        MyCallable myCallable = new MyCallable();

        // 4 创建FutureTask类的对象 , 把Callable实现类对象作为构造参数传递
        FutureTask<String> task = new FutureTask<>(myCallable);

        // 5 创建线程类的对象 . FutureTask作为构造参数传递
        // Thread t = new Thread(Runnable接口实现类对象);
        Thread t = new Thread(task);
        t.setName("新线程");
        // 6 开启线程
        t.start();

        // call方法执行完毕返回的结果值
        String s = task.get();// 具备阻塞
        System.out.println(s);

        System.out.println("main方法的执行了...");
    }
}

// 1 自定义类实现Callable接口
class MyCallable implements Callable<String> {

    // 2 重写接口中的call方法 , 此方法的返回值就是线程执行完毕返回的结果值
    @Override
    public String call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            // Thread.currentThread() : 拿到当前线程对象
            // Thread.currentThread().getName() : 当前线程的名字
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        return "当前线程执行完毕!";
    }
}


