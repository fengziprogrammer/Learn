CREATE TABLE product(
  pid INT PRIMARY KEY AUTO_INCREMENT,
  pname VARCHAR(50),
  price INT
);

INSERT INTO  product (pid,pname,price) VALUES (1,'Iphone13promax',8999);

INSERT INTO  product (pid,pname,price) VALUES (NULL,'Iphone14promax',7999);

INSERT INTO  product (pid,pname,price) VALUES (4,'Iphone15promax',9999);

INSERT INTO  product (pid,pname,price) VALUES (0,'Iphone12promax',5999);

INSERT INTO  product (pid,pname,price) VALUES (3,'Iphone11promax',3999);

INSERT INTO  product (pname,price) VALUES ('Iphone16promax',12999);

INSERT INTO  product  VALUES (NULL,'Iphone17promax',13999);

-- 删除数据
DELETE FROM product WHERE pid = 7;
/*
  如果主键为自增长,删除之后,再次添加,主键列数据不会重新编被删除的号
  会直接往下编号
*/
INSERT INTO  product  VALUES (NULL,'Iphone18promax',14999);

-- 摧毁表结构,清空数据
TRUNCATE TABLE product;
