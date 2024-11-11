package com.atguigu.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CloseUtils {
    public static void closeQuiety(FileOutputStream fos, InputStream is, OutputStream os, Socket socket){
        //6.关流
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
