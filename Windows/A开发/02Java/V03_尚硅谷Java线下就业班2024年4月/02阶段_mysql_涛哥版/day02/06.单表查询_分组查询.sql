-- 查询相同商品的价格总和
#select pname,sum(price) from product;
SELECT pname,SUM(price) `newprice` FROM product GROUP BY pname;

-- 查询相同商品的价格总和并排序

/*
  先查询后排序
  先执行查询,在查询结果的基础上进行排序
  但是查询之后的结果,价格列叫做newprice
  所以我们可以按照newprice去排序
*/
-- SELECT pname,SUM(price) `newprice` FROM product GROUP BY pname order by price;
SELECT pname,SUM(price) `newprice` FROM product GROUP BY pname ORDER BY `newprice`;

-- 查询相同商品的价格总和,再展示出价格总和大于等于2000的商品
/*
   where应该写在group by前面
*/
SELECT pname,SUM(price) `newprice` FROM product GROUP BY pname WHERE `newprice` >= 2000;

/*
  Unknown column 'newprice' in 'where clause'
  
  先执行where,执行where的时候newprice还没出来呢,所以报错
  
*/
SELECT pname,SUM(price) `newprice` FROM product WHERE `newprice` >= 2000 GROUP BY pname;


/*
   结果不对
   因为上来执行where的时候直接按照分组之前的结果筛选
   此时果9还没进行分组,所以直接将果9筛除了
*/
SELECT pname,SUM(price) `newprice` FROM product WHERE price >= 2000 GROUP BY pname;

/*
  我们应该找一个在分组查询之后筛选的条件关键字
  所以我们选择用having,having关键字既在分组之后写,还在分组之后查询
*/
SELECT pname,SUM(price) `newprice` FROM product GROUP BY pname HAVING `newprice` >= 2000;
