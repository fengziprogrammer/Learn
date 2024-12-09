/*
第8章 关联查询
关联查询：两个或更多个表一起查询。
又称为联合查询，多表查询。

1、关联查询的结果一共有7种：
两个表的记录分为四种：
①A表中能在B表中找到对应的记录的记录
②A表中在B表中找不到对应的记录的记录
③B表中可以在A表找到对应的记录的记录
④B表中在A表中找不到对应的记录的记录

（1）A∩B      ①③
（2）A        ①②
（3）A-A∩B    ②
（4）B        ③④
（5）B-A∩B    ④
（6）A∪B      ①②③④
（7）A∪B-A∩B  ②④

2、两个表要一起查询，要有前提条件：有关联
就是有相同逻辑意义和数据类型的字段。

3、如何实现7种查询结果
（1）内连接  inner join
（2）外连接  outer join 
左外连接   left outer join 或 left join
右外连接   right outer join 或 right join
全外连接   full outer join 或 full join

但是，mysql不支持全外连接，没有full join。
mysql使用union关键字合并其他的查询结果实现全外连接的效果。

内连接 ==> A∩B
左连接 ==> A 或 A-A∩B
右连接 ==> B 或 B-A∩B
全外连接 ==> A∪B 或 A∪B - A∩B
     左连接的A union 右连接的B	得到  A∪B
     左连接的A-A∩B  union 右连接B-A∩B 得到 A∪B - A∩B

4、内连接 inner join 
A表 inner join B表 on 关联条件
*/
#查询员工表的员工姓名，和部门编号，部门表的部门名称
#不显示那些 没有分配部门的员工，也不包括那些没有员工的部门
/*
select ename,did,dname
from t_employee inner join t_department

Column 'did' in field list is ambiguous 原因did没有指定是哪个表的，有重名问题
*/

/*select ename,t_employee.did,dname
from t_employee inner join t_department

上面的sql错误，结果出现了一种现象：笛卡尔积
*/

SELECT ename,t_employee.did,dname
FROM t_employee INNER JOIN t_department
ON t_employee.did = t_department.did;


/*
5、左连接 left join
（1）A表：A表 left join B表 on A表.关联字段 = B表.关联字段
（2）A-A∩B：
	A表 left join B表 on A表.关联字段 = B表.关联字段
	where 从表.关联字段 is null
	从表是A和B是占从表位置的表。
*/
#查询所有的员工的姓名和部门编号，部门名称，包括那些没有分配部门的员工
#但是不包括没有员工的部门
SELECT ename,t_employee.did,dname
FROM t_employee LEFT JOIN t_department
ON t_employee.did = t_department.did;

#查询所有的员工的姓名和部门编号，部门名称，只显示那些没有分配部门的员工。
#但是不包括没有员工的部门
SELECT ename,t_employee.did,dname
FROM t_employee LEFT JOIN t_department
ON t_employee.did = t_department.did
WHERE t_employee.did IS NULL;

/*
6、右连接 right join
（1）B表：A表 right join B表 on A表.关联字段 = B表.关联字段
（2）B-A∩B：
	A表 right join B表 on A表.关联字段 = B表.关联字段
	where 从表.关联字段 is null
	从表是A和B是占从表位置的表。
	
思考：
	B表 right join A表 on A表.关联字段 = B表.关联字段  结果是A
	A表 right join B表 on A表.关联字段 = B表.关联字段  结果是B	
*/
#查询所有部门的编号，部门的名称，以及该部门下所有的员工信息，
#包括那些没有员工的部门
#不包括那些没有分配部门的员工
SELECT t_department.*, t_employee.*
FROM t_employee RIGHT JOIN t_department
ON t_employee.did = t_department.did;

#查询所有部门的编号，部门的名称，以及该部门下所有的员工信息，
#只显示那些没有员工的部门
#不包括那些没有分配部门的员工
SELECT t_department.*, t_employee.*
FROM t_employee RIGHT JOIN t_department
ON t_employee.did = t_department.did
WHERE t_employee.did IS NULL;
/*
主表/父表：部门表是主表
从表/子表：员工表是从表

两个表的关联字段是 did（部门编号）
部门表中是所有部门的信息，是完整的部门信息。
员工表选择所属部门时，必须参考部门表，选择的部门编号必须在部门表中找得到。
*/

/*
7、使用union实现全外连接的效果
（1）A∪B
转换为 左连接的A union 右连接的B
（2）A∪B - A∩B
转换为 左连接的A-A∩B union 右连接的B-A∩B
*/
#查询所有员工和所有部门的信息，包括那些没有员工的部门，和没有分配部门的员工
#当然也包括有员工的部门、和有部门的员工。
SELECT *
FROM t_employee LEFT JOIN t_department
ON t_employee.did = t_department.did

UNION 

SELECT *
FROM t_employee RIGHT JOIN t_department
ON t_employee.did = t_department.did;


#查询所有员工和所有部门的信息，
#只显示那些没有部门的员工、没有员工的部门。

SELECT *
FROM t_employee LEFT JOIN t_department
ON t_employee.did = t_department.did
WHERE t_employee.did IS NULL

UNION 

SELECT *
FROM t_employee RIGHT JOIN t_department
ON t_employee.did = t_department.did
WHERE t_employee.did IS NULL;


/*
8、特殊的内连接

*/
#查询员工和部门的信息，只显示有部门的员工和有员工的部门
SELECT *
FROM t_employee , t_department
WHERE t_employee.did = t_department.did;


/*
9、自连接
进行关联查询的两个表，本质上是一个表。

分析员工表：
  有一个字段是mid，是领导编号，即表示这个员工归谁管。
  那么这里的领导编号其实就是这个领导他作为员工的员工编号。
  
通过取别名的方式，把一张表虚拟成两张表。
当然，也要关联字段。  

*/
#查询每一个员工的编号，姓名，和他的领导的编号和姓名
SELECT emp.eid,emp.ename,emp.`mid`,mgr.ename
FROM t_employee AS emp LEFT JOIN  t_employee AS mgr
ON emp.mid = mgr.eid;

/*
10、更多表关联
n张表关联，关联条件要编写n-1个
2张表，写1个关联条件
3张表，写2个关联条件
....
*/

/*
查询每一个员工的姓名，职位名称，部门名称
员工的姓名在t_employee表中
员工的职位名称在t_job表中
员工的部门名称在t_department表中

找关联条件
(1) t_employee.did = t_department.did
(2) t_employee.job_id = t_job.jid

A表 inner|left|right join B表 on 关联条件1 
  inner|left|right join C表 on 关联条件2

*/
SELECT ename,jname,dname
FROM 
 t_employee LEFT JOIN t_department ON t_employee.did = t_department.did
 LEFT JOIN t_job ON  t_employee.job_id = t_job.jid;


/*
查询员工的姓名，领导的姓名，员工自己职位的名称，领导的职位名称，部门的名称
分析：
  t_employee 当员工表使用 emp
  t_employee 当领导表使用 mgr
  t_department 部门表
  t_job   j1 职位表
  t_job j2 职位表
  
找关联条件
(1) emp.did = t_department.did
(2) emp.job_id = j2.jid
(3) emp.mid = mgr.eid   
(4) mgr.job_id = j1.jid
*/
SELECT emp.ename AS 员工姓名,
	mgr.ename AS 领导姓名,
	j2.jname AS 员工的职位名称,
	j1.jname AS 领导的职位名称,
	dname AS 部门的名称
FROM t_employee AS emp LEFT JOIN t_employee AS mgr ON emp.mid = mgr.eid 
    LEFT JOIN t_job j1 ON mgr.`job_id` = j1.jid
    LEFT JOIN t_department ON emp.did = t_department.did
    LEFT JOIN t_job j2 ON emp.job_id = j2.jid



