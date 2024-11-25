CREATE TABLE persons(
  firstname VARCHAR(10), -- 名
  lastname VARCHAR(10), -- 姓
  address VARCHAR(10), -- 地址
  city VARCHAR(10), -- 城市
  PRIMARY KEY (firstname,lastname)
);

INSERT INTO persons (firstname,lastname,address,city) VALUES ('岩','柳','长沙','湖南');

INSERT INTO persons (firstname,lastname,address,city) VALUES ('岩','于','长沙','湖南');


-- 下面的sql语句是错误的,因为firstname和lastname为联合主键,两个列中的数据不能完全一样
-- INSERT INTO persons (firstname,lastname,address,city) VALUES ('岩','于','长沙','湖南');

INSERT INTO persons (firstname,lastname,address,city) VALUES ('涛','于','霸州','廊坊');


-- 主键列数据不能为NULL
INSERT INTO persons (firstname,lastname,address,city) VALUES (NULL,'于','霸州','廊坊');