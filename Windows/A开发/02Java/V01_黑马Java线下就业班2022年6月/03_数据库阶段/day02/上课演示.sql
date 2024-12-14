use day02_heima141;
-- Ա����
create table emp
(
  -- primary key ����Լ��(�ǿ���Ψһ)  auto_increment �Զ�����
  id       int primary key auto_increment, -- Ա��id��������������
  -- unique Ψһ  not null �ǿ�Լ��
  -- unique �� not null Լ��û����дǰ��˳��
  ename    varchar(50) unique not null,    -- Ա���������ǿղ���Ψһ
  joindate date               not null,    -- ��ְ���ڣ��ǿ�
  salary   double(7, 2)       not null,    -- ���ʣ��ǿ�
  -- default 0 Ĭ��ֵ��0�����Ǹ�bonus��ֵ��ʱ���������ֵ��ôʹ��Ĭ��ֵ0
  bonus    double(7, 2) default 0,-- �������û�н���Ĭ��Ϊ0
  age      int unique
);


-- ��������
-- ����id������Լ������ô���Ȳ������ظ������ݣ�����������Զ���������ô�������ݵ�ʱ��ֱ������null���ɣ�mysql�ͻ��Զ�����
insert into emp(id, ename, joindate, salary, bonus)
values (null, '����', '2010-10-10', 88888.88, 1000);
insert into emp(id, ename, joindate, salary, bonus)
values (null, '����', '2010-10-10', 88888.88, 1000);
-- ����id������Լ�����ǿ���Ψһ�����ݱ����Ѿ�����id��2���ˣ���������ִ��ʧ��
insert into emp(id, ename, joindate, salary, bonus)
values (2, '����', '2010-10-10', 88888.88, 1000);
-- ����ʧ�ܣ���Ϊename��uniqueΨһԼ��������ֵ�����ظ�
insert into emp(id, ename, joindate, salary, bonus)
values (null, '����', '2010-10-10', 88888.88, 1000);
-- ����ʧ�ܣ�Column 'ename' cannot be null ��Ϊename�� not null �ǿ�Լ��
insert into emp(id, ename, joindate, salary, bonus)
values (null, null, '2010-10-10', 88888.88, 1000);
--
insert into emp(id, ename, joindate, salary)
values (null, '����', '2010-10-10', 88888.88);

/*
	���⣺
		����Լ���ͷǿ���ΨһԼ������
			id int primary key���ǿ���Ψһ һ����ֻ��һ������
			ename varchar(50) unique not null���ǿ���Ψһ  ���Զ��
 */


-- 2.���ϵ_��Զ�

-- ������
CREATE TABLE tb_order
(
  id           int primary key auto_increment,
  payment      double(10, 2),
  payment_type TINYINT, -- 0 ΢��֧��  1 ֧����֧��
  status       TINYINT  -- 0 δ����  1 �Ѿ�֧��
);

-- ��Ʒ��
CREATE TABLE tb_goods
(
  id    int primary key auto_increment,
  title varchar(100), -- ��Ʒ��
  price double(10, 2) -- ����
);


-- ������Ʒ�м��
CREATE TABLE tb_order_goods
(
  id       int primary key auto_increment,
  order_id int, -- ����������ڶ����������
  goods_id int, -- �������������Ʒ�������
  count    int  -- ������Ʒ����
);
-- ��Ӳ�������
insert into tb_order
values (null, 7376.00, 0, 0);
insert into tb_order
values (null, 59880.00, 1, 1);

insert into tb_goods
values (null, '��ΪP40�ֻ�', 5988);
insert into tb_goods
values (null, '���콴��', 9.9);
insert into tb_goods
values (null, '��ΪGT2�ֱ�', 1388);
insert into tb_order_goods
values (null, 1, 1, 1);
insert into tb_order_goods
values (null, 1, 3, 1);
insert into tb_order_goods
values (null, 2, 1, 10);


-- ��ձ�
truncate table tb_order;
truncate tb_goods;
truncate tb_order_goods;

-- 1.���м��tb_order_goods�����order_id������Լ��
/*
  1.constraint ���Լ��
  2.fk_order_id  ���Լ������ҪΨһ
  3.foreign key(order_id) references tb_order(id); �м��������order_id����tb_order���id����
*/
alter table tb_order_goods
  add constraint fk_order_id foreign key (order_id) references tb_order (id);
-- 2.���м��tb_order_goods�����goods_id������Լ��
alter table tb_order_goods
  add constraint fk_goods_id foreign key (goods_id) references tb_goods (id);


-- 3.����ѯ
-- 3.1.�ѿ�����

-- �۸� 1
create table price
(
  id    int primary key auto_increment,
  price double
);
-- ˮ�� n
create table fruit
(
  id       int primary key auto_increment,
  name     varchar(20) not null,
  price_id int,
  foreign key (price_id) references price (id)
);
insert into price
values (1, 2.30);
insert into price
values (2, 3.50);
insert into price
values (4, null);

insert into fruit
values (1, 'ƻ��', 1);
insert into fruit
values (2, '����', 2);
insert into fruit
values (3, '�㽶', null);

-- ���󣺲�ѯˮ���ͼ۸���Ϣ select * from ����1,����2,....
select *
from fruit,
     price;

-- 3.2.������
-- ����ѿ��������⣺
-- 1)��ʽ�����ӱ���ѿ���������
-- fruit.price_id :ʹ��fruit����øñ��е�����ֶ�price_id��ȡprice_id��ֵ
-- price.id; ��ʾʹ��price�۸�����price�������id��ȡ����ֵ
select *
from fruit,
     price
where fruit.price_id = price.id;
-- 2)ʹ����ʾ�����ӱ���ѿ���������
select *
from fruit as f
       inner join price p on f.price_id = p.id;
-- ����ʡ��inner
-- as ����ʡ��
select *
from fruit as f
       join price p on f.price_id = p.id;

-- ��ϰ����ѯƻ����Ϣ����ʾƻ��id�ͼ۸�
-- ��������ˮ�����п��Բ鿴ƻ��id ���� ���ڼ۸���п��Բ鿴�۸�ͼ۸�id
-- ʹ����ʾ�����Ӳ�ѯ
-- ��ʽһ
select f.id, p.price
from fruit f
       inner join price p on f.price_id = p.id and f.name = 'ƻ��';
-- ��ʽ��
/*
    ˵����
      1.�������Ӳ�ѯ���������ѿ�������������д��on���� f.price_id = p.id
      2.����������������Կ���ʹ��where����
      ��ʽ��select * from ����1 inner join ��2 inner join ����3 ������ on ��ѿ����������� where ��������;
      -- ����д��Ҳ����
      select * from ����1 inner join ��2 on ���� inner join ����3  on ���� where ��������;
 */
select f.id, p.price
from fruit f
       inner join price p on f.price_id = p.id
where f.name = 'ƻ��';

-- 3.3��������
-- ��ϰ������������ϰ����ѯˮ����Ϣ�Ͷ�Ӧ�۸���Ϣ
-- fruit f  λ��left��ߣ���Ϊ����������������Ϊ��
-- price p  λ��left�ұߣ���Ϊ�ұ�
-- f.* :��ȡfruitˮ�����е���������
-- p.price : ��ȡprice�۸����ֶ�price��ֵ
# 	  select f.*,p.price from fruit f left outer join price p on f.price_id = p.id;
select *
from fruit f
       left outer join price p on f.price_id = p.id;

-- 3.4��������
-- ��ϰ��ʹ���������Ӳ�ѯ�۸��Ӧ��ˮ������ʾ���м۸�
--  right outer join  ��ʾ��������
--  price p ��Ϊ�ұ� �������ӻ��ѯ�ұ�price���ȫ�������Լ������fruit f�Ľ���
select *
from fruit f
       right outer join price p on f.price_id = p.id;

-- ��ϰ��ʹ���������Ӳ�ѯ�۸��Ӧ��ˮ������ʾ���м۸�
select *
from price p
       left outer join fruit f on f.price_id = p.id;


-- 4.�Ӳ�ѯ
use day0201_heima141;
-- �������ű� 1
CREATE TABLE dept
(
  id   INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(20)
);

INSERT INTO dept (NAME)
VALUES ('������'),
       ('�г���'),
       ('����');

-- ����Ա���� n
CREATE TABLE emp
(
  id        INT PRIMARY KEY AUTO_INCREMENT,
  NAME      VARCHAR(10),
  gender    CHAR(1), -- �Ա�
  salary    DOUBLE,  -- ����
  join_date DATE,    -- ��ְ����
  dept_id   INT,
  foreign key (dept_id) references dept (id)
);

INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('�����', '��', 7200, '2013-02-24', 1);
INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('��˽�', '��', 3600, '2010-12-02', 2);
INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('��ɮ', '��', 9000, '2008-08-08', 2);
INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('�׹Ǿ�', 'Ů', 5000, '2015-10-07', 3);
INSERT INTO emp(NAME, gender, salary, join_date, dept_id)
VALUES ('֩�뾫', 'Ů', 4500, '2011-03-14', 1);


-- 1.��ѯ������ߵ�Ա����˭
-- 1.1 ��empԱ�����в�ѯ��߹���
select max(salary)
from emp;
-- 9000 ���е���
-- 1.2��empԱ�����и���������ѯ����߹��ʲ�ѯԱ����Ϣ
select *
from emp
where salary = (select max(salary) from emp);
-- 2.��ѯ����С��ƽ�����ʵ�Ա������Щ��
-- 2.1��empԱ�����в�ѯƽ������
select avg(salary)
from emp;
-- ���е��� 5860
-- 2.2��empԱ�����в�ѯС��������ƽ�����ʲ�ѯԱ����Ϣ
select *
from emp
where salary < (select avg(salary) from emp);
-- 3.��ѯ���ʴ���5000��Ա������������Щ���ŵ�����
-- 3.1 ��Ա����emp�в�ѯ���ʴ���5000��Ա�����ű��
select dept_id
from emp
where salary > 5000;
-- 1 2 ���е��� ��Ϊ�Ӳ�ѯ������ʹ��in
-- 3.2��dept���ű��и���������ѯ�Ĳ��ű�Ų�ѯ��������
select name
from dept
where id in (select dept_id from emp where salary > 5000);
-- 4. ��ѯ��������������е�Ա����Ϣ
-- 4.1 ��dept���ѯ�������Ͳ��񲿵Ĳ��ű��
select id
from dept
where name in ('������', '����');
-- 1 3 ���е��� ��Ϊ�Ӳ�ѯ������ʹ��in
-- 4.2��empԱ�����и���������ѯ�Ĳ��ű�Ų�ѯԱ����Ϣ
select *
from emp
where dept_id in (select id from dept where name in ('������', '����'))

-- 5.��ѯ��2011���Ժ���ְ��Ա����Ϣ��������������
-- 5.1��emp���в�ѯ2011���Ժ���ְ��Ա����Ϣ
select *
from emp
where join_date > '2011-01-01';
-- ���ж��У���Ϊ�Ӳ�ѯһ��ʹ��as�������Ϊ��ʱ����������ѯ
-- 5.2 ��������ѯ�Ľ����Ϊ��ʱ���dept�������ѯ����ѯԱ����Ϣ�Ͳ�������
select *
from dept,
     (select * from emp where join_date > '2011-01-01') as temp
where dept.id = temp.dept_id;

use day0202_heima141;
create table teacher
(
  id   int(11) primary key auto_increment,
  name varchar(20) not null unique
);
create table student
(
  id   int(11) primary key auto_increment,
  name varchar(20) NOT NULL unique,
  city varchar(40) NOT NULL,
  age  int
);
create table course
(
  id         int(11) primary key auto_increment,
  name       varchar(20) not null unique,
  teacher_id int(11)     not null,
  foreign key (teacher_id) references teacher (id)
);

create table studentcourse
(
  student_id int    NOT NULL,
  course_id  int    NOT NULL,
  score      double NOT NULL,
  foreign key (student_id) references student (id),
  foreign key (course_id) references course (id)
);

insert into teacher
values (null, '����');
insert into teacher
values (null, '�ŷ�');
insert into teacher
values (null, '����');

insert into student
values (null, 'С��', '����', 20);
insert into student
values (null, 'С��', '�Ϻ�', 18);
insert into student
values (null, 'С��', '����', 22);
insert into student
values (null, 'С��', '����', 21);
insert into student
values (null, 'С��', '�Ϻ�', 22);
insert into student
values (null, 'С��', '����', 17);
insert into student
values (null, 'С��', '�Ϻ�', 23);
insert into student
values (null, 'С��', '����', 25);
insert into student
values (null, 'Сκ', '�Ϻ�', 18);
insert into student
values (null, 'С��', '����', 20);

insert into course
values (null, '����', 1);
insert into course
values (null, '��ѧ', 1);
insert into course
values (null, '����', 2);
insert into course
values (null, '��ѧ', 2);
insert into course
values (null, '����', 2);
insert into course
values (null, 'Ӣ��', 3);

insert into studentcourse
values (1, 1, 80);
insert into studentcourse
values (1, 2, 90);
insert into studentcourse
values (1, 3, 85);
insert into studentcourse
values (1, 4, 78);
insert into studentcourse
values (2, 2, 53);
insert into studentcourse
values (2, 3, 77);
insert into studentcourse
values (2, 5, 80);
insert into studentcourse
values (3, 1, 71);
insert into studentcourse
values (3, 2, 70);
insert into studentcourse
values (3, 4, 80);
insert into studentcourse
values (3, 5, 65);
insert into studentcourse
values (3, 6, 75);
insert into studentcourse
values (4, 2, 90);
insert into studentcourse
values (4, 3, 80);
insert into studentcourse
values (4, 4, 70);
insert into studentcourse
values (4, 6, 95);
insert into studentcourse
values (5, 1, 60);
insert into studentcourse
values (5, 2, 70);
insert into studentcourse
values (5, 5, 80);
insert into studentcourse
values (5, 6, 69);
insert into studentcourse
values (6, 1, 76);
insert into studentcourse
values (6, 2, 88);
insert into studentcourse
values (6, 3, 87);
insert into studentcourse
values (7, 4, 80);
insert into studentcourse
values (8, 2, 71);
insert into studentcourse
values (8, 3, 58);
insert into studentcourse
values (8, 5, 68);
insert into studentcourse
values (9, 2, 88);
insert into studentcourse
values (10, 1, 77);
insert into studentcourse
values (10, 2, 76);
insert into studentcourse
values (10, 3, 80);
insert into studentcourse
values (10, 4, 85);
insert into studentcourse
values (10, 5, 83);


-- 1.��ѯ�����߷ֵ�ѧ����Ϣ��
-- 1.1 ���м���в�ѯ��߷�
select max(score)
from studentcourse;
-- 95
-- ���е���
-- 1.2 ���м���и���������ѯ����߷ֲ�ѯѧ��id
-- һ���༶��߷�95�������ж���ѧԱ������п����Ƕ��ж���
select student_id
from studentcourse
where score = (select max(score) from studentcourse);


-- 1.3��ѧ�����и���������ѯ��ѧ��id��ѯѧ����Ϣ
select *
from student
where id in (select student_id
             from studentcourse
             where score = (select max(score) from studentcourse));

-- 2.��ѯ�����2�Ŀγ̱ȱ����1�Ŀγ���߳ɼ��ߵ�ѧ����Ϣ��
-- 2.1���м���ѯ�γ̱����1����߷���
select max(score)
from studentcourse
where course_id = 1;
-- 80
-- 2.2���м���в�ѯ�γ̱����2���ҷ����������������ѧ�����
select student_id
from studentcourse
where course_id = 2
  and score > (select max(score) from studentcourse where course_id = 1);
-- ���е���
-- 2.3 ��ѧ�����и���������ѯ��ѧ����Ų�ѯѧ����Ϣ
select *
from student
where id in (select student_id
             from studentcourse
             where course_id = 2
               and score > (select max(score) from studentcourse where course_id = 1));
-- 3.��ѯ�����2�Ŀγ̱ȱ����1�Ŀγ���߳ɼ��ߵ�ѧ�������ͳɼ���
-- 3.1���м���ѯ�γ̱����1����߷���
select max(score)
from studentcourse
where course_id = 1;
-- 80
-- 3.2���м���в�ѯ�γ̱����2���ҷ����������������ѧ����źͷ���
select student_id, score
from studentcourse
where course_id = 2
  and score > (select max(score) from studentcourse where course_id = 1);
-- ���ж�����Ϊ��ʱ��
-- 3.3 ��������ѯ�Ľ����Ϊ��ʱ��
select s.name, temp.score
from student s,
     (select student_id, score
      from studentcourse
      where course_id = 2
        and score > (select max(score) from studentcourse where course_id = 1)) temp
where s.id = temp.student_id;
-- 4.��ѯÿ��ͬѧ��ѧ�š�������ѡ�������ܳɼ�
-- 4.1���м���и���ѧ�ŷ����ѯѧ�� ѡ���� �ܳɼ�
select student_id, count(*), sum(score)
from studentcourse
group by student_id;
-- ���ж��У���Ϊ��ʱ��
-- 4.2��������ѯ�Ľ����Ϊ��ʱ���ѧ������й�����ѯ
select *
from student s,
     (select student_id, count(*), sum(score) from studentcourse group by student_id) temp
where s.id = temp.student_id;

/*
  ע�⣺����Ӳ�ѯ�в�ѯ�Ľ���ֶ��ǾۺϺ����������������Ҫʹ��
  �ۺϺ�������ô����ʹ��as���ۺϺ������ֶ������
 */
select s.id, s.name, temp.ѡ����, temp.�ܳɼ�
from student s,
     (select student_id, count(*) as ѡ����, sum(score) as �ܳɼ� from studentcourse group by student_id) temp
where s.id = temp.student_id;

-- ���Ӳ�ѯ��ϰ

-- ���ű�
CREATE TABLE dept
(
  id    INT PRIMARY KEY PRIMARY KEY, -- ����id
  dname VARCHAR(50),                 -- ��������
  loc   VARCHAR(50)                  -- ����λ��
);

-- ���4������
INSERT INTO dept(id, dname, loc)
VALUES (10, '���в�', '����'),
       (20, 'ѧ����', '�Ϻ�'),
       (30, '���۲�', '����'),
       (40, '����', '����');

-- ְ���ְ�����ƣ�ְ������
CREATE TABLE job
(
  id          INT PRIMARY KEY,
  jname       VARCHAR(20),
  description VARCHAR(50)
);

-- ���4��ְ��
INSERT INTO job (id, jname, description)
VALUES (1, '���³�', '����������˾���ӵ�'),
       (2, '����', '������Ա��'),
       (3, '����Ա', '�����������Ʒ'),
       (4, '��Ա', 'ʹ�ð칫���');

-- Ա����
CREATE TABLE emp
(
  id       INT PRIMARY KEY, -- Ա��id
  ename    VARCHAR(50),     -- Ա������
  job_id   INT,             -- ְ��id
  mgr      INT,             -- �ϼ��쵼
  joindate DATE,            -- ��ְ����
  salary   DECIMAL(7, 2),   -- ����
  bonus    DECIMAL(7, 2),   -- ����
  dept_id  INT,             -- ���ڲ��ű��
  CONSTRAINT emp_jobid_ref_job_id_fk FOREIGN KEY (job_id) REFERENCES job (id),
  CONSTRAINT emp_deptid_ref_dept_id_fk FOREIGN KEY (dept_id) REFERENCES dept (id)
);

-- ���Ա��
INSERT INTO emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id)
VALUES (1001, '�����', 4, 1004, '2000-12-17', '8000.00', NULL, 20),
       (1002, '¬����', 3, 1006, '2001-02-20', '16000.00', '3000.00', 30),
       (1003, '�ֳ�', 3, 1006, '2001-02-22', '12500.00', '5000.00', 30),
       (1004, '��ɮ', 2, 1009, '2001-04-02', '29750.00', NULL, 20),
       (1005, '����', 4, 1006, '2001-09-28', '12500.00', '14000.00', 30),
       (1006, '�ν�', 2, 1009, '2001-05-01', '28500.00', NULL, 30),
       (1007, '����', 2, 1009, '2001-09-01', '24500.00', NULL, 10),
       (1008, '��˽�', 4, 1004, '2007-04-19', '30000.00', NULL, 20),
       (1009, '�޹���', 1, NULL, '2001-11-17', '50000.00', NULL, 10),
       (1010, '����', 3, 1006, '2001-09-08', '15000.00', '0.00', 30),
       (1011, 'ɳɮ', 4, 1004, '2007-05-23', '11000.00', NULL, 20),
       (1012, '����', 4, 1006, '2001-12-03', '9500.00', NULL, 30),
       (1013, 'С����', 4, 1004, '2001-12-03', '30000.00', NULL, 20),
       (1014, '����', 4, 1007, '2002-01-23', '13000.00', NULL, 10);

-- ���ʵȼ���
CREATE TABLE salarygrade
(
  grade    INT PRIMARY KEY,
  losalary INT, -- ���н��
  hisalary INT  -- ���н��
);

-- ���5�����ʵȼ�
INSERT INTO salarygrade(grade, losalary, hisalary)
VALUES (1, 7000, 12000),
       (2, 12010, 14000),
       (3, 14010, 20000),
       (4, 20010, 30000),
       (5, 30010, 99990);

-- 1.��ѯ����Ա����Ϣ����ʾԱ����ţ�Ա�����������ʣ�ְ�����ƣ�ְ��������
-- 1.1 ȷ�����ű������ѯ��2�ű� emp job
-- 1.2 ȷ�����Ӳ�ѯ������������ѿ����������� emp.job_id = job.id
-- 1.3 ȷ��Ҫ��ѯ�Ľ���ֶΣ�Ա����ţ�Ա�����������ʣ�ְ�����ƣ�ְ������
select e.id, e.ename, e.salary, j.jname, j.description
from emp e
       inner join job j on e.job_id = j.id;

-- 2.��ѯ����Ա����Ϣ����ʾԱ����ţ�Ա�����������ʣ�ְ�����ƣ�ְ���������������ƣ�����λ��
-- 2.1 ȷ�����ű������ѯ��3�ű� emp job dept
-- 2.2 ȷ�����Ӳ�ѯ������������ѿ����������� emp.job_id = job.id and emp.dept_id=dept.id
-- 2.3 ȷ��Ҫ��ѯ�Ľ���ֶΣ�Ա����ţ�Ա�����������ʣ�ְ�����ƣ�ְ���������������ƣ�����λ��
select e.id, e.ename, e.salary, j.jname, j.description, d.dname, d.loc
from emp e
       inner join job j
       inner join dept d
                  on e.dept_id = d.id and e.job_id = j.id;

/*
  ���Ӳ�ѯ���ɣ�
    1.ȷ�����ű����
    2.ȷ�����Ӳ�ѯ������
    3.ȷ��Ҫ��ѯ�Ľ���ֶ�
    4.�����n�ű��������ô����ѿ������������ĸ����ǣ�n-1
 */


-- 3.��ѯ����Ա����Ϣ����ʾԱ�����������ʣ�ְ�����ƣ�ְ���������������ƣ�����λ�ã����ʵȼ���
-- 1.ȷ�����ű���� 4�ű� emp job dept salarygrade
-- 2.ȷ�����Ӳ�ѯ������ :emp.job_id = job.id and emp.dept_id=dept.id
-- ����������e.salary between salarygrade.losalary and salarygrade.hisalary
-- 3.ȷ��Ҫ��ѯ�Ľ���ֶ�
select e.ename, e.salary, j.jname, j.description, d.dname, d.loc, s.grade
from emp e
       inner join dept d
       inner join job j
       inner join salarygrade s
                  on e.job_id = j.id and e.dept_id = d.id
where e.salary between s.losalary and s.hisalary;



-- 4.��ѯ��ÿ�����ŵĲ��ű�š��������ơ�����λ�á���������
-- 4.1 ��emp���а��ղ��ű�ŷ����ѯ���ű�ź�ÿ����������
select dept_id, count(*)
from emp
group by dept_id;
-- 4.2 ���ű������dept ������ʱ��
-- 4.3 ���� dept.id����ʱ���dept_id���
-- 4.4 ������ѯ�Ľ�����ű�š��������ơ�����λ�á���������
select d.id,d.dname,d.loc,temp.c
from dept d
       inner join (select dept_id, count(*) c from emp group by dept_id) temp
on d.id = temp.dept_id;

delete from salarygrade where grade=5;

-- ����

# �����˺ű�
create table account(
	id int primary key auto_increment,
	name varchar(20),
	money double
);
# ��ʼ������
insert into account values (null,'a',1000);
insert into account values (null,'b',1000);

-- �ֶ���������
-- ����a��bת��100����ʾ����
-- 1.�ֶ���������
-- ������������л��ж���sql��䣬sql���Ҫ�ɹ�����ɹ���Ҫʧ�ܶ�ʧ��
-- �ɹ���һ������ �ύ���� commit
-- ʧ�ܣ������쳣 �ع����� rollback
start transaction ;
-- a-100
update account set money=money-100 where name='a';
-- b+100
update account set money=money+100 where name='b';

-- һ���������ύ�������a-100��b+100
commit ;

-- ����ع�
start transaction ;
-- a-100
update account set money=money-100 where name='a';
-- b+100
update account set money=money+100 where name='b';

-- ʧ�ܣ������쳣 �ع����� rollback ,���ݻص���������֮ǰ��״̬
rollback ;


-- ע�⣺�ύ������ô���ݾͻ������Ըı䣬�ڻع�Ҳ����ص���������֮ǰ��״̬
-- ע�⣺��������Ѿ��ع��������ύ�ˡ�

-- ��ʾ�Զ��ύ����mysql���Զ��ύ����ģ�����ִ��һ��sql���ͻ��ύһ������

-- a-100
update account set money = money - 100 where name='a';

-- b+100
update account set money = money + 100 where name='b';

-- �鿴mysql�Ƿ����Զ��ύ����
show variables like '%commit%';
/*
	autocommit��ֵ��on��ʾ�Զ���������ֵ��off��ʾ�ر��Զ��ύ����ֻ���ֶ��ύ����
	ͨ������set������ʱ����autocommit��ֵ1����ʾon.0��ʾoff,����ʹ�ÿͻ�������mysql�������ͻῪ����
*/
  -- a-100
update account set money = money - 100 where name='a';

-- b+100
update account set money = money + 100 where name='b';

-- �ر��Զ��ύ����
set autocommit=0;
