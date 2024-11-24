DELETE FROM product;
-- 删除pid为1的记录
DELETE FROM product WHERE pid = 1;

-- 删除pid>=5的记录
DELETE FROM product WHERE pid>5;

-- 删除pid不等于3的记录
DELETE FROM product WHERE pid !=3;

DELETE FROM product WHERE pid <> 3;

DELETE FROM product WHERE NOT (pid=3);