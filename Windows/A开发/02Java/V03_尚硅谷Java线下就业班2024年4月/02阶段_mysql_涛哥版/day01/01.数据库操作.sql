/*
  1.创建数据库
     create database 数据库名称 charset 编码集
     
  2.注意:
    编码集:写成utf8   
*/
CREATE DATABASE 230417_java CHARSET utf8;

/*
  3.查看所有库
    语法:SHOW DATABASES
*/
SHOW DATABASES;

/*
  4.删除数据库
   语法: drop database 数据库名;
*/
DROP DATABASE 230417_java;

/*
  5.切换数据库
    语法:use 数据库名字

    只有切换到指定的库上,才能在此库中进行创建表等其他操作
*/
USE 230417_java;


