package com.webserver.core;

import java.io.IOException;
import java.net.Socket;

/**
 * 处理与指定客户端的交互。这里的客户端通常是浏览器，并且是基于HTTP协议
 * 进行交互的，因此交互模式采取一问一答规则。对此，ClientHandler处理的
 * 过程分为三步:
 * 1:解析请求
 * 2:处理请求
 * 3:响应客户端
 */
public class ClientHandler implements Runnable{
    private Socket socket;
    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    public void run() {
        try{
            //1 解析请求   读取客户端发送过来的HTTP请求(一问)

            //2 处理请求

            //3 响应客户端  将处理结果以HTTP响应格式发送给客户端(一答)

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //与客户端断开连接
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
