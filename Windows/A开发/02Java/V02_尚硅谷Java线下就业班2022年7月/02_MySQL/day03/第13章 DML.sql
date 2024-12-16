/*
第13章 DML语句
增删改查
*/
#添加语句
INSERT INTO 表名称 VALUES(值列表);#要求值列表的数量、顺序要与表结构一一对应

#例如：
INSERT INTO student VALUES(1,'张三','13478956896','1995-2-5',89,'男',86.5);

#例如：
INSERT INTO student VALUES(2,'李四','13478956896','1995-2-5',89,'男');#少了体重
/*
错误代码： 1136
Column（列，字段） count（数量） doesn't match（不匹配） value（值） count（数量） at row 1
*/

#添加语句，可以指定部分字段赋值
INSERT INTO 表名称(字段列表) VALUES(值列表);#值列表只需要和前面的字段列表数量、顺序一一对应就可以

#例如：
INSERT INTO student(sid,sname,phone) VALUES(2,'李四','13478956896');


#一条insert语句同时添加多行记录
INSERT INTO 表名称 VALUES(值列表),(值列表),(值列表)...;
INSERT INTO 表名称(字段列表) VALUES(值列表),(值列表),(值列表)...;

#例如：
INSERT INTO student(sid,sname,phone) 
VALUES(3,'王五','13478956811'),
(4,'赵六','13478953811'),
(5,'老王','13478956822');

/*
修改
*/
UPDATE 表名称 SET 字段名 = 值,字段名 = 值,字段名 = 值;

#例如：
UPDATE student SET weight = 50;


UPDATE 表名称 SET 字段名 = 值,字段名 = 值,字段名 = 值 WHERE 条件;

#修改李四和王五的体重为86
UPDATE student SET weight = 86 WHERE sname IN('李四','王五');

#删除整个表的数据
DELETE FROM 表名称;

#例如：
DELETE FROM student;

#删除部分行
DELETE FROM 表名称 WHERE 条件;

#例如：
DELETE FROM student WHERE sname = '老王';

#删除weight列的数据
UPDATE student SET weight=NULL;

#删除weight列的定义
ALTER TABLE student DROP weight;

/*
修改遇到比较复杂的情况
*/
#修改atguigu数据库中t_employee表中的数据
#修改“何进”员工的薪资和“孙洪亮”的薪资一样
/*
update t_employee 
set salary = (select salary from t_employee where ename = '孙洪亮')
where ename = '何进';*/
/*
错误代码： 1093
You can't specify target table 't_employee' for update in FROM clause
t_employee现在在from子句中出现了，说明它正在被“查询”，
就不能同时被修改。
*/


UPDATE t_employee 
SET salary = (SELECT salary FROM (SELECT salary FROM t_employee WHERE ename = '孙洪亮') temp)
WHERE ename = '何进';
/*
把子查询(SELECT salary FROM t_employee WHERE ename = '孙洪亮') 的结果放到一个内存中“临时表”中，
可以解开t_employee的锁，
然后修改t_employee表就不会因为锁的问题被拒绝。
*/

/*
删除
*/
#删除和“何进”同一个部门的员工
/*
delete from t_employee
where did = (select did from t_employee where ename='何进');*/
/*
错误代码： 1093
You can't specify target table 't_employee' for update in FROM clause*/

DELETE FROM t_employee
WHERE did = (SELECT did FROM (SELECT did FROM t_employee WHERE ename='何进') temp);


#复制表结构和数据
CREATE TABLE emp LIKE t_employee;
INSERT INTO emp (SELECT * FROM t_employee WHERE eid = 4)

INSERT INTO emp (SELECT * FROM t_employee WHERE did = 3);




