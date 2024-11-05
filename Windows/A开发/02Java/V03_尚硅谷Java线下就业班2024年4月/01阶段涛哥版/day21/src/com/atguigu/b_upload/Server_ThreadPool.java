package com.atguigu.b_upload;

import java.io.FileOutputStream;
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
public class Server_ThreadPool {
    public static void main(String[] args) throws Exception {
        //1.创建ServerSocket对象,设置端口号
        ServerSocket ss = new ServerSocket(6666);

        ExecutorService es = Executors.newFixedThreadPool(50);

        while (true) {
            //2.调用accept方法等待客户端连接
            Socket socket = ss.accept();

           es.submit(new Runnable() {
                @Override
                public void run() {
                    InputStream is = null;
                    FileOutputStream fos = null;
                    OutputStream os = null;
                    try {
                        //3.调用getInputStream,用于读取客户端发送过来的图片字节
                        is = socket.getInputStream();

                        //UUID是一个工具类,可以生成随机的串儿
                        UUID uuid = UUID.randomUUID();
                        String name = uuid.toString();
                        //4.创建FileOutputStream,用于将读取过来的图片写到本地上
                        fos = new FileOutputStream("E:\\Idea\\io\\upload\\" + name + ".jpg");
                        //5.边读边写
                        byte[] bytes1 = new byte[1024];
                        int len;
                        while ((len = is.read(bytes1)) != -1) {
                            fos.write(bytes1, 0, len);
                        }

                        System.out.println("============以下代码为响应结果=============");

                        //6.获取getOutputStream,用于给客户端响应数据
                        os = socket.getOutputStream();
                        os.write("上传成功".getBytes());

                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                       CloseUtils.closeUtils(os,fos,null,null,is,socket);
                    }
                }
            });


        }

    }
}
