/*DDL语言*/
-- 查看数据库
show databases ;

-- 查看当前使用的哪个数据库
select database();

-- 切换数据库
use test;


#创建数据库练习
-- 1.直接创建数据库db1
create database db1;

-- 2.判断是否存在并创建数据库db2
create database if not exists db2;

-- 3.查看所有的数据库
show databases ;

-- 4.删除db2数据库
drop database db2;
drop database if exists db2;

-- 5.查看正在使用的数据库
select database();

-- 6.使用db1数据库
use db1;


#操作数据表
-- 查看当前数据库下所有的表
show tables;

-- 查看数据表结构
desc student;

-- 创建表
create table student
(
   id  int,
   name  varchar(10), #varchar属于可变长度的字符串    varchar(2)  存储：'女'  就只占用1个 （最多不能超过2个）
   gender char(1), #char属于固定长度的字符串  char(2)  存储：'男 ' 缺少的字符会补充空格（占用2个）
   birthday date,
   score double ,
   email varchar(64),
   tel varchar(20),
   status int #使用数字表示：0是正常 ， 1是休学， 2是毕业 ， ....
);

-- 删除表
drop table student;
drop table if exists student; #如果数据表存在，则删除

# 修改表
-- 修改表名字
alter table student rename to mystudent;
-- 向表中新增一列
alter table mystudent add remark varchar(100);

-- 修改表中某列的数据类型
alter table mystudent modify remark char(50);

-- 修改表中某列的列名和数据类型
alter table mystudent change  remark temp varchar(200);

-- 删除表中已存在的列
alter table mystudent drop temp;



-- 数据库 -> 数据表 -> 记录
# 创建数据库
create database db2;
# 切换到db2数据库上
use db2;
# 基于数据库创建数据表
create table student
(
    id int ,
    name varchar(10),
    gender char(1),
    birthday date
);

-- 1.修改student表名为stu
alter table student rename to stu;
-- 2.给学生表添加一列remark，类型为varchar(20)
alter table stu add remark varchar(20);
-- 3.修改remark列的类型是varchar(100)
alter table stu modify remark varchar(100);
-- 4.修改remark列的名变为intro,类型varchar(30)
alter table stu change remark intro varchar(30);
-- 5.删除intro列
alter table stu drop  intro;



/*
SQL分类 ：
1. DDL语言： 操作数据库、数据表 （创建、修改、删除）
2、DML语言： 针对数据表中的记录进行增、删、改操作
3、DQL语言： 针对数据表中的记录进行查询
*/

##DML语言

-- 向数据表中的添加数据（行记录）  insert
-- 1.向数据表中指定的列上，添加数据
insert into stu(id , name) values (1,'黑马'); # SQL中字符串数据，通常使用英文单引号包含。例：'字符串数据'

-- 2.向数据表中所有的列上，添加数据
insert into stu(id, name, gender, birthday) values (2,'老唐','男','1990-12-12');#SQL中的date类型数据，也使用英文单引号包含
insert into stu values (3,'奇轩','男','1980/12/12');#SQL中date类型数据默认格式：yyyy-MM-dd

-- 3.向数据表中批量添加数据
insert into stu(id , name) values (4,'上海'),(5,'北京'),(6,'深圳');


#练习
-- 创建student表。包含：id、name、age、birthday、sex、address
create table student
(
    id int ,
    name varchar(10),
    age int ,
    birthday date,
    sex char(1),
    address varchar(50)
);
-- 向student表中的id、name、age、sex中插入数据
insert into student(id,name,age,sex) values (1,'张三',23,'男');

-- 向stuent表中所有的字段，插入数据
insert into db2.student(id, name, age, birthday, sex, address) values (2,'李四',24,'1999-10-10','男','上海');

-- 向student表中批量插入数据
insert into db2.student(id, name, age, birthday, sex, address)
values
(3,'王五',25,'1999-12-10','女','北京'),
(4,'赵六',26,'1990-11-10','女','南京');


insert into db2.student(id) values ('测试');#插入的数据值，必须符合字段的数据类型


-- 修改数据表中的数据   update
-- 修改表中的性别，修改为女
update db2.student set sex ='女';#当前写法在开发中不存在（会修改所有的记录）
update db2.student set sex ='男' where 1=1;

-- 将表中id为2的记录的数据，性别修改为：男
update db2.student set sex ='男' where id=2; # where后面跟的是条件

-- 修改表中id为3的记录。 年龄修改为26，地址修改为老北京
update db2.student set age =26 , address='老北京' where id=3;






-- 删除数据表中的数据   delete
-- 删除表中id为3的行记录  （删除1行记录）
delete from db2.student where id=3;  #删除行记录（会删除条件满足所有行记录）

-- 删除表中id为1和2的行记录 （删除多行记录）
delete  from db2.student where id in (1,2);# in关键字表示在某个指定的范围内


-- 删除表中的所有行记录
delete from db2.student where 1=1;

/*在开发中，如果要删除表中所有的行记录时，通常使用：truncat  */
truncate table db2.student;

/* delete和truncate的区别：

   delete是逐行删除表中的记录（删除所有的记录：一行一行删除）
   truncate是先执行：drop table 表 ，再执行：create table 表  （先删除表，再创建一张相同结构的表）


*/



###DQL语言 （查询：select）
-- 基础查询 （没有where条件）
# 查询学生的编号和姓名
select id, name from db2.student;
select id, name, age, birthday, sex, address from db2.student;
select * from db2.student;#  * 表示当前数据表中的所有的字段  （开发中不让使用）

# 查询学生的姓名和年龄，并以中文方式显示列名
select  name AS "姓名" ,age AS "年龄"  from db2.student;

# 去重查询
select distinct  address from db2.student;





/********************回顾：SQL语法******************/
-- DDL : 操作数据库、数据表
#创建数据库
create database db3 ;
#切换数据库
use db3;
#创建数据表
create table student(
    id int ,
    name varchar(20),
    age int ,
    gender char(1),
    birthday date
);
#修改表： 新增字段、修改类型、修改列名、修改表名、删除列
alter table student add (
    score double ,
    address varchar(100)
);
alter table student drop address;
alter table student modify name varchar(10);

#删除数据库
drop database db3;
#删除数据表
drop table student;



-- DML：操作数据表中的数据（增、删、改）
#添加一行数据
insert into student(id, name, age, gender, birthday) values (1,'张三',23,'男','1990-1-1');
insert into student(id, name, age, gender, birthday,score)
values
(2,'李四',24,'女','1990-2-2',100),
(3,'王五',25,'女','1988-2-2',88);

#修改数据
update student set age=22 where id=1;
update student set age=30 , gender='男', score=50 where id=3;

#删除数据
delete from student where id=1;-- 删除1行数据
delete from student where id in(1,2,3); -- 删除多行数据
delete from student ; #删除所有数据

truncate table student;#删除表后在创建新表（删除全部数据建议使用这个。原因：效率高）



-- DQL
select id, name, age, gender, birthday, score from db3.student;

select id AS "编号", name AS "姓名" , age AS "年龄" from db3.student;

#查询时去除重复的行记录
select distinct gender from db3.student;












use db1;
drop table if exists student;

CREATE TABLE student
(
    id      int,
    name    varchar(20),
    age     int,
    sex     varchar(5),
    address varchar(100),
    math    int,
    english int
);

INSERT INTO student(id, NAME, age, sex, address, math, english)
VALUES (1, '马云', 55, '男', '杭州', 66, 78),
       (2, '马化腾', 45, '女', '深圳', 98, 87),
       (3, '马景涛', 55, '男', '香港', 56, 77),
       (4, '柳岩', 20, '女', '湖南', 76, 65),
       (5, '柳青', 20, '男', '湖南', 86, NULL),
       (6, '刘德华', 57, '男', '香港', 99, 99),
       (7, '马德', 22, '女', '香港', 99, 99),
       (8, '德玛西亚', 18, '男', '南京', 56, 65);


-- 条件查询
# 查询math分数>80的学生
select id, name, age, sex, math, english, math
from db1.student
where math > 80;

# 查询english分数<=80的学生
select id, name, age, sex, math, english, math
from db1.student
where english <=80; #条件筛选会忽略null值

# 查询年龄等于20的学生
select id, name, age, sex, math, english, math
from db1.student
where age =20;

# 查询年龄不等于20的学生
select id, name, age, sex, math, english, math
from db1.student
where age != 20;
select id, name, age, sex, math, english, math
from db1.student
where age <> 20;


#查询age>35且性别为男的学生
select id, name, age, sex, math, english, math
from db1.student
where age >35 and sex ='男';

#查询age>35或性别为男的学生
select id, name, age, sex, math, english, math
from db1.student
where age >35 or sex ='男';


#查询id是1、3、5的学生
select id, name, age, sex, math, english, math
from db1.student
where id in (1,3,5);

select id, name, age, sex, math, english, math
from db1.student
where id=1 or id=3 or id=5;


#查询id不是1、3、5的学生
select id, name, age, sex, math, english, math
from db1.student
where id not in (1,3,5);


##范围查询
#查询english成绩在75~90范围内的学生
select id, name, age, sex, math, english, math
from db1.student
where english>=75 and english<=90;

select id, name, age, sex, math, english, math
from db1.student
where english between 75 and 90;



##模糊查询
#语法： select 字段列表 from 表名 where 字段名 LIKE 模糊查询的关键字 (关键字通常和通配符号关联)
# 在模糊查询时，有一些通配符号：  %  _
#    %  ： 任意个数据
#    _  ： 任意一个数据

-- 查询姓马的学生
select id, name, age, sex, math, english, math
from db1.student
where name LIKE '马%';

-- 查询姓名中包含"德"
select id, name, age, sex, math, english, math
from db1.student
where name LIKE '%德%';


-- 查询姓马，且姓名有三个字的学生
select id, name, age, sex, math, english, math
from db1.student
where name LIKE '马__';



###排序查询
#语法： select 字段列表 from 表 [where 条件] ORDER BY 字段名1 排序规则(升序or降序) , 字段名2 排序规则 , ...
# 升序： ASC （默认， 可以不写）
# 降序： DESC

#查询学生信息，以年龄进行排序（降序）
select id, name, age, sex, math, english, math
from db1.student
order by age DESC;

#查询学生信息，以年龄进行排序（降序）, 当年龄相同时在以数学成绩排序（降序）
select id, name, age, sex, math, english, math
from db1.student
order by age DESC , math DESC;



###分组查询
#和分组查询密切相关的技术：聚合函数
#聚合函数：count(列名)、sum(列名)、max(列名)、min(列名)、avg(列名)
#语法： select 聚合函数名(列名) from 表  [where 条件]

-- 查询有多少个学生
select count(id) AS "学生总数" from db1.student;
select count(*) as "学生总数" from db1.student;

-- 数学成绩总分
select  sum(math) as "数学成绩总分" from db1.student;

-- 查询数学成绩最高分
select  max(math) as "最高分" from db1.student;


-- 计算英语和数学成绩总分
select sum(math)+ sum(english) as "英数总分" from db1.student; -- 结果：1206
select sum(math+english) as "英数总分" from db1.student; -- 结果：1120
# 为什么两个查询的结果不同呢？
# 在mysql中，null值和任意类型的数据值，相加后的结果还是：null
# null值 不参与 聚合函数中的运算

-- 可以使用mysql中的函数： ifnull(列名,默认值)  解决null值的问题
# ifnull(列名,默认值)   当前指定的列名下有null数据值时，会以指定的默认值代替
select sum( ifnull(math,0) + ifnull(english,0) ) as "英数总分" from db1.student;-- 1206





##分组查询
#语法 ：select 字段列表 from 表名 [where 条件]  GROUPBY 字段名1 [HAVING 分组后条件] , 字段名2, ...
#语法要求：
# 1、在进行分组查询时，书写在select关键字后面的列名，要么出现在group by关键字后，要么使用聚合函数包含
#    例：
#       select  age  from student  group by age   -- 查询的age字段出现在group by关键字后
#       select  age  count(id)  from student  group by age -- 查询的id字段没有出现在group by关键字后，要使用聚合函数包含
#      错误写法：
#          select  name, age  from student  group by age

# 分组查询中，使用了where条件和having条件，区别：
# 1、where条件在分组之前执行 、  having条件在分组之后执行
# 2、where条件中不允许使用聚合函数 、 having条件中可以使用聚合函数
#    例：  select ... from  表  where  max(age)  -- 报错。 语法不支持

-- 车辆表
create table car
(
    id int,
    color char(2),
    price float
);
-- 测试数据
insert into car(id,color,price) values(1,'黄色',16);
insert into car(id,color,price) values(2,'黄色',16);
insert into car(id,color,price) values(3,'蓝色',5);
insert into car(id,color,price) values(4,'红色',60);
insert into car(id,color,price) values(5,'白色',8);
insert into car(id,color,price) values(6,'红色',60);


# 查询每种颜色车辆的总价
select color , sum(price) as "总价" from car group by color;

# having关键字，适用于在分组之后进行条件过滤

# 查询显示每种颜色车辆的总价>30的信息
select color , sum(price) as "总价"
from car
group by color
having sum(price)>30; -- having是在分组查询之后进行条件过滤



### 分页查询    关键字：LIMIT
# 思考：为什么要进行分页查询？
# 随着业务增长，数据表中的体量会越来越大，查询时就不能把所有数据全部查询出来（效率低）
# 解决方案： 查询一部分数据， 再查询一部分数据 ， .......
# 好处： 提高查询效率

# 语法 ： select 字段列表 from 表 limit 起始索引 ， 查询条数
# 例：  select ... from student limit 0,5;    -- 从0索引开始，后向取5行数据

select id, name, age, sex, math, english  from db1.student LIMIT 0,3;
select id, name, age, sex, math, english  from db1.student LIMIT 3,3;
select id, name, age, sex, math, english  from db1.student LIMIT 6,3;
/*
   LIMIT 0 ，3    第1页
   LIMIT 3 , 3    第2页
   LIMIT 6 , 3    第3页

   开发中，计算起始索引的公式：  (当前页码-1)*显示条数
   第1页：  起始索引 =  (1-1)*3      起始索引=0
   第2页：  起始索引 =  (2-1)*3      起始索引=3
   第3页：  起始索引 =  (3-1)*3      起始索引=6
*/

-- 查询学生信息，跳过第1行，显示后面4行
select id, name, age, sex, math, english from db1.student LIMIT 1,4;



/* SQL完整语句：
select 字段列表
from  表名
where 条件
group by 分组字段
having 分组后条件
order by 排序字段
limit 起始索引 ， 条数

SQL语句的执行顺序：
   1. from
   2. where
   3. group by
   4. having
   5. select
   6. order by
   7. limit

*/

# 修改root密码
update mysql.user set password=password('itheima') where user='root';
flush privileges;-- 刷新权限


create database db1;

