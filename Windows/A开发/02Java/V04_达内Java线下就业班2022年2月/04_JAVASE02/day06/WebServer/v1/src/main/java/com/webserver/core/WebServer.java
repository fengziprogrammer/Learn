package com.webserver.core;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * WebServer 是模拟Tomcat的一个简易版的Web容器。
 * 与客户端(通常是浏览器)进行TCP连接，并基于HTTP协议进行交互，是的客户端可以
 * 访问当前Web容器中管理的所有网络应用的资源和功能。
 * Webapp:网络应用，Web容器中可以同时管理多个网络应用。每个网络应用都包含:
 * 网页，静态素材(图片，样式文件，脚本文件等)以及用于处理业务的java代码。也就是
 * 我们俗称的一个"网站"的全部内容。
 */
public class WebServer {
    private ServerSocket server;

    public WebServer(){
        try {
            System.out.println("正在启动服务端...");
            server = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            System.out.println("等待客户端连接...");
            Socket socket = server.accept();
            System.out.println("一个客户端连接了!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        WebServer server = new WebServer();
        server.start();
    }
}






