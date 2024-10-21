package com.atguigu.g_callable;

import java.util.concurrent.Callable;

public class MyString implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "我爱java";
    }
}
