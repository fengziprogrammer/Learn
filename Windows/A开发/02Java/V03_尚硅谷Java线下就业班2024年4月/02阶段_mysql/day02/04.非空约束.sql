CREATE TABLE product(
  pid INT PRIMARY KEY AUTO_INCREMENT,
  pname VARCHAR(10) NOT NULL
);

INSERT INTO product (pname) VALUES ('丝袜');

-- 好比是 String s = null
INSERT INTO product (pname) VALUES (NULL); -- pname不能为NULL


-- 好比是 String s = "null"
INSERT INTO product (pname) VALUES ('null');

-- 好比是 String s = ""
INSERT INTO product (pname) VALUES ('');
