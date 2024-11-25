DELETE FROM category;

-- 删除cid为1的记录
DELETE FROM category WHERE cid = 1;

-- 删除cid>=5的记录
DELETE FROM category WHERE cid>=5;

-- 删除cid不等于3的记录
DELETE FROM category WHERE cid!=3;

DELETE FROM category WHERE cid<>3;

DELETE FROM category WHERE NOT (cid = 3);