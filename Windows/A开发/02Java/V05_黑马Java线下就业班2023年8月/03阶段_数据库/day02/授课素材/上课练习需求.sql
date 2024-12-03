
-- 给root用户，添加密码
update mysql.user set password=PASSWORD('itheima') where User='root';
-- 当修改root密码后，需要刷新下root用户权限
flush privileges;


use itheima;

# 主键约束： 创建表时指定主键

-- 测试：主键约束


# 删除表上的主键约束 （修改表）


# 给表中添加主键约束（修改表）



# 带主键自增的学生表

-- 测试：主键自动增长 （主键列下的数据由mysql自己完成插入）
-- 在向表中插入数据时，不需要考虑主键列数据



-- 测试： 删除一行记录后，对主键字段是否有影响

-- 设置表中主键的起始值




## 唯一约束

-- 测试：唯一约束


# 给student2表中的name字段添加：唯一约束


## 非空约束

-- 测试：非空约束



# 默认值约束


-- 测试：默认值


-- 修改表：添加默认值








### 外键约束
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



-- 测试数据
insert into employee (name, age, dep_id) values
('张三', 20, 1),
('李四', 21, 1),
('王五', 20, 1),
('老王', 20, 2),
('大王', 22, 2),
('小王', 18, 2);

-- 测试： 插入数据时外键字段下的数据没有在主表中主键列下存在

-- 删除外键


-- 测试：删除主表中的数据



# 级联删除、更新






## 高级查询：多表查询
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


-- 笛卡尔积
select * from  dept , emp;  -- 把两张连接在一起查询数据


-- 多表查询
-- 需求1：查询所有员工信息（含部门名称）
# 注意细节： 1、当多张表中存在相同名称的字段时，建议给字段起别名； 2、查询字段时添加上表名






-- 需求2： 查询"孙悟空"的员工信息及部门信息







-- 显式内连接查询
# 查询唐僧的信息，显示员工id，姓名，性别，工资和所在的部门名称
/*
   多表查询技巧：
   1、明确要查询哪些字段
   2、明确所查询字段分别归属哪张表
   3、明确表和表之间的关系（寻找主键、外键）

   分析需求：
   1、明确要查询哪些字段
        员工id，姓名，性别，工资、部门名称
   2、明确所查询字段分别归属哪张表
        emp表 ： 员工id，姓名，性别，工资
        dept表： 部门名称
   3、明确表和表之间的关系（寻找主键、外键）
        emp表.dept_id = dept表.id
   4、其他要求
        查询唐僧       where name ='唐僧'
*/








# 左外连接
-- 需求1：查询所有的部门，以及该部门下面的员工
/* 查询的要求： 所有的部门

    分析需求：
   1、明确要查询哪些字段
        员工id，姓名，性别，工资、入职日期、 部门编号、部门名称
   2、明确所查询字段分别归属哪张表
        emp表 ： 员工id，姓名，性别，工资、入职日期
        dept表： 部门编号、部门名称
   3、明确表和表之间的关系（寻找主键、外键）
        emp表.dept_id = dept表.id
   4、其他要求
        查询所有的部门
*/
-- 新增部门数据
INSERT INTO dept (NAME) VALUES ('行政部');










# 右外连接
-- 需求2：查询所有员工，以及员工所属的部门
-- 向员工表中新增一行记录
INSERT INTO emp(NAME,gender,salary,join_date) VALUES ('白龙马','男',9000,'2012-02-24');








## 子查询 ： 在一个查询中嵌套另一个查询 （有外部查询、有内部查询）
-- 内部查询的结果为： 单列单行
-- 查询最高工资的员工信息
/* 内部查询： 查询出最高工资
   外部查询： 匹配最高工资，查询员工信息
*/







-- 查询工资大于"蜘蛛精"的员工
/*
   外部查询： 查询员工信息， 条件是工资>蜘蛛精的工资
   内部查询： 查询蜘蛛精的工资
*/



# 多行单列： 内部查询的结果是一列数据，多行记录
-- 查询所有工资大于5000的员工其部门信息
/*
   外部查询：  查询部门信息   条件是部门id是1或2
   内部查询：  查询工资>5000的员工部门编号
*/






-- 查询工资高于1号部门所有员工工资的员工信息
/*
   外部查询： 查询员工信息      条件：工资 > 1号部门所有员工工资
   内部查询： 查询 1号部门所有员工工资
*/




-- 查询工资高于1号部门任意一位员工工资的员工信息










## 子查询： 多行多列  （子查询作为一张临时表使用）
# 需求：查询出2011年以后入职的员工信息（包括部门名称）



