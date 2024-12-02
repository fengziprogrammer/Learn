/*
第5章 SELECT语句
*/
#select语句的最简单形式，查看某个常量、变量、表达式的结果
SELECT 1;
SELECT 1+1;
SELECT NOW();

#查看某个表的数据
#select * from 表名称;  #前提是选择好了，针对哪个库操作，否则会报 No database selected错误
#select * from 数据库名.表名称; 
#*表示所有行所有列
SELECT * FROM stu;

#查看某些列的数据
#select 字段列表 from 【数据库名.】表名称;

SELECT `name` FROM stu;
SELECT id,`name` FROM stu;

#查看某些行的数据
SELECT * FROM stu WHERE `name` = '张三';

#查看某些行某些列的数据
#查看张三的学号
SELECT id FROM stu WHERE  `name` = '张三';

#给查询结果取别名
SELECT id AS 学号, `name` AS 姓名 FROM stu;
SELECT id 学号, `name` 姓名 FROM stu;
SELECT id "学 号", `name` "姓 名" FROM stu;

#给表取别名
SELECT id AS 学号, `name` AS 姓名 FROM stu 学生表;
SELECT id AS 学号, `name` AS 姓名 FROM stu "学生表"; #错误，表别名是不能加双引号








