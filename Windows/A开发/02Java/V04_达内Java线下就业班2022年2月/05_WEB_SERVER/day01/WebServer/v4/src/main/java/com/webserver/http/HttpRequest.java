package com.webserver.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 *  请求对象
 *  当前类的每一个实例用于表示客户端发送过来的一个HTTP请求
 *  一个请求由三部分构成:
 *  请求行，消息头，消息正文
 *  这里这些内容都以属性形式分别保存。
 */
public class HttpRequest {
    //请求行相关信息
    private String method;//请求方式
    private String uri;//抽象路径
    private String protocol;//协议版本

    //消息头相关信息
    //使用一个Map保存所有的消息头，其中key保存消息头的名字，value保存消息头的值
    private Map<String,String> headers = new HashMap<>();

    //消息正文相关信息


    private Socket socket;
    /**
     * HttpRequest的构造方法需要传入Socket，目的是实例化时通过该Socket
     * 读取客户端发送过来的请求内容来进行初始化。即:解析请求
     * @param socket
     */
    public HttpRequest(Socket socket){
        System.out.println("HttpRequest:开始解析请求...");
        this.socket = socket;//先将socket赋值给属性以便下面三个方法使用
        //1解析请求行
        parseRequestLine();
        //2解析消息头
        parseHeaders();
        //3解析消息正文
        parseContent();
        System.out.println("HttpRequest:请求解析完毕!");
    }
    private void parseRequestLine(){
        System.out.println("HttpRequest:开始解析请求行...");
        try{
            String line = readLine();
            System.out.println("请求行:"+line);
            //将请求行按照空格拆分为三部分并分别设置到对应属性上
            //  "\s"在正则表达式中表示一个空白字符
            String[] data = line.split("\\s");
            method = data[0];
            //下面代码如果出现了下标越界异常，说明浏览器发送了空请求!后期解决
            uri = data[1];
            protocol = data[2];
            System.out.println("method:"+method);
            System.out.println("uri:"+uri);
            System.out.println("protocol:"+protocol);


        }catch(IOException e){
            e.printStackTrace();
        }



        System.out.println("HttpRequest:请求行解析完毕!");
    }
    private void parseHeaders(){
        System.out.println("HttpRequest:开始解析消息头...");
        try{
            while(true) {
                String line = readLine();
                //如果line是空串说明单独读取到了CRLF
                if(line.isEmpty()){
                    break;
                }
                System.out.println("消息头:" + line);
                //将消息头按照": "拆分并存入map
            }
            System.out.println("headers:"+headers);

        }catch(IOException e){
            e.printStackTrace();
        }


        System.out.println("HttpRequest:消息头解析完毕!");
    }
    private void parseContent(){
        System.out.println("HttpRequest:开始解析消息正文...");

        System.out.println("HttpRequest:消息正文解析完毕!");
    }


    private String readLine() throws IOException {
        InputStream in = socket.getInputStream();
        int d;
        //pre表示上次读取到的字符，cur表示本次读取到的字符
        char pre='a',cur='a';
        StringBuilder builder = new StringBuilder();
        while((d = in.read())!=-1){
            cur = (char)d;//本次读取到的字符
            if(pre==13&&cur==10){//上次读取的是回车本次是换行?
                break;
            }
            builder.append(cur);
            pre = cur;
        }
        //trim的目的是去除字符串最后的回车符
        return builder.toString().trim();
    }
}







