/*
第11章数据类型
1、整数类型
*/
CREATE TABLE t1(
   i1 INT,
   i2 INT(5),
   i3 INT(5) UNSIGNED ZEROFILL
);

INSERT INTO t1 VALUES(25,25,25);
INSERT INTO t1 VALUES(250000,250000,250000);


CREATE TABLE t2(
  f1 FLOAT,
  f2 DOUBLE,
  f3 DECIMAL #没有指定(M,D)值保留整数部分
);

INSERT INTO t2 VALUES(1.256, 1.256, 1.256);


CREATE TABLE t3(
  f1 FLOAT(5,2),  #(M,D)表示总位数不能超过5位，小数点后面2位
  f2 DOUBLE(5,2),
  f3 DECIMAL(5,2) 
);

INSERT INTO t3 VALUES(1.256, 1.256, 1.256);
INSERT INTO t3 VALUES(1222.256, 1222.256, 1222.256);
/*
Out of range value（超出范围） for column 'f1' at row 1

(5,2)：只能存在-999.99 ~ 999.99
*/

CREATE TABLE t4(
   b1 BIT, #默认是1位二进制
   b2 BIT(4)
);
INSERT INTO t4 VALUE(8,8);
/*
Data too long（数据太长了） for column 'b1' at row 1
8的二进制 1000
*/

INSERT INTO t4 VALUE(1,8);


/*
2、字符串类型
char：定长
varchar：边长

例如：	张
char(2)，分配2个字符的宽度
varchar(2)，分配1个字符的宽度，加1个字节（记录字节总数）
*/
CREATE TABLE t5(
   c1 CHAR, #没指定宽度，默认是1个字符
   c2 CHAR(2),
   #c3 varchar,  在mysql中varchar必须指定宽度，表示最多不能超过多少个字符
   c4 VARCHAR(2)
);

INSERT INTO t5 VALUES('张','张','张');
INSERT INTO t5 VALUES('张三','张三','张三');
/*
Data too long for column 'c1' at row 1
*/
INSERT INTO t5 VALUES('a','a','a');
SELECT * FROM t5 WHERE c1 = 'A';

INSERT INTO t5 VALUES('b','柴','柴');

CREATE TABLE t6(
    gender ENUM('男','女'),
    hobby SET('睡觉','打游戏','泡妞','写代码')
);

INSERT INTO t6 VALUES('男', '打游戏,睡觉');
#INSERT INTO t6 VALUES('妖', '打游戏,睡觉'); #错误
INSERT INTO t6 VALUES('男', '睡觉,打游戏,泡妞,写代码');


CREATE TABLE t7(
   b1 BINARY, #没有指定(M)，默认是(1) 这个1是1个字节
   b2 VARBINARY(3) #没有指定(M)，报错，必须指定(M)
);

INSERT INTO t7 VALUES('a','a');

INSERT INTO t7 VALUES('a','尚');
SELECT * FROM t7 WHERE b1 = 'A';

INSERT INTO t7 VALUES('b','柴');

CREATE TABLE t8(
	b BLOB,
	t TEXT
);

/*
日期时间类型
*/
CREATE TABLE t9(
	d1 DATETIME,
	d2 TIMESTAMP
);

INSERT INTO t9 VALUES('2021-9-2 14:45:52','2021-9-2 14:45:52');

SET time_zone = '+9:00';