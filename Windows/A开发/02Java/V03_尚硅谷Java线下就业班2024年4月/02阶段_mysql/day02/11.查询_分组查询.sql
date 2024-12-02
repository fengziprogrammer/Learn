-- 查询相同商品的价格总和
SELECT pname, SUM(price) FROM product GROUP BY pname;

-- 查询相同商品的价格总和并排序

SELECT pname,SUM(price) FROM product GROUP BY pname ORDER BY SUM(price) ASC;

SELECT pname,SUM(price) `newprice` FROM product GROUP BY pname ORDER BY newprice ASC;

-- 查询相同商品的价格总和,再展示出价格总和大于等于2000的商品


/*
  where关键字要写在group by前面,现在写在后面了,所以报错了
*/
SELECT pname,SUM(price) `newprice` FROM product GROUP BY pname WHERE newprice>=2000;

/*
  先走where,在走where的时候别名还没产生了,所以报错
*/
SELECT pname,SUM(price) `newprice` FROM product WHERE newprice>=2000 GROUP BY pname ;

/*
  执行where的时候,还没分组呢
  此时第一个果9是1块钱;第二个果9是1999,都没有到2000,所以直接被where筛掉了
  所以结果不对
*/
SELECT pname,SUM(price) `newprice` FROM product WHERE price>=2000 GROUP BY pname ;


SELECT pname,SUM(price) `newprice` FROM product GROUP BY pname HAVING newprice>=2000;
