-- 查询products表中'化妆品'的商品信息
SELECT * FROM products WHERE category_id = 'c003';

/*
  光看products表,我们其实并去不确定c003就是化妆品
  
  c003是从category表中来的
  
  c003不确实是啥,但是'化妆品'这三个字是确定的
  
  所以我们不能直接用c003作为条件
  
  我们应该根据化妆品查询对应的c003
*/

SELECT cid FROM category WHERE cname = '化妆品';

SELECT * FROM products WHERE category_id = (SELECT cid FROM category WHERE cname = '化妆品');

-- 查询products表中化妆品和家电的商品信息
SELECT * FROM products WHERE category_id IN ('c001','c003');

-- 我们不确定家电和化妆品的id是谁,所以我们应该先根据家电和化妆品将对应的id查询出来
SELECT cid FROM category WHERE cname IN ('家电','化妆品');

SELECT * FROM products WHERE category_id IN (SELECT cid FROM category WHERE cname IN ('家电','化妆品'));
