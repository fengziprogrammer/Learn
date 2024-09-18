package com.atguigu.e_fanxing;

public class MyScanner implements MyIterator<String>{
    @Override
    public String next() {
        return "重写的next方法";
    }
}
