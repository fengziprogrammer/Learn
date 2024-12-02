/*
第6章 mysql的运算符
1、算术运算符
加：+
减：-
乘：*
除：/ 正常除
   div 只保留整数部分
模：%

*/
SELECT 1+2;
SELECT 2-1;
SELECT 2*8;
SELECT 9/2;
SELECT 9 DIV 2;
SELECT 9.3 DIV 2;
SELECT 9%2;

/*
大于：>
小于：<
大于等于：>=
小于等于：>=
等于：=   不能用于null判断
不等于：!=  或 <>  不能用于null判断
*/
SELECT 1=1;
SELECT * FROM stu WHERE id = 1;
SELECT * FROM stu WHERE id == 1;#错误 Java中才有==
SELECT * FROM stu WHERE `name` = NULL; #错误,null值的判断不能用=
SELECT * FROM stu WHERE `name` IS NULL;
SELECT * FROM stu WHERE `name` <=> NULL;

SELECT * FROM stu WHERE `name` != NULL;#错误,null值的判断不能用!=
SELECT * FROM stu WHERE `name` IS NOT NULL;
SELECT * FROM stu WHERE !(`name` <=> NULL);

SELECT * FROM stu WHERE id != 1;
SELECT * FROM stu WHERE id <> 1;


#查询薪资高于15000的员工信息
SELECT * FROM t_employee WHERE salary > 15000;

#查询不是1号部门的员工
SELECT * FROM t_employee WHERE did != 1;

#查询所有的男员工信息
SELECT * FROM t_employee WHERE gender = '男';

/*
区间范围：between x  and  y
	    not between x  and  y
集合范围：in (x,x,x)
	    not  in(x,x,x)
	    */
#查询薪资在[10000,15000]之间的员工
SELECT * FROM t_employee WHERE salary BETWEEN 10000 AND 15000;

#查询薪资不在[10000,15000]之间的员工
SELECT * FROM t_employee WHERE salary NOT BETWEEN 10000 AND 15000;

#查询1,2,3部门的员工
SELECT * FROM t_employee WHERE did IN(1,2,3);

#查询不是1,2,3部门的员工
SELECT * FROM t_employee WHERE did NOT IN(1,2,3);

/*
%：代表任意个字符

_：代表一个字符，如果两个下划线代表两个字符
*/
#查询名字中包含“冰”字 的员工
SELECT * FROM t_employee WHERE ename LIKE '%冰%';

#查询名字中包含3个字，最后一个是“冰”字 的员工
SELECT * FROM t_employee WHERE ename LIKE '__冰';

/*
逻辑与：&& 或 and
逻辑或：|| 或 or
逻辑非：! 或 not
逻辑异或： xor
*/
#查询薪资高于15000的男员工
SELECT * 
FROM t_employee
WHERE salary > 15000 && gender = '男';

SELECT * 
FROM t_employee
WHERE salary > 15000 AND gender = '男';

#查询薪资高于15000，或者他是男员工
SELECT * 
FROM t_employee
WHERE salary > 15000 || gender = '男';

#查询薪资低于10000，或者入职日期在2016-1-1之前的员工
SELECT * 
FROM t_employee
WHERE salary < 10000 || hiredate < '2016-1-1';

#查询入职日期不在 2016-1-1之前的员工
SELECT * FROM t_employee WHERE hiredate >= '2016-1-1';
SELECT * FROM t_employee WHERE !(hiredate < '2016-1-1');


#查询薪资低于10000，但是入职日期是在2016-1-1之后的员工
#或薪资大于等于10000，但是入职日期是在2016-1-1之前的员工
/*
分析：要么满足薪资低于10000，要么满足入职日期在2016-1-1之前
只能满足一个。
*/
SELECT salary,hiredate
FROM t_employee
WHERE salary<10000 XOR hiredate < '2016-1-1';

/*
1）判断时xx is null
xx is not null
xx <=> null​


(2)计算时ifnull(xx,代替值)  当xx是null时，用代替值计算
*/
#计算所有员工的实发工资
/*
实发工资 = salary * (1+奖金比例)
*/
SELECT ename AS 姓名,
	salary AS 月薪,
	commission_pct AS 奖金比例,
	salary * (1+IFNULL(commission_pct,0)) AS 实发工资
FROM t_employee;

