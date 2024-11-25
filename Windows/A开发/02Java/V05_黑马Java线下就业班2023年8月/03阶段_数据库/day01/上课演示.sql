/*DDL����*/
-- �鿴���ݿ�
show databases ;

-- �鿴��ǰʹ�õ��ĸ����ݿ�
select database();

-- �л����ݿ�
use test;


#�������ݿ���ϰ
-- 1.ֱ�Ӵ������ݿ�db1
create database db1;

-- 2.�ж��Ƿ���ڲ��������ݿ�db2
create database if not exists db2;

-- 3.�鿴���е����ݿ�
show databases ;

-- 4.ɾ��db2���ݿ�
drop database db2;
drop database if exists db2;

-- 5.�鿴����ʹ�õ����ݿ�
select database();

-- 6.ʹ��db1���ݿ�
use db1;


#�������ݱ�
-- �鿴��ǰ���ݿ������еı�
show tables;

-- �鿴���ݱ�ṹ
desc student;

-- ������
create table student
(
   id  int,
   name  varchar(10), #varchar���ڿɱ䳤�ȵ��ַ���    varchar(2)  �洢��'Ů'  ��ֻռ��1�� ����಻�ܳ���2����
   gender char(1), #char���ڹ̶����ȵ��ַ���  char(2)  �洢��'�� ' ȱ�ٵ��ַ��Ჹ��ո�ռ��2����
   birthday date,
   score double ,
   email varchar(64),
   tel varchar(20),
   status int #ʹ�����ֱ�ʾ��0������ �� 1����ѧ�� 2�Ǳ�ҵ �� ....
);

-- ɾ����
drop table student;
drop table if exists student; #������ݱ���ڣ���ɾ��

# �޸ı�
-- �޸ı�����
alter table student rename to mystudent;
-- ���������һ��
alter table mystudent add remark varchar(100);

-- �޸ı���ĳ�е���������
alter table mystudent modify remark char(50);

-- �޸ı���ĳ�е���������������
alter table mystudent change  remark temp varchar(200);

-- ɾ�������Ѵ��ڵ���
alter table mystudent drop temp;



-- ���ݿ� -> ���ݱ� -> ��¼
# �������ݿ�
create database db2;
# �л���db2���ݿ���
use db2;
# �������ݿⴴ�����ݱ�
create table student
(
    id int ,
    name varchar(10),
    gender char(1),
    birthday date
);

-- 1.�޸�student����Ϊstu
alter table student rename to stu;
-- 2.��ѧ�������һ��remark������Ϊvarchar(20)
alter table stu add remark varchar(20);
-- 3.�޸�remark�е�������varchar(100)
alter table stu modify remark varchar(100);
-- 4.�޸�remark�е�����Ϊintro,����varchar(30)
alter table stu change remark intro varchar(30);
-- 5.ɾ��intro��
alter table stu drop  intro;



/*
SQL���� ��
1. DDL���ԣ� �������ݿ⡢���ݱ� ���������޸ġ�ɾ����
2��DML���ԣ� ������ݱ��еļ�¼��������ɾ���Ĳ���
3��DQL���ԣ� ������ݱ��еļ�¼���в�ѯ
*/

##DML����

-- �����ݱ��е�������ݣ��м�¼��  insert
-- 1.�����ݱ���ָ�������ϣ��������
insert into stu(id , name) values (1,'����'); # SQL���ַ������ݣ�ͨ��ʹ��Ӣ�ĵ����Ű���������'�ַ�������'

-- 2.�����ݱ������е����ϣ��������
insert into stu(id, name, gender, birthday) values (2,'����','��','1990-12-12');#SQL�е�date�������ݣ�Ҳʹ��Ӣ�ĵ����Ű���
insert into stu values (3,'����','��','1980/12/12');#SQL��date��������Ĭ�ϸ�ʽ��yyyy-MM-dd

-- 3.�����ݱ��������������
insert into stu(id , name) values (4,'�Ϻ�'),(5,'����'),(6,'����');


#��ϰ
-- ����student��������id��name��age��birthday��sex��address
create table student
(
    id int ,
    name varchar(10),
    age int ,
    birthday date,
    sex char(1),
    address varchar(50)
);
-- ��student���е�id��name��age��sex�в�������
insert into student(id,name,age,sex) values (1,'����',23,'��');

-- ��stuent�������е��ֶΣ���������
insert into db2.student(id, name, age, birthday, sex, address) values (2,'����',24,'1999-10-10','��','�Ϻ�');

-- ��student����������������
insert into db2.student(id, name, age, birthday, sex, address)
values
(3,'����',25,'1999-12-10','Ů','����'),
(4,'����',26,'1990-11-10','Ů','�Ͼ�');


insert into db2.student(id) values ('����');#���������ֵ����������ֶε���������


-- �޸����ݱ��е�����   update
-- �޸ı��е��Ա��޸�ΪŮ
update db2.student set sex ='Ů';#��ǰд���ڿ����в����ڣ����޸����еļ�¼��
update db2.student set sex ='��' where 1=1;

-- ������idΪ2�ļ�¼�����ݣ��Ա��޸�Ϊ����
update db2.student set sex ='��' where id=2; # where�������������

-- �޸ı���idΪ3�ļ�¼�� �����޸�Ϊ26����ַ�޸�Ϊ�ϱ���
update db2.student set age =26 , address='�ϱ���' where id=3;






-- ɾ�����ݱ��е�����   delete
-- ɾ������idΪ3���м�¼  ��ɾ��1�м�¼��
delete from db2.student where id=3;  #ɾ���м�¼����ɾ���������������м�¼��

-- ɾ������idΪ1��2���м�¼ ��ɾ�����м�¼��
delete  from db2.student where id in (1,2);# in�ؼ��ֱ�ʾ��ĳ��ָ���ķ�Χ��


-- ɾ�����е������м�¼
delete from db2.student where 1=1;

/*�ڿ����У����Ҫɾ���������е��м�¼ʱ��ͨ��ʹ�ã�truncat  */
truncate table db2.student;

/* delete��truncate������

   delete������ɾ�����еļ�¼��ɾ�����еļ�¼��һ��һ��ɾ����
   truncate����ִ�У�drop table �� ����ִ�У�create table ��  ����ɾ�����ٴ���һ����ͬ�ṹ�ı�


*/



###DQL���� ����ѯ��select��
-- ������ѯ ��û��where������
# ��ѯѧ���ı�ź�����
select id, name from db2.student;
select id, name, age, birthday, sex, address from db2.student;
select * from db2.student;#  * ��ʾ��ǰ���ݱ��е����е��ֶ�  �������в���ʹ�ã�

# ��ѯѧ�������������䣬�������ķ�ʽ��ʾ����
select  name AS "����" ,age AS "����"  from db2.student;

# ȥ�ز�ѯ
select distinct  address from db2.student;





/********************�عˣ�SQL�﷨******************/
-- DDL : �������ݿ⡢���ݱ�
#�������ݿ�
create database db3 ;
#�л����ݿ�
use db3;
#�������ݱ�
create table student(
    id int ,
    name varchar(20),
    age int ,
    gender char(1),
    birthday date
);
#�޸ı� �����ֶΡ��޸����͡��޸��������޸ı�����ɾ����
alter table student add (
    score double ,
    address varchar(100)
);
alter table student drop address;
alter table student modify name varchar(10);

#ɾ�����ݿ�
drop database db3;
#ɾ�����ݱ�
drop table student;



-- DML���������ݱ��е����ݣ�����ɾ���ģ�
#���һ������
insert into student(id, name, age, gender, birthday) values (1,'����',23,'��','1990-1-1');
insert into student(id, name, age, gender, birthday,score)
values
(2,'����',24,'Ů','1990-2-2',100),
(3,'����',25,'Ů','1988-2-2',88);

#�޸�����
update student set age=22 where id=1;
update student set age=30 , gender='��', score=50 where id=3;

#ɾ������
delete from student where id=1;-- ɾ��1������
delete from student where id in(1,2,3); -- ɾ����������
delete from student ; #ɾ����������

truncate table student;#ɾ������ڴ����±�ɾ��ȫ�����ݽ���ʹ�������ԭ��Ч�ʸߣ�



-- DQL
select id, name, age, gender, birthday, score from db3.student;

select id AS "���", name AS "����" , age AS "����" from db3.student;

#��ѯʱȥ���ظ����м�¼
select distinct gender from db3.student;












use db1;
drop table if exists student;

CREATE TABLE student
(
    id      int,
    name    varchar(20),
    age     int,
    sex     varchar(5),
    address varchar(100),
    math    int,
    english int
);

INSERT INTO student(id, NAME, age, sex, address, math, english)
VALUES (1, '����', 55, '��', '����', 66, 78),
       (2, '����', 45, 'Ů', '����', 98, 87),
       (3, '����', 55, '��', '���', 56, 77),
       (4, '����', 20, 'Ů', '����', 76, 65),
       (5, '����', 20, '��', '����', 86, NULL),
       (6, '���»�', 57, '��', '���', 99, 99),
       (7, '���', 22, 'Ů', '���', 99, 99),
       (8, '��������', 18, '��', '�Ͼ�', 56, 65);


-- ������ѯ
# ��ѯmath����>80��ѧ��
select id, name, age, sex, math, english, math
from db1.student
where math > 80;

# ��ѯenglish����<=80��ѧ��
select id, name, age, sex, math, english, math
from db1.student
where english <=80; #����ɸѡ�����nullֵ

# ��ѯ�������20��ѧ��
select id, name, age, sex, math, english, math
from db1.student
where age =20;

# ��ѯ���䲻����20��ѧ��
select id, name, age, sex, math, english, math
from db1.student
where age != 20;
select id, name, age, sex, math, english, math
from db1.student
where age <> 20;


#��ѯage>35���Ա�Ϊ�е�ѧ��
select id, name, age, sex, math, english, math
from db1.student
where age >35 and sex ='��';

#��ѯage>35���Ա�Ϊ�е�ѧ��
select id, name, age, sex, math, english, math
from db1.student
where age >35 or sex ='��';


#��ѯid��1��3��5��ѧ��
select id, name, age, sex, math, english, math
from db1.student
where id in (1,3,5);

select id, name, age, sex, math, english, math
from db1.student
where id=1 or id=3 or id=5;


#��ѯid����1��3��5��ѧ��
select id, name, age, sex, math, english, math
from db1.student
where id not in (1,3,5);


##��Χ��ѯ
#��ѯenglish�ɼ���75~90��Χ�ڵ�ѧ��
select id, name, age, sex, math, english, math
from db1.student
where english>=75 and english<=90;

select id, name, age, sex, math, english, math
from db1.student
where english between 75 and 90;



##ģ����ѯ
#�﷨�� select �ֶ��б� from ���� where �ֶ��� LIKE ģ����ѯ�Ĺؼ��� (�ؼ���ͨ����ͨ����Ź���)
# ��ģ����ѯʱ����һЩͨ����ţ�  %  _
#    %  �� ���������
#    _  �� ����һ������

-- ��ѯ�����ѧ��
select id, name, age, sex, math, english, math
from db1.student
where name LIKE '��%';

-- ��ѯ�����а���"��"
select id, name, age, sex, math, english, math
from db1.student
where name LIKE '%��%';


-- ��ѯ�����������������ֵ�ѧ��
select id, name, age, sex, math, english, math
from db1.student
where name LIKE '��__';



###�����ѯ
#�﷨�� select �ֶ��б� from �� [where ����] ORDER BY �ֶ���1 �������(����or����) , �ֶ���2 ������� , ...
# ���� ASC ��Ĭ�ϣ� ���Բ�д��
# ���� DESC

#��ѯѧ����Ϣ��������������򣨽���
select id, name, age, sex, math, english, math
from db1.student
order by age DESC;

#��ѯѧ����Ϣ��������������򣨽���, ��������ͬʱ������ѧ�ɼ����򣨽���
select id, name, age, sex, math, english, math
from db1.student
order by age DESC , math DESC;



###�����ѯ
#�ͷ����ѯ������صļ������ۺϺ���
#�ۺϺ�����count(����)��sum(����)��max(����)��min(����)��avg(����)
#�﷨�� select �ۺϺ�����(����) from ��  [where ����]

-- ��ѯ�ж��ٸ�ѧ��
select count(id) AS "ѧ������" from db1.student;
select count(*) as "ѧ������" from db1.student;

-- ��ѧ�ɼ��ܷ�
select  sum(math) as "��ѧ�ɼ��ܷ�" from db1.student;

-- ��ѯ��ѧ�ɼ���߷�
select  max(math) as "��߷�" from db1.student;


-- ����Ӣ�����ѧ�ɼ��ܷ�
select sum(math)+ sum(english) as "Ӣ���ܷ�" from db1.student; -- �����1206
select sum(math+english) as "Ӣ���ܷ�" from db1.student; -- �����1120
# Ϊʲô������ѯ�Ľ����ͬ�أ�
# ��mysql�У�nullֵ���������͵�����ֵ����Ӻ�Ľ�����ǣ�null
# nullֵ ������ �ۺϺ����е�����

-- ����ʹ��mysql�еĺ����� ifnull(����,Ĭ��ֵ)  ���nullֵ������
# ifnull(����,Ĭ��ֵ)   ��ǰָ������������null����ֵʱ������ָ����Ĭ��ֵ����
select sum( ifnull(math,0) + ifnull(english,0) ) as "Ӣ���ܷ�" from db1.student;-- 1206





##�����ѯ
#�﷨ ��select �ֶ��б� from ���� [where ����]  GROUPBY �ֶ���1 [HAVING ���������] , �ֶ���2, ...
#�﷨Ҫ��
# 1���ڽ��з����ѯʱ����д��select�ؼ��ֺ����������Ҫô������group by�ؼ��ֺ�Ҫôʹ�þۺϺ�������
#    ����
#       select  age  from student  group by age   -- ��ѯ��age�ֶγ�����group by�ؼ��ֺ�
#       select  age  count(id)  from student  group by age -- ��ѯ��id�ֶ�û�г�����group by�ؼ��ֺ�Ҫʹ�þۺϺ�������
#      ����д����
#          select  name, age  from student  group by age

# �����ѯ�У�ʹ����where������having����������
# 1��where�����ڷ���֮ǰִ�� ��  having�����ڷ���֮��ִ��
# 2��where�����в�����ʹ�þۺϺ��� �� having�����п���ʹ�þۺϺ���
#    ����  select ... from  ��  where  max(age)  -- ���� �﷨��֧��

-- ������
create table car
(
    id int,
    color char(2),
    price float
);
-- ��������
insert into car(id,color,price) values(1,'��ɫ',16);
insert into car(id,color,price) values(2,'��ɫ',16);
insert into car(id,color,price) values(3,'��ɫ',5);
insert into car(id,color,price) values(4,'��ɫ',60);
insert into car(id,color,price) values(5,'��ɫ',8);
insert into car(id,color,price) values(6,'��ɫ',60);


# ��ѯÿ����ɫ�������ܼ�
select color , sum(price) as "�ܼ�" from car group by color;

# having�ؼ��֣��������ڷ���֮�������������

# ��ѯ��ʾÿ����ɫ�������ܼ�>30����Ϣ
select color , sum(price) as "�ܼ�"
from car
group by color
having sum(price)>30; -- having���ڷ����ѯ֮�������������



### ��ҳ��ѯ    �ؼ��֣�LIMIT
# ˼����ΪʲôҪ���з�ҳ��ѯ��
# ����ҵ�����������ݱ��е�������Խ��Խ�󣬲�ѯʱ�Ͳ��ܰ���������ȫ����ѯ������Ч�ʵͣ�
# ��������� ��ѯһ�������ݣ� �ٲ�ѯһ�������� �� .......
# �ô��� ��߲�ѯЧ��

# �﷨ �� select �ֶ��б� from �� limit ��ʼ���� �� ��ѯ����
# ����  select ... from student limit 0,5;    -- ��0������ʼ������ȡ5������

select id, name, age, sex, math, english  from db1.student LIMIT 0,3;
select id, name, age, sex, math, english  from db1.student LIMIT 3,3;
select id, name, age, sex, math, english  from db1.student LIMIT 6,3;
/*
   LIMIT 0 ��3    ��1ҳ
   LIMIT 3 , 3    ��2ҳ
   LIMIT 6 , 3    ��3ҳ

   �����У�������ʼ�����Ĺ�ʽ��  (��ǰҳ��-1)*��ʾ����
   ��1ҳ��  ��ʼ���� =  (1-1)*3      ��ʼ����=0
   ��2ҳ��  ��ʼ���� =  (2-1)*3      ��ʼ����=3
   ��3ҳ��  ��ʼ���� =  (3-1)*3      ��ʼ����=6
*/

-- ��ѯѧ����Ϣ��������1�У���ʾ����4��
select id, name, age, sex, math, english from db1.student LIMIT 1,4;



/* SQL������䣺
select �ֶ��б�
from  ����
where ����
group by �����ֶ�
having ���������
order by �����ֶ�
limit ��ʼ���� �� ����

SQL����ִ��˳��
   1. from
   2. where
   3. group by
   4. having
   5. select
   6. order by
   7. limit

*/

# �޸�root����
update mysql.user set password=password('itheima') where user='root';
flush privileges;-- ˢ��Ȩ��


create database db1;

