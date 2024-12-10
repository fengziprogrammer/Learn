package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * 聊天室的服务端
 */
public class Server {
    /*
     *  运行在服务端的java.net.ServerSocket主要有两个工作:
     *  1:向系统申请服务端口，客户端就是通过这个端口与服务端建立连接的
     *  2:监听该服务端口，一旦一个客户端连接就会自动创建一个Socket，
     *    相当于"接起一个电话".通过这个Socket与该客户端交互
     *
     *  我们可以把Socket想象成是电话，而ServerSocket则是总机。
     */
    private ServerSocket server;
    /*
        存所有客户端输出流的数组，供所有ClientHandler转发消息使用
     */
    private PrintWriter[] allOut = {};

    public Server(){
        try {
            /*
                实例化ServerSocket的同时需要指定服务端口，如果该端口
                已经被系统其他程序占用时会抛出异常:
                java.net.BindException:Address already in use
             */
            System.out.println("正在启动服务端...");
            server = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            /*
                ServerSocket提供的方法:
                Socket accept()
                这个方法是一个阻塞方法，调用后就"卡住了",直到一个客户端
                连接，该方法会立即返回一个Socket，通过这个Socket就可以
                和刚建立连接的客户端交互了
             */
            while(true) {
                System.out.println("等待客户端连接...");
                Socket socket = server.accept();
                System.out.println("一个客户端连接了!");
                //启动一个线程来处理该客户端的交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 定有线程任务，该任务是与指定的客户端进行交互
     * 每当一个客户端连接，就会启动一个线程执行这个任务与该客户端交互
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//当前客户端的地址信息

        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机的IP地址的字符串格式
            host = socket.getInetAddress().getHostAddress();
        }
        public void run(){
            PrintWriter pw = null;
            try{
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);

                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);
                //将该输出流存入共享数组allOut
                synchronized (server) {
                    //1对allOut数组扩容
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    //2将该输出流存入数组最后一个位置
                    allOut[allOut.length - 1] = pw;
                }
                System.out.println(host+"上线了,当前在线人数:"+allOut.length);

                String line;
                while((line = br.readLine())!=null) {
                    System.out.println(host+"说:" + line);
                    //遍历allOut数组，给所有客户端回复
                    synchronized (server) {
                        for (int i = 0; i < allOut.length; i++) {
                            allOut[i].println(host + "说:" + line);
                        }
                    }
                }
            }catch(IOException e){
            }finally{
                //处理当客户端关闭后的操作
                //将当前客户端的输出流从共享数组allOut中删除
                synchronized (server) {
                    for (int i = 0; i < allOut.length; i++) {
                        if (allOut[i] == pw) {
                            allOut[i] = allOut[allOut.length - 1];
                            allOut = Arrays.copyOf(allOut, allOut.length - 1);
                            break;
                        }
                    }
                }
                System.out.println(host+"下线了,当前在线人数:"+allOut.length);
                try {
                    socket.close();//与客户端断开连接
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
