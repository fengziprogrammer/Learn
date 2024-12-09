-- 练习1：获取用户的姓名、性别，如果性别为1则显示'男'，否则显示'女'；要求使用if函数查询：
SELECT uname,age,IF(sex=1,'男','女') `sex` FROM t_user;

-- 练习2：获取用户的姓名、性别，如果性别为null则显示为0；要求使用ifnull函数查询
SELECT uname,age,IFNULL(sex,0) `sex` FROM t_user;

/*
  练习3：如果age<=12,显示儿童,如果age<=18,显示少年,如果age<=40,显示中年,否则显示老年
         CASE WHEN 条件1 THEN result1 WHEN 条件2 THEN result2 .... [ELSE resultn] END
*/
SELECT uname,
CASE WHEN age<=12 THEN '儿童' 
WHEN age<=18 THEN '少年' 
WHEN age<=40 THEN '中年' 
ELSE '老年' END `age`,IF(sex=1,'男','女') `sex` FROM t_user;