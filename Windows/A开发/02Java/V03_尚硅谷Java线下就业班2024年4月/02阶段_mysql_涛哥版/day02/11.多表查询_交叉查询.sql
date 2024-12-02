-- 查询所有商品的具体信息
SELECT * FROM category,products WHERE category.`cid` = products.`category_id`;