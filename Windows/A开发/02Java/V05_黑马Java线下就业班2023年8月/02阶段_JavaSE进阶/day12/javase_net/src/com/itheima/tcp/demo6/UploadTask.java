package com.itheima.tcp.demo6;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

//线程任务： 接收文件上传
public class UploadTask implements Runnable{
    //成员变量：Socket对象
    private Socket server;
    private Logger LOGGER;

    public UploadTask() {
    }
    public UploadTask(Socket server, Logger LOGGER) {
        this.server = server;
        this.LOGGER = LOGGER;
    }

    @Override
    public void run() {
        InputStream netInput=null;
        FileOutputStream fos=null;
        BufferedWriter bw=null;
        try {
            //基于Socket对象，获取网络输入流（接收数据）
             netInput = server.getInputStream();
            //创建本地输出流（把读取的文件数据，写入到本地文件中）
            String fileName = UUID.randomUUID().toString().replace("-", "");//随机字符串
             fos = new FileOutputStream("upload/" + fileName + ".jpg");

            //使用Commons-io工具类实现文件上传
            IOUtils.copy(netInput, fos);//参数1：网络输入流   参数2：本地输出流

            LOGGER.trace("上传文件接收完毕!");

            //基于Socket对象，获取网络输出流（发送数据）
            bw = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
            bw.write("文件上传成功!");
            bw.newLine();//写入换行号
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //释放资源
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                netInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
