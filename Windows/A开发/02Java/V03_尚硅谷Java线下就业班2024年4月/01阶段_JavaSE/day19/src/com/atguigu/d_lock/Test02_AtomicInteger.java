package com.atguigu.d_lock;

import java.util.concurrent.atomic.AtomicInteger;

public class Test02_AtomicInteger {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println("atomicInteger = " + atomicInteger);

        //int addAndGet(int delta)
        int andAdd = atomicInteger.addAndGet(10);
        System.out.println("andAdd = " + andAdd);
        //int incrementAndGet()      以原子方式将当前值加 1。

        int andIncrement = atomicInteger.incrementAndGet();
        System.out.println("andIncrement = " + andIncrement);
    }
}
