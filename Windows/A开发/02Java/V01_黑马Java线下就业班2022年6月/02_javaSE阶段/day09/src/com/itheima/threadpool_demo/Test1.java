package com.itheima.threadpool_demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    1 需求 :
        使用线程池模拟游泳教练教学生游泳。
        游泳馆（线程池）内有3名教练（线程）
        游泳馆招收了5名学员学习游泳（任务）。

    2 实现步骤：
        1 创建线程池指定3个线程
        2 定义学员类实现Runnable，
        3 创建学员对象给线程池
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建线程池对象 , 线程池中有三条线程
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        threadPool.submit(new Student("小花"));
        threadPool.submit(new Student("小明"));
        threadPool.submit(new Student("小红"));
        threadPool.submit(new Student("小刚"));
        threadPool.submit(new Student("小白"));

        // 关闭线程池
        // threadPool.shutdown();
    }
}

// 定义任务类
class Student implements Runnable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "教" + name + "学习游泳...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "学习完毕!");
    }
}


