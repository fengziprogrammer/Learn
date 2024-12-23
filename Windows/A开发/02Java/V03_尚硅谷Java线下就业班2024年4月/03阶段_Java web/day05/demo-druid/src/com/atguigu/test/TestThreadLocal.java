package com.atguigu.test;

import org.testng.annotations.Test;

public class TestThreadLocal {
    @Test
    public void testSetAndGet() throws InterruptedException {

        ThreadLocal<String> threadLocal =new ThreadLocal<String>();
        // 存数据
        threadLocal.set("t1 value");
        // 取数据
        String value = threadLocal.get();
        System.out.println(value);
        threadLocal.remove();


        Thread.sleep(100);

        // 开启一个线程,在线程中用ThreadLocal取出数据
        new Thread(() -> {
                String valueb = threadLocal.get();
                System.out.println(valueb);
            }
        ).start();


    }
}
