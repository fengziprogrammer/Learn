package io;

import java.io.*;
import java.util.Scanner;

/**
 * 实现一个简易记事本工具
 * 程序启动后要求用户在控制台输入一个文件名，然后对该文件进行操作。
 * 将用户后续输入的每一行字符串都写入到这个文件中。
 * 如果用户单独输入了exit，则程序退出。
 * 使用PrintWriter并且使用流连接完成
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String fileName = scanner.nextLine();

        FileOutputStream fos = new FileOutputStream(fileName);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        /*
            PrintWriter如果创建时第一个参数是一个流，那么就支持再传入
            一个参数，是一个boolean值，该值为true时则当前PW为自动行刷新
            模式。即:每当我们调用println方法写出一行字符串后就会自动flush
         */
        PrintWriter pw = new PrintWriter(bw,true);

        System.out.println("请开始输入内容，单独输入exit退出.");
        while(true){
            String line = scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
        }
        System.out.println("再见!");
        pw.close();
    }
}
