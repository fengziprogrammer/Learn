package com.itheima.tcp_demo.test4;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadServer implements Runnable {

    private Socket socket;

    public ThreadServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (
                // 3 获取网络中的字节输入流 , 封装成高效的字节输入流
                BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                // 4 创建本地高效的字节输出流
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\img\\" + UUID.randomUUID() + ".jpg"));
                // 5 获取网络中的字节输出流 , 在封装成高效的字符输出流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        ) {

            int by;// 收到的是客户端发送过来的每一个字节数据
            while ((by = bis.read()) != -1) {
                bos.write(by);
                bos.flush();
            }

            // =========================================
            // 给客户端反馈数据
            bw.write("很好看,谢谢你!");
            bw.newLine();// 必须加!!!
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
