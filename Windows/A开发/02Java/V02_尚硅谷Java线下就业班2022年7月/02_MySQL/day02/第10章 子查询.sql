/*
第10章 子查询
1、什么是子查询？
嵌套在另一个sql语句中的查询，就叫做子查询。
通常子查询都是先执行的SELECT查询语句，需要用()括起来。
子查询的查询结果是作为另一个SQL语句的 条件、数据范围等。

2、形式一：SELECT的SELECT中嵌套子查询
*/
#（1）在“t_employee”表中查询每个人薪资和公司平均薪资的差值，
#并显示员工薪资和公司平均薪资相差5000元以上的记录。
/*
select salary-avg(salary)
from t_employee;#错误，只有一行*/

SELECT ename,salary,
	salary - (SELECT AVG(salary) FROM t_employee) AS 与公司平均薪资的差值
FROM t_employee
WHERE ABS(salary - (SELECT AVG(salary) FROM t_employee)) > 5000;


#（2）在“t_employee”表中查询每个部门平均薪资和公司平均薪资的差值。
SELECT did,AVG(salary), 
	AVG(salary) - (SELECT AVG(salary) FROM t_employee) AS 部门与公司平均薪资的差值
FROM t_employee
GROUP BY did;


/*
3、形式二：SELECT的WHERE或HAVING中嵌套子查询
*/
#（1）在“t_employee”表中查询薪资最高的员工姓名（ename）和薪资（salary）。
#第一步：全公司薪资最高的薪资值是多少
SELECT MAX(salary) FROM t_employee;

#第二步：谁的薪资和 这个最高薪资值相同
SELECT *
FROM t_employee
WHERE salary = (SELECT MAX(salary) FROM t_employee);

#（2）在“t_employee”表中查询比全公司平均薪资高的男员工姓名和薪资。
#第一步：查询全公司平均薪资
SELECT AVG(salary) FROM t_employee;

#第二步：查询薪资 > 全公司平均薪资 && gender = '男'
SELECT *
FROM t_employee
WHERE salary > (SELECT AVG(salary) FROM t_employee) AND gender = '男';


#（3）在“t_employee”表中查询和“白露”，“谢吉娜”同一部门的员工姓名和电话。
#第一步：查询“白露”，“谢吉娜”的部门编号
SELECT did FROM t_employee  WHERE ename IN('白露','谢吉娜');

#第二步：查询部门编号 和 她俩的部门编号一样的
/*
select *
from t_employee
where did = (SELECT did FROM t_employee  WHERE ename IN('白露','谢吉娜'));*/
/*
Subquery（子查询） returns（返回） more than 1 row（超过1行的记录）
*/

SELECT *
FROM t_employee
WHERE did IN(SELECT did FROM t_employee  WHERE ename IN('白露','谢吉娜'));

SELECT *
FROM t_employee
WHERE did =ANY(SELECT did FROM t_employee  WHERE ename IN('白露','谢吉娜'));

/*
4、形式三：在FROM后面嵌套子查询，子查询的结果作为一张临时表用，必须给临时表取别名
*/

#（1）在“t_employee”表中，查询每个部门的平均薪资，
#然后与“t_department”表联合查询
#所有部门的部门编号、部门名称、部门平均薪资。
#方案一：先联合两个表，再分组
SELECT dept.did,dname,AVG(salary)
FROM t_employee AS emp RIGHT JOIN t_department AS dept ON emp.did = dept.did 
GROUP BY dept.did

#方案二：先分组后联合
SELECT dept.did,dname,a
FROM 
(SELECT did,AVG(salary) AS a FROM t_employee GROUP BY did) AS avgtable 
RIGHT JOIN
t_department AS dept
ON avgtable.did = dept.did;
/*
子查询的结果是单个值的，可以嵌套在select后面和where后面。
如果在where后面可以与=，>等比较运算符做条件判断。

子查询的结果是单列多个值，只能嵌套在where后面。与in, =any, >any, =all....结合做条件判断。

子查询的结果是多列多个值（类似于表格），只能嵌套在from后面，当成临时表使用。

*/


/*
5、特殊的子查询  exists查询，它也是在where里面
*/

#（1）查询“t_employee”表中是否存在部门编号为NULL的员工，
#如果存在，查询“t_department”表的部门编号、部门名称。
#第一步：查询“t_employee”表中是否存在部门编号为NULL的员工
SELECT * FROM t_employee WHERE did IS NULL

#第二步：查询“t_department”表的部门编号、部门名称。
SELECT did,dname FROM t_department WHERE EXISTS (SELECT * FROM t_employee WHERE did IS NULL)

#（2）查询“t_department”表是否存在与“t_employee”表相同部门编号的记录，
#如果存在，查询这些部门的编号和名称。
SELECT * FROM t_department 
WHERE EXISTS (SELECT * FROM t_employee WHERE t_department.did = t_employee.did);

#等价于
SELECT DISTINCT t_department.*
FROM t_department INNER JOIN t_employee
ON t_department.did = t_employee.did;



