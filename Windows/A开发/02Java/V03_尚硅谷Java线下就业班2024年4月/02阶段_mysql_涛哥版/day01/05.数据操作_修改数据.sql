UPDATE category SET cname = '蔬菜';

-- 将表中的蔬菜改成家具
UPDATE category SET cname = '家具' WHERE cname = '蔬菜';

-- 将cid为6的数据改成手机
UPDATE category SET cname = '手机' WHERE cid = 6;

-- 将cid不等于1的canme都改成平板
UPDATE category SET cname = '平板' WHERE cid!=1;