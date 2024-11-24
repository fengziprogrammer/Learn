/*
  创建表
*/
CREATE TABLE `product`(
  pid INT,
  pname VARCHAR(10),
  price INT
);

#查看所有表
SHOW TABLES;

#查看表结构
DESC product;

-- 删除表
DROP TABLE product;

/*
  alter table 表名 add 列名 类型(长度) [约束];
  作用：添加列. 
*/
ALTER TABLE product ADD `desc` VARCHAR(100);

/*
  alter table 表名 modify 列名 类型(长度) [约束];
  作用：修改列的类型,长度及约束.
*/
ALTER TABLE product MODIFY `desc` VARCHAR(50);

/*
    alter table 表名 change 旧列名 新列名 类型(长度) [约束]; 
  作用：修改列名.
*/
ALTER TABLE product CHANGE `desc` `miaoshu` VARCHAR(50);

/*
    alter table 表名 drop 列名; 
  作用：修改表_删除列.
*/		
ALTER TABLE product DROP miaoshu;

/*
   rename table 表名 to 新表名; 
 作用：修改表名
*/
RENAME TABLE shangpin TO product;

