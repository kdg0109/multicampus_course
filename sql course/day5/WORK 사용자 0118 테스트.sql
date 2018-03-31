--�������ϸ� : exercise_4.sql
--QUESTION
select * from emp;
select * from dept;
select * from salgrade;
select * from bonus;

--1. ��� ������ ������ ����� ���Ͻÿ�. 
--       (�Ҽ��� ���� ��°�ڸ������� ��Ÿ���� ��°�ڸ� ���ʹ� �����Ͻÿ�)
select trunc(avg(sal), 2) as "���� ���"
from emp;

--2. ��� �������� �޴� Ŀ�̼��� ���� ���Ͻÿ�.
select sum(comm) as "Ŀ�̼� ��"
from emp;

--3. 'DALLAS'���� �ٹ����� ������ ����� ������ ���� ������ ���� �������� �����Ͻÿ�.
select '�������� ' || count(*) || '���̰� ' || '������ ' || '���� ' || sum(sal) || '�Դϴ�.' as "ó�� ���"
from emp join dept
using(deptno)
where loc = 'DALLAS';

--4. �μ��� �ִ� ������ "�μ���", "�ִ����" ���� ����Ͻÿ�.(�ִ������ ū ��)
select dname as �μ���, max(sal) as �ִ����
from emp join dept
using(deptno)
group by dname
order by max(sal) desc;

--5. ���޺� �ּ� ������ 3000 �̻��� �Ǵ� ������ ���޸�� �ּ� ������  ����Ͻÿ�. 
select job as ���޸�, min(sal) as "�ּ� ����"
from emp
group by job
having min(sal) >= 3000;


--6. �μ��� ��տ����� ����ϵ�, ��տ��ް� 2000����
-- ū �μ��� �μ� �̸��� ��տ����� ����Ͻÿ�.
select dname as �μ���, avg(sal) as ��տ���
from emp join dept
using(deptno)
group by dname
having avg(sal) > 2000;


--7. �� ���޺��� �ѿ����� ����ϵ� �ѿ����� ���� ������ ����Ͻÿ�.
select job as ����, sum(sal) as �ѿ���
from emp
group by job
order by sum(sal);


--8. ���޺� �ѿ����� ����ϵ�, ������ 'MANAGER'�� �������� �����Ͻÿ�. 
--   �׸��� �� �ѿ����� 5000���� ū ���޿� �ѿ��޸� ����Ͻÿ�.
select job as ���޸�, sum(sal) as �ѿ���
from emp
where job != 'MANAGER'
group by job
having sum(sal) > 5000;



--9. Ŀ�̼��� ������ ������ �߿��� �μ��� �ִ������ ����Ͻÿ�. 
--�ִ� ������ ���� ������ �����Ͽ� ����Ͻÿ�.
select dname as �μ���, max(sal) as �ִ����
from emp join dept
using(deptno)
where comm is not null
group by dname
order by max(sal) desc;




  