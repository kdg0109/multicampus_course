select * from tab;
select * from countries;                  -- ���� ����        ����id, ����name, (����id)
select * from departments;                -- �μ� ����        �μ�id, �μ�name, �Ŵ���id, (�����̼�id)
select * from employees;                  -- ���� ����        ����id, firstname, lastname, email, ����ȣ, �Ի糯¥, jobid, �޿�, Ŀ�̼�, �Ŵ���id, (�μ�id)
select * from emp_details_view;           -- ���������� ����   ����id, jobid, �Ŵ���id, (�μ�id), (�����̼�id), (����id), firstname, lastname, �޿�, Ŀ�̼�, �μ�name, jobŸ��Ʋ, ����, ������, country�̸�, �����̸�
select * from jobs;                       -- ���� ����        jobid, jobŸ��Ʋ, �ּұ޿�, �ִ�޿�
select * from job_history;                -- ���� �̷�        ����id, ���۳�¥, ���ᳯ¥, (jobid), (�μ�id)
select * from locations;                  -- �����̼� ����    �����̼�id, �����ּ�, ����code, ����, ������, (����id)
select * from regions;                    -- ���� ����        ����id, �����̸�
insert into news values (news_seq.nextval, '�赿��', '�׽�Ʈ', '�׽�Ʈ�Դϴ�', sysdate, 0);
insert into news values (news_seq.nextval, '���¿�', '�׽�Ʈ2', '�׽�Ʈ�Դϴ�2', sysdate, 0);
commit;
select * from news;
select id, writer, title, content, writedate, cnt from news;
     �÷���� : id - ���̰� 5�� ���� Ÿ�� - primary key
                    writer - �ѱ� �������� �ִ� 6�ڸ� ������ �� �ְ�
                    title - �ѱ� �������� �ִ� 40�ڸ� ������ �� �ְ�
	    content - �ѱ� �������� �ִ� 300�ڸ� ������ �� �ְ�
                    writedate - �ۼ���¥ ������ ������ �� �ְ�
                    cnt - ���̰� 8�� ���� Ÿ��
create table news (
  id number(5) primary key,
  writer varchar(18),
  title varchar(120),
  content varchar(900),
  writedate date,
  cnt number(8));
  commit;
-- �������� 1
--select * from tab;
--
--desc bonus;
--desc dept;
--desc emp;
--desc emp_dept;
--desc salgrade;
--
--select * from emp;
--
--select empno, ename, sal from emp;
--
--select distinct sal from emp;
--
--select ename as "�� ��", sal as "�� ��" from emp;

--�������� 2
--select initcap(ename) as ����̸� from emp;
--
--select ename as ����̸�, substr(ename, 2, 3) as "2-4����" from emp;
--
--select length(ename) as "��� �̸��� ���� ����" from emp;
--
--select substr(ename, 1, 1) as �ձ���, substr(ename, -1) as �ޱ��� from emp;
--
--select round(3456.78, 1) from dual;
--
--select concat(to_char(sal*55, '999,999'),'��') as "��� ���" from emp;
--
--select ename, nvl2(comm, '����', '����'), comm from emp;
--
--select * from emp;
--
--select ename, deptno, case when deptno = 10 then 'A �μ�'
--                           when deptno = 20 then 'B �μ�'
--                           when deptno = 30 then 'C �μ�'
--                           else '����'
--                      end as �μ���
--from emp;
--
--select ename, sal
--from emp
--where job = 'SALESMAN' and sal >= 1000;
--
--select sysdate, sysdate+10 from dual;
--
--select to_char(sysdate, 'yyyy"��" mm"��" dd"��" hh"��" mi"��"') as "���� �ð�" from dual;
--
--select ename as �̸�, sal as ���޿�, (sal+200)*12 as ���� from emp;
--
--select ename || ', ' || job as "Employee and Job Title" from emp;
--
--select ename from emp where ename like '_A%';
--
--select ename as �̸�, to_char(hiredate, 'yyyy"��"mm"��"dd"��"') as �Ի���, to_char(hiredate, 'day') as �Ի����
--from emp
--order by to_char(hiredate-1, 'd');
--
--select ENAME, round(months_between(sysdate, hiredate)) as "MONTHS WORKED" from emp order by "MONTHS WORKED" asc;
--
--select ename, trunc((sysdate-hiredate)) || '��' as �ٹ��ϼ� from emp;
--
--select ename, job, hiredate
--from emp
--where hiredate > to_date(1981, 'yyyy');
--
--select to_char(to_date('910109', 'rrmmdd'), 'day') as "����" from dual;
--
--select months_between(sysdate, to_date('910109', 'rrmmdd')) from dual;
--
--select ename, sal, nvl(to_char(comm), '����') as comm from emp;


--�������� 3
--select ename as �̸�, job as ����, dname as �μ��̸�
--from emp join dept
--using(deptno);
--
--select ename as �̸�, dname as �μ��̸�
--from emp join dept
--using(deptno)
--where ename like '%A%';
--
--select ename as ����̸�, dname as �μ���, sal as ����
--from emp join dept
--using(deptno)
--where sal >= 3000;
--
--select job as ����, ename as ����̸�, dname as �μ��̸�
--from emp join dept
--using(deptno)
--where job = 'SALESMAN';
--select * from salgrade;
--select empno as �����ȣ, ename as ����̸�, sal*12 as ����, sal*12+comm as �Ǳ޿�, grade as �޿����
--from emp join dept
--using(deptno), salgrade
--where comm is not null and sal between losal and hisal;
--select * from emp;
--
--select deptno as �μ���ȣ, dname as �μ��̸�, sal as ����, grade as �޿����
--from emp join dept
--using(deptno), salgrade
--where deptno = 10 and sal between losal and hisal;
--
--select nvl(ename, '����') as �̸�, deptno as �μ���ȣ, dname as �μ��̸�
--from emp right join dept
--using(deptno);
--
--select nvl(ename, '����') as �̸�, nvl(to_char(deptno), '����') as �μ���ȣ, nvl(dname, '����') as �μ��̸�
--from emp left join dept
--using(deptno);
--
--select nvl(ename, '����') as �̸�, case when nvl(ename, '����') = '����' then '����'
--                                      else  nvl(to_char(deptno), '����') end as �μ���ȣ, nvl(dname, '����') as �μ��̸�
--from emp full join dept
--using(deptno);
--select * from emp;
--select ENAME, COMM, DNAME, LOC
--from emp join dept
--using(deptno)
--where comm is not null;
--
--select ename as �̸�, sal as ����, grade as ���
--from emp join dept using(deptno), salgrade
--where loc = 'DALLAS' and sal between losal and hisal;
--
--select e.empno as �����ȣ, e.ename as ����̸�, p.mgr as �����ڹ�ȣ, p.ename as �������̸�
--from emp e, emp p
--where e.mgr = p.empno;


--�������� 4
--select trunc(avg(sal), 2) as ��տ��� from emp;
--
--select sum(comm) as ��տ��� from emp;
--
--select * from dept;
--
--select '��������' || count(ename) || '���̰� ������ ���� ' || sum(sal) || '�Դϴ�.' as ó�����
--from emp join dept
--using(deptno)
--where loc = 'DALLAS';
--
--select dname as �μ���, max(sal) as �ִ����
--from emp join dept using(deptno)
--group by dname;
--
--select job as ���޸�, min(sal) as �ּҿ���
--from emp
--where sal >= 3000
--group by job;
--
--select dname as �μ���, avg(sal) as ��տ���
--from emp join dept
--using(deptno)
--group by dname
--having avg(sal) >= 2000;
--
--select sum(sal)
--from emp
--group by job
--order by sum(sal);
--
--select job as ���޸�, sum(sal) as �ѿ���
--from emp
--where job != 'MANAGER'
--group by job
--having sum(sal) > 5000;
--
--select dname as �μ���, max(sal) as ��տ���
--from emp join dept
--using(deptno)
--where comm is not null
--group by dname
--order by max(sal) desc;


--�������� 6
select ENAME, SAL
from emp
where sal > (select sal from emp where ename = 'MARRY');

select ENAME, SAL, DEPTNO
from emp
where (ename, sal) in (select ename, sal from emp where deptno = 10);

-- 3�� ����
select ENAME, HIREDATE from emp join dept using(deptno) 
where dname = (select dname 
              from emp join dept using(deptno) 
              where ename = 'BLAKE') and ename != 'BLAKE';
              
select EMPNO, ENAME, SAL
from emp
where sal > (select avg(sal) from emp)
order by sal desc;

--5�� ����
select EMPNO, ENAME
from emp
where deptno in (select deptno from emp where ename like '%T%');

select EMPNO, ENAME, SAL
from emp
where sal > (select avg(sal) from emp) and deptno in (select deptno
                                                      from emp
                                                      where ename like '%S%');
select ename as �̸�, deptno as �μ���ȣ, sal as ����
from emp
where sal > all (select max(sal) from emp where deptno = 30);

select ENAME, DEPTNO, JOB
from emp join dept
using(deptno)
where dname = (select dname from dept where loc = 'DALLAS');

select DEPTNO, ENAME, JOB
from emp join dept
using(deptno)
where dname = 'SALES';

select ENAME, SAL
from emp
where mgr = (select empno from emp where ename = 'KING');

select ename as �̸�, sal as ����, deptno as �μ���ȣ
from emp
where comm is not null and (deptno, sal) in (select deptno, sal from emp);

select ENAME, SAL, COMM
from emp
where sal in (select sal from emp where deptno != 30)
            and comm in (select comm from emp where deptno != 30);

create view emp_dept (dname, sal, comm)
as
select dname, sal, comm
from emp join dept using(deptno);

select * from tab;
drop view emp_dept;

select dname as �μ���, max(sal) as �ִ����
from emp_dept
group by dname;

select dname as �μ��̸�, avg(sal) as ��տ���
from emp_dept
group by dname
having avg(sal) > 2000;
select * from dept;

select max(sal), dname
from emp_dept
where comm is not null
group by dname
order by max(sal) desc;