package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 实现一个简易记事本工具
 * 程序启动后要求用户在控制台输入一个文件名，然后对该文件进行操作。
 * 将用户后续输入的每一行字符串都写入到这个文件中。
 * 如果用户单独输入了exit，则程序退出。
 * 写入文件的内容不用考虑换行问题。
 * 使用文件输出流完成
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String fileName = scanner.nextLine();
        FileOutputStream fos = new FileOutputStream(fileName);
        System.out.println("请开始输入内容，单独输入exit时退出。");
        while(true) {
            String line = scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            fos.write(line.getBytes("UTF-8"));
        }
        System.out.println("再见!");
        fos.close();
    }
}
