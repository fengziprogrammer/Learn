package com.itheima.commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/*
    org.apache.commons.io.FileUtils

    public static void copyFileToDirectory(final File srcFile, final File destFile):
	复制文件到另外一个目录下。

    public static void copyDirectoryToDirectory(File src , File dest ):
	复制src目录到dest目录中。

	D:\传智播客\安装包\IO资源 图片
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        FileUtils.copyDirectoryToDirectory(new File("D:\\传智播客\\安装包\\IO资源 图片") , new File("D:\\"));
    }
}