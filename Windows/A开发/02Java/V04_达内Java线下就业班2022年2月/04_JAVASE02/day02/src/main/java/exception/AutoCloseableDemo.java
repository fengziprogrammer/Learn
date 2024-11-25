package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 常见面试问题:
 * 请分别说明final,finally,finalize?
 * finalize方法是Object定义的方法，所以java中所有的类都有这个方法，该方法
 * 是当GC释放一个对象前调用的方法，意味着该方法调用完毕这个对象就会给GC释放。
 * 如果需要重写这个方法，方法中不应当有耗时的操作!!
 *
 *
 *
 * JDK7之后，推出了一个新特性:AutoCloseable 自动关闭特性
 * 允许我们用较精简的代码完成在异常处理机制中如IO流的关闭工作
 */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        try(
                /*
                    只有实现了AutoCloseable接口的类才能在这里定义
                    javaIO中的流和RandomAccessFile都已经实现了这个
                    接口。
                 */
                FileOutputStream fos
                        = new FileOutputStream("fos.dat");
        ){
            fos.write(1);
        }catch(IOException e){
            System.out.println("出错了!");
        }
    }
}
