UPDATE product SET pname = '毛裤';

-- 将表中的秋裤改成袜子
UPDATE product SET pname = '袜子' WHERE pname = '秋裤';


-- 将pid为6的数据改成手机
UPDATE product SET pname = '手机' WHERE pid = 6;


-- 将pid不等于1的pname都改成平板
UPDATE product SET pname = '平板' WHERE pid!=1;