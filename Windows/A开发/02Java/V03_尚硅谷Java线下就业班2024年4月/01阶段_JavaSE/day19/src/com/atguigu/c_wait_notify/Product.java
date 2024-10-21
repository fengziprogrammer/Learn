package com.atguigu.c_wait_notify;

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
            synchronized (baoZiPu){
                while (baoZiPu.isFlag()==true){
                    //1.如果flag为true,证明有包子,生产线程等待
                    try {
                        baoZiPu.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //2.如果出了if,或者不走if,没有包子,需要生产了
                baoZiPu.setCount();
                //3.改变flag状态为true,证明生产完了,有包子了
                baoZiPu.setFlag(true);
                //4.唤醒所有等待线程
                baoZiPu.notifyAll();
            }
        }
    }
}
