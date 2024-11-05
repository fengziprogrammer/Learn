package com.atguigu.b_upload;

import java.io.*;
import java.net.Socket;

public class CloseUtils {
    private CloseUtils(){

    }
    public static void closeUtils(OutputStream os, FileOutputStream fos, FileInputStream fis,BufferedReader br, InputStream is, Socket socket){
        //7.关闭资源
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (fis!=null){
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (br!=null){
            try {
                br.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }

        if (is!=null){
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (socket!=null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
