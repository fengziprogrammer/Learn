package com.atguigu.tcp.demo3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/*
需求：
（1）与服务器建立连接，或者说和服务器发起连接请求
（2）从键盘输入单词，并且按行给服务器发送每一个单词
（3）直到输入bye结束
（4）结束后要断开连接
 */
public class Client3 {
    public static void main(String[] args)throws Exception {
        Socket socket  = new Socket(InetAddress.getLocalHost(),8888);

        OutputStream out = socket.getOutputStream();//获取输出流，用于发送数据
        InputStream in = socket.getInputStream();//获取输入流，用于接收消息

        /*
        同理，为了能够按行读和写，需要对in和out进行包装
         */
         /*
        按行发送：BufferedWriter里面有write方法 + newLine方法
                PrintStream里面println
         */
        PrintStream ps = new PrintStream(out);

        InputStreamReader isr = new InputStreamReader(in);
        //假设我还想要按行读，处理更方便
        BufferedReader br = new BufferedReader(isr);

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("请输入单词或词语：");
            String word = input.next();

            //发送一个单词
            ps.println(word);

            if("bye".equals(word)){
                break;
            }

            //接收一个单词
            String result = br.readLine();
            System.out.println("服务器返回的消息是：" + result);
        }

        //退出循环，说明要断开连接
        ps.close();
        out.close();
        br.close();
        isr.close();
        in.close();
        socket.close();
    }
}
