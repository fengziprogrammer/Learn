package com.itheima.threadpool_demo;

import java.util.concurrent.*;

/*
    ThreadPoolExecutor线程池类

        public ThreadPoolExecutor(
                            int corePoolSize,                   -- 核心线程数量
                            int maximumPoolSize,                -- 最大线程数量
                            long keepAliveTime,                 -- 临时线程存活时间
                            TimeUnit unit,                      -- 临时线程存活时间单位
                            BlockingQueue<Runnable> workQueue,  -- 阻塞队列
                            ThreadFactory threadFactory,        -- 创建线程的方式
                            RejectedExecutionHandler handler    -- 取舍模式
                            )

     饭馆 :
        长工
        短工
 */
public class Demo {
    public static void main(String[] args) {
        // ExecutorService threadPool = Executors.newFixedThreadPool(3);

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                5,
                20 ,
                60 ,
                TimeUnit.SECONDS ,
                new ArrayBlockingQueue<>(20) ,
                Executors.defaultThreadFactory() ,
                new ThreadPoolExecutor.AbortPolicy()
        );

        for (int i = 0; i < 41; i++) {
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("hello");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
