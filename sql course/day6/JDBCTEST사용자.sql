-- jdbctest ��� ����ڷ� �����ؼ� �� ���̺���� �����Ѵ�.
-- exercise_5.sql
--1. ���̺�� : visitor
--    �÷� ��� : name - �ѱ� �������� �ִ� 6�ڸ� ������ �� �ְ�
--                     writedate - ��¥�� ������ �� �ְ� 
--                     memo - �ѱ� �������� �ִ� 60�ڸ� ������ �� �ְ�
--
--                    [visitor ���̺� �����͸� 3�� ���� �Է�]
--	    ��¥ ������ : 1�� : ����ð�,  
--                                         1�� : 2016�� 12�� 25��, 
--                                         1�� : 1999�� 8�� 11��

create table visitor (
  name  varchar(18),
  writedate date,
  memo varchar(180));

insert into visitor (name, writedate, memo) values ('�ȵ���̵�', sysdate, '����� ���־�');
insert into visitor values ('���̽���', to_date('2016�� 12�� 25��', 'yyyy"��" mm"��" dd"��"'), '���� �����ϴ� ������');
insert into visitor values ('�����', to_date('1999�� 8�� 11��', 'yyyy"��" mm"��" dd"��"'), '���� �߱�����');
commit;
--
-- 2. ���̺�� : member
--    �÷� ��� : memId -  ���� �������� �ִ� 12�ڸ� ������ �� �ְ� - primary key
--	     memPwd - ���� �������� �ִ� 12�ڸ� ������ �� �ְ� - not null
--	     memName - �ѱ� �������� �ִ� 6�ڸ� ������ �� �ְ�  - not null
--                     memPic - �̹���(���̳ʸ� ����)�� ������ �� �ְ�(blob Ÿ��)     ���̳ʸ� ���� ������Ʈ             
--                     joindate - ���Գ�¥ ������ ������ �� �ְ� - �⺻�� ����(���� ��¥) sysdate

create table member (
  memId varchar(12) primary key,
  memPwd varchar(12) not null,
  memName varchar(18) not null,
  memPic blob,                
  joindate date default sysdate);
  
-- 3. ���̺�� : news
--     �÷���� : id - ���̰� 5�� ���� Ÿ�� - primary key
--                    writer - �ѱ� �������� �ִ� 6�ڸ� ������ �� �ְ�
--                    title - �ѱ� �������� �ִ� 40�ڸ� ������ �� �ְ�
--	    content - �ѱ� �������� �ִ� 300�ڸ� ������ �� �ְ�
--                    writedate - �ۼ���¥ ������ ������ �� �ְ�
--                    cnt - ���̰� 8�� ���� Ÿ��

create table news (
  id number(5) primary key,
  writer varchar(18),
  title varchar(120),
  content varchar(900),
  writedate date,
  cnt number(8));