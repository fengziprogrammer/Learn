-- 统计product的总记录数
SELECT COUNT(*) FROM product; -- 查询所有,表中有多少条记录,都统计出来
SELECT COUNT(pid) FROM product;
SELECT COUNT(0) FROM product; -- 即使有NULL也能统计
SELECT COUNT(1) FROM product; -- 即使有NULL也能统计
SELECT COUNT(pname) FROM product; -- 如果指定的列中有NULL,统计不出来

-- 查询所有商品的价格总和
SELECT SUM(price) FROM product;

-- 查询pid为1,3,7 商品的价格平均值
SELECT AVG(price) FROM product WHERE pid IN(1,3,7);


-- 查询商品的最高价格以及最低价格
SELECT MIN(price),MAX(price) FROM product;