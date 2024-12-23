package thread;

/**
 * 线程提供了一个方法:join,可以协调线程之间的同步运行。
 *
 * 异步运行:多个线程各干各的，并发本身就是异步运行。
 * 同步运行:多个线程执行存在先后顺序。
 */
public class JoinDemo {
    //标识图片是否下载完毕
    private static boolean isFinish = false;

    public static void main(String[] args) {
        /*
            一个方法的局部内部类中若引用这个方法的其他局部变量时，这个变量
            必须是final的。
         */
//        boolean isFinish = false;
        Thread download = new Thread(){
            public void run(){
                System.out.println("down:开始下载图片...");
                for(int i=1;i<=100;i++){
                    System.out.println("down:"+i+"%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("down:下载图片完毕!");
                isFinish = true;
            }
        };

        Thread show = new Thread(){
            public void run(){
                try{
                    System.out.println("show:开始显示文字...");
                    Thread.sleep(3000);
                    System.out.println("show:显示文字完毕!");
                    /*
                        要先等待download线程执行完毕后再继续后续工作

                        当show线程调用download.join()方法后就会进入阻塞
                        状态，直到download执行完毕才会解除阻塞
                     */
                    System.out.println("show:开始等待download...");
                    download.join();
                    System.out.println("show:等待download完毕!");


                    System.out.println("show:开始显示图片...");
                    if(isFinish){
                        System.out.println("show:显示图片完毕!");
                    }else{
                        throw new RuntimeException("图片加载失败!");
                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        download.start();
        show.start();
    }
}






