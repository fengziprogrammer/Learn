CREATE TABLE product(
  pid INT PRIMARY KEY AUTO_INCREMENT,
  pname VARCHAR(50) NOT NULL,
  price DOUBLE
);

INSERT INTO product (pname,price) VALUES ('拯救者y9000p',9000);


-- 相当于String s = null
-- INSERT INTO product (pname,price) VALUES (NULL,10000);


-- 相当于String s = ""
INSERT INTO product (pname,price) VALUES ('',8000);


-- 相当于 String s = "null"
INSERT INTO product (pname,price) VALUES ('null',7000);
