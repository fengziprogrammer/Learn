package thread;

/**
 * 线程提供了一个静态方法:
 * static void sleep(long ms)
 * 使调用该方法的线程进入阻塞状态指定毫秒。超时后线程会自动回到RUNNABLE状态
 * 等待再次获取时间片并发运行。
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        /*
            实现倒计时程序:
            程序启动后要求用户输入一个数字，然后从这个数字开始每秒递减，
            到0时输出时间到。
         */
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("程序结束了");
    }
}
