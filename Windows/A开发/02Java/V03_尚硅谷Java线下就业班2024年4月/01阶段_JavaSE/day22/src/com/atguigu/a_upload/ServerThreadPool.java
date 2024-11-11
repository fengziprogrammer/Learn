package com.atguigu.a_upload;

import com.atguigu.utils.CloseUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 服务端
 */
public class ServerThreadPool {
    public static void main(String[] args) throws Exception {
        //1.创建ServerSocket对象
        ServerSocket ss = new ServerSocket(6666);

        ExecutorService es = Executors.newFixedThreadPool(50);

        while (true) {
            Socket socket = ss.accept();
            es.submit(new Runnable() {
                @Override
                public void run() {
                    FileOutputStream fos = null;
                    InputStream is = null;
                    OutputStream os = null;
                    try {
                        //2.创建FileOutputStream,将读取过来的图片写到本身上
                        String s = UUID.randomUUID().toString();
                        long time = System.currentTimeMillis();
                        String name = s + time;
                        fos = new FileOutputStream("E:\\Idea\\io\\upload\\" + name + ".jpg");
                        //3.调用Socket中的getInputStream读取客户端写过来的图片字节
                        is = socket.getInputStream();
                        //4.边读边写
                        byte[] bytes = new byte[1024 * 10000];
                        int len;
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }

                        System.out.println("==========以下代码是回响应代码========");

                        //5.调用getOutputStream,给客户端写数据
                        os = socket.getOutputStream();
                        os.write("上传成功".getBytes());


                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        CloseUtils.closeQuiety(fos,is,os,socket);
                    }
                }
            });
        }
    }
}
