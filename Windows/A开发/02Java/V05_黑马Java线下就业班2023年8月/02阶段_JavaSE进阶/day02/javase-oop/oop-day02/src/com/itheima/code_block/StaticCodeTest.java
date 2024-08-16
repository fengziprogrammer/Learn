package com.itheima.code_block;

public class StaticCodeTest {
    public static void main(String[] args) {
        //不需要创建对象，使用静态方法获取数据
        String data = StaticCode.getData(2);

        System.out.println(data);
    }
}
