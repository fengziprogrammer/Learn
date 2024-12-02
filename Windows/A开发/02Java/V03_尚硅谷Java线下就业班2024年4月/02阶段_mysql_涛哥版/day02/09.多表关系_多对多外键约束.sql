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

/*
  先给products和orderitem建立外键约束
  主表:products
  从表:orderitem
  
  alter table 从表 add [constraint 外键名称(自定义)] foreign key 从表(外键列名) references 主表(主键列名)
*/
ALTER TABLE orderitem ADD CONSTRAINT op FOREIGN KEY orderitem(pid) REFERENCES products(pid);

/*
  给orders和orderitem建立外键约束
  主表:orders
  从表:orderitem
*/
ALTER TABLE orderitem ADD CONSTRAINT oo1 FOREIGN KEY orderitem(oid) REFERENCES orders(oid);
