-- 给root用户，添加密码
update mysql.user set password=PASSWORD('itheima') where User='root';
-- 当修改root密码后，需要刷新下root用户权限
flush privileges;


# MySQL备份命令 （DOS窗口/Linux系统中运行）
-- mysqldump -h hostname -u username -p 数据库名字 表名字 > xxxx.sql
# MySQL还原命令 （DOS窗口/Linux系统中运行）
-- mysql -u root -p 数据库名 < xxxx.sql
create database db1;
use db1;



-- 商品表
create table product(
	pid int primary key,
	pname varchar(20),
	price double,
	category_id varchar(32)
);
INSERT INTO product(pid,pname,price,category_id) VALUES(1,'联想',5000,'c001');
INSERT INTO product(pid,pname,price,category_id) VALUES(2,'海尔',3000,'c001');
INSERT INTO product(pid,pname,price,category_id) VALUES(3,'雷神',5000,'c001');

INSERT INTO product(pid,pname,price,category_id) VALUES(4,'JACK JONES',800,'c002');
INSERT INTO product(pid,pname,price,category_id) VALUES(5,'真维斯',200,'c002');
INSERT INTO product(pid,pname,price,category_id) VALUES(6,'花花公子',440,'c002');
INSERT INTO product(pid,pname,price,category_id) VALUES(7,'劲霸',2000,'c002');

INSERT INTO product(pid,pname,price,category_id) VALUES(8,'香奈儿',800,'c003');
INSERT INTO product(pid,pname,price,category_id) VALUES(9,'相宜本草',200,'c003');
INSERT INTO product(pid,pname,price,category_id) VALUES(10,'面霸',5,'c003');

INSERT INTO product(pid,pname,price,category_id) VALUES(11,'好想你枣',56,'c004');
INSERT INTO product(pid,pname,price,category_id) VALUES(12,'香飘飘奶茶',1,'c005');

INSERT INTO product(pid,pname,price,category_id) VALUES(13,'果9',1,NULL);

-- 商品没有分类的商品（查询category_id字段中存储为null值的行记录）
select pid, pname, price, category_id from product where category_id is null;

-- 查询有分类的商品
select pid, pname, price, category_id from product where category_id  is not null;


### 回顾上次SQL语言
-- DDL
#创建数据库
create database db4;
#删除数据库
drop database  db4;
#查询所有的数据库
show databases ;
#切换数据库
use db4;

#创建表
create table student
(
    id int ,
    name varchar(20),
    birthday date
);
#删除表
drop table student;
#修改表
alter table student add
(
    age int ,
    sex char(1)
);


-- DML ：针对数据表中的数据进行增、删、改
insert into student(id, name, birthday) value (1,'张三','1990-10-11');

update student set name='李四', birthday='1991-12-1' where  id =1;

delete from student where id=1;

truncate table student;

-- DQL ： 针对数据表中的数据进行查询操作
select id, name,birthday from student;
select id, name,birthday from student where name LIKE '张%';
select id, name,birthday from student where birthday > '1990-12-31'; -- 查询1990年以后出生的

select birthday , count(id) as "人数"
from student
where id between 10 and  20
group by birthday
having  count(*) >= 2  -- 每组中至少有2个
order by 人数 desc  -- 因为order by是在select之后执行，所以排序字段必须是以查询出来的结果中的字段名为主
limit 1, 3; -- 针对查询的结果从索引1开始，向后取3行记录

/* SQL语法执行顺序：
1. from
2. where
3. group by
4. having
5. select
6. order by
7. limit
*/








# 约束 ： 在定义在表中的列上，用于针对列中所存储的数据进行限制（目的：保证数据的合法性、有效性）
/*约束的分类：
  1、主键约束（特点：唯一+非空）
  2、唯一约束（特点：唯一）
  3、非空约束（特点：不能为null）
  4、默认值约束（特点：没有指定具体数据时给默认值）
  5、外键约束 （特点：建立表与表之间的关系）
*/

## 主键约束
-- 开发中，通常每表张必须有一个主键字段（提高查询效率、和外键建立表关系）
-- 根据查询的结果，创建新表（表结构和要查询的数据表结构一模一样）
create table db4.student AS select * from db1.student;


-- 在已表中添加主键约束
alter table db4.student add primary key (id);

-- 创建表时指定主键约束
create table student2
(
    id int primary key , -- 添加主键约束
    name varchar(20)
);
-- 删除主键约束
alter table db1.student2 drop primary key ;



#主键约束的练习
-- 创建学生表（id,name,age） 将id做为主键
create table db4.student2
(
    id int primary key ,
    name varchar(20),
    age int
);

-- 测试主键
insert into db4.student2(id, name, age) value (1,'熊大',23);
insert into db4.student2(id, name, age) value (1,'熊二',22);
insert into db4.student2(id, name, age) value (null,'光头强',24);

use db4;
-- 删除student2表中的主键
alter table student2 drop primary key ;

-- 给已有的表，添加主键
alter table student2 add primary key (id);


# 明确：主键列下的数据不能重复（唯一）
# 开发中，主键列交由mysql管理（主键列的插入的数据，程序员不干预，由mysql自主完成插入）
## 主增主键
create table student3
(
    -- 只有整数类型数据，才可以使用自动增长
    id int primary key  auto_increment, --  主键且自动增长
    name varchar(20)
);
insert into student3(name) value ('张三');
insert into student3(name) value ('李四');
insert into student3(name) value ('王五');
insert into student3(id , name) value (null , '田七');

delete from student3 where id=4;
delete from student3 where id=3;
insert into student3(id , name) value (100 , '王五');-- 使用100覆盖msql管理的主键值


select id,name from student3;

/*主键自增注意细节：
1. 主键列下的数据由mysql维护 （从1开始，每次增长1）
2. mysql维护过的主键值，不能在继续使用
3. 当程序员干预主键，就会拿插入的主键值，  覆盖msql管理的主键值
*/
-- DELETE和TRUNCATE删表对主键列有影响
-- DELETE : 不会影响 auto_increment维护的主键值
-- TRUNCATE : 先删除表再创建新表（会重置auto_increment维护的主键值，重置为0）

-- 在自增主键中，可以设置主键的起始值
-- alter table 表名 auto_increment = 起始值;


# 疑问：既然有主键约束了，为什么还要使用唯一约束呢？
# 答案：一张表只允许存在一个主键
# 针对非主键字段，希望保证该列下的数据不能重复，就使用：唯一约束

# 唯一约束的练习
-- 创建学生表（id,name） id为自增主键， name字段下的数据不能重复
use db4;
create table student4
(
    id int primary key  auto_increment,
    name varchar(20) unique  -- 唯一约束（name列下的数据不能有重复）
);

insert into student4(name) value ('张三');
insert into student4(name) value ('李四');
insert into student4(name) value ('张三'); -- 插入失败（主键值被使用）。 原因：唯一约束
insert into student4(name) value (null);

select * from student4;


## 非空约束
# 保证：指定列下的数据不能有null
-- 创建学生表（id,name）  id字段为自增主键 ， name字段下存储的值不能为空且不能重复
create table student5
(
  id int primary key  auto_increment,
  name varchar(20) unique  not null
);
insert into student5(name) value ('张三');
insert into student5(name) value ('李四');
insert into student5(name) value ('张三');
insert into student5(name) value (null);

select * from student5;



/*面试题： 非空+唯一约束 vs 主键约束

  1、主键约束在一张表中只能存在一个，  非空+唯一在表中没有限制（允许有多个）
  2、主键约束有自动增长 ，  非空+唯一没有自动增长

*/



##默认值约束
#作用：向表中插入数据时，列下没有插入具体数据，可以指定默认值
create table student6
(
    id int primary key  auto_increment,
    name varchar(20) not null unique ,
    adress varchar(100) default '广州'
-- ,
--    birthday date default current_date -- now()是mysql中的函数，作用：获取当前系统时间
);
-- 插入null数据，不代表没插入值
insert into student6(id, name, adress) value (null,'张三', null);

-- 插入数据时，没有给adress指定值
insert into student6(name) value ('李四');



create table student8
(
    id int primary key  auto_increment,
    name varchar(20) not null unique ,
    adress varchar(100) default '广州' ,
    birthday datetime default now()
);
insert into student7(name) value ('李四');




### 表关系：
# 1. 一对一
# 2. 一对多
# 3. 多对多


## 一对多关系表设计： 在多表上新增字段(外键字段)， 外键字段下存储的数据全部来自主表中的主键字段下的数据
# 外键约束的作用：
# 1、建议表与表之间的关系
# 2、约束外键字段下的数据和主表主键下的数据保持一致（一致性、完整性）


##多对多关系表设计 ： 创建第三张中间表，由中间表承担外键字段（降低多对多的复杂关系，变为：一对多）

/*
在之前学习时：创建的表，都是独立的
在生活中，实体(表)和实体(表)是存在关系的
关系型数据库：表与表也有关系

问题1：怎么建立表与表之间的关系？
答案： 外键字段 + 主键字段

问题2：外键字段应该是创建在哪个表中？
思考 ： 选择一张合适的表来新增外键字段
外键字段创建，需要考虑多表关系： 一对一、一对多、多对多
一对多 ：  外键字段创建在多表上
多对多：   创建第三张中间表，外键字段创建在中间表上
一对一：   方案1：两张表合并为一张表       方案2(一定要外键字段)： 任选一张作为从表，创建外键字段
*/
## 先有外键字段 ， 再有外键约束
-- 外键约束：是用来限制外键字段下的数据，都来自主表中的主键字段下


#外键约束的练习
# 部门表 （主表）
create table department (
    id int primary key auto_increment, -- 主键字段
    dep_name varchar(20),
    dep_location varchar(20)
);
-- 测试数据
insert into department (dep_name, dep_location) values
('研发部', '广州'),
('销售部', '深圳');

# 员工表 （从表）
create table employee(
    id int primary key  auto_increment,
    name varchar(20),
    age int ,
    dept_id int, -- 外键字段（和department表中的id字段有关联）
    -- 添加外键约束
    constraint FK_employee_dept_id FOREIGN KEY(dept_id) references department(id)
);


-- 测试数据
insert into employee (name, age,dept_id) values
('张三', 20, 1),
('李四', 21, 1),
('王五', 20, 1),
('老王', 20, 2),
('大王', 22, 2),
('小王', 18, 2);
-- 测试： 在主表中的主键字段下没有数据10
insert into employee (name, age,dept_id) values ('测试',22,10);

-- 外键约束的使用细节：
-- 1、删除主表中的数据：报错
delete from department where id=10; -- 原因：外键表中还有引用数据 （解决方案：先删除从表中的数据，再删除主表中的数据）

-- 2 、修改主表中主键字段下的数据 : 报错
update department set id = 10 where id=1; -- 原因：外键表中还有引用数据



#修改从表中的外键约束
alter table employee drop foreign key FK_employee_dept_id;

-- 给外键约束添加：级联更新、级联删除
alter table employee add
    constraint  FK_employee_dept_id foreign key(dept_id) references department(id)
    on DELETE cascade  on update cascade ;



#### 多表查询 ： 在查询数据时，数据是从多张表中获取的
# 多表查询分类：
# 1. 内连接查询
# 2. 外连接查询
# 3. 子查询


-- 创建部门表
CREATE TABLE dept (
    id INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(20)
);
-- 创建员工表
CREATE TABLE emp (
        id INT PRIMARY KEY AUTO_INCREMENT,
        NAME VARCHAR(10),
        gender CHAR(1),   -- 性别
        salary DOUBLE,   -- 工资
        join_date DATE,  -- 入职日期
        dept_id INT, -- 部门id(外键字段)
        foreign key(dept_id) references dept(id)-- 外键约束
);
-- 测试数据
INSERT INTO dept (NAME) VALUES
('开发部'),
('市场部'),
('财务部');
INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES
('孙悟空','男',7200,'2013-02-24',1),
('猪八戒','男',3600,'2010-12-02',2),
('唐僧','男',9000,'2008-08-08',2),
('白骨精','女',5000,'2015-10-07',3),
('蜘蛛精','女',4500,'2011-03-14',1);

-- 多表查询： 所有的员工信息以及员工的部门名字
select  emp.id, emp.NAME, gender, salary, join_date, dept_id ,
        dept.id, dept.name
from emp , dept -- 查询两张表

-- 在进行多表查询时，会出现一种情况：笛卡尔积 （多张表中的每行数据进行了交叉查询）
-- 解决方案： 在进行多表查询时，消除笛卡尔积
--            查询添加条件：   主表.主键字段 = 从表.外键字段
select  emp.id, emp.NAME, gender, salary, join_date, dept_id ,
        dept.id, dept.name
from emp , dept
where dept.id = emp.dept_id;


-- 练习： 查询孙悟空的信息以及部门信息
select  emp.id, emp.NAME, emp.gender, emp.salary, emp.join_date, emp.dept_id ,
        dept.id, dept.name
from emp , dept
where dept.id = emp.dept_id -- 消除笛卡尔积的条件
      AND
      emp.NAME='孙悟空'; -- 查询孙悟空的条件




/***************************回顾上午内容*****************************************/
##知识点1： 约束
-- 约束是什么
-- 约束是数据库中针对表中列下存储的数据进行限制的

-- 约束的作用
-- 可以保证数据的完整性、准确性（数据合法有效）、一致性

-- 约束怎么使用
create table student8
(
    -- 主键约束
    id int primary key  auto_increment, # id主键值自增

    -- 唯一约束+非空约束
    name varchar(20) not null unique ,

    -- 默认值约束
    gender char(1) default '男'

    -- 外键约束 : 保证两张表(主表、从表)中数据的一致性
);



#知识点2： 表关系
-- mysql属于关系型数据库，通常表与表之间会存在一定的关系，而这种关系分为：
-- 1. 一对多
-- 2. 多对多
-- 3. 一对一

-- 建立表关系：
-- 1对1 ：  方案1：两张表合并为一张表     方案2：任选一张表添加外键字段
-- 1对多：  在多表上添加外键字段
-- 多对多：  创建第三张中间表， 在中间表上添加外键字段

-- 外键约束目的： 保证从表外键字段下的数据和主表主键字段下的数据一致



#知识点3： 多表查询中的笛卡尔积
-- 多表查询语法： select 表1.字段1，表1.字段2，... ，  表2.字段1,...   from 表1  ， 表2 ， ......
-- 多表查询时会出现：笛卡尔积
-- 笛卡尔积产生的原因：多表查询时，会以每张表中的每条数据进行交叉查询
-- 解决方案： 添加消除笛卡尔积的条件      主表.主键 = 从表.外键

/*******************************************************************************/


/* 多表查询：
   1、内连接查询
   2、外连接查询
   3、子查询
*/


## 内连接查询
-- 语法1： select 字段列表 from 表1,表2,... where 表1.字段 = 表2.字段 ....
-- 语法2： select 字段列表  from  表1 INNER JOIN 表2  ON 表1.字段 = 表2.字段
/*
   多表查询技巧：
   第1步：明确要查询哪些数据
   第2步：明确所查询数据分别归属哪张表
   第3步：明确表和表之间的关系（寻找主键、外键）
 */
-- 练习： 查询唐僧的信息. 显示：员工id、姓名、性别、工资、部门名字
/*
   第1步：明确要查询哪些数据
          id、姓名、性别、工资、部门名字
   第2步：明确所查询数据分别归属哪张表
          id、姓名、性别、工资  归属： emp表
          部门名字             归属： dept表
   第3步：明确表和表之间的关系（寻找主键、外键）
          emp.dept_id  =   dept.id
   其他要求：
           查询唐僧
*/
-- 语法1书写方式：  隐式内连接
select emp.id , emp.NAME , emp.gender  , emp.salary,
       dept.NAME
from emp , dept
where emp.dept_id = dept.id
      AND
      emp.NAME ='唐僧';
-- 语法2书写方式： 显式内连接
select emp.id , emp.NAME , emp.gender  , emp.salary,
       dept.NAME
from emp inner join dept
     on emp.dept_id = dept.id   -- ON关键字执行优先级高于where
where emp.NAME ='唐僧';

-- 使用了别名的写法：
select e.id , e.NAME , e.gender  , e.salary,
       d.NAME  -- 使用别名
from emp AS e inner join dept AS d  -- 给表名起了别名
     on e.dept_id = d.id  -- 使用别名
where e.NAME ='唐僧';



# 左外连接查询
-- 新增部门信息
insert into dept(id,NAME) value  (null , '行政部');
-- 查询所有的部门，以及该部门下的员工
select d.name ,
       e.id , e.NAME , e.gender  , e.salary
from dept AS d left join emp AS e
on d.id  = e.dept_id;

-- 查询所有的员工，以及员工所在部门名字
select  emp.id , emp.NAME , emp.gender  , emp.salary, emp.join_date,
        dept.NAME
from dept right join emp
on dept.id = emp.dept_id;



## 子查询 ： 在一个查询语句中嵌套了另一个查询语法
/*
   select 字段1， 字段2， .....
   from 表1 ， (select 字段列表 from 表 where 条件) ， .....
   where 条件1   条件2=(select 字段 from 表 where 条件)
*/
-- 查询工资最高的员工信息
select id, NAME, gender, salary, join_date, dept_id
from emp
where salary = (select max(salary) from emp) ;

# 子查询在使用时，子查询结果通常分为三种：单行单列、多行单列、多行多列
-- 子查询：单行单列
select max(salary) from emp;
-- 子查询：多行单列
select salary from emp where salary > 5000;
-- 子查询：多行多列
select id , name ,salary from emp where salary>5000;


### 子查询练习：
-- 查询工资>"蜘蛛精"的 员工信息
# 查询："蜘蛛精"的工资
select salary from emp where NAME='蜘蛛精';
# 查询： 工资 >  "蜘蛛精"工资的员工
select id, NAME, gender, salary, join_date, dept_id from emp where salary > 4500;
#整合以上两个SQL语句
select id, NAME, gender, salary, join_date, dept_id
from emp
where salary > (select salary from emp where NAME='蜘蛛精');

-- 查询所有工资 > 5000的员工部门信息
# 查询工资>5000员的部门编号
select dept_id from emp where salary > 5000;
# 查询员工部门信息    工资 > 5000
select id , name from dept where id in (select dept_id from emp where salary > 5000);

-- 查询工资高于1号部门所有员工工资的员工信息
# 1号部门所有员工工资
select salary from emp where dept_id=1;
# 工资高于1号部门所有员工工资的员工信息
select id, NAME, gender, salary, join_date, dept_id
from emp
where salary > all (select salary from emp where dept_id=1);
##另一种写法：
select id, NAME, gender, salary, join_date, dept_id
from emp
where salary > (select max(salary) from emp where dept_id=1);


-- 查询工资高于1号部门的任意一位员工工资的员工信息
# 1号部门所有员工工资
select salary from emp where dept_id=1;
# 工资高于1号部门所有员工工资的员工信息
select id, NAME, gender, salary, join_date, dept_id
from emp
where salary > any (select salary from emp where dept_id=1);
-- 另一种写法：
select id, NAME, gender, salary, join_date, dept_id
from emp
where salary > (select min(salary) from emp where dept_id=1);



-- 子查询是多行多列（作为一个临时表使用）
-- 查询2011年以后入职的员工信息及部门名字
select tempTable.* ,
      dept.name
from (select id, NAME, gender, salary, join_date, dept_id from emp where join_date>'2011-1-1') AS tempTable
     left join
     dept
on tempTable.dept_id = dept.id;







-- 查询所有工资 > 5000的员工信息以及部门信息
select emp.id,emp.NAME,emp.gender,emp.salary,emp.join_date,
       dept.id , dept.name
from dept right join  emp
    on dept.id  = emp.dept_id
where dept.id in (select dept_id from emp where salary > 5000);
#实现方式1：
-- 1、查询工资大于5000的员工信息 （作为子查询。 查询结果为：多行多列[做为临时表使用]）
select id, NAME, gender, salary, join_date, dept_id from emp where salary > 5000;
-- 2、基于以上查询结果，关联dept表，进行多表查询
select emp.id, emp.NAME, emp.gender, emp.salary, emp.join_date,
       dept.name
from dept
     inner join
     (select id, NAME, gender, salary, join_date, dept_id from emp where salary > 5000) as emp
on dept.id = emp.dept_id;
# 实现方式2：
select emp.id,emp.NAME,emp.gender,emp.salary,emp.join_date,
       dept.id , dept.name
from dept right join  emp
    on dept.id  = emp.dept_id
where emp.salary in (select salary from emp where salary > 5000);























