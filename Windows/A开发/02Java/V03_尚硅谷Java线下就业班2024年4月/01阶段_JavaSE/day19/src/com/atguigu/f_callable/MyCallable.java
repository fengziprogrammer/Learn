package com.atguigu.f_callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "涛哥和柳岩那一夜去钻小树林的故事";
    }
}
