-- a.insert into 表名 (列名,列名)  values (值1,值2);

/*
  INSERT INTO product (pid,pname,price) VALUES (1,"裤衩",50);
  
  用java代码表示sql语句
    String sql = "INSERT INTO product (pid,pname,price) VALUES (1,'裤衩',50);"
    
*/
INSERT INTO product (pid,pname,price) VALUES (1,'裤衩',50);
INSERT product (pid,pname,price) VALUES (2,'背心',25);

INSERT product (pid,pname,price) VALUES (3,'内裤',80),(4,'丝袜',9),(5,'拖鞋',150);

INSERT product VALUES (6,'秋裤',55);