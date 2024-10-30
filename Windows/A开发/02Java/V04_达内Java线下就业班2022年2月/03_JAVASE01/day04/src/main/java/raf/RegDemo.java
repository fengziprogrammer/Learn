package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册功能
 * 程序启动后要求用户顺序输入:用户名，密码，昵称和年龄
 * 然后将该用户信息写入文件user.dat中保存。
 *
 * 设计格式:
 * 每条记录固定占用100字节，其中用户名，密码，昵称各站32字节，年龄固定4字节。
 * 对于字符串而言故意留白好处是后期再添加字符是可以的，不会影响其他数据。而且
 * 长度固定利于指针的移动操作。
 *
 */
public class RegDemo {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎注册:");
        System.out.println("请输入用户名:");
        String username = scanner.nextLine();
        System.out.println("请输入密码:");
        String password = scanner.nextLine();
        System.out.println("请输入昵称:");
        String nickname = scanner.nextLine();
        System.out.println("请输入年龄:");
        int age = scanner.nextInt();

        RandomAccessFile raf
                = new RandomAccessFile("user.dat","rw");
        //现将指针移动到文件末尾
        raf.seek(raf.length());
        //写入用户名
        byte[] data = username.getBytes("UTF-8");
        //将数组扩容至32字节
        data = Arrays.copyOf(data,32);
        raf.write(data);//写入32字节
        //写密码
        data = password.getBytes("UTF-8");
        //将数组扩容至32字节
        data = Arrays.copyOf(data,32);
        raf.write(data);//写入32字节
        //写昵称
        data = nickname.getBytes("UTF-8");
        //将数组扩容至32字节
        data = Arrays.copyOf(data,32);
        raf.write(data);//写入32字节
        //写入年龄
        raf.writeInt(age);
        System.out.println("注册完毕!");
        raf.close();

    }
}







