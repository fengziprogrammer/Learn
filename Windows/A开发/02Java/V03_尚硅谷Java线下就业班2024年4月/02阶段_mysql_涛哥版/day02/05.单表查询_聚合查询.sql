-- 统计product的总记录数
SELECT COUNT(*) FROM product;
SELECT COUNT(pid) FROM product;
SELECT COUNT(0) FROM product;-- 可以统计带NULL的数据
SELECT COUNT(1) FROM product;-- 可以统计带NULL的数据

SELECT COUNT(pname) FROM product; -- 不统计NULL的数据


-- 查询所有商品的价格总和
SELECT SUM(price) FROM product;

-- 查询pid为1,3,7 商品的价格平均值
SELECT AVG(price) FROM product WHERE pid IN(1,3,7);


-- 查询商品的最高价格以及最低价格
SELECT MAX(price),MIN(price) FROM product;