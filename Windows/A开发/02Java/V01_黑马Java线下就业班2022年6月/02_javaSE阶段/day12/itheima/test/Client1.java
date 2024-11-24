package com.itheima.test;

import java.io.*;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) {
        try {
            //创建网络输出流
            Socket socket = new Socket("127.0.0.1", 50026);
            //创建高效网络字节输出流
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            File file = new File("D:\\a.txt");
            String fileName = file.getName();// "a.txt"
            bw.write(fileName);
            bw.newLine();
            bw.flush();

            //创建高效的网络字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String status = br.readLine();//  状态
            //创建本地高效字节输入流
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            if (status.equals("true")) {
                int by;
                while ((by = bis.read()) != -1) {
                    bos.write(by);
                    bos.flush();
                }
                socket.shutdownOutput();

                String s = br.readLine();
                System.out.println("服务器反馈:" + s);
            } else {
                System.out.println("文件已存在 , 上传失败!");
            }

            br.close();
            socket.close();
            bos.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
