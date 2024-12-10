use db3;

/*
mysql���ݿ�Ĭ�ϣ� һ��SQL�����ǻ��Զ��ύ���������ݳ־ø��£�

���� �߼���Ԫ����������������д����SQL��䣬��ЩSQL������һ�����壬Ҫôȫ���ɹ���Ҫôȫ��ʧ�ܡ�

*/
-- �����ʹ�ò������ƣ�
# 1����������
# 2��ִ�ж���SQL��䣨ҵ�������
# 3���ύ���� | �ع�����



/* MySQL���ݿ��������ƣ�
   1���Զ��ύ ��Ĭ�ϣ�
       ÿִ��һ��SQL��䣬�Ϳ���һ������SQL�ύ��ɣ������ύ ��һ��SQLһ������
   2���ֶ��ύ ��Ҫд���룩
       �ȿ������� �� ��ִ��SQL��䣨���Զ��У� �� �ύ���񣨻ع���
*/


-- �����˺ű�
create table account(
    id int primary key auto_increment,
    name varchar(20),
    money double
);

-- ��������
insert into account values (null,'С��',1000);
insert into account values (null,'�仨',1000);


-- ��������� ת��ʧ��
  # 1����������
  start transaction ;

  # 2��ִ��ת�˲���
  -- ����
  update account set money = money-500 where name='С��';
  -- ����
  update account set money = money+500 where name='�仨';

  # 3���ع�����
  rollback ;




-- ��������� ת�˳ɹ�
  # 1����������
  start transaction;
  # 2��ִ��ת�˲���
  -- ����
  update account set money = money - 500 where name='С��';
  -- ����
  update account set money = money + 500 where name='�仨';
  # 3���ύ����
  commit ;

select * from account;


# �鿴mysql������Ĭ���ύ��ʽ
select @@autocommit;
# �޸�mysql�����Ĭ���ύ��ʽ�� ��Ϊ�ֶ��ύ
set @@autocommit = 0;




-- �鿴���ݿ���뼶��
select @@tx_isolation;  # REPEATABLE-READ ���ѽ��������������ظ��� �������⣩

# �޸����ݸ��뼶���ø��뼶�����ò�����
set global transaction isolation level read uncommitted; # read uncommitted����ͼ��� ����֣�����������ظ������ö���

 # 1����������
  start transaction;
  # 2��ִ��ת�˲���
  -- ����
  update account set money = money - 500 where name='С��';
  -- ����
  update account set money = money + 500 where name='�仨';
  # 3���ع�����
  rollback ;

-- ����������뼶�� �� �����ύ�������������⣩
set global transaction isolation level read committed;





-- ����������mysql���ݿ��ṩ��һЩ�������Ĺ��ܣ�����java�е�API������

-- ������ �ۺϺ���

-- ���������ں��� ����������������ݽ��в�����
# ��ȡ��ǰϵͳ���ں�ʱ��
select now();
select sysdate();

#��ȡ��ǰϵͳ������
select curdate();
insert into student(id, name, age, gender, birthday, score)
value (100,'����',23,'��', curdate()  , 99) ;

#��ȡ��ǰϵͳ��ʱ��
select curtime();

#��ȡ�ꡢ�¡���
select year(curdate());
select month(curdate());
select day(curdate());

#��ȡһ���еĵ�x��
select week(now());

# ��ȡѧ�����������ڣ�����Ҫ�꣩
select name, month(birthday) , day(birthday) from student;

select name,
       concat(month(birthday) , '��',day(birthday),'��') as "����"  -- �ַ�������
from student;






/* Case..when�﷨1��

    case �� | ���ʽ
       when ����1 then ���1
       when ����2 then ���2
       ....
       else
           ���N
    end;



   Case..when�﷨1��
    case
       when ����1 then ���1
       when ����2 then ���2
       ....
       else
           ���N
    end;
*/

create table user
(
    id int primary key  auto_increment,
    name varchar(20) not null  unique ,
    sex  int default 0, -- 0:����   1:��   2:Ů
    age int
);
insert into user(id, name, sex, age)
values (null , '�ܴ�',1 ,23), (null , '�ܶ�',1 ,21), (null , '����',2 ,21);


select id, name,
       case sex
            when 1 then '��'
            when 2 then 'Ů'
            else '����'
        end AS gender,
       age from user;



select id, name,
       case when sex=1 then '��'
            when sex=2 then 'Ů'
            else '����'
        end AS gender,
       age from user;






-- �������ַ����� ������ַ��������ݽ��в�����
# ��ȡ�ַ����ĳ���
select char_length('itheima');
select char_length(name) from user;

# ƴ���ַ���
select concat('I','Love','Java','!');

# ת��С��תСд
select lower('Itheima');
select upper('Itheima');


# ��ȡ�ַ���
select substr('itheima',3,5); -- ������1��ʼ

# ȥ���ַ���ǰ��ո�
select trim('  hei ma   ');-- �м�ո񲻻�ȥ��
-- Ӧ�ó����� ���ݱ���char�������ݣ��洢���㳤��ʱ����ո񣬵���ȡ��char��������ʱ���ܴ��пո�



-- ��ѧ���� ������������͵������ṩ���ܣ�
# ��ȡ������֣���Χ��0~1��
select rand();


# ��������
select round('3.14159265358',4);

# ��ȡ����
select truncate('3.14159265358',4);


# ��ȡ��Сֵ
select least(11,2,4,7,19,2);

select min(age) from student;




# �鿴mysql���ݿ�ִ�����ܣ�DML������ or DQL�����ࣩ
show global status like 'Innodb_rows%';











use db2;
/*  ���´��룺 ���1000W�����ݵĲ���  */
-- 1. ׼����
CREATE TABLE `user`(
	id INT,
	username VARCHAR(32),
	`password` VARCHAR(32),
	sex VARCHAR(6),
	email VARCHAR(50)
);

-- 2. �����洢���̣�ʵ�����������¼
DELIMITER $$ -- �����洢���̵Ľ�������Ϊ$$
CREATE PROCEDURE auto_insert()
BEGIN
    DECLARE i INT DEFAULT 1;
	START TRANSACTION; -- ��������
    WHILE(i<=10000000)DO
        INSERT INTO `user` VALUES(i,CONCAT('jack',i),MD5(i),'male',CONCAT('jack',i,'@itcast.cn'));
        SET i=i+1;
    END WHILE;
	COMMIT; -- �ύ
END$$ -- ��������
DELIMITER ; -- ���������ֺ�Ϊ��������

-- 3. �鿴�洢����
SHOW CREATE PROCEDURE auto_insert;

-- 4. ���ô洢����
CALL auto_insert(); -- ����1000W�����ݻ��ѣ�3m49s 304 ms

/************************************************************************/

# ���ԣ���ѯ����
-- ��ѯid��22���û�,���Բ�ѯ��ʱ  ��1000W�����ݣ���ѯid��22���ݣ���ѯЧ�ʵͣ�
select * from user where id=22; -- ����ʱ�䣺14��314����
-- ������ݲ�ѯЧ�ʵ͵����⣬�����Ż��� ����

# ������ ��һ�����ݽṹ �� ���ṹ  -> B+�� ��
##Ҫѧϰ�������� �������� �� Ψһ���� ����ͨ����

# �������Ǵ������е�ĳ��(ĳЩ��)��
# ����������Ĭ���ڴ�����ʱָ�������У�primary key�������Զ������






-- �޸�user��ṹ����id�ֶ��������Լ��
alter table user add primary key (id); -- �����е��������Ƚϴ�ʱ����������Ҳ��Ҫ����ʱ��    1 m 44 s 479 ms

# ���ԣ���������󣬲�ѯid=22
select * from user where id=22; -- 20����
select * from user where id = 8888888; -- 21����


-- username�ֶ��ϣ�û������
select * from user  where username ='jack1234567';-- 17s146ms



create table student2(
   id int primary key  auto_increment, -- ����������������
   name varchar(32),
   telephone varchar(11) unique , -- Ψһ����
   sex char(1),
   birthday date
);
-- ��student2���е�name�ֶ��������
create index idx_student2_name on student2(name);





/*****************************�ع���������*******************************/
# ֪ʶ��1: ����
-- ʲô������
-- ���������ݿ��е��߼���Ԫ����������һ��SQL����һ��SQL��Ϊһ�����壬Ҫôȫ���ɹ���Ҫôȫ��ʧ�ܡ�

-- ������ʲô���⣿
-- ������SQL��Ҫһ��ִ��ʱ���Ѷ���SQL��д������Χ�ڣ�����������Ϊһ���������

-- �������ʹ��
# �������� ���ֶ�����
start transaction ;
# ��дҵ�����������SQL��
-- SQL���
# �ύ���� | �ع�����
commit ;  -- rollback;


-- �����������
# ���ݿ��е�������ࣿ   �ֶ����� ���Զ�����
# ������Ĵ����ԣ�      ACID   ԭ���ԡ�һ���ԡ��־��ԡ�������
# �����ڲ���ʱ�ᷢ�����⣿   ����������ظ������ö�/���
# ���񲢷�������ֵ�ԭ��   ��Ϊ����ĸ��뼶�����ò�����������񲢷�����ķ���
# ��ν������������ķ����� ����������뼶������Ϊ��2�����3����



# ֪ʶ��2������
-- ���ں���
# ��ȡ��ǰϵͳ���ں�ʱ��
select now();
# ��ȡ��ǰϵͳ����
select curdate();
# �����������л�ȡ�·�
select month( now() );

-- �жϺ���
/*
    case  ����
        when  ����1  then ���1
        when  ����2  then ���2
        ...
        else  ���N
    end
 */

-- �ַ�����
# ƴ���ַ���
select concat('it','hei','ma');
# ��ȡ�ַ���
select substr('itheima',3,5);


-- ��ѧ����
# ��������
select round(45.367,2);
# ��ȡָ��С��
select truncate(45.367,2);




# ֪ʶ��3������
-- ʲô������
-- ������һ�����ݽṹ(B+��)��

-- �������ʲô����
-- ���������ύ��ѯЧ��

-- ������ôʹ��
-- ��������
# �ڴ�����ʱָ�������У��ͻ�Ĭ����ӣ���������

-- Ψһ����
# �������ָ��Ψһ����
create table student3
(
    id int primary key auto_increment, -- ��������
    name varchar(20),
    phone varchar(11) unique  -- Ĭ�����Ψһ����
);
# �ڴ���������Ψһ����
create unique index ������  on ����(�ֶ���); -- Ҫ��ָ���ֶ��µ����ݲ��������ظ���null���⣩
alter table ���� add unique (�ֶ���); -- Ĭ�ϵ��������֣��ֶ���


-- ��ͨ����
create index ������ on ����(�ֶ���);


-- ��������
create index ������ on ����(�ֶ���1,�ֶ���2,...);
create unique index ������ on ����(�ֶ���1,�ֶ���2,...);-- ���ϵĶ���ֶκϲ���һ��󣬲���������ظ�����


/***********************************************************************/




-- B+Tree�ṹ���ص㣺 ������Ҷ�ӽڵ�ͷ�Ҷ�ӽڵ�
-- ��Ҷ�ӽڵ㣺 ֻ�洢������ָ��
-- Ҷ�ӽڵ㣺 �洢������ָ�롢 ����(ռ�ô洢�ռ����)



