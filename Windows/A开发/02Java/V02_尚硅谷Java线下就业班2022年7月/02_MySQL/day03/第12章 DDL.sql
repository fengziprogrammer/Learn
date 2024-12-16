/*
第12章 DDL
*/
#数据库的查看，当前用户登录后，可以看到哪些数据库
SHOW DATABASES;

#创建自己的数据库
CREATE DATABASE 数据库名;

#例如：
CREATE DATABASE 0225db;

#删除数据库
DROP DATABASE IF EXISTS 数据库名称;

#例如：
DROP DATABASE IF EXISTS 0225db;

#查看某个数据库的详细定义
SHOW CREATE DATABASE 数据库名称;

#例如：
SHOW CREATE DATABASE atguigu;
SHOW CREATE DATABASE 0225db;

#修改数据库的编码
ALTER DATABASE 数据库名 CHARACTER SET 新的字符集名称 COLLATE 校对规则;

#例如
ALTER DATABASE 0225db CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;

#一般先要指定在哪个数据库中对表进行操作
#使用哪个数据库
USE 数据库名;

USE 0225db;

#查看当前数据库下面，当前用户可以查看的表有哪些
SHOW TABLES;

#创建表格
CREATE TABLE 表名称(
   字段名1 数据类型,
   字段名2 数据类型,
   字段名3 数据类型
);

/*
表格：stu
学号，姓名，生日，成绩，性别，体重，手机号码

*/
CREATE TABLE stu(
	sid INT,
	sname VARCHAR(20),
	birthday DATE,
	score INT,
	gender ENUM('男','女'),
	weight DOUBLE(4,1),
	tel CHAR(11)
);

#查看表结构
DESC 表名称;

#例如：
DESC stu; 

#查看表的详细定义
SHOW CREATE TABLE 表名称;

#例如：
SHOW CREATE TABLE stu;

CREATE TABLE `stu` (
  `sid` INT DEFAULT NULL,
  `sname` VARCHAR(20) DEFAULT NULL,
  `birthday` DATE DEFAULT NULL,
  `score` INT DEFAULT NULL,
  `gender` ENUM('男','女') DEFAULT NULL,
  `weight` DOUBLE(4,1) DEFAULT NULL,
  `tel` CHAR(11) DEFAULT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


#删除表格
DROP TABLE IF EXISTS 表名称;

#例如：
DROP TABLE IF EXISTS stu;

#例如
CREATE TABLE stu(
	sid INT,
	sname VARCHAR(20),
	birthday DATE,
	score INT,
	gender ENUM('男','女'),
	weight DOUBLE(4,1),
	tel CHAR(11)
)CHARSET=utf8 COLLATE=utf8_general_ci;

#修改表的字符集和校对规则
ALTER TABLE 表名称 CHARSET=新字符集 COLLATE=新校对规则;

#例如：
ALTER TABLE stu CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#增加一个字段
ALTER TABLE 表名称 ADD COLUMN 字段名 数据类型;

#例如：
ALTER TABLE stu ADD COLUMN address VARCHAR(50);

#删除一个字段
ALTER TABLE 表名称 DROP COLUMN 字段名;

#例如：
ALTER TABLE stu DROP COLUMN address;

#修改一个字段名称
ALTER TABLE 表名称 CHANGE 旧字段名称 新的字段名称 数据类型;

#例如：
ALTER TABLE stu CHANGE tel phone CHAR(11);

#修改一个字段的数据类型
ALTER TABLE 表名称 MODIFY 字段名称 新数据类型;

#例如：
ALTER TABLE stu MODIFY score DOUBLE;

#修改字段的位置，顺序
ALTER TABLE 表名称 MODIFY 字段名称 数据类型  AFTER 另一个字段;
ALTER TABLE 表名称 MODIFY 字段名称 数据类型  FIRST;

#例如：
ALTER TABLE stu MODIFY phone CHAR(11) AFTER sname;

#重命名表
ALTER TABLE 表名称 RENAME TO 新名称;

#例如：
ALTER TABLE stu RENAME TO student;




