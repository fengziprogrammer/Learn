package com.atguigu.other;

import java.util.Date;

public class Demo1_System {


    /*
        gc()  运行垃圾回收器
        finalize() 最终执行垃圾清理方法
     */
    public static void main(String[] args) {

        // System.out.println(System.currentTimeMillis());// 当前时间与系统元年的差值 毫秒值
        // System.out.println(new Date().getTime());

        //System.exit(0);
        // System.out.println("-------我执行了吗");

        for (int i = 0; i < 500000; i++) {
            new Test();
            System.gc();// 手动的 调用 垃圾回收器  不建议手动调用
        }
    }
}

class Test{

    @Override
    protected void finalize() throws Throwable {
        System.out.println("------------finalize-");
    }
}
