CREATE TABLE product(
  pid INT PRIMARY KEY AUTO_INCREMENT,
  pname VARCHAR(50) UNIQUE,
  price DOUBLE
);

INSERT INTO product (pname,price) VALUES ('拯救者y9000p',9000);

-- INSERT INTO product (pname,price) VALUES ('拯救者y9000p',1000);pname不能重复