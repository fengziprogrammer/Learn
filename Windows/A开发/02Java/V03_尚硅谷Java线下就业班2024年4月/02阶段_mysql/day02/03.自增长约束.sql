CREATE TABLE category(
  cid INT PRIMARY KEY AUTO_INCREMENT,
  cname VARCHAR(10)
);

INSERT INTO category (cid,cname) VALUES (3,'服装');

INSERT INTO category (cid,cname) VALUES (NULL,'服装');

INSERT INTO category (cid,cname) VALUES (0,'箱包');

INSERT INTO category (cname) VALUES ('居家');

INSERT INTO category VALUES (NULL,'家电');

DELETE FROM category WHERE cid = 7;

DELETE FROM category;

TRUNCATE TABLE category;



