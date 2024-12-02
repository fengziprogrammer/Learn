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
     格式:alter table 从表 add [constraint 外键名称(自定义)] 
     foreign key 从表(外键列名) references 主表(主键列名)    
    */
    ALTER TABLE products ADD CONSTRAINT cp1 FOREIGN KEY products(category_id) REFERENCES category(cid);
    

# 订单表 -> 主表
 CREATE TABLE `orders`(
  `oid` VARCHAR(32) PRIMARY KEY ,
  `totalprice` DOUBLE 	#总计
  );
   
#订单项表->中间表->从表
CREATE TABLE orderitem(
  pid VARCHAR(50),-- 商品id->外键
  oid VARCHAR(50)-- 订单id ->外键
);

-- 商品表和中间表做
ALTER TABLE orderitem ADD CONSTRAINT po1 FOREIGN KEY orderitem(pid) REFERENCES products(pid);

-- 订单表和中间表做
ALTER TABLE orderitem ADD CONSTRAINT po2 FOREIGN KEY orderitem(oid) REFERENCES orders(oid);


