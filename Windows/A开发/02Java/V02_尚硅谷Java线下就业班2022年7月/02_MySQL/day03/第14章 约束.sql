/*
第14章 约束

1、主键约束
（1）关键字是primary key
（2）特点
A：每一个表只能有一个主键约束
B：主键约束的字段值是不允许为null，也不允许重复的
*/

CREATE TABLE teacher(
	tid INT PRIMARY KEY,
	tname VARCHAR(20)
);

INSERT INTO teacher VALUES(1,'柴');
/*
上面的insert语句执行两遍，就会报错
错误代码： 1062
Duplicate（重复的） entry（输入） '1' 
for key 'teacher.PRIMARY'

意思：违反了主键约束
*/

INSERT INTO teacher VALUES(2,'柴');
INSERT INTO teacher VALUES(NULL,'王');
/*
错误代码： 1048
Column 'tid' cannot be null  
主键不允许为null
*/


CREATE TABLE teacher(
	tid INT PRIMARY KEY,
	tname VARCHAR(20) PRIMARY KEY
);
/*
错误代码： 1068
Multiple（重复的，多倍的） primary key defined（定义）*/


/*
需求：
 有一个学生表：
  stu(sid,sname,tel)
  course(cid,cname,description)
  xuanke(sid,cid,score)  记录某个学生选择的某门课的成绩

 stu表可以选择sid作为主键
 course表可以选择cid作为主键
 xuanke表可以选择sid
 
*/
CREATE TABLE stu(
   sid INT PRIMARY KEY,
   sname VARCHAR(20),
   tel CHAR(11)
);
CREATE TABLE course(
    cid INT PRIMARY KEY,
    cname VARCHAR(50),
    description VARCHAR(100)
);
INSERT INTO stu VALUES(1,'张三','10086');
INSERT INTO stu VALUES(2,'李四','10010');

INSERT INTO course VALUES(1,'java','基础课');
INSERT INTO course VALUES(2,'mysql','高级课');

/*
表达  张三，选择了java和mysql课程，成绩分别为89和96分
      李四，选择了java和mysql课程，成绩分别为88和100分
*/
/*
create table xuanke(
   sid int primary key,
   cid int PRIMARY KEY,
   score int
);*/
/*
错误代码： 1068
Multiple primary key defined
*/
/*
create table xuanke(
   sid int primary key,
   cid int,
   score int
);
insert into xuanke values(1,1,89);
INSERT INTO xuanke VALUES(1,2,96);*/
/*
错误代码： 1062
Duplicate entry '1' for key 'xuanke.PRIMARY'
*/
/*
create table xuanke(
   id int primary key,
   sid int ,
   cid int,
   score int
);*/
#解决方案一，单独使用一个id列当主键

#解决方案二：复合主键
CREATE TABLE xuanke(
   sid INT ,
   cid INT,
   score INT,
   PRIMARY KEY(sid,cid) #它俩的组合不能为NULL，并且唯一
);
INSERT INTO xuanke VALUES(1,1,89);
INSERT INTO xuanke VALUES(1,2,96);
INSERT INTO xuanke VALUES(2,1,88);
INSERT INTO xuanke VALUES(2,2,100);


#建表后增加主键约束
ALTER TABLE 表名称 ADD PRIMARY KEY(字段列表);
#(字段列表)如果是一个字段，就是一个字段是主键
#(字段列表)如果是多个字段，就是复合主键

#例如
ALTER TABLE student ADD PRIMARY KEY(sid);

#如果想要删除主键约束
ALTER TABLE 表名称 DROP PRIMARY KEY;

ALTER TABLE student DROP PRIMARY KEY;


/*
如果希望某个字段的值，是唯一的，但不要求非空，它也不是主键。
就可以给这样的字段加唯一键约束

2、唯一键约束：
（1）关键字：unique key
（2）特点
A：允许为null，但是不能重复
B：一个表可以有多个唯一键约束
*/
CREATE TABLE student(
	sid INT PRIMARY KEY,
	sname VARCHAR(20),
	birthday DATE,
	score INT,
	gender ENUM('男','女'),
	weight DOUBLE(4,1),
	tel CHAR(11) UNIQUE KEY
);
INSERT INTO student(sid,sname,tel) VALUES
(1,'张三',NULL),
(2,'李四','10086');

INSERT INTO student(sid,sname,tel) VALUES
(3,'王五','10086');

#建表后增加唯一键约束
ALTER TABLE 表名称 ADD UNIQUE KEY (字段列表);

ALTER TABLE student ADD UNIQUE KEY(sname);

DESC student;


#如果要用语句删除唯一键约束
/*
mysql中，会给主键约束，唯一键约束，外键约束，自动创建索引。
在底层会单独的索引表，来记录每一个索引值对应的数据地址。
好比  书的目录页，单独有几页来存储 标题和页面，
哪个标题和对应的页面就像是索引表的意思。
索引的作用是提高查询的效率。
像唯一键约束，主键约束等，它们都是表中“关键“信息，可以通过它们快速的定位到某个记录。
而且实际中根据“关键”信息查询记录的情况更多。
例如：在一个大的学生信息管理系统中，查询自己的数据，那么根据“学号”或“身份证号”，“姓名”。
*/
ALTER TABLE 表名称 DROP INDEX 索引名;

ALTER TABLE student DROP INDEX tel;



/*
如果某个字段，不要求唯一，但是要求非空。那么就可以给字段加非空约束。
3、非空约束
*/

CREATE TABLE student(
	sid INT PRIMARY KEY,
	sname VARCHAR(20),
	birthday DATE,
	score INT NOT NULL,
	gender ENUM('男','女'),
	weight DOUBLE(4,1),
	tel CHAR(11) UNIQUE KEY
);
INSERT INTO student(sid,sname,tel) VALUES
(3,'王五','10086');
/*
错误代码： 1364
Field 'score' doesn't have a default value*/

INSERT INTO student(sid,sname,score,tel) VALUES
(3,'王五',89,'10086');


/*
4、默认值约束
如果某个字段，在添加数据时未指定值时，希望不要用NULL处理，而是按照一个默认值处理，
就可以使用默认值约束。
例如：学生性别，在未指定时，默认按照 男 处理
*/
CREATE TABLE student(
	sid INT PRIMARY KEY, #主键约束
	sname VARCHAR(20) UNIQUE KEY, #唯一键约束
	birthday DATE,
	score INT NOT NULL,  #非空约束
	gender ENUM('男','女') NOT NULL DEFAULT '男', #非空 + 默认值约束
	weight DOUBLE(4,1),
	tel CHAR(11) UNIQUE KEY #唯一键约束
);
INSERT INTO student(sid,sname,score,tel)
 VALUES(1,'张三',89,'10086');
 
 INSERT INTO student(sid,sname,score,gender,tel)
 VALUES(2,'小翠',89,'女','10010');
 
 
 #删除score的非空约束
 ALTER TABLE student MODIFY score INT;
 
 #增加非空约束
  ALTER TABLE student MODIFY score INT NOT NULL;
  
  #删除gender的默认值约束，保留非空约束
  ALTER TABLE student MODIFY gender ENUM('男','女') NOT NULL; 
  
    #删除gender的非空约束，保留默认值约束
  ALTER TABLE student MODIFY gender ENUM('男','女') DEFAULT '男'; 
  
  #保留非空和默认值约束
  
    ALTER TABLE student MODIFY gender ENUM('男','女') DEFAULT '男' NOT NULL;
    
    
/*
查看一个表的约束名等信息，查看系统库“information_schema”的“table_constraints”
*/    
SELECT * FROM information_schema.table_constraints WHERE table_name = '表名称';

SELECT * FROM information_schema.table_constraints WHERE table_name= 'student';

/*

5、检查约束
*/

CREATE TABLE student(
	sid INT PRIMARY KEY, #主键约束
	sname VARCHAR(20) ,
	age INT CHECK (age>=18 && age<=35)
);
INSERT INTO student VALUES(1,'张三',25);
INSERT INTO student VALUES(2,'李四',45);
/*
Check constraint 'student_chk_1' is violated（侵犯，无效）.
违反了检查约束*/

/*
6、外键约束
约束两个表的关系，或者是一个表的两个字段之间的关系。

（1）主表（父表）和从表（子表）
主表：被依赖，被参考
从表：依赖别人的，参考别人的

例如：员工表和部门表
员工表中有一个部门编号字段，它的值是依赖于部门表的部门编号。 
员工表是从表。
部门表示主表。

例如：学生表、课程表和选课表
选课表中的学号，它的值是依赖于学生表的学号。
选课表是从表，
学生表是主表。
选课表中的课程编号，它的值是依赖于课程表的课程编号。
选课表是从表，
课程表示主表。

选课表有两个外键。

例如：订单表，用户表
订单表中有一个字段（用户名），它的值依赖于用户表。
订单表就是从表，
用户表就是主表。

例如：订单明细表和订单表。
订单明细表中的订单编号，它的值是依赖于订单表的订单编号。
订单表就是主表，
订单明细表就是从表。

（2）外键的建立和指定要在从表中定义
（3）关键字 foreign key
（4）格式  foreign key (从表的字段) references 主表(被依赖字段)
（5）要求
A：主表必须先存在
B：主表被依赖字段必须有索引，所以通常是主键列或唯一键列等才能作为被依赖字段。
C：删除表时，要么先删除从表，再删除主表，要么先解除外键约束，然后各自删除。
D：从（子）表的依赖字段的数据，必须在主（父）表被依赖字段中选择。
   添加和修改都是这样的。
E：主（父）表被依赖字段的数据不能轻易的删除和修改，要看是否被引用
*/
/*
部门表
*/
CREATE TABLE dept(
   did INT PRIMARY KEY,
   dname VARCHAR(20)
);
CREATE TABLE emp(
   eid INT,
   ename VARCHAR(20),
   deptid INT, #这里的部门编号可以和dept表中的部门编号名字不一样，但是数据类型和逻辑意义要一样
   FOREIGN KEY (deptid) REFERENCES dept(did)
);
#emp依赖于dept表

#删除表
DROP TABLE dept; #失败

INSERT INTO emp VALUES(1,'张三',1);
/*
错误代码： 1452
Cannot add or update a child row: 
a foreign key constraint fails (`0106db`.`emp`, CONSTRAINT `emp_ibfk_1` FOREIGN KEY (`deptid`) REFERENCES `dept` (`did`))*/

INSERT INTO dept VALUES(1,'财务');
INSERT INTO emp VALUES(1,'张三',1);


CREATE TABLE emp(
   eid INT,
   ename VARCHAR(20),
   deptid INT, #这里的部门编号可以和dept表中的部门编号名字不一样，但是数据类型和逻辑意义要一样
   FOREIGN KEY (deptid) REFERENCES dept(did) ON UPDATE CASCADE ON DELETE SET NULL
);


/*
7、自增属性
维护某个字段的值自动增长的一个属性。
它的要求：
（1）一个表最多只能有一个字段是自增的
（2）自增的字段必须是整数类型
（3）自增的字段必须是键约束的字段（通常是主键、唯一键）

自增字段赋值为null和0的时候，会自增，
如果赋值为其他的值，按照你指定的值来。
*/
CREATE DATABASE atguigu; 
USE atguigu;

CREATE TABLE stu(
 sid INT AUTO_INCREMENT PRIMARY KEY,
 sname VARCHAR(20)
);
/*
错误代码： 1075
Incorrect table definition; 
there can be only one auto column（只能是一个自动列）
 and（并且） it must be defined as a key（必须是键列）
*/


INSERT INTO stu VALUES(NULL,'张三');
INSERT INTO stu VALUES(NULL,'李四');
INSERT INTO stu VALUES(0,'王五');
INSERT INTO stu VALUES(-1,'赵六');
INSERT INTO stu VALUES(8,'王八');
INSERT INTO stu VALUES(NULL,'小九');

ALTER TABLE 表名称 AUTO_INCREMENT = 起始值;
ALTER TABLE stu AUTO_INCREMENT = 1001;

INSERT INTO stu VALUES(NULL,'小十');
INSERT INTO stu VALUES(NULL,'小十1');

SHOW CREATE TABLE stu;

