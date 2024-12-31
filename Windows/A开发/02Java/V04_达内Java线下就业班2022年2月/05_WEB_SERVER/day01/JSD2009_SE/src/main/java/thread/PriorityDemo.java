package thread;

/**
 * 线程的优先级
 * 线程有10个优先级，分别用整数1-10表示。其中1为最低，5为默认，10为最高。
 * 线程start后就纳入到线程调度器中统一管理，线程不能主动索取时间片来运行，只能
 * 被动被分配，并且线程调度器尽可能均匀将时间片分配给线程并发运行。
 * 通过调整线程的优先级可以最大程度改善一个线程获取CPU时间片的次数。原则上
 * 线程优先级越高的线程获取时间片的次数越多(前提是这些线程在同一个CPU核心上)。
 *
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread(){
          public void run(){
              for(int i=0;i<10000;i++){
                  System.out.println("min");
              }
          }
        };
        Thread norm = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("nor");
                }
            }
        };
        Thread max = new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("max");
                }
            }
        };
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        norm.start();
        max.start();
    }
}






