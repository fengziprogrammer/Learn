package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室的客户端
 */
public class Client {
    /*
        java.net.Socket 套接字
        Socket封装了TCP协议的通讯细节，使用它可以和远端计算机建立连接。
        并利用两个流的读写完成与远端计算机的数据交互。
     */
    private Socket socket;
    /**
     * 构造方法，用于初始化客户端
     */
    public Client(){
        try {
            /*
                实例化Socket时需要传入两个参数:
                参数1:服务端的IP地址信息，”localhost“是一种特殊的写法
                     表示本机地址。
                参数2:服务端打开的端口，数字取值范围1-65535之间

                通过IP我们可以找到网络上的服务端所在计算机，通过端口可以
                连接到该计算机上的服务端应用程序。
             */
            System.out.println("正在连接服务端...");
            socket = new Socket("localhost",8088);
            System.out.println("与服务端建立连接!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 客户端开始工作的方法
     */
    public void start(){
        try {
            /*
                Socket提供的方法:
                OutputStream getOutputStream()
                该方法会返回一个字节输出流，通过这个输出流写出的字节会发送
                给远端计算机
             */
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner scanner = new Scanner(System.in);
            while(true) {
                String line = scanner.nextLine();
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
