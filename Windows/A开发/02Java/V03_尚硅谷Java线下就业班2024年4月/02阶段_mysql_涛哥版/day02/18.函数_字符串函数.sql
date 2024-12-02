/*
  concat(str1, str2, ...)
  字符串连接函数，可以将多个字符串进行连接
  
  concat_ws(separator, str1, str2, ...)->可以指定间隔符将多个字符串进行连接
*/
-- 拼接字符串练习 练习1：使用concat函数显示出 你好uname 的结果

SELECT CONCAT('你好',uname) `name`,age,sex FROM t_user;

-- 练习2：使用concat_ws函数显示出 你好,uname 的结果
SELECT CONCAT_WS(',','你好',uname) `name`,age,sex FROM t_user


-- 将hello转成大写
SELECT UPPER('abcdefg');

-- 查询t_user,uname变成大写
SELECT UPPER(uname) `name`,age,sex FROM t_user;


SELECT LOWER(uname) `name`,age,sex FROM t_user;

-- 将用户id为9的用户的姓名的两边空白符移除
SELECT TRIM(uname) `name`,age,sex FROM t_user;

/*
  功能一样:
    substr(str, pos)
    substring(str, pos)
    
    str:要截取的字符串
    pos:从第几个字符开始截取
    
  功能一样  
    substr(str, pos, len)
    substring(str, pos, len)  
  
  str:要截取的字符串
  pos:从第几个字符开始截
  len:截多少个
*/

SELECT SUBSTRING('abcdefg',2);

SELECT SUBSTRING('abcdefg',2,2);



