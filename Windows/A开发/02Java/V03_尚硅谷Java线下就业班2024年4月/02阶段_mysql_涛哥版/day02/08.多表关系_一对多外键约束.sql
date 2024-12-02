    CREATE TABLE category (
      cid VARCHAR(32) PRIMARY KEY ,
      cname VARCHAR(50)
    );

    #商品表->从表
    CREATE TABLE products(
      pid VARCHAR(32) PRIMARY KEY ,
      pname VARCHAR(50),
      price DOUBLE,
      category_id VARCHAR(32)-- 外键  存储的是主表的主键内容
    );
    
    /*
      建立外键约束:
      格式:alter table 从表 add [constraint 外键名称(自定义)] foreign key 从表(外键列名) references 主表(主键列名)    
    */
    ALTER TABLE products ADD CONSTRAINT cp FOREIGN KEY products(category_id) REFERENCES category(cid);
    
    INSERT INTO category(cid,cname) VALUES (1,'蔬菜'),(2,'水果'),(3,'服装'),(4,'肉蛋');
    
    INSERT INTO products (pid,pname,price,category_id) VALUES (1,'黄瓜',5,1);
    INSERT INTO products (pid,pname,price,category_id) VALUES (2,'西红柿',4,1);
    INSERT INTO products (pid,pname,price,category_id) VALUES (3,'苹果',8,2);
    INSERT INTO products (pid,pname,price,category_id) VALUES (4,'牛仔裤',99,3);
    INSERT INTO products (pid,pname,price,category_id) VALUES (5,'鸡蛋',2,4);
    -- INSERT INTO products (pid,pname,price,category_id) VALUES (6,'洗衣机',1999,5);