package thread;

/**
 * 同步块
 * 语法:
 * synchronized(同步监视器对象){
 *     需要同步运行的代码片段
 * }
 *
 * 有效的缩小同步范围可以在保证并发安全的前提下提高并发效率
 *
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }
}

class Shop{
    /*
        在方法上使用synchronized时，同步监视器对象就是当前方法所属对象
        即:this
     */
//    public synchronized void buy(){
    public void buy(){
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在挑衣服...");
            Thread.sleep(5000);
            /*
                同步块使用时要指定同步监视器对象，它可以是java中任何类的
                实例，但是必须保证多个需要同步运行该代码块的线程看到的这个
                对象是同一个才行。
             */
//            synchronized (new Object()) {//该同步监视器对象无效
            synchronized (this) {
                System.out.println(t.getName() + ":正在试衣服...");
                Thread.sleep(5000);
            }
            System.out.println(t.getName()+":结账离开!");
        }catch(InterruptedException e){
        }
    }
}





