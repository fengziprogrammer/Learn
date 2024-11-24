package com.itheima.test;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ServerThreadPool implements Runnable {
    Socket socket;

    public ServerThreadPool(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //通过创建高效网络输入流接收用户数据
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

            //创建高效的网络字符输出流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String fileName = br.readLine();// a.txt


            // false : fileName在文件夹中不存在
            // true : 存在
            boolean flag = false;
            BufferedOutputStream bos = null;

            File file = new File("D:\\aaa");// 父路径文件夹
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                // 遍历数组
                for (File f : files) {
                    String name = f.getName();
                    if (name.equals(fileName)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    // 存在 , 给客户端反馈 , 文件已存在 ,不需要上传
                    bw.write("false");
                    bw.newLine();
                    bw.flush();
                } else {
                    // 不存在 , 告知客户端可以上传
                    bw.write("true");
                    bw.newLine();
                    bw.flush();

                    //创建高效本地字节输出流下载数据
                    bos = new BufferedOutputStream(new FileOutputStream(file + "\\" + fileName));
                    int by;
                    while ((by = bis.read()) != -1) {
                        bos.write(by);
                        bos.flush();
                    }

                    bw.write("传输完成");
                    bw.newLine();
                    bw.flush();
                }

            }

            bw.close();
            bis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
