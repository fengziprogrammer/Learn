-- 查询化妆品的所有商品信息
SELECT * FROM category c,products p WHERE c.`cid` = p.`category_id` AND cname = '化妆品';

-- 先从category中查询出化妆品,作为伪表和products做联合查询
SELECT * FROM category WHERE cname = '化妆品';

SELECT * FROM (SELECT * FROM category WHERE cname = '化妆品') c,products p WHERE c.`cid` = p.`category_id`;


-- 查询所有化妆品和家电的商品信息
SELECT * FROM category c,products p WHERE c.`cid` = p.`category_id` AND cname IN ('家电','化妆品');

-- 先从category中查询出化妆品和家电的结果作为伪表,和products联合查询

SELECT * FROM category WHERE cname IN ('家电','化妆品');

SELECT * FROM (SELECT * FROM category WHERE cname IN ('家电','化妆品')) c,products p WHERE c.`cid` = p.`category_id`
