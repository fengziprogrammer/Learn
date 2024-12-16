/*
第15章 事务

1、什么是事务？
事务是指一组sql操作要么一起成功后提交，要么一起失败后回滚。

例如：
 张三  账号余额是500
 李四  账号余额是500
 张三要给李四转账，转100元。
 
 张三的余额减少100，李四的余额要增加100。
 这两个操作要么一起成功，要么一起失败。
 一起成功：
   张三  账号余额是400
   李四  账号余额是600
 不允许出现：
   张三  账号余额是400
   李四  账号余额是500
 不允许出现：
    张三  账号余额是500
    李四  账号余额是600
 一起失败：
   张三  账号余额是500
   李四  账号余额是500 
   
2、如何提交事务，和回滚事务？
提交事务：commit
回滚事务：rollback

3、mysql中默认事务是自动提交的。
如果需要手动提交和回滚，那么需要设置手动提交模式，或者开始事务。

（1）设置手动提交模式
set autocommit = false;
要注意，每次操作完之后，要记得手动commit，否则就没有正式的生效。

（2）默认还是自动提交模式，只是临时开启一个事务。
start transaction;
  这一段sql需要手动处理提交或回滚。
rollback; commit;

下面仍然是自动提交模式。

*/
SET autocommit = FALSE;

DELETE FROM stu WHERE sid = 1001;
ROLLBACK;

INSERT INTO stu VALUES (NULL,'沈彦');
COMMIT;


SET autocommit = TRUE;
START TRANSACTION; #开始事务

DELETE FROM stu;

ROLLBACK;

DELETE FROM stu WHERE sid = 1004;

/*
所有的DDL语句，不支持事务。
create ,drop, truncate，alter 等语句不支持事务。
只有insert,update,delete支持事务。
select不影响数据，所以是否支持事务没什么问题。
*/

START TRANSACTION;

CREATE TABLE temp(id INT);


ROLLBACK;

/*
删除整个表的数据有两种方式：
(1)delete from 表名称;
(2)truncate 表名称; 截断表

区别：
（1）delete效率没有truncate高
因为delete是一条语句一条语句的删除的，
而truncate是把整个表drop表，新建一张新表。
（2）delete支持事务，而truncate不支持事务。
*/

START TRANSACTION;

DELETE FROM stu;

ROLLBACK;


START TRANSACTION;

TRUNCATE stu;

ROLLBACK;

/*
事务的隔离级别：
如果多个客户端同时操作同一个库的同一个表，就是多线程的并发问题。
如果多个客户端对数据都有修改操作，那么是有安全问题的。


*/
