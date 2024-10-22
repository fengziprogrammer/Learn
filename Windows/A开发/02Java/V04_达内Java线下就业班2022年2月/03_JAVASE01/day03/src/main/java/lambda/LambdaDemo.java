package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK8推出后出现了一个新的特性:lambda表达式
 * lambda可以让java"以函数式编程"。比较直观的感受是可以用更精简的语法创建
 * 匿名内部类。
 * 语法:
 * (参数列表)->{
 *     方法体
 * }
 */
public class LambdaDemo {
    public static void main(String[] args) {
//        FileFilter filter = new FileFilter(){
//            public boolean accept(File file) {
//                return file.getName().endsWith(".txt");
//            }
//        };
        //lambda与传统写法主要是忽略了接口的名字和方法的名字
//        FileFilter filter = (file)->{
//            return file.getName().endsWith(".txt");
//        };

        /*
            lambda表达式中如果只有一句代码，那么可以忽略方法体的"{}",并且如果这句
            代码有return关键字时这个关键字也要一同忽略。
         */
        FileFilter filter = (file)->file.getName().endsWith(".txt");


        File dir = new File(".");
        if(dir.isDirectory()){
            File[] subs= dir.listFiles(filter);
            System.out.println("一共:"+subs.length+"个");
        }
    }
}







