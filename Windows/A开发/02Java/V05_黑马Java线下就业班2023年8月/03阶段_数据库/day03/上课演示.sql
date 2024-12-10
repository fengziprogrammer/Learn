use db3;

/*
mysql数据库默认： 一行SQL语句就是会自动提交（表中数据持久更新）

事务： 逻辑单元。可以在事务中书写多行SQL语句，这些SQL语句会做一个整体，要么全部成功、要么全部失败。

*/
-- 事务的使用操作机制：
# 1、开启事务
# 2、执行多条SQL语句（业务操作）
# 3、提交事务 | 回滚事务



/* MySQL数据库的事务机制：
   1、自动提交 （默认）
       每执行一行SQL语句，就开启一个事务，SQL提交完成，事务提交 （一行SQL一个事务）
   2、手动提交 （要写代码）
       先开启事务 ， 再执行SQL语句（可以多行） ， 提交事务（回滚）
*/


-- 创建账号表
create table account(
    id int primary key auto_increment,
    name varchar(20),
    money double
);

-- 测试数据
insert into account values (null,'小明',1000);
insert into account values (null,'翠花',1000);


-- 事务操作： 转账失败
  # 1、开启事务
  start transaction ;

  # 2、执行转账操作
  -- 出账
  update account set money = money-500 where name='小明';
  -- 入账
  update account set money = money+500 where name='翠花';

  # 3、回滚事务
  rollback ;




-- 事务操作： 转账成功
  # 1、开启事务
  start transaction;
  # 2、执行转账操作
  -- 出账
  update account set money = money - 500 where name='小明';
  -- 入账
  update account set money = money + 500 where name='翠花';
  # 3、提交事务
  commit ;

select * from account;


# 查看mysql的事务默认提交方式
select @@autocommit;
# 修改mysql事务的默认提交方式： 改为手动提交
set @@autocommit = 0;




-- 查看数据库隔离级别
select @@tx_isolation;  # REPEATABLE-READ （已解决：脏读、不可重复读 两个问题）

# 修改数据隔离级别（让隔离级别设置不当）
set global transaction isolation level read uncommitted; # read uncommitted（最低级别。 会出现：脏读、不可重复读、幻读）

 # 1、开启事务
  start transaction;
  # 2、执行转账操作
  -- 出账
  update account set money = money - 500 where name='小明';
  -- 入账
  update account set money = money + 500 where name='翠花';
  # 3、回滚事务
  rollback ;

-- 设置事务隔离级别 ： 读已提交（解决：脏读问题）
set global transaction isolation level read committed;





-- 函数，就是mysql数据库提供的一些解决问题的功能（就是java中的API方法）

-- 函数： 聚合函数

-- 函数：日期函数 （针对日期类型数据进行操作）
# 获取当前系统日期和时间
select now();
select sysdate();

#获取当前系统的日期
select curdate();
insert into student(id, name, age, gender, birthday, score)
value (100,'张三',23,'男', curdate()  , 99) ;

#获取当前系统的时间
select curtime();

#获取年、月、日
select year(curdate());
select month(curdate());
select day(curdate());

#获取一年中的第x周
select week(now());

# 获取学生的生日日期（不需要年）
select name, month(birthday) , day(birthday) from student;

select name,
       concat(month(birthday) , '月',day(birthday),'日') as "生日"  -- 字符串函数
from student;






/* Case..when语法1：

    case 列 | 表达式
       when 条件1 then 结果1
       when 条件2 then 结果2
       ....
       else
           结果N
    end;



   Case..when语法1：
    case
       when 条件1 then 结果1
       when 条件2 then 结果2
       ....
       else
           结果N
    end;
*/

create table user
(
    id int primary key  auto_increment,
    name varchar(20) not null  unique ,
    sex  int default 0, -- 0:保密   1:男   2:女
    age int
);
insert into user(id, name, sex, age)
values (null , '熊大',1 ,23), (null , '熊二',1 ,21), (null , '熊三',2 ,21);


select id, name,
       case sex
            when 1 then '男'
            when 2 then '女'
            else '保密'
        end AS gender,
       age from user;



select id, name,
       case when sex=1 then '男'
            when sex=2 then '女'
            else '保密'
        end AS gender,
       age from user;






-- 函数：字符函数 （针对字符类型数据进行操作）
# 获取字符串的长度
select char_length('itheima');
select char_length(name) from user;

# 拼接字符串
select concat('I','Love','Java','!');

# 转大小、转小写
select lower('Itheima');
select upper('Itheima');


# 截取字符串
select substr('itheima',3,5); -- 索引从1开始

# 去除字符串前后空格
select trim('  hei ma   ');-- 中间空格不会去除
-- 应用场景： 数据表中char类型数据，存储不足长度时补充空格，但是取出char类型数据时不能带有空格



-- 数学函数 （针对数字类型的数据提供功能）
# 获取随机数字（范围：0~1）
select rand();


# 四舍五入
select round('3.14159265358',4);

# 截取数字
select truncate('3.14159265358',4);


# 获取最小值
select least(11,2,4,7,19,2);

select min(age) from student;




# 查看mysql数据库执行性能（DML操作多 or DQL操作多）
show global status like 'Innodb_rows%';











use db2;
/*  以下代码： 完成1000W条数据的插入  */
-- 1. 准备表
CREATE TABLE `user`(
	id INT,
	username VARCHAR(32),
	`password` VARCHAR(32),
	sex VARCHAR(6),
	email VARCHAR(50)
);

-- 2. 创建存储过程，实现批量插入记录
DELIMITER $$ -- 声明存储过程的结束符号为$$
CREATE PROCEDURE auto_insert()
BEGIN
    DECLARE i INT DEFAULT 1;
	START TRANSACTION; -- 开启事务
    WHILE(i<=10000000)DO
        INSERT INTO `user` VALUES(i,CONCAT('jack',i),MD5(i),'male',CONCAT('jack',i,'@itcast.cn'));
        SET i=i+1;
    END WHILE;
	COMMIT; -- 提交
END$$ -- 声明结束
DELIMITER ; -- 重新声明分号为结束符号

-- 3. 查看存储过程
SHOW CREATE PROCEDURE auto_insert;

-- 4. 调用存储过程
CALL auto_insert(); -- 插入1000W条数据花费：3m49s 304 ms

/************************************************************************/

# 测试：查询性能
-- 查询id是22的用户,测试查询耗时  （1000W条数据，查询id是22数据，查询效率低）
select * from user where id=22; -- 花费时间：14秒314毫秒
-- 针对数据查询效率低的问题，进行优化： 索引

# 索引： 是一种数据结构 （ 树结构  -> B+树 ）
##要学习的索引： 主键索引 、 唯一索引 、普通索引

# 索引，是创建表中的某列(某些列)上
# 主键索引，默认在创建表时指定主键列（primary key），就自动添加了






-- 修改user表结构，给id字段添加主键约束
alter table user add primary key (id); -- 当表中的数据量比较大时，建立索引也需要消耗时间    1 m 44 s 479 ms

# 测试：添加索引后，查询id=22
select * from user where id=22; -- 20毫秒
select * from user where id = 8888888; -- 21毫秒


-- username字段上，没有索引
select * from user  where username ='jack1234567';-- 17s146ms



create table student2(
   id int primary key  auto_increment, -- 主键（主键索引）
   name varchar(32),
   telephone varchar(11) unique , -- 唯一索引
   sex char(1),
   birthday date
);
-- 给student2表中的name字段添加索引
create index idx_student2_name on student2(name);





/*****************************回顾上午内容*******************************/
# 知识点1: 事务
-- 什么是事务
-- 事务是数据库中的逻辑单元，用来包含一组SQL，把一组SQL做为一个整体，要么全部成功、要么全部失败。

-- 事务解决什么问题？
-- 当多行SQL需要一起执行时，把多行SQL书写在事务范围内，这个事务就做为一个整体存在

-- 事务如何使用
# 开启事务 （手动事务）
start transaction ;
# 书写业务操作（多行SQL）
-- SQL语句
# 提交事务 | 回滚事务
commit ;  -- rollback;


-- 事务的面试题
# 数据库中的事务分类？   手动事务 、自动事务
# 事务的四大特性？      ACID   原子性、一致性、持久性、隔离性
# 事务在并发时会发生问题？   脏读、不可重复读、幻读/虚读
# 事务并发问题出现的原因？   因为事务的隔离级别设置不当，造成事务并发问题的发生
# 如何解决事务中脏读的发生？ 设置事务隔离级别。设置为：2级别或3级别



# 知识点2：函数
-- 日期函数
# 获取当前系统日期和时间
select now();
# 获取当前系统日期
select curdate();
# 从日期数据中获取月份
select month( now() );

-- 判断函数
/*
    case  列名
        when  条件1  then 结果1
        when  条件2  then 结果2
        ...
        else  结果N
    end
 */

-- 字符函数
# 拼接字符串
select concat('it','hei','ma');
# 截取字符串
select substr('itheima',3,5);


-- 数学函数
# 四舍五入
select round(45.367,2);
# 截取指定小数
select truncate(45.367,2);




# 知识点3：索引
-- 什么是索引
-- 索引是一种数据结构(B+树)。

-- 索引解决什么问题
-- 索引可以提交查询效率

-- 索引怎么使用
-- 主键索引
# 在创建表时指定主键列，就会默认添加：主键索引

-- 唯一索引
# 创建表进指定唯一索引
create table student3
(
    id int primary key auto_increment, -- 主键索引
    name varchar(20),
    phone varchar(11) unique  -- 默认添加唯一索引
);
# 在创建表后添加唯一索引
create unique index 索引名  on 表名(字段名); -- 要求：指定字段下的数据不允许有重复（null除外）
alter table 表名 add unique (字段名); -- 默认的索引名字：字段名


-- 普通索引
create index 索引名 on 表名(字段名);


-- 联合索引
create index 索引名 on 表名(字段名1,字段名2,...);
create unique index 索引名 on 表名(字段名1,字段名2,...);-- 联合的多个字段合并在一起后，不允许出现重复数据


/***********************************************************************/




-- B+Tree结构的特点： 划分了叶子节点和非叶子节点
-- 非叶子节点： 只存储索引和指针
-- 叶子节点： 存储索引、指针、 数据(占用存储空间最大)



