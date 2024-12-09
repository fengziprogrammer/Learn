/*
第9章 SELECT 的7大子句
(1)from
(2)on
(3)where
(4)group by
(5)having

where和having的区别？
where是针对原表的元素数据筛选，后面不能接分组函数（avg,sum,count,max,min等）
having是针对分组统计结果的再次筛选，后面可以接分组函数，还可以使用统计结果的别名
(6)order by 排序
(7)limit 分页

*/
#查询所有男员工的姓名和部门名称
/*
分析：男员工在t_employee表
      部门名称在t_department表
需要两个表关联查询， 关联字段是did
*/
SELECT ename,dname
FROM t_employee LEFT JOIN t_department ON t_employee.did = t_department.did
WHERE gender = '男';

#查询每一个部门的平均薪资
SELECT did,AVG(salary)
FROM t_employee
GROUP BY did

#查询每一个部门的部门编号，部门名称，和部门的平均薪资
/*
薪资在员工表，部门名称在部门表，两个表关联查询
*/
SELECT dept.did,dname,AVG(salary)
FROM t_employee AS emp RIGHT JOIN t_department dept ON emp.did = dept.did
GROUP BY emp.did;

SELECT dept.did,dname,ROUND(IFNULL(AVG(salary),0.00),2) AS 部门平均薪资
FROM t_employee AS emp RIGHT JOIN t_department dept ON emp.did = dept.did
GROUP BY emp.did;

#查询每一个部门所有男员工的平均薪资
SELECT dept.did,dname,ROUND(IFNULL(AVG(salary),0.00),2) AS 部门平均薪资
FROM t_employee AS emp RIGHT JOIN t_department dept ON emp.did = dept.did
WHERE gender='男'
GROUP BY emp.did;

#分别统计查询每一个部门男、女员工的平均薪资
SELECT dept.did,dname,gender,ROUND(IFNULL(AVG(salary),0.00),2) AS 部门平均薪资
FROM t_employee AS emp RIGHT JOIN t_department dept ON emp.did = dept.did
GROUP BY emp.did,gender;


#分别统计查询每一个部门男、女员工的平均薪资，
#只显示平均薪资在10000元以上的记录
/*SELECT dept.did,dname,gender,ROUND(IFNULL(AVG(salary),0.00),2) AS 部门平均薪资
FROM t_employee AS emp RIGHT JOIN t_department dept ON emp.did = dept.did
where 部门平均薪资 > 10000
GROUP BY emp.did,gender;*/
/*
Unknown（未知的） column（列） '部门平均薪资' in 'where clause（where子句）'
`部门平均薪资`列在表中找不到
*/

/*
SELECT dept.did,dname,gender,ROUND(IFNULL(AVG(salary),0.00),2) AS 部门平均薪资
FROM t_employee AS emp RIGHT JOIN t_department dept ON emp.did = dept.did
where ROUND(IFNULL(AVG(salary),0.00),2) > 10000
GROUP BY emp.did,gender;*/
/*
Invalid（无效的） use（使用） of group function（分组函数）
where后面是不能使用分组函数
因为where后面只能是根据 原表中的数据筛选，’
而 ROUND(IFNULL(AVG(salary),0.00),2)是统计结果，不是原表中的原始数据
*/

SELECT dept.did,dname,gender,ROUND(IFNULL(AVG(salary),0.00),2) AS 部门平均薪资
FROM t_employee AS emp RIGHT JOIN t_department dept ON emp.did = dept.did
GROUP BY emp.did,gender
HAVING ROUND(IFNULL(AVG(salary),0.00),2) > 10000;

#或

SELECT dept.did,dname,gender,ROUND(IFNULL(AVG(salary),0.00),2) AS 部门平均薪资
FROM t_employee AS emp RIGHT JOIN t_department dept ON emp.did = dept.did
GROUP BY emp.did,gender
HAVING 部门平均薪资 > 10000;

#查询所有员工的姓名和薪资，按照薪资从高到低排序
SELECT ename,salary
FROM t_employee
ORDER BY salary DESC;
/*
默认是升序，降序要加desc，当然升序也可以加asc
*/

#查询所有员工的姓名和薪资、出生日期
#按照薪资从高到低排序
#如果薪资相同的，按照出生日期从小到大
SELECT ename,salary,birthday
FROM t_employee
ORDER BY salary DESC, birthday ASC;

/*
查询每一个部门的男员工的平均薪资。
显示部门编号、部门名称、平均薪资。
并且只显示平均薪资高于8000，
按照平均薪资升序排序
*/
SELECT dept.did,dname,AVG(salary)
FROM t_employee AS emp  RIGHT JOIN t_department AS dept
ON emp.did = dept.did
WHERE gender = '男'
GROUP BY dept.did
HAVING AVG(salary)>8000
ORDER BY AVG(salary);

/*
分页，
limit 记录的下标, 每页的总数
第n页，每页显示total条
limit (n-1)*total, total
每页显示5条,第1页=> limit (1-1)*5, 5 => limit 0,5
每页显示5条,第2页=> limit (2-1)*5, 5 => limit 5,5
每页显示5条,第3页=> limit (3-1)*5, 5 => limit 10,5

每页显示20条,第6页=> limit (6-1)*20, 20 => limit 100,20
*/
#查询员工信息，按照每页显示5条的规则，查询第1页
SELECT * 
FROM t_employee
LIMIT 0,5;

#查询员工信息，按照每页显示5条的规则，查询第2页
SELECT * 
FROM t_employee
LIMIT 5,5;

#查询员工信息，按照每页显示5条的规则，查询第3页
SELECT * 
FROM t_employee
LIMIT 10,5;



/*
查询每一个部门的男员工的平均薪资。
显示部门编号、部门名称、平均薪资。
并且只显示平均薪资高于8000，
按照平均薪资升序排序
每页显示2条，显示第2页
*/
SELECT dept.did,dname,AVG(salary)
FROM t_employee AS emp  RIGHT JOIN t_department AS dept
ON emp.did = dept.did
WHERE gender = '男'
GROUP BY dept.did
HAVING AVG(salary)>8000
ORDER BY AVG(salary)
LIMIT 2,2;

