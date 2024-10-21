package com.atguigu.a_wait_notify;

/**
 * 消费线程
 */
public class Consumer implements Runnable{
    private BaoZiPu baoZiPu;

    public Consumer(BaoZiPu baoZiPu) {
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
                if (baoZiPu.isFlag()==false){
                    //1.如果flag为false,证明没有包子,消费线程等待
                    try {
                        baoZiPu.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //2.如果出了if,或者不走if,有包子,需要消费了
                baoZiPu.getCount();
                //3.改变flag状态为false,证明消费完了,没有包子了
                baoZiPu.setFlag(false);
                //4.唤醒生产线程
                baoZiPu.notify();
            }

        }

    }
}
