package com.itheima.review;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//第一种：线程任务
class Task1 implements Runnable{
    @Override
    public void run() {

    }
}

//第二种：线程任务
class Task2 implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }
}


public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(10);

        //把线程任务，交给线程池运行
        es.submit( new Task1() );

        es.submit( new Task2() );
    }
}
