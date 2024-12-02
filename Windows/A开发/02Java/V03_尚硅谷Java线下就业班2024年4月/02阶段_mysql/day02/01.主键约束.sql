CREATE TABLE product(
   pid INT PRIMARY KEY,
   pname VARCHAR(10),
   price INT
   
);

INSERT INTO product (pid,pname,price) VALUES (1,'丝袜',9);
-- INSERT INTO product (pid,pname,price) VALUES (1,'内裤',50);主键列数据不能重复
-- INSERT INTO product (pid,pname,price) VALUES (NULL,'背心',10);主键列数据不能为NULL

DROP TABLE product;

CREATE TABLE product(
   pid INT,
   pname VARCHAR(10),
   price INT,
   PRIMARY KEY (pid)   
);


#=====================
CREATE TABLE product(
   pid INT,
   pname VARCHAR(10),
   price INT  
);
 -- ALTER TABLE 表名 ADD [CONSTRAINT 名称] PRIMARY KEY (字段列表)
 ALTER TABLE product ADD PRIMARY KEY (pid);


