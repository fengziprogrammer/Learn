-- 查询所有商品的具体信息
SELECT * FROM category,products;  -- 出现了笛卡尔乘积

SELECT * FROM category,products WHERE category.cid = products.category_id;

SELECT * FROM category c,products p WHERE c.cid = p.category_id;