use day02_heima141;
-- 员工表
create table emp
(
  -- primary key 主键约束(非空且唯一)  auto_increment 自动增长
  id       int primary key auto_increment, -- 员工id，主键且自增长
  -- unique 唯一  not null 非空约束
  -- unique 和 not null 约束没有书写前后顺序
  ename    varchar(50) unique not null,    -- 员工姓名，非空并且唯一
  joindate date               not null,    -- 入职日期，非空
  salary   double(7, 2)       not null,    -- 工资，非空
  -- default 0 默认值是0，就是给bonus的值的时候如果不赋值那么使用默认值0
  bonus    double(7, 2) default 0,-- 奖金，如果没有奖金默认为0
  age      int unique
);


-- 插入数据
-- 由于id是主键约束，那么首先不能有重复的数据，并且添加了自动增长，那么插入数据的时候直接输入null即可，mysql就会自动增加
insert into emp(id, ename, joindate, salary, bonus)
values (null, '锁哥', '2010-10-10', 88888.88, 1000);
insert into emp(id, ename, joindate, salary, bonus)
values (null, '柳岩', '2010-10-10', 88888.88, 1000);
-- 由于id是主键约束：非空且唯一，数据表中已经存在id是2的了，所以这里执行失败
insert into emp(id, ename, joindate, salary, bonus)
values (2, '李沁', '2010-10-10', 88888.88, 1000);
-- 插入失败，因为ename是unique唯一约束，数据值不能重复
insert into emp(id, ename, joindate, salary, bonus)
values (null, '柳岩', '2010-10-10', 88888.88, 1000);
-- 插入失败，Column 'ename' cannot be null 因为ename是 not null 非空约束
insert into emp(id, ename, joindate, salary, bonus)
values (null, null, '2010-10-10', 88888.88, 1000);
--
insert into emp(id, ename, joindate, salary)
values (null, '杨幂', '2010-10-10', 88888.88);

/*
	问题：
		主键约束和非空且唯一约束区别？
			id int primary key：非空且唯一 一个表只有一个主键
			ename varchar(50) unique not null：非空且唯一  可以多个
 */


-- 2.表关系_多对多

-- 订单表
CREATE TABLE tb_order
(
  id           int primary key auto_increment,
  payment      double(10, 2),
  payment_type TINYINT, -- 0 微信支付  1 支付宝支付
  status       TINYINT  -- 0 未付款  1 已经支付
);

-- 商品表
CREATE TABLE tb_goods
(
  id    int primary key auto_increment,
  title varchar(100), -- 商品名
  price double(10, 2) -- 单价
);


-- 订单商品中间表
CREATE TABLE tb_order_goods
(
  id       int primary key auto_increment,
  order_id int, -- 外键，来自于订单表的主键
  goods_id int, -- 外键，来自于商品表的主键
  count    int  -- 购买商品数量
);
-- 添加测试数据
insert into tb_order
values (null, 7376.00, 0, 0);
insert into tb_order
values (null, 59880.00, 1, 1);

insert into tb_goods
values (null, '华为P40手机', 5988);
insert into tb_goods
values (null, '海天酱油', 9.9);
insert into tb_goods
values (null, '华为GT2手表', 1388);
insert into tb_order_goods
values (null, 1, 1, 1);
insert into tb_order_goods
values (null, 1, 3, 1);
insert into tb_order_goods
values (null, 2, 1, 10);


-- 清空表
truncate table tb_order;
truncate tb_goods;
truncate tb_order_goods;

-- 1.给中间表tb_order_goods的外键order_id添加外键约束
/*
  1.constraint 添加约束
  2.fk_order_id  外键约束名，要唯一
  3.foreign key(order_id) references tb_order(id); 中间表的外键名order_id引用tb_order表的id主键
*/
alter table tb_order_goods
  add constraint fk_order_id foreign key (order_id) references tb_order (id);
-- 2.给中间表tb_order_goods的外键goods_id添加外键约束
alter table tb_order_goods
  add constraint fk_goods_id foreign key (goods_id) references tb_goods (id);


-- 3.多表查询
-- 3.1.笛卡尔积

-- 价格 1
create table price
(
  id    int primary key auto_increment,
  price double
);
-- 水果 n
create table fruit
(
  id       int primary key auto_increment,
  name     varchar(20) not null,
  price_id int,
  foreign key (price_id) references price (id)
);
insert into price
values (1, 2.30);
insert into price
values (2, 3.50);
insert into price
values (4, null);

insert into fruit
values (1, '苹果', 1);
insert into fruit
values (2, '橘子', 2);
insert into fruit
values (3, '香蕉', null);

-- 需求：查询水果和价格信息 select * from 表名1,表名2,....
select *
from fruit,
     price;

-- 3.2.内连接
-- 避免笛卡尔积问题：
-- 1)隐式内连接避免笛卡尔积问题
-- fruit.price_id :使用fruit表调用该表中的外键字段price_id获取price_id的值
-- price.id; 表示使用price价格表调用price表的主键id获取主键值
select *
from fruit,
     price
where fruit.price_id = price.id;
-- 2)使用显示内连接避免笛卡尔积问题
select *
from fruit as f
       inner join price p on f.price_id = p.id;
-- 可以省略inner
-- as 可以省略
select *
from fruit as f
       join price p on f.price_id = p.id;

-- 练习：查询苹果信息，显示苹果id和价格
-- 分析：在水果表中可以查看苹果id 名字 ，在价格表中可以查看价格和价格id
-- 使用显示内连接查询
-- 格式一
select f.id, p.price
from fruit f
       inner join price p on f.price_id = p.id and f.name = '苹果';
-- 格式二
/*
    说明：
      1.对于连接查询，如果避免笛卡尔积的条件书写在on后面 f.price_id = p.id
      2.如果是其他条件可以考虑使用where条件
      格式：select * from 表名1 inner join 表2 inner join 表名3 。。。 on 免笛卡尔积的条件 where 其他条件;
      -- 下面写法也可以
      select * from 表名1 inner join 表2 on 条件 inner join 表名3  on 条件 where 其他条件;
 */
select f.id, p.price
from fruit f
       inner join price p on f.price_id = p.id
where f.name = '苹果';

-- 3.3左外连接
-- 练习：左外连接练习：查询水果信息和对应价格信息
-- fruit f  位于left左边，称为左表，左外连接以左表为主
-- price p  位于left右边，称为右表
-- f.* :获取fruit水果表中的所有数据
-- p.price : 获取price价格表的字段price的值
# 	  select f.*,p.price from fruit f left outer join price p on f.price_id = p.id;
select *
from fruit f
       left outer join price p on f.price_id = p.id;

-- 3.4右外连接
-- 练习：使用右外连接查询价格对应的水果，显示所有价格
--  right outer join  表示右外连接
--  price p 称为右表 右外连接会查询右表即price表的全部数据以及和左表fruit f的交集
select *
from fruit f
       right outer join price p on f.price_id = p.id;

-- 练习：使用左外连接查询价格对应的水果，显示所有价格
select *
from price p
       left outer join fruit f on f.price_id = p.id;


-- 4.子查询
use day0201_heima141;
-- 创建部门表 1
CREATE TABLE dept
(
  id   INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(20)
);

INSERT INTO dept (NAME)
VALUES ('开发部'),
       ('市场部'),
       ('财务部');

-- 创建员工表 n
CREATE TABLE emp
(
  id        INT PRIMARY KEY AUTO_INCREMENT,
  NAME      VARCHAR(10),
  gender    CHAR(1), -- 性别
  salary    DOUBLE,  -- 工资
  join_date DATE,    -- 入职日期
  dept_id   INT,
  foreign key (dept_id) references dept (id)
);

INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('孙悟空', '男', 7200, '2013-02-24', 1);
INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('猪八戒', '男', 3600, '2010-12-02', 2);
INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('唐僧', '男', 9000, '2008-08-08', 2);
INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('白骨精', '女', 5000, '2015-10-07', 3);
INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('蜘蛛精', '女', 4500, '2011-03-14', 1);


-- 1.查询工资最高的员工是谁
-- 1.1 在emp员工表中查询最高工资
select max(salary)
from emp;
-- 9000 单行单列
-- 1.2在emp员工表中根据上述查询的最高工资查询员工信息
select *
from emp
where salary = (select max(salary) from emp);
-- 2.查询工资小于平均工资的员工有哪些？
-- 2.1在emp员工表中查询平均工资
select avg(salary)
from emp;
-- 单行单列 5860
-- 2.2在emp员工表中查询小于上述的平均工资查询员工信息
select *
from emp
where salary < (select avg(salary) from emp);
-- 3.查询工资大于5000的员工，来自于哪些部门的名字
-- 3.1 在员工表emp中查询工资大于5000的员工部门编号
select dept_id
from emp
where salary > 5000;
-- 1 2 多行单列 作为子查询的条件使用in
-- 3.2在dept部门表中根据上述查询的部门编号查询部门名字
select name
from dept
where id in (select dept_id from emp where salary > 5000);
-- 4. 查询开发部与财务部所有的员工信息
-- 4.1 在dept表查询开发部和财务部的部门编号
select id
from dept
where name in ('开发部', '财务部');
-- 1 3 多行单列 作为子查询的条件使用in
-- 4.2在emp员工表中根据上述查询的部门编号查询员工信息
select *
from emp
where dept_id in (select id from dept where name in ('开发部', '财务部'))

-- 5.查询出2011年以后入职的员工信息，包括部门名称
-- 5.1在emp表中查询2011年以后入职的员工信息
select *
from emp
where join_date > '2011-01-01';
-- 多行多列，作为子查询一般使用as起别名作为临时表和其他表查询
-- 5.2 将上述查询的结果作为临时表和dept表关联查询最后查询员工信息和部门名称
select *
from dept,
     (select * from emp where join_date > '2011-01-01') as temp
where dept.id = temp.dept_id;

use day0202_heima141;
create table teacher
(
  id   int(11) primary key auto_increment,
  name varchar(20) not null unique
);
create table student
(
  id   int(11) primary key auto_increment,
  name varchar(20) NOT NULL unique,
  city varchar(40) NOT NULL,
  age  int
);
create table course
(
  id         int(11) primary key auto_increment,
  name       varchar(20) not null unique,
  teacher_id int(11)     not null,
  foreign key (teacher_id) references teacher (id)
);

create table studentcourse
(
  student_id int    NOT NULL,
  course_id  int    NOT NULL,
  score      double NOT NULL,
  foreign key (student_id) references student (id),
  foreign key (course_id) references course (id)
);

insert into teacher
values (null, '关羽');
insert into teacher
values (null, '张飞');
insert into teacher
values (null, '赵云');

insert into student
values (null, '小王', '北京', 20);
insert into student
values (null, '小李', '上海', 18);
insert into student
values (null, '小周', '北京', 22);
insert into student
values (null, '小刘', '北京', 21);
insert into student
values (null, '小张', '上海', 22);
insert into student
values (null, '小赵', '北京', 17);
insert into student
values (null, '小蒋', '上海', 23);
insert into student
values (null, '小韩', '北京', 25);
insert into student
values (null, '小魏', '上海', 18);
insert into student
values (null, '小明', '广州', 20);

insert into course
values (null, '语文', 1);
insert into course
values (null, '数学', 1);
insert into course
values (null, '生物', 2);
insert into course
values (null, '化学', 2);
insert into course
values (null, '物理', 2);
insert into course
values (null, '英语', 3);

insert into studentcourse
values (1, 1, 80);
insert into studentcourse
values (1, 2, 90);
insert into studentcourse
values (1, 3, 85);
insert into studentcourse
values (1, 4, 78);
insert into studentcourse
values (2, 2, 53);
insert into studentcourse
values (2, 3, 77);
insert into studentcourse
values (2, 5, 80);
insert into studentcourse
values (3, 1, 71);
insert into studentcourse
values (3, 2, 70);
insert into studentcourse
values (3, 4, 80);
insert into studentcourse
values (3, 5, 65);
insert into studentcourse
values (3, 6, 75);
insert into studentcourse
values (4, 2, 90);
insert into studentcourse
values (4, 3, 80);
insert into studentcourse
values (4, 4, 70);
insert into studentcourse
values (4, 6, 95);
insert into studentcourse
values (5, 1, 60);
insert into studentcourse
values (5, 2, 70);
insert into studentcourse
values (5, 5, 80);
insert into studentcourse
values (5, 6, 69);
insert into studentcourse
values (6, 1, 76);
insert into studentcourse
values (6, 2, 88);
insert into studentcourse
values (6, 3, 87);
insert into studentcourse
values (7, 4, 80);
insert into studentcourse
values (8, 2, 71);
insert into studentcourse
values (8, 3, 58);
insert into studentcourse
values (8, 5, 68);
insert into studentcourse
values (9, 2, 88);
insert into studentcourse
values (10, 1, 77);
insert into studentcourse
values (10, 2, 76);
insert into studentcourse
values (10, 3, 80);
insert into studentcourse
values (10, 4, 85);
insert into studentcourse
values (10, 5, 83);


-- 1.查询获得最高分的学生信息。
-- 1.1 在中间表中查询最高分
select max(score)
from studentcourse;
-- 95
-- 单行单列
-- 1.2 在中间表中根据上述查询的最高分查询学生id
-- 一个班级最高分95，可以有多名学员，结果有可能是多行多列
select student_id
from studentcourse
where score = (select max(score) from studentcourse);


-- 1.3在学生表中根据上述查询的学生id查询学生信息
select *
from student
where id in (select student_id
             from studentcourse
             where score = (select max(score) from studentcourse));

-- 2.查询编号是2的课程比编号是1的课程最高成绩高的学生信息。
-- 2.1在中间表查询课程编号是1的最高分数
select max(score)
from studentcourse
where course_id = 1;
-- 80
-- 2.2在中间表中查询课程编号是2并且分数大于上述结果的学生编号
select student_id
from studentcourse
where course_id = 2
  and score > (select max(score) from studentcourse where course_id = 1);
-- 多行单列
-- 2.3 在学生表中根据上述查询的学生编号查询学生信息
select *
from student
where id in (select student_id
             from studentcourse
             where course_id = 2
               and score > (select max(score) from studentcourse where course_id = 1));
-- 3.查询编号是2的课程比编号是1的课程最高成绩高的学生姓名和成绩。
-- 3.1在中间表查询课程编号是1的最高分数
select max(score)
from studentcourse
where course_id = 1;
-- 80
-- 3.2在中间表中查询课程编号是2并且分数大于上述结果的学生编号和分数
select student_id, score
from studentcourse
where course_id = 2
  and score > (select max(score) from studentcourse where course_id = 1);
-- 多行多列作为临时表
-- 3.3 将上述查询的结果作为临时表
select s.name, temp.score
from student s,
     (select student_id, score
      from studentcourse
      where course_id = 2
        and score > (select max(score) from studentcourse where course_id = 1)) temp
where s.id = temp.student_id;
-- 4.查询每个同学的学号、姓名、选课数、总成绩
-- 4.1在中间表中根据学号分组查询学号 选课数 总成绩
select student_id, count(*), sum(score)
from studentcourse
group by student_id;
-- 多行多列，作为临时表
-- 4.2将上述查询的结果作为临时表和学生表进行关联查询
select *
from student s,
     (select student_id, count(*), sum(score) from studentcourse group by student_id) temp
where s.id = temp.student_id;

/*
  注意：如果子查询中查询的结果字段是聚合函数，并且最后结果需要使用
  聚合函数，那么必须使用as给聚合函数的字段起别名
 */
select s.id, s.name, temp.选课数, temp.总成绩
from student s,
     (select student_id, count(*) as 选课数, sum(score) as 总成绩 from studentcourse group by student_id) temp
where s.id = temp.student_id;

-- 连接查询练习

-- 部门表
CREATE TABLE dept
(
  id    INT PRIMARY KEY PRIMARY KEY, -- 部门id
  dname VARCHAR(50),                 -- 部门名称
  loc   VARCHAR(50)                  -- 部门位置
);

-- 添加4个部门
INSERT INTO dept(id, dname, loc)
VALUES (10, '教研部', '北京'),
       (20, '学工部', '上海'),
       (30, '销售部', '广州'),
       (40, '财务部', '深圳');

-- 职务表，职务名称，职务描述
CREATE TABLE job
(
  id          INT PRIMARY KEY,
  jname       VARCHAR(20),
  description VARCHAR(50)
);

-- 添加4个职务
INSERT INTO job (id, jname, description)
VALUES (1, '董事长', '管理整个公司，接单'),
       (2, '经理', '管理部门员工'),
       (3, '销售员', '向客人推销产品'),
       (4, '文员', '使用办公软件');

-- 员工表
CREATE TABLE emp
(
  id       INT PRIMARY KEY, -- 员工id
  ename    VARCHAR(50),     -- 员工姓名
  job_id   INT,             -- 职务id
  mgr      INT,             -- 上级领导
  joindate DATE,            -- 入职日期
  salary   DECIMAL(7, 2),   -- 工资
  bonus    DECIMAL(7, 2),   -- 奖金
  dept_id  INT,             -- 所在部门编号
  CONSTRAINT emp_jobid_ref_job_id_fk FOREIGN KEY (job_id) REFERENCES job (id),
  CONSTRAINT emp_deptid_ref_dept_id_fk FOREIGN KEY (dept_id) REFERENCES dept (id)
);

-- 添加员工
INSERT INTO emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id)
VALUES (1001, '孙悟空', 4, 1004, '2000-12-17', '8000.00', NULL, 20),
       (1002, '卢俊义', 3, 1006, '2001-02-20', '16000.00', '3000.00', 30),
       (1003, '林冲', 3, 1006, '2001-02-22', '12500.00', '5000.00', 30),
       (1004, '唐僧', 2, 1009, '2001-04-02', '29750.00', NULL, 20),
       (1005, '李逵', 4, 1006, '2001-09-28', '12500.00', '14000.00', 30),
       (1006, '宋江', 2, 1009, '2001-05-01', '28500.00', NULL, 30),
       (1007, '刘备', 2, 1009, '2001-09-01', '24500.00', NULL, 10),
       (1008, '猪八戒', 4, 1004, '2007-04-19', '30000.00', NULL, 20),
       (1009, '罗贯中', 1, NULL, '2001-11-17', '50000.00', NULL, 10),
       (1010, '吴用', 3, 1006, '2001-09-08', '15000.00', '0.00', 30),
       (1011, '沙僧', 4, 1004, '2007-05-23', '11000.00', NULL, 20),
       (1012, '李逵', 4, 1006, '2001-12-03', '9500.00', NULL, 30),
       (1013, '小白龙', 4, 1004, '2001-12-03', '30000.00', NULL, 20),
       (1014, '关羽', 4, 1007, '2002-01-23', '13000.00', NULL, 10);

-- 工资等级表
CREATE TABLE salarygrade
(
  grade    INT PRIMARY KEY,
  losalary INT, -- 最低薪资
  hisalary INT  -- 最高薪资
);

-- 添加5个工资等级
INSERT INTO salarygrade(grade, losalary, hisalary)
VALUES (1, 7000, 12000),
       (2, 12010, 14000),
       (3, 14010, 20000),
       (4, 20010, 30000),
       (5, 30010, 99990);

-- 1.查询所有员工信息。显示员工编号，员工姓名，工资，职务名称，职务描述。
-- 1.1 确定几张表关联查询：2张表 emp job
-- 1.2 确定连接查询的条件即避免笛卡尔积的条件 emp.job_id = job.id
-- 1.3 确定要查询的结果字段：员工编号，员工姓名，工资，职务名称，职务描述
select e.id, e.ename, e.salary, j.jname, j.description
from emp e
       inner join job j on e.job_id = j.id;

-- 2.查询所有员工信息。显示员工编号，员工姓名，工资，职务名称，职务描述，部门名称，部门位置
-- 2.1 确定几张表关联查询：3张表 emp job dept
-- 2.2 确定连接查询的条件即避免笛卡尔积的条件 emp.job_id = job.id and emp.dept_id=dept.id
-- 2.3 确定要查询的结果字段：员工编号，员工姓名，工资，职务名称，职务描述，部门名称，部门位置
select e.id, e.ename, e.salary, j.jname, j.description, d.dname, d.loc
from emp e
       inner join job j
       inner join dept d
                  on e.dept_id = d.id and e.job_id = j.id;

/*
  连接查询规律：
    1.确定几张表关联
    2.确定连接查询的条件
    3.确定要查询的结果字段
    4.如果是n张表关联，那么避免笛卡尔积的条件的个数是：n-1
 */


-- 3.查询所有员工信息。显示员工姓名，工资，职务名称，职务描述，部门名称，部门位置，工资等级。
-- 1.确定几张表关联 4张表 emp job dept salarygrade
-- 2.确定连接查询的条件 :emp.job_id = job.id and emp.dept_id=dept.id
-- 其他条件：e.salary between salarygrade.losalary and salarygrade.hisalary
-- 3.确定要查询的结果字段
select e.ename, e.salary, j.jname, j.description, d.dname, d.loc, s.grade
from emp e
       inner join dept d
       inner join job j
       inner join salarygrade s
                  on e.job_id = j.id and e.dept_id = d.id
where e.salary between s.losalary and s.hisalary;



-- 4.查询出每个部门的部门编号、部门名称、部门位置、部门人数
-- 4.1 在emp表中按照部门编号分组查询部门编号和每个部门人数
select dept_id, count(*)
from emp
group by dept_id;
-- 4.2 几张表关联：dept 上述临时表
-- 4.3 条件 dept.id和临时表的dept_id相等
-- 4.4 分析查询的结果部门编号、部门名称、部门位置、部门人数
select d.id,d.dname,d.loc,temp.c
from dept d
       inner join (select dept_id, count(*) c from emp group by dept_id) temp
on d.id = temp.dept_id;

delete from salarygrade where grade=5;

-- 事务

# 创建账号表
create table account(
	id int primary key auto_increment,
	name varchar(20),
	money double
);
# 初始化数据
insert into account values (null,'a',1000);
insert into account values (null,'b',1000);

-- 手动控制事务
-- 需求：a给b转账100，演示事务
-- 1.手动开启事务
-- 在下面的事务中会有多条sql语句，sql语句要成功都会成功，要失败都失败
-- 成功：一切正常 提交事务 commit
-- 失败：出现异常 回滚事务 rollback
start transaction ;
-- a-100
update account set money=money-100 where name='a';
-- b+100
update account set money=money+100 where name='b';

-- 一切正常，提交事务，最后a-100，b+100
commit ;

-- 事务回滚
start transaction ;
-- a-100
update account set money=money-100 where name='a';
-- b+100
update account set money=money+100 where name='b';

-- 失败：出现异常 回滚事务 rollback ,数据回到开启事务之前的状态
rollback ;


-- 注意：提交事务，那么数据就会永久性改变，在回滚也不会回到开启事务之前的状态
-- 注意：如果事务已经回滚，不能提交了。

-- 演示自动提交事务，mysql是自动提交事务的，就是执行一条sql语句就会提交一次事务

-- a-100
update account set money = money - 100 where name='a';

-- b+100
update account set money = money + 100 where name='b';

-- 查看mysql是否是自动提交事务
show variables like '%commit%';
/*
	autocommit的值是on表示自动开启事务，值是off表示关闭自动提交事务，只能手动提交事务
	通过命令set可以临时设置autocommit的值1，表示on.0表示off,重新使用客户端连接mysql服务器就会开启了
*/
  -- a-100
update account set money = money - 100 where name='a';

-- b+100
update account set money = money + 100 where name='b';

-- 关闭自动提交事务
set autocommit=0;
