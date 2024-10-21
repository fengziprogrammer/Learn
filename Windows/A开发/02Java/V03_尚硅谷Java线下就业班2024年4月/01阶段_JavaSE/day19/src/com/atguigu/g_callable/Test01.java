package com.atguigu.g_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<String> future1 = es.submit(new MyString());
        Future<Integer> future2 = es.submit(new MySum());

        System.out.println(future1.get());
        System.out.println(future2.get());

        es.shutdown();
    }
}
