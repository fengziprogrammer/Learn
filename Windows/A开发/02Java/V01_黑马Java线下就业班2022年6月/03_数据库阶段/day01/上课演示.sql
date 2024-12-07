0.创建数据库练习
	1.直接创建数据库db3
	create database db1; ***
	2.判断是否存在并创建数据库db4
	create database if not exists db4; ***
	3.查看所有的数据库
	show databases;
	4.删除db3数据库
	drop database db3;
	5.查看正在使用的数据库
	select database();
	6.使用db4数据库
	use db4;  *****
	
1.创建表练习
- 需求：设计一张学生表，请注重数据类型、长度的合理性

	1.编号
	2.姓名，姓名最长不超过10个汉字
	3.性别，因为取值只有两种可能，因此最多一个汉字
	4.生日，取值为年月日
	5.入学成绩，小数点后保留两位
	6.邮件地址，最大长度不超过 64
	7.家庭联系电话，不一定是手机号码，可能会出现 - 等字符
	8.学生状态（用数字表示，正常、休学、毕业...）

create table student(
	-- 1.编号 id表示字段名或者列名 int表示数据类型是整数
	id int,
	-- 2.姓名，姓名最长不超过10个汉字
	-- 对于字符类型使用varchar，使用格式： varchar(字符的最大长度)
	name varchar(10),
	-- 3.性别，因为取值只有两种可能，因此最多一个汉字
	-- varchar一般是不确定字符长度时使用，char一般是确定字符长度时使用
	sex char(1),
	-- 4.生日，取值为年月日
	birthday date,
	-- 5.入学成绩，小数点后保留两位
	-- double(5,2) 表示数值位最多是5位，小数点后面保留2位 3.14
	score double(5,2),
	-- 6.邮件地址，最大长度不超过 64
	email varchar(64),
	-- 7.家庭联系电话，不一定是手机号码，可能会出现 - 等字符
	tel varchar(15),
	-- 8.学生状态（用数字表示，正常0、休学1、毕业2...）
	status int

);
----------------------------------------------------------------------------------
注意：数据表是存在数据库下面的，所以创建数据表之前必须先切换具体的数据库
----------------------------------------------------------------------------------




2.更改表练习
	-- 1.修改student表名为stu
	alter table student rename to stu;
	-- 2.给学生表添加一列remark，类型为varchar(20)
	alter table stu add  remark varchar(20);
	-- 3.修改remark列的类型是varchar(100)
	alter table stu modify remark varchar(100);
	-- 4.修改remark列的名变为intro,类型varchar(30)
	alter table stu change remark intro varchar(30);
	-- 5.删除intro列
	alter table stu drop intro;
3.添加数据
	-- 1.创建表 老师上课复制，同学们你们需要一个一个写

create table student2
(
  id       int,
  name     varchar(20),
  age      int,
  birthday date,
  sex      char(2),
  address  varchar(100)
);
-- 2.插入部分数据，给id name age sex赋值
-- 2.1 在sql语句中如果操作的数据是字符串类型，可以使用双引号也可以使用单引号，建议使用单引号
-- 2.2 如果给数据表插入部分列必须将对应的列名书写出来
insert into student2(id, name, age, sex)
values (1, '锁哥', 18, "男");

/*
  1.在mysql中插入字符数据，数据使用单引号或者双引号都可以，建议使用单引号
  2.在mysql中插入的数据是date类型，那么必须将数据书写在单引号或者双引号都可以
*/

-- 3.插入所有的字段，不写字段名
-- 3.1 运行选中sql语句：ctrl+enter
insert into student2
values (2, '柳岩', 20, '1999-10-10', '女', '湖南');

-- 4.插入所有的字段，写出字段名
insert into student2(id, name, age, birthday, sex, address)
values (3, '杨幂', 20, '1999-10-10', '女', '北京');
-- 5.批量插入数据
-- 批量插入数据，只有一个values，每组值书写在小括号中，并使用逗号分隔
insert into student2(id, name, age, birthday, sex, address)
values (4, '李沁', 20, '1999-10-10', '女', '北京'),
       (5, '赵丽颖', 19, '1999-10-10', '女', '北京');
-- 插入数据注意
-- 6.插入数据时 省略列名，那么如果不需要给列赋值那么使用null
insert into student2
values (6, null, null, '1999-10-10', '女', '北京'),
       (7, '赵丽颖', 21, '1999-10-10', '女', '北京');

insert into student2
values (10, null, null, 19991002, '女', '北京');


-- 4.修改数据

-- 1.修改数据：修改性别都变为男
update student2
set sex='男';
-- 2.修改数据：带条件修改id是2的学生性别变为女
-- 修改语法： update 表名 set 字段名=字段值,字段名=字段值,... where 条件; where 条件可以书写也可以不书写
update student2
set sex='女'
where id = 2;

-- 3.一次修改多个列，把id为3的学生，年龄改成26岁，address改成上海
update student2
set address ='上海',
    age=26
where id = 3;

-- 5.删除数据
	-- 1.带条件删除数据，删除id是3的记录
  delete from student2 where id=3;
	-- 2.带条件删除数据，删除id是1和2的记录   id in(1,2) : 表示id的值是1或者2
	-- 在sql语句中如果条件是多个值的时候可以考虑使用in关键字，使用格式： 字段名 in(值1,值2,...);
 delete from student2 where id in(1,2);

	-- 3.不带条件删除
	  -- 3.1 使用DML的delete删除
	  delete from student2;

	-- 还可以使用：DDL
	-- 这里的table可以省略
  -- 如果是清除表的所有数据，建议使用truncate，如果删除部分数据，使用delete
  -- 清除整张表数据使用truncate原理是先销毁整张数据表，然后重新创建一张和原来结构一样的数据表(空表)
  -- delete 删除所有数据是一行一行删除
  -- DDL中删除表的语句：drop table 表名; 删除整张表，表不在了，不能操作了
  truncate table student2;
  drop table stu;


-- 6.查询数据


	-- 1.查询多个字段
	-- * 表示所有字段
  select * from student2;
	-- 2.写出查询每列的名称 select 字段名,字段名,... from 表名
  select id,name,age,birthday,sex,address from student2;
  select id,name,age from student2;
	-- 3.查询表中name和age列，name列的别名为姓名，age列的别名为年龄
	-- 使用as起给字段和表起别名
	-- as可以省略
	-- 格式： 字段名 as 别名      表名  as 别名
  select name as 姓名,age 年龄 from student2;

	-- 4.去重
	-- 对age去重
	select distinct age from student2;
	-- 对age和address去重
	-- 如果多个字段一起去重，如果所有的字段值全部一样才会去重
  select distinct age,address from student2;
  select  distinct age,address,name from student2;


-- 7.带条件的查询
	-- 1.查询数学成绩大于80学生
  select * from student2 where math > 80;
	-- 2.查询英语成绩小于等于80学生
  select * from student2 where english <= 80;
	-- 3.查询年龄等于20的学生
  select * from student2 where age=20;
	-- 4.查询年龄不等于20的学生
  select * from student2 where age!=20;
  select * from student2 where age<>20;

	-- 5.查询年龄大于35并且性别是男的学生
  select * from student2 where age > 35 and sex='男';
	-- 6.查询年龄大于35或者性别是男的学生
   select * from student2 where age > 35 || sex='男';
   select * from student2 where age > 35 or  sex='男';
	-- 7.查询id是1 3 5的学生
  select * from student2 where id in(1,3,5);

	-- 8.查询id不是1 3 5的学生
	-- not in 是in的取反，表示不在什么其中
  select * from student2 where id not in(1,3,5);
	-- 范围查询
	-- 9.英语成绩在75和90之间
	-- 语法格式：字段名 between 值 and 值
  -- 包含两个值
	select * from student2 where english between 75 and 90;


	-- 模糊查询 使用like
	-- 10.查询姓赵的学生
	-- name like '赵%' 表示name的值以赵开始，后面是什么都可以
	-- %在模糊查询中表示任意多个的字符
	  select * from student2 where name like '赵%'; -- % 匹配大于等于0的任意字符


	-- 11.查询包含岩
	-- name like '%岩%' 表示name的值只要含有岩即可，前后%表示匹配任意多个字符
  select * from student2 where name like '%岩%';

	-- 12.查询姓赵并且是三个字的学生
	-- _下划线在模糊查询中表示任意单个字符
  -- 赵__ :表示以赵开始的三个字符
  -- _赵_ :表示以查询第二个字符是赵的三个字的内容
 select * from student2 where name like '赵__';

	-- 排序
	-- desc表示降序
	-- 13.按照年龄降序排序
  -- 使用格式：order by 字段名 desc/asc
  select * from student2 order by age desc;
	-- 14.先按照年龄降序排序，如果年龄相同在按照数学降序排序
	/*
	  order by age desc,math desc
	    结果：
	      age   math
	      40    80
	      36    100
	      20    90
	      20    80
	    分析：
	      1.先按照age值排序，如果age值不相等，则不会向后进行排序即不会对math排序了，只会看age值
	      2.如果age值相同，则继续向后比较，即对math降序排序
	*/
  select * from student2 order by age desc,math desc;
	-- 15.先按照年龄降序排序，如果年龄相同在按照数学升序排序
  select * from student2 order by age desc,math asc;
  select * from student2 order by age desc,math; -- 默认是升序的asc，结果和上述一致

	-- 聚合函数
	-- 16.查询学生总数即有多少名学生 使用聚合函数：count(列名)
  select count(id) from student2; -- 4
  select count(english) from student2; -- 3 english的某一行为null，聚合函数对null不进行统计
  select count(*) from student2; -- 4 建议使用这个
	-- 17.查询数学成绩总分数
  select sum(math) from student2;
	-- 18.查询数学成绩最高分数
  select max(math) from student2;
  -- 求英语平均值 56.6667  170/3
   select avg(english) from student2;
	-- 19.统计数学和英语总和值
	-- 实现一：分别统计数学和英语的每个总成绩，然后进行相加
  -- sum(math) 统计math这一列总和值
  -- sum(english) 统计english这一列总和值
  -- sum(math)+sum(english) 将math和english总和值进行相加
  select sum(math)+sum(english) from student2; -- 520

	-- 实现二：分别统计每个人的数学和英语成绩，然后将每个人的数学和英语成绩相加
	select sum(math+english) from student2; -- 430 少了id是4的math90
	/*
		结果是：430少了4的math90
		sum(math+english)：
		问题原因：
      id是1的总成绩：100+90==》190
      id是2的总成绩：80+30==》110
      id是3的总成绩：90+null==》null ,在sql语句中null任何值相互运算值是null,也就是说id是3这一行总成绩是null,对于聚合函数
      sum不会统计null，所以这里丢失了数据90


		解决上述问题：使用mysql自带函数：ifnull(字段值,默认值)
		说明：
			ifnull(字段值,默认值)
				如果字段值是null，那么使用默认值作为ifnull函数的整体结果
				如果字段值不是null，那么使用字段值作为ifnull函数的整体结果
			举例：
			ifnull(english,0)：
				1）假设english的值是null===>ifnull(null,0)===>整体结果是0
				2）假设english的值是80===>ifnull(80,0)===>整体结果是80
	*/
select sum(ifnull(math,0)+ifnull(english,0)) 总成绩 from student2; -- 520


-- 分组
		-- 准备数据
		create table car(
			id int,
			color char(2),
			price float
		);

		insert into car(id,color,price) values(1,'黄色',16);
		insert into car(id,color,price) values(2,'黄色',16);
		insert into car(id,color,price) values(3,'蓝色',5);
		insert into car(id,color,price) values(4,'红色',60);
		insert into car(id,color,price) values(5,'白色',8);
		insert into car(id,color,price) values(6,'红色',60);

    -- 1.查询每种颜色车辆的总价
  select color,sum(price) from car group by color;
		-- 2.查询每种颜色车辆总价大于30车辆的颜色和总价
		-- 说明：在sql语句中where后面不能使用聚合函数 where sum(price)>30  是错误的
    -- select color,sum(price) from car where sum(price)>30 group by color;
    /*
      如果想分组之后使用聚合函数作为条件，我们可以使用having关键字。
      使用格式：
        group by 分组的字段名 having 分组之后的条件
     */
    select color,sum(price) from car group by color having  sum(price)>30 ;
		-- 3.注意：分组查询的结果最好是分组字段和聚合函数，不要是其他字段
		/*
		    id  color  sum(price)
		    4   红色    120
		    说明：上述结果中不正确，因为color红色的id不仅仅有4还有6
		 */
    select id,color,sum(price) from car group by color having  sum(price)>30 ;
		-- 4.where后面不能使用聚合函数 报错的
    select color,sum(price) from car where sum(price)>30 group by color;


		-- 小结：where是在分组前筛选，having是在分组后筛选
		-- 5.查询车的单价大于15的每种颜色车辆总价大于30车辆的颜色和总价
    select color,sum(price) from car where price > 15 group by color having sum(price) > 30;


-- 分页
		-- 1.分页查询数据，每页显示2条数据
		-- 第一页
		-- 0 表示起始索引，对应第一行数据
		-- 2表示每页显示2条数据
  select * from car limit 0,2;
  	-- 第2页
		-- 2 表示起始索引，对应第三行数据
		-- 2表示每页显示2条数据
  select * from car limit 2,2;

  -- 第3页
		-- 4 表示起始索引，对应第五行数据
		-- 2表示每页显示2条数据
  select * from car limit 4,2;
		-- 当起始索引是0的情况下可以不写索引0，写法如下，
		-- 下面的2表示每页显示的数据行数
  select * from car limit 2; -- 这里省略了第一个参数起始索引
    -- 第4页
		-- 6表示起始索引，对应第七行数据
		-- 2表示每页显示2条数据
  -- 注意：最后一页显示的数据条数有可能和前面的页不一致，剩下几行数据就会显示几行数据
  select * from car limit 6,2;



			/*
			  第一页： select * from car limit 0,2;
			  第二页： select * from car limit 2,2;
			  第三页： select * from car limit 4,2;
      说明：当前页码 就是当前位于第几页
				公式： 起始索引  = （当前页码-1）*每页显示的条数
					      0		            1		          2
					      2		            2		          2
					      4		            3		          2
			*/