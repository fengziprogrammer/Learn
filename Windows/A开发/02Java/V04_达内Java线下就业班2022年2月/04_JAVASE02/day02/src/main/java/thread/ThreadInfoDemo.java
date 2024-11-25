package thread;

/**
 * 获取线程相关信息的一组方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();//获取主线程
        //获取线程的名字
        String name = main.getName();
        System.out.println("name:"+name);
        //获取线程的ID
        long id = main.getId();
        System.out.println("id:"+id);
        //获取线程的优先级
        int priority = main.getPriority();
        System.out.println("优先级:"+priority);
        //线程是否活着
        boolean isAlive = main.isAlive();
        System.out.println("isAlive:"+isAlive);
        //是否为守护线程
        boolean isDaemon = main.isDaemon();
        System.out.println("isDaemon:"+isDaemon);
        //是否被中断
        boolean isInterrupted = main.isInterrupted();
        System.out.println("isInterrupted:"+isInterrupted);

    }
}
