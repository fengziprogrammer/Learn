-- 查询products表中'化妆品'的商品信息
SELECT * FROM products WHERE category_id = 'c003'; 

/*
  我们单纯看products表,我们并不确定c003就一定是化妆品
  c003是category表来的
  所以c003应该是查询出来的数据
  
  c003不确定是化妆品,但是化妆品这三个字是确定的吧
  我们只需要根据化妆品从category中查询出对应的id,就可以了
*/
-- 先根据化妆品将id从category表中差出来
SELECT cid FROM category WHERE cname = '化妆品';

-- 再将上面的sql语句放到另外一个查询语句中做条件使用
SELECT * FROM products WHERE category_id = (SELECT cid FROM category WHERE cname = '化妆品');


-- 查询products表中化妆品和家电的商品信息
SELECT * FROM products WHERE category_id = 'c001' OR category_id = 'c003';
SELECT * FROM products WHERE category_id IN ('c001','c003');

SELECT cid FROM category WHERE cname IN ('家电','化妆品');

SELECT * FROM products WHERE category_id IN (SELECT cid FROM category WHERE cname IN ('家电','化妆品'));

