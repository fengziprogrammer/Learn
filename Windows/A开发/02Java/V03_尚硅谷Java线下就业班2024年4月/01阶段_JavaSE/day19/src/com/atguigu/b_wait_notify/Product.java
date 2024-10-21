package com.atguigu.b_wait_notify;

/**
 * 生产线程
 */
public class Product implements Runnable{
    private BaoZiPu baoZiPu;

    public Product(BaoZiPu baoZiPu) {
        this.baoZiPu = baoZiPu;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //直接调用set方法
            baoZiPu.setCount();

        }
    }
}
