package com.itheima.service;

import com.itheima.Protocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件上传下载功能定义
 */
public interface FileUpDownService {
    /**
     * 上传
     * @param protocol 协议
     * @param netIn
     * @param netOut
     * @throws IOException
     */
    void uploadFile(Protocol protocol, InputStream netIn, OutputStream netOut) throws IOException;

    /**
     * 下载
     * @param protocol
     * @param netIn
     * @param netOut
     * @throws IOException
     */
    void downloadFile(Protocol protocol, InputStream netIn, OutputStream netOut) throws IOException;

    /**
     * 浏览
     * @param protocol
     * @param netIn
     * @param netOut
     * @throws IOException
     */
    void scanDirectory(Protocol protocol, InputStream netIn, OutputStream netOut) throws IOException;

    /**
     * 解析协议
     * @param netIn
     * @return
     * @throws IOException
     */
    Protocol parseProtocol(InputStream netIn) throws IOException;
}
