package com.atguigu.tcp.demo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
需求：
(1)开启一个TCP协议的服务，在8888端口号监听客户端的连接。
(2)接收一个客户端的连接
(3)接收客户端发过来的单词或词语，然后我把它“反转”
例如：客户端发过来“hello"，反转"olleh"
(4)把反转后的单词或词语，返回给客户端
(5)直到客户端发过来"bye"为止

升级需求，同时接收多个客户端连接

 */
public class Server3 {
    public static void main(String[] args) throws Exception{
        //开启一个TCP协议的服务，在8888端口号监听客户端的连接。
        ServerSocket server = new ServerSocket(8888);

        while(true) {
            //正式接收客户端的连接
            Socket socket = server.accept();
            System.out.println(socket.getInetAddress().getHostAddress() + "连接成功！");

            //启动线程
            new ClientHandlerThread(socket).start();
        }

//       不关闭，因为要接收n个客户端连接，一直工作
//        server.close();

    }
}

class ClientHandlerThread extends Thread{
    private Socket socket;

    public ClientHandlerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run(){
        try(
        InputStream in = socket.getInputStream();//获取输入流对象，用于接收消息
        OutputStream out = socket.getOutputStream();//获取输出流对象，用于返回消息

    /*        byte[] data = new byte[1024];
            int len;
            while((len = in.read(data)) != -1){

            }*///如果使用纯字节方式，会不好区分每一个单词，应该使用字符流更好一点

        InputStreamReader isr = new InputStreamReader(in);
        //假设我还想要按行读，处理更方便
        BufferedReader br = new BufferedReader(isr);

            /*
            按行发送：BufferedWriter里面有write方法 + newLine方法
                    PrintStream里面println
             */
        PrintStream ps = new PrintStream(out);) {

            while (true) {
                String str = br.readLine();
                if ("bye".equals(str)) {
                    break;
                }

                //字符串反转
                StringBuilder s = new StringBuilder(str);
                s.reverse();

                //返回
                //为了对方接收时，可以按行处理，我这边也可以把反转的数据按行发送
                ps.println(s.toString());
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}