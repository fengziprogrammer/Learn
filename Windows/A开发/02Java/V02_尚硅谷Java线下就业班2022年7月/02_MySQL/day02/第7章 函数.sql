/*
第7章函数
1、MySQL中的函数分为两大类：
（1）系统预定义的函数，可以直接调用
（2）用户自定义的函数，需要自己声明，然后才能使用（基本阶段不讲）

2、系统预定义的函数又可以分为两大类
（1）单行函数
所谓单行函数是指 一行记录通过单行函数计算完结果还是一行。

（2）多行函数，聚合函数，分组函数
所谓多行函数是指  一行或多行记录通过单行函数计算完，结果的记录数会减少。



*/
#查询员工姓名和出生的年份
SELECT ename,YEAR(birthday) FROM t_employee;

#查询员工中年龄最小的
SELECT MAX(birthday) FROM t_employee;
SELECT * FROM t_employee WHERE birthday = (SELECT MAX(birthday) FROM t_employee);

#查询每一个部门的人数
SELECT did, COUNT(*)
FROM t_employee
GROUP BY did;

/*
3、分组函数
AVG(x) ：求平均值
SUM(x)：求总和
MAX(x)：求最大值
MIN(x)：求最小值
COUNT(x)：统计记录数
*/
#查询全公司的平均薪资值
SELECT AVG(salary) FROM t_employee;
SELECT AVG(salary) AS 平均工资 FROM t_employee;

#查询全公司员工的实发工资的平均值
#实发工资 = salary * (1 + 奖金比例)
#select avg(实发工资) FROM t_employee;

SELECT AVG(salary * (1 + IFNULL(commission_pct,0)))  FROM t_employee;
SELECT AVG(salary * (1 + IFNULL(commission_pct,0))) AS 平均实发工资  FROM t_employee;


#查询公司一个月要给员工开多少工资
SELECT SUM(salary) FROM t_employee; #不考虑奖金
SELECT SUM(salary * (1 + IFNULL(commission_pct,0))) FROM t_employee; #考虑奖金

SELECT SUM(salary),SUM(salary * (1 + IFNULL(commission_pct,0))) FROM t_employee;
SELECT SUM(salary) AS 不考虑奖金工资总额,
       SUM(salary * (1 + IFNULL(commission_pct,0))) AS 考虑奖金的工资总额, 
      SUM(salary * (1 + IFNULL(commission_pct,0)))  - SUM(salary) AS 奖金总数
FROM t_employee;


#查询全工资最高工资值和最低工资值
SELECT MAX(salary),MIN(salary) FROM t_employee;
SELECT MAX(salary),MIN(salary),MAX(salary)-MIN(salary) FROM t_employee;


#统计全公司的员工总数
SELECT COUNT(*) FROM t_employee;
SELECT COUNT(1) FROM t_employee;
SELECT COUNT(eid) FROM t_employee;
SELECT COUNT(commission_pct) FROM t_employee;
/*
count(*)是对满足条件的（如果没有where条件，就是对所有记录）记录累加数量
count(常量值)等价于count(*)
count(字段名/表达式) 只统计非NULL值的记录数
*/


#查询所有男员工的最高薪资值
SELECT MAX(salary) FROM t_employee WHERE gender ='男';

#查询所有女员工的最高薪资值
SELECT MAX(salary) FROM t_employee WHERE gender ='女';

#查询所有男员工的人数
SELECT COUNT(*) FROM t_employee WHERE gender ='男';

/*
四、单行函数

1、数学函数

*/
SELECT CEIL(2.4),FLOOR(2.4),ROUND(2.56,1),TRUNCATE(2.56,1);

SELECT ROUND(5786544.567,2),FORMAT(5786544.567,2);

#查询全公司的平均薪资，显示小数点后2位
SELECT ROUND(AVG(salary),2) FROM t_employee;

/*
2、字符串函数
*/
SELECT 'hello' + 'world'; #+不是拼接
SELECT CONCAT('hello','world','java');
SELECT CONCAT('hello','world','java'),CONCAT_WS('-','hello','world','java');

#length求字节个数/长度
SELECT LENGTH('hello'); #ASCII表范围的字符，一个字符用1个字节
SELECT LENGTH('尚硅谷'); #mysql8默认编码是UTF8，一个汉字时3个字节

SELECT CHAR_LENGTH('尚硅谷'); #求字符个数/长度

#LOCATE(str1,str)或  POSITION(str1 in str)或  INSTR(str,str1)类似于Java中的indexOf函数
SELECT POSITION('o' IN 'hello'); #直接返回第几个，不是下标

#返回某个字符左边/右边的几个字符
SELECT LEFT('hello', 3),RIGHT('hello',3);

#trim系列
SELECT CONCAT('[', TRIM('    hello    world    '), ']');
SELECT CONCAT('[', LTRIM('    hello    world    '), ']');
SELECT CONCAT('[', RTRIM('    hello    world    '), ']');
SELECT CONCAT('[', TRIM(BOTH 'x' FROM 'xxxxhelloxxxxxworldxxxx'), ']');
SELECT CONCAT('[', TRIM(LEADING 'x' FROM 'xxxxhelloxxxxxworldxxxx'), ']');
SELECT CONCAT('[', TRIM(TRAILING 'x' FROM 'xxxxhelloxxxxxworldxxxx'), ']');

SELECT SUBSTRING_INDEX('www.atguigu.com', '.', 2);
SELECT SUBSTRING_INDEX('www.atguigu.com', '.', -2);
SELECT SUBSTRING_INDEX(SUBSTRING_INDEX('www.atguigu.com', '.', 2),'.',-1);

/*
3、日期时间函数
*/
SELECT CURDATE(),CURTIME(),NOW();

SELECT NOW(),UTC_TIME();

#查询这个月过生日的员工
SELECT ename,birthday
FROM t_employee
WHERE MONTH(birthday) = MONTH(CURDATE());

#查询40岁(含）以上(含）的员工
SELECT ename,birthday
FROM t_employee
WHERE YEAR(CURDATE()) - YEAR(birthday) >= 40;

#查询员工姓名和员工的生日中的 月和日
SELECT ename,CONCAT_WS('-',MONTH(birthday),DAY(birthday))
FROM t_employee;

#查询员工姓名和员工的生日中的 年和月
SELECT ename,EXTRACT(YEAR_MONTH FROM birthday)
FROM t_employee;


#看今天和员工的入职日期的间隔
SELECT ename,hiredate, DATEDIFF(CURDATE(),hiredate)
FROM t_employee;

#查询入职超过5年的员工
SELECT ename,hiredate,DATEDIFF(CURDATE(),hiredate)/365
FROM t_employee
WHERE DATEDIFF(CURDATE(),hiredate)>365*5;

#
SELECT DATE_FORMAT(CURDATE(), '%y-%c-%e');

/*
4、加密函数
*/
INSERT INTO t_user VALUES('chai',MD5('123456'));
INSERT INTO t_user VALUES('lin',SHA('123456')); 
#同一个表不要使用两种加密函数

#查询"chai"，密码是“123456”
SELECT * FROM t_user WHERE username='chai' AND PASSWORD=MD5('123456');
#查询"lin"，密码是“123456”
SELECT * FROM t_user WHERE username='lin' AND PASSWORD=MD5('123456');

/*
5、系统信息
*/
SELECT VERSION();
SELECT USER();
SELECT DATABASE();


/*
6、条件判断
（1）IF(value,t,f)：如果value是true,那么整个表达式的结果是t，否则就是f
（2）IFNULL(value1,value2)
（3）
CASE WHEN 条件1  THEN result1 
    WHEN 条件2  THEN result2 … 
    ELSE resultn 
END		相当于JAVA中if..else if...

（4）
CASE expr 
WHEN 常量值1  THEN 值1  
WHEN 常量值2  THEN 值2 …  
ELSE 值n 
END
*/
#查询员工，如果薪资高于15000，显示高薪，否则现在普通
SELECT ename,salary, IF(salary>15000,'高薪','普通')
FROM t_employee;

#查询奖金比例为NULL的员工的数量
SELECT COUNT(*) FROM t_employee WHERE commission_pct IS NULL;
SELECT SUM(IF(commission_pct IS NULL,1,0)) FROM t_employee;

#显示员工的姓名、奖金比例，如果奖金比例为NULL显示为0
SELECT ename, IFNULL(commission_pct,0) FROM t_employee;

/*
#查询员工编号，姓名，薪资，等级，等级根据薪资判断，
#如果薪资大于20000，显示“羡慕级别”，
#如果薪资15000-20000，显示“努力级别”，
#如果薪资10000-15000，显示“平均级别”
#如果薪资10000以下，显示“保底级别”
*/
SELECT eid,ename,salary, 
	CASE 
		WHEN salary > 20000 THEN '羡慕级别'
		WHEN salary > 15000 THEN '努力级别'
		WHEN salary > 10000 THEN '羡慕级别'
		ELSE '平均级别'
	END AS 等级
FROM t_employee;



#在“t_employee”表中查询入职7年以上的
#员工姓名、工作地点、轮岗的工作地点数量情况。
/*
计算工作地点的数量，转换为求 work_place中逗号的数量+1。
 work_place中逗号的数量 = work_place的总字符数 -  work_place去掉,的字符数
 work_place去掉, ，使用replace函数
 
   '北京,深圳'的字符个数是5，去掉,后字符是'北京深圳'个数是4，
   工作地点的数量：5-4+1
*/
SELECT ename,work_place,
   CHAR_LENGTH(work_place) - CHAR_LENGTH(REPLACE(work_place,',',''))+1
FROM t_employee;

/*
查询员工的工作地点情况
如果是常年在一个地方工作的，显示’只在一个地方工作‘
如果是常年在两个地方工作的，显示'在两个地方来回奔波'
如果是在三个地方工作，显示'在三个地方流动'
剩下的，显示'频繁出差'

*/
SELECT ename,work_place,
 CASE CHAR_LENGTH(work_place) - CHAR_LENGTH(REPLACE(work_place,',',''))+1
  WHEN 1 THEN '只在一个地方工作'
  WHEN 2 THEN '在两个地方来回奔波'
  WHEN 3 THEN '在三个地方流动'
  ELSE '频繁出差'
 END AS 工作地点情况描述
FROM t_employee;



/*
7、窗口函数
*/
#查询t_employee表，给每一条记录编号
SELECT ROW_NUMBER() over (), eid,ename
FROM t_employee;

#查询t_employee表，按照部门分组，给记录编号
SELECT ROW_NUMBER() over (PARTITION BY did),
	did,eid,ename
FROM t_employee;


#查询t_employee表，按照部门分组，按照薪资排序，给记录编号
SELECT ROW_NUMBER() over (PARTITION BY did ORDER BY salary) AS r1,
	RANK() over (PARTITION BY did ORDER BY salary)  r2,
	DENSE_RANK() over (PARTITION BY did ORDER BY salary) r3,
	did,salary,eid,ename
FROM t_employee;

#查询每一个部门薪资最低的员工
SELECT * FROM
(SELECT DENSE_RANK() over (PARTITION BY did ORDER BY salary) r3,
	did,salary,eid,ename
FROM t_employee) temp
WHERE r3=1;

#查询每一个部门薪资最高的员工
SELECT * FROM
(SELECT DENSE_RANK() over (PARTITION BY did ORDER BY salary DESC) r3,
	did,salary,eid,ename
FROM t_employee) temp
WHERE r3=1;

#查询每一个员工他前面一个员工的薪资
SELECT ename,salary,lag(salary,1)over()
FROM t_employee;



