0.�������ݿ���ϰ
	1.ֱ�Ӵ������ݿ�db3
	create database db1; ***
	2.�ж��Ƿ���ڲ��������ݿ�db4
	create database if not exists db4; ***
	3.�鿴���е����ݿ�
	show databases;
	4.ɾ��db3���ݿ�
	drop database db3;
	5.�鿴����ʹ�õ����ݿ�
	select database();
	6.ʹ��db4���ݿ�
	use db4;  *****
	
1.��������ϰ
- �������һ��ѧ������ע���������͡����ȵĺ�����

	1.���
	2.�����������������10������
	3.�Ա���Ϊȡֵֻ�����ֿ��ܣ�������һ������
	4.���գ�ȡֵΪ������
	5.��ѧ�ɼ���С���������λ
	6.�ʼ���ַ����󳤶Ȳ����� 64
	7.��ͥ��ϵ�绰����һ�����ֻ����룬���ܻ���� - ���ַ�
	8.ѧ��״̬�������ֱ�ʾ����������ѧ����ҵ...��

create table student(
	-- 1.��� id��ʾ�ֶ����������� int��ʾ��������������
	id int,
	-- 2.�����������������10������
	-- �����ַ�����ʹ��varchar��ʹ�ø�ʽ�� varchar(�ַ�����󳤶�)
	name varchar(10),
	-- 3.�Ա���Ϊȡֵֻ�����ֿ��ܣ�������һ������
	-- varcharһ���ǲ�ȷ���ַ�����ʱʹ�ã�charһ����ȷ���ַ�����ʱʹ��
	sex char(1),
	-- 4.���գ�ȡֵΪ������
	birthday date,
	-- 5.��ѧ�ɼ���С���������λ
	-- double(5,2) ��ʾ��ֵλ�����5λ��С������汣��2λ 3.14
	score double(5,2),
	-- 6.�ʼ���ַ����󳤶Ȳ����� 64
	email varchar(64),
	-- 7.��ͥ��ϵ�绰����һ�����ֻ����룬���ܻ���� - ���ַ�
	tel varchar(15),
	-- 8.ѧ��״̬�������ֱ�ʾ������0����ѧ1����ҵ2...��
	status int

);
----------------------------------------------------------------------------------
ע�⣺���ݱ��Ǵ������ݿ�����ģ����Դ������ݱ�֮ǰ�������л���������ݿ�
----------------------------------------------------------------------------------




2.���ı���ϰ
	-- 1.�޸�student����Ϊstu
	alter table student rename to stu;
	-- 2.��ѧ�������һ��remark������Ϊvarchar(20)
	alter table stu add  remark varchar(20);
	-- 3.�޸�remark�е�������varchar(100)
	alter table stu modify remark varchar(100);
	-- 4.�޸�remark�е�����Ϊintro,����varchar(30)
	alter table stu change remark intro varchar(30);
	-- 5.ɾ��intro��
	alter table stu drop intro;
3.�������
	-- 1.������ ��ʦ�Ͽθ��ƣ�ͬѧ��������Ҫһ��һ��д

create table student2
(
  id       int,
  name     varchar(20),
  age      int,
  birthday date,
  sex      char(2),
  address  varchar(100)
);
-- 2.���벿�����ݣ���id name age sex��ֵ
-- 2.1 ��sql���������������������ַ������ͣ�����ʹ��˫����Ҳ����ʹ�õ����ţ�����ʹ�õ�����
-- 2.2 ��������ݱ���벿���б��뽫��Ӧ��������д����
insert into student2(id, name, age, sex)
values (1, '����', 18, "��");

/*
  1.��mysql�в����ַ����ݣ�����ʹ�õ����Ż���˫���Ŷ����ԣ�����ʹ�õ�����
  2.��mysql�в����������date���ͣ���ô���뽫������д�ڵ����Ż���˫���Ŷ�����
*/

-- 3.�������е��ֶΣ���д�ֶ���
-- 3.1 ����ѡ��sql��䣺ctrl+enter
insert into student2
values (2, '����', 20, '1999-10-10', 'Ů', '����');

-- 4.�������е��ֶΣ�д���ֶ���
insert into student2(id, name, age, birthday, sex, address)
values (3, '����', 20, '1999-10-10', 'Ů', '����');
-- 5.������������
-- �����������ݣ�ֻ��һ��values��ÿ��ֵ��д��С�����У���ʹ�ö��ŷָ�
insert into student2(id, name, age, birthday, sex, address)
values (4, '����', 20, '1999-10-10', 'Ů', '����'),
       (5, '����ӱ', 19, '1999-10-10', 'Ů', '����');
-- ��������ע��
-- 6.��������ʱ ʡ����������ô�������Ҫ���и�ֵ��ôʹ��null
insert into student2
values (6, null, null, '1999-10-10', 'Ů', '����'),
       (7, '����ӱ', 21, '1999-10-10', 'Ů', '����');

insert into student2
values (10, null, null, 19991002, 'Ů', '����');


-- 4.�޸�����

-- 1.�޸����ݣ��޸��Ա𶼱�Ϊ��
update student2
set sex='��';
-- 2.�޸����ݣ��������޸�id��2��ѧ���Ա��ΪŮ
-- �޸��﷨�� update ���� set �ֶ���=�ֶ�ֵ,�ֶ���=�ֶ�ֵ,... where ����; where ����������дҲ���Բ���д
update student2
set sex='Ů'
where id = 2;

-- 3.һ���޸Ķ���У���idΪ3��ѧ��������ĳ�26�꣬address�ĳ��Ϻ�
update student2
set address ='�Ϻ�',
    age=26
where id = 3;

-- 5.ɾ������
	-- 1.������ɾ�����ݣ�ɾ��id��3�ļ�¼
  delete from student2 where id=3;
	-- 2.������ɾ�����ݣ�ɾ��id��1��2�ļ�¼   id in(1,2) : ��ʾid��ֵ��1����2
	-- ��sql�������������Ƕ��ֵ��ʱ����Կ���ʹ��in�ؼ��֣�ʹ�ø�ʽ�� �ֶ��� in(ֵ1,ֵ2,...);
 delete from student2 where id in(1,2);

	-- 3.��������ɾ��
	  -- 3.1 ʹ��DML��deleteɾ��
	  delete from student2;

	-- ������ʹ�ã�DDL
	-- �����table����ʡ��
  -- ������������������ݣ�����ʹ��truncate�����ɾ���������ݣ�ʹ��delete
  -- ������ű�����ʹ��truncateԭ�����������������ݱ�Ȼ�����´���һ�ź�ԭ���ṹһ�������ݱ�(�ձ�)
  -- delete ɾ������������һ��һ��ɾ��
  -- DDL��ɾ�������䣺drop table ����; ɾ�����ű������ˣ����ܲ�����
  truncate table student2;
  drop table stu;


-- 6.��ѯ����


	-- 1.��ѯ����ֶ�
	-- * ��ʾ�����ֶ�
  select * from student2;
	-- 2.д����ѯÿ�е����� select �ֶ���,�ֶ���,... from ����
  select id,name,age,birthday,sex,address from student2;
  select id,name,age from student2;
	-- 3.��ѯ����name��age�У�name�еı���Ϊ������age�еı���Ϊ����
	-- ʹ��as����ֶκͱ������
	-- as����ʡ��
	-- ��ʽ�� �ֶ��� as ����      ����  as ����
  select name as ����,age ���� from student2;

	-- 4.ȥ��
	-- ��ageȥ��
	select distinct age from student2;
	-- ��age��addressȥ��
	-- �������ֶ�һ��ȥ�أ�������е��ֶ�ֵȫ��һ���Ż�ȥ��
  select distinct age,address from student2;
  select  distinct age,address,name from student2;


-- 7.�������Ĳ�ѯ
	-- 1.��ѯ��ѧ�ɼ�����80ѧ��
  select * from student2 where math > 80;
	-- 2.��ѯӢ��ɼ�С�ڵ���80ѧ��
  select * from student2 where english <= 80;
	-- 3.��ѯ�������20��ѧ��
  select * from student2 where age=20;
	-- 4.��ѯ���䲻����20��ѧ��
  select * from student2 where age!=20;
  select * from student2 where age<>20;

	-- 5.��ѯ�������35�����Ա����е�ѧ��
  select * from student2 where age > 35 and sex='��';
	-- 6.��ѯ�������35�����Ա����е�ѧ��
   select * from student2 where age > 35 || sex='��';
   select * from student2 where age > 35 or  sex='��';
	-- 7.��ѯid��1 3 5��ѧ��
  select * from student2 where id in(1,3,5);

	-- 8.��ѯid����1 3 5��ѧ��
	-- not in ��in��ȡ������ʾ����ʲô����
  select * from student2 where id not in(1,3,5);
	-- ��Χ��ѯ
	-- 9.Ӣ��ɼ���75��90֮��
	-- �﷨��ʽ���ֶ��� between ֵ and ֵ
  -- ��������ֵ
	select * from student2 where english between 75 and 90;


	-- ģ����ѯ ʹ��like
	-- 10.��ѯ���Ե�ѧ��
	-- name like '��%' ��ʾname��ֵ���Կ�ʼ��������ʲô������
	-- %��ģ����ѯ�б�ʾ���������ַ�
	  select * from student2 where name like '��%'; -- % ƥ����ڵ���0�������ַ�


	-- 11.��ѯ������
	-- name like '%��%' ��ʾname��ֵֻҪ�����Ҽ��ɣ�ǰ��%��ʾƥ���������ַ�
  select * from student2 where name like '%��%';

	-- 12.��ѯ���Բ����������ֵ�ѧ��
	-- _�»�����ģ����ѯ�б�ʾ���ⵥ���ַ�
  -- ��__ :��ʾ���Կ�ʼ�������ַ�
  -- _��_ :��ʾ�Բ�ѯ�ڶ����ַ����Ե������ֵ�����
 select * from student2 where name like '��__';

	-- ����
	-- desc��ʾ����
	-- 13.�������併������
  -- ʹ�ø�ʽ��order by �ֶ��� desc/asc
  select * from student2 order by age desc;
	-- 14.�Ȱ������併���������������ͬ�ڰ�����ѧ��������
	/*
	  order by age desc,math desc
	    �����
	      age   math
	      40    80
	      36    100
	      20    90
	      20    80
	    ������
	      1.�Ȱ���ageֵ�������ageֵ����ȣ��򲻻����������򼴲����math�����ˣ�ֻ�ῴageֵ
	      2.���ageֵ��ͬ����������Ƚϣ�����math��������
	*/
  select * from student2 order by age desc,math desc;
	-- 15.�Ȱ������併���������������ͬ�ڰ�����ѧ��������
  select * from student2 order by age desc,math asc;
  select * from student2 order by age desc,math; -- Ĭ���������asc�����������һ��

	-- �ۺϺ���
	-- 16.��ѯѧ���������ж�����ѧ�� ʹ�þۺϺ�����count(����)
  select count(id) from student2; -- 4
  select count(english) from student2; -- 3 english��ĳһ��Ϊnull���ۺϺ�����null������ͳ��
  select count(*) from student2; -- 4 ����ʹ�����
	-- 17.��ѯ��ѧ�ɼ��ܷ���
  select sum(math) from student2;
	-- 18.��ѯ��ѧ�ɼ���߷���
  select max(math) from student2;
  -- ��Ӣ��ƽ��ֵ 56.6667  170/3
   select avg(english) from student2;
	-- 19.ͳ����ѧ��Ӣ���ܺ�ֵ
	-- ʵ��һ���ֱ�ͳ����ѧ��Ӣ���ÿ���ܳɼ���Ȼ��������
  -- sum(math) ͳ��math��һ���ܺ�ֵ
  -- sum(english) ͳ��english��һ���ܺ�ֵ
  -- sum(math)+sum(english) ��math��english�ܺ�ֵ�������
  select sum(math)+sum(english) from student2; -- 520

	-- ʵ�ֶ����ֱ�ͳ��ÿ���˵���ѧ��Ӣ��ɼ���Ȼ��ÿ���˵���ѧ��Ӣ��ɼ����
	select sum(math+english) from student2; -- 430 ����id��4��math90
	/*
		����ǣ�430����4��math90
		sum(math+english)��
		����ԭ��
      id��1���ܳɼ���100+90==��190
      id��2���ܳɼ���80+30==��110
      id��3���ܳɼ���90+null==��null ,��sql�����null�κ�ֵ�໥����ֵ��null,Ҳ����˵id��3��һ���ܳɼ���null,���ھۺϺ���
      sum����ͳ��null���������ﶪʧ������90


		����������⣺ʹ��mysql�Դ�������ifnull(�ֶ�ֵ,Ĭ��ֵ)
		˵����
			ifnull(�ֶ�ֵ,Ĭ��ֵ)
				����ֶ�ֵ��null����ôʹ��Ĭ��ֵ��Ϊifnull������������
				����ֶ�ֵ����null����ôʹ���ֶ�ֵ��Ϊifnull������������
			������
			ifnull(english,0)��
				1������english��ֵ��null===>ifnull(null,0)===>��������0
				2������english��ֵ��80===>ifnull(80,0)===>��������80
	*/
select sum(ifnull(math,0)+ifnull(english,0)) �ܳɼ� from student2; -- 520


-- ����
		-- ׼������
		create table car(
			id int,
			color char(2),
			price float
		);

		insert into car(id,color,price) values(1,'��ɫ',16);
		insert into car(id,color,price) values(2,'��ɫ',16);
		insert into car(id,color,price) values(3,'��ɫ',5);
		insert into car(id,color,price) values(4,'��ɫ',60);
		insert into car(id,color,price) values(5,'��ɫ',8);
		insert into car(id,color,price) values(6,'��ɫ',60);

    -- 1.��ѯÿ����ɫ�������ܼ�
  select color,sum(price) from car group by color;
		-- 2.��ѯÿ����ɫ�����ܼ۴���30��������ɫ���ܼ�
		-- ˵������sql�����where���治��ʹ�þۺϺ��� where sum(price)>30  �Ǵ����
    -- select color,sum(price) from car where sum(price)>30 group by color;
    /*
      ��������֮��ʹ�þۺϺ�����Ϊ���������ǿ���ʹ��having�ؼ��֡�
      ʹ�ø�ʽ��
        group by ������ֶ��� having ����֮�������
     */
    select color,sum(price) from car group by color having  sum(price)>30 ;
		-- 3.ע�⣺�����ѯ�Ľ������Ƿ����ֶκ;ۺϺ�������Ҫ�������ֶ�
		/*
		    id  color  sum(price)
		    4   ��ɫ    120
		    ˵������������в���ȷ����Ϊcolor��ɫ��id��������4����6
		 */
    select id,color,sum(price) from car group by color having  sum(price)>30 ;
		-- 4.where���治��ʹ�þۺϺ��� �����
    select color,sum(price) from car where sum(price)>30 group by color;


		-- С�᣺where���ڷ���ǰɸѡ��having���ڷ����ɸѡ
		-- 5.��ѯ���ĵ��۴���15��ÿ����ɫ�����ܼ۴���30��������ɫ���ܼ�
    select color,sum(price) from car where price > 15 group by color having sum(price) > 30;


-- ��ҳ
		-- 1.��ҳ��ѯ���ݣ�ÿҳ��ʾ2������
		-- ��һҳ
		-- 0 ��ʾ��ʼ��������Ӧ��һ������
		-- 2��ʾÿҳ��ʾ2������
  select * from car limit 0,2;
  	-- ��2ҳ
		-- 2 ��ʾ��ʼ��������Ӧ����������
		-- 2��ʾÿҳ��ʾ2������
  select * from car limit 2,2;

  -- ��3ҳ
		-- 4 ��ʾ��ʼ��������Ӧ����������
		-- 2��ʾÿҳ��ʾ2������
  select * from car limit 4,2;
		-- ����ʼ������0������¿��Բ�д����0��д�����£�
		-- �����2��ʾÿҳ��ʾ����������
  select * from car limit 2; -- ����ʡ���˵�һ��������ʼ����
    -- ��4ҳ
		-- 6��ʾ��ʼ��������Ӧ����������
		-- 2��ʾÿҳ��ʾ2������
  -- ע�⣺���һҳ��ʾ�����������п��ܺ�ǰ���ҳ��һ�£�ʣ�¼������ݾͻ���ʾ��������
  select * from car limit 6,2;



			/*
			  ��һҳ�� select * from car limit 0,2;
			  �ڶ�ҳ�� select * from car limit 2,2;
			  ����ҳ�� select * from car limit 4,2;
      ˵������ǰҳ�� ���ǵ�ǰλ�ڵڼ�ҳ
				��ʽ�� ��ʼ����  = ����ǰҳ��-1��*ÿҳ��ʾ������
					      0		            1		          2
					      2		            2		          2
					      4		            3		          2
			*/