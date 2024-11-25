/*
   1.创建表
     语法:
  create table 表名(
    列名 数据类型(长度)[约束],
    列名 数据类型(长度)[约束],
    列名 数据类型(长度)[约束]  
  )
*/
-- 商品分类表
CREATE TABLE category(
  cid INT,
  cname VARCHAR(10)
);

/*

2.查看所有表
  show tables;

3.查看表结构
  desc 表名;
*/
SHOW TABLES;

DESC category;

/*
 4.删除表
  a.关键字:drop table
  b.语法:
    drop table 表名
*/
DROP TABLE category;

/*
  5.alter table 表名 add 列名 类型(长度) [约束];
    作用：添加列. 
*/
ALTER TABLE category ADD `desc` VARCHAR(20);

/*
  6.alter table 表名 modify 列名 类型(长度) [约束];
    作用：修改列的类型,长度及约束.
*/
ALTER TABLE category MODIFY `desc` VARCHAR(20);

/*
  7.alter table 表名 change 旧列名 新列名 类型(长度) [约束]; 
    作用：修改列名.
*/
ALTER TABLE category CHANGE `desc` `miaoshu` VARCHAR(20);

/*
  8.  alter table 表名 drop 列名; 
      作用：修改表_删除列.
*/
ALTER TABLE category DROP `miaoshu`;

/*
   9.rename table 表名 to 新表名; 
     作用：修改表名
*/
RENAME TABLE category TO kind;
RENAME TABLE kind TO category;


