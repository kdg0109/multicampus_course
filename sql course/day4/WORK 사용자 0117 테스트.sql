--ANSI ����(����Ŭ ����)

-- ���ϸ� : exercise_3.sql

select * from emp;
select * from dept;
select * from salgrade;
select * from bonus;

-- 1. DALLAS���� �ٹ��ϴ� ����� �̸�, ����, �μ���ȣ, �μ��̸��� ����Ͻÿ�.(5��)
--�̸�         ����        �μ��̸�          
---------- --------- --------------
--SMITH      CLERK     RESEARCH      
--JONES      MANAGER   RESEARCH      
--SCOTT      ANALYST   RESEARCH      
--ADAMS      CLERK     RESEARCH      
--FORD       ANALYST   RESEARCH
select ename as "�̸�", job as "����", deptno as "�μ���ȣ", dname as "�μ��̸�"
from emp join dept
using(deptno)
where loc = 'DALLAS';

select e.ename as "�̸�", e.job as "����", e.deptno as "�μ���ȣ", d.dname as "�μ��̸�"
from emp e, dept d
where e.deptno = d.deptno and loc = 'DALLAS';


-- 2. �̸��� 'A'�� ���� ������� �̸��� �μ��̸��� ����Ͻÿ�.(7��)
--�̸�         �μ��̸�          
---------- --------------
--ALLEN      SALES         
--WARD       SALES         
--MARTIN     SALES        
select ename as "�̸�", dname as "�μ��̸�"
from emp join dept
using(deptno)
where ename like '%A%';

select e.ename as "�̸�", d.dname as "�μ��̸�"
from emp e, dept d
where e.deptno = d.deptno and e.ename like '%A%';

-- 3. ����̸��� �� ����� ���� �μ��� �μ���, �׸��� ������ 
--����ϴµ� ������ 3000�̻��� ����� ����Ͻÿ�. (3��)
--����̸�       �μ���                    ����
---------- -------------- ----------
--KING       ACCOUNTING           5000
--FORD       RESEARCH             3000
--SCOTT      RESEARCH             3000
select ename as "�̸�", dname as "�μ���", sal as "����"
from emp join dept
using(deptno)
where sal >= 3000;

select e.ename as "�̸�", d.dname as "�μ���", e.sal as "����"
from emp e, dept d
where e.deptno = d.deptno and e.sal >= 3000;

-- 4. ������ 'SALESMAN'�� ������� ������ �� ����̸�, �׸���
-- �� ����� ���� �μ� �̸��� ����Ͻÿ�. (4��)
--����        ����̸�       �μ��̸�          
--------- ---------- --------------
--SALESMAN  TURNER     SALES         
--SALESMAN  MARTIN     SALES         
--SALESMAN  WARD       SALES         
--SALESMAN  ALLEN      SALES       
select job as "����", ename as "����̸�", dname as "�μ��̸�"
from emp join dept
using(deptno)
where job = 'SALESMAN';

select e.job as "����", e.ename as "����̸�", d.dname as "�μ��̸�"
from emp e, dept d
where e.deptno = d.deptno and job = 'SALESMAN';

-- 5. Ŀ�̼��� å���� ������� �����ȣ, �̸�, ����, ����+Ŀ�̼�,
-- �޿������ ����ϵ�, ������ �÷����� '�����ȣ', '����̸�',
-- '����','�Ǳ޿�', '�޿����'���� �Ͽ� ����Ͻÿ�. (6��)
--  �����ȣ ����̸�               ����        �Ǳ޿�       �޿����
---------- ---------- ---------- ---------- ----------
--  7521 WARD            15000      15200          2
--  7654 MARTIN          15000      15300          2
--  7844 TURNER          18000      18000          3
select empno as "�����ȣ", ename as "�̸�", sal*12 as "����", sal*12+comm as "�Ǳ޿�", grade as "�޿����"
from emp, salgrade
where sal between losal and hisal 
  and comm is not null;
  
  select e.empno as "�����ȣ", e.ename as "�̸�", e.sal*12 as "����", e.sal*12+comm as "�Ǳ޿�", s.grade as "�޿����"
from emp e, salgrade s
where sal between losal and hisal 
  and e.comm is not null;

-- 6. �μ���ȣ�� 10���� ������� �μ���ȣ, �μ��̸�, ����̸�,
-- ����, �޿������ ����Ͻÿ�. (3��)
--   �μ���ȣ �μ��̸�           ����̸�               ����       �޿����
---------- -------------- ---------- ---------- ----------
--      10 ACCOUNTING     CLARK            2450          4
--      10 ACCOUNTING     KING             5000          5
--      10 ACCOUNTING     MILLER           1300          2 
select deptno as "�μ���ȣ", dname as "�μ��̸�", ename as "����̸�", sal as "����", grade as "�޿����"
from emp join dept using(deptno), salgrade
where sal between losal and hisal 
  and deptno = 10;
  
select e.deptno as "�μ���ȣ", d.dname as "�μ��̸�", e.ename as "����̸�", e.sal as "����", s.grade as "�޿����"
from emp e, dept d, salgrade s
where e.deptno = d.deptno and sal between losal and hisal 
  and e.deptno = 10;

-- 7. �μ���ȣ�� 10��, 20���� ������� �μ���ȣ, �μ��̸�, 
-- ����̸�, ����, �޿������ ����Ͻÿ�. �׸��� �� ��µ� 
-- ������� �μ���ȣ�� ���� ������, ������ ���� ������ �����Ͻÿ�. (8��)
--   �μ���ȣ �μ��̸�           ����̸�               ����       �޿����
---------- -------------- ---------- ---------- ----------
--    10 ACCOUNTING     KING             5000          5
--    10 ACCOUNTING     CLARK            2450          4
select deptno as "�μ���ȣ", dname as "�μ��̸�", ename as "����̸�", sal as "����", grade as "�޿����"
from emp join dept using(deptno), salgrade
where sal between losal and hisal 
  and (deptno = 10 or deptno = 20)
order by deptno asc, sal desc;

select e.deptno as "�μ���ȣ", d.dname as "�μ��̸�", e.ename as "����̸�", e.sal as "����", s.grade as "�޿����"
from emp e, dept d, salgrade s
where e.deptno = d.deptno and sal between losal and hisal 
  and (e.deptno = 10 or e.deptno = 20)
order by e.deptno asc, sal desc;

-- 8. ������� �̸�, �μ���ȣ, �μ��̸��� ����Ͻÿ�. (15��) 
-- ��, ������ ���� �μ��� ����ϸ� �̰�� �̸��� '����'�̶��
-- ����Ѵ�.        
--�̸�               �μ���ȣ �μ��̸�          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH      
select nvl(ename, '����') as "�̸�", deptno as "�μ���ȣ", dname as "�μ��̸�"
from emp right join dept
using(deptno);

select nvl(e.ename, '����') as "�̸�", d.deptno as "�μ���ȣ", d.dname as "�μ��̸�"
from emp e, dept d
where d.deptno = e.deptno(+);

-- 9. ������� �̸�, �μ���ȣ, �μ��̸��� ����Ͻÿ�. (15��) 
-- ��, ���� �μ� ��ġ�� ������ ������  ����ϸ� �̰�� �μ���ȣ��  0 ����
-- ����Ѵ�.        
--�̸�               �μ���ȣ �μ��̸�          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH      
select ename as "�̸�", nvl(deptno, 0) as "�μ���ȣ", dname as "�μ��̸�"
from emp left join dept d
using(deptno);

select e.ename as "�̸�", nvl(e.deptno, 0) as "�μ���ȣ", d.dname as "�μ��̸�"
from emp e, dept d
where e.deptno = d.deptno(+);

-- 10. ������� �̸�, �μ���ȣ, �μ��̸��� ����Ͻÿ�. (16��) 
-- ��, ������ ���� �μ��� ����ϸ� �̰�� �̸��� �μ���ȣ�� '����'�̶��
-- ����Ѵ�. ���� �μ� ��ġ�� ������ ������  ����ϸ� �μ� ��ȣ�� �μ� �̸���
-- '����' �̶�� ����Ѵ�.     
--�̸�               �μ���ȣ �μ��̸�          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH    
select nvl(ename, '����') as "�̸�", 
    case when ename is null then '����' 
    when deptno is null then '����' 
    else to_char(deptno)
    end as "�μ���ȣ", nvl(to_char(dname), '����') as "�μ��̸�"
from emp full join dept
using(deptno);

--from emp e, dept d
--where e.deptno = d.deptno(+);
--union
--rom emp e, dept d
--where d.deptno = e.deptno(+);

--11. ���ʽ��� �޴� ��� ������ �̸�, ���ʽ�, �μ��̸�, ��ġ�� ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ�.

--ENAME           COMM        DNAME         	LOC
----------------------------------------------------
--KING		3500	ACCOUNTING	NEW YORK
--JONES		30	RESEARCH	DALLAS
--TURNER	0	SALES		CHICAGO
--MARTIN	300	SALES		CHICAGO
--WARD		200	SALES		CHICAGO
--ALLEN		300	SALES		CHICAGO         
select ENAME, COMM, DNAME, LOC
from emp join dept
using(deptno)
where comm is not null;

select e.ENAME, e.COMM, d.DNAME, d.LOC
from emp e, dept d
where d.deptno = e.deptno and comm is not null;

-- 12. DALLAS���� �ٹ��ϴ� ����� �̸�,  ����, ����� ����Ͻÿ�.(5��)
--�̸�         ����        ���          
---------- --------- --------------
--SMITH      800         1      
--JONES      2975       4   
--SCOTT            
--ADAMS           
--FORD             
select ename as "����̸�", sal as "����", grade as "���"
from emp join dept using(deptno), salgrade
where sal between losal and hisal 
  and loc = 'DALLAS';
  
select e.ename as "����̸�", e.sal as "����", s.grade as "���"
from emp e, dept d, salgrade s
where d.deptno = e.deptno and sal between losal and hisal 
  and d.loc = 'DALLAS';

--13. �����ȣ�� ����̸�, �׸��� �� ����� �����ϴ� �������� 
-- �����ȣ�� ����̸��� ����ϵ� ������ �÷����� '�����ȣ',
-- '����̸�', '�����ڹ�ȣ', '�������̸�'���� �Ͽ� ����Ͻÿ�. (15��)
--      �����ڰ� ������ '����'�� ��� ����Ѵ�.
--    �����ȣ ����̸�            �����ڹ�ȣ �������̸�     
---------- ---------- ---------- ----------
--  7902 FORD             7566 JONES     
--  7788 SCOTT            7566 JONES     
--   7900 JAMES            7698 BLAKE 

select empno as "�����ȣ", e.ename as "����̸�", nvl(to_char(e.mgr), '����') as "�����ڹ�ȣ", nvl(to_char(e.mgr), '����') as "�������̸�"
from emp e left join emp m
using(empno);

select e.empno as "�����ȣ", e.ename as "����̸�", nvl(to_char(e.mgr), '����') as "�����ڹ�ȣ", nvl(to_char(e.mgr), '����') as "�������̸�"
from emp e, emp m
where e.empno = m.empno;
