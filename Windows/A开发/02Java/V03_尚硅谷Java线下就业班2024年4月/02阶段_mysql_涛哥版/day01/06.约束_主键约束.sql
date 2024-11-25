CREATE TABLE product(
  pid INT PRIMARY KEY,
  pname VARCHAR(10),
  price INT
  
);

INSERT INTO product (pid,pname,price) VALUES (1,'Iphone12',6999);

INSERT INTO product (pid,pname,price) VALUES (1,'HUAWEIP60',6999);-- 错误,主键列不能重复

INSERT INTO product(pid,pname,price) VALUES (2,'XIAOMI13',5999);

INSERT INTO product(pid,pname,price) VALUES (NULL,'OPPOFINDX6',4999);-- 错误,主键列不能为NULL


-- 在constraint约束区域,去指定主键约束
CREATE TABLE product(
  pid INT,
  pname VARCHAR(10),
  price INT,
  PRIMARY KEY (pid)
);

/*
通过修改表结构的方式

1.格式:ALTER TABLE 表名 ADD [CONSTRAINT 名称] PRIMARY KEY (字段列表)
2.注意:[CONSTRAINT 名称]可以省略不写
*/
CREATE TABLE product(
  pid INT,
  pname VARCHAR(10),
  price INT
);
ALTER TABLE product ADD CONSTRAINT pk PRIMARY KEY (pid);
