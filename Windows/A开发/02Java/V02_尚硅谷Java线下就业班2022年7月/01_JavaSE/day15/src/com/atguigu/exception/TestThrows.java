package com.atguigu.exception;

public class TestThrows {
    public static void main(String[] args){
        System.out.println("上课.....");
        try {
            afterClass();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("上课.....");
    }

    public static void afterClass() throws InterruptedException {//把锅甩给main方法了
        for(int i=10; i>=1; i--){//循环10次
            //每运行异常Thread.sleep(1000)语句，程序就会暂停1秒  1000毫秒
            Thread.sleep(1000);//本来应该在这里处理异常
            System.out.println("距离上课还有：" + i + "分钟");
        }
    }
}
