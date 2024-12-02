-- 查询具体的商品信息->隐式内连接
SELECT * FROM category c,products p WHERE c.`cid` = p.`category_id`;

-- 查询具体的商品信息->显示内连接
SELECT * FROM category c JOIN products p ON c.`cid` = p.`category_id`;


-- 用显示内连接的方式查询"化妆品"的商品信息



/*
   on  条件1  and  条件2  -> 条件1和条件2是一个整体条件,是一个大条件
   
*/
SELECT * FROM category c JOIN products p ON c.`cid` = p.`category_id` AND cname = '化妆品';


/*
  on 条件1 where 条件2  -> 两个条件,经过了两次过滤
*/
SELECT * FROM category c JOIN products p ON c.`cid` = p.`category_id` WHERE cname = '化妆品';