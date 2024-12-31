package thread;

/**
 *  守护线程
 *  守护线程是通过普通线程调用setDaemon()方法设置而来的。因此在创建和使用上
 *  并无太多区别。唯一的区别就是进程的结束。
 *  当java进程中没有任何普通线程时，进程就会结束，此时会强制杀死所有守护线程。
 *
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("rose:let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("rose:啊啊啊啊啊AAAAAAaaaaaa...");
                System.out.println("扑通.");
            }
        };

        Thread jack = new Thread(){
            public void run(){
                while(true){
                    System.out.println("jack:you jump,i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        rose.start();
        jack.setDaemon(true);//设置为守护线程
        jack.start();

        /*
            如果主线程不结束，守护线程可以继续运行
            因为进程发现只要还有普通线程运行，进程就不会结束，因此不会强制
            杀掉所有守护线程。
         */
//        while(true);
    }
}







