package com.itheima.logback_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
    ①：在项目下新建文件夹lib，导入Logback的相关jar包到该文件夹下，并添加到项目库中去。
    ②：必须将Logback的核心配置文件logback.xml直接拷贝到src目录下。
    ③：在代码中获取日志的对象
    ④：使用日志对象输出日志信息
 */
public class LoggerDemo {
    // 在代码中获取日志的对象
    public static final Logger LOGGER = LoggerFactory.getLogger("LoggerDemo类");

    public static void main(String[] args) {

            LOGGER.trace("trace级别的日志");
            LOGGER.info("info级别的日志");
            LOGGER.debug("debug级别的日志");
            LOGGER.warn("warn级别的日志");
            LOGGER.error("error级别的日志");

    }
}
