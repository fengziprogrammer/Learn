package com.atguigu.e_threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {
    public static void main(String[] args) {
        //1.创建线程池对象
        ExecutorService es = Executors.newFixedThreadPool(2);
        //2.调用submit提交线程任务
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());
        es.submit(new MyRunnable());

        //3.关闭线程池,不再接受新的线程任务
        es.shutdown();
    }
}
