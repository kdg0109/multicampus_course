--QUESTION
--1. 'MARRY'���� ������ ���� �޴� ������� �̸��� ������ ����Ͻÿ�.(12��)
--ENAME             SAL
---------- ----------
--ALLEN            1600
--WARD             1250
select ENAME, SAL
from emp
where sal > (select sal
              from emp
              where ename = 'MARRY');
--2. 10�� �μ��� ������ ���� ������ �޴� ������� �̸�, ����, (3��)
--   �μ���ȣ�� ����Ͻÿ�.
ENAME             SAL     DEPTNO
---------- ---------- ----------
CLARK            2450         10
KING             5000         10
MILLER           1300         10
select ENAME, SAL, DEPTNO
from emp
where sal in (select sal
              from emp
              where deptno = 10);

--3. 'BLAKE'�� ���� �μ��� �ִ� ������� �̸��� ������� �̴µ� 'BLAKE'�� ���� ����Ͻÿ�. (5��)
--ENAME      HIREDATE
---------- --------
--JAMES      81/10/03
--TURNER     81/09/08
select ENAME, HIREDATE
from emp
where deptno = (select deptno
                from emp
                where ename = 'BLAKE') and ename <> 'BLAKE';

--4. ��ձ޿����� ���� �޿��� �޴� ������� �����ȣ, �̸�, ������
-- ����ϵ�, ������ ���� ��� ������ ����Ͻÿ�.(6��)
--  EMPNO ENAME             SAL
---------- ---------- ----------
--   7839 KING             5000
--   7902 FORD             3000
select EMPNO, ENAME, SAL
from emp
where sal > (select avg(sal) from emp)
order by sal desc;
--5. �̸��� 'T'�� �����ϰ� �ִ� ������ ���� �μ����� �ٹ��ϰ�
--   �ִ� ����� �����ȣ�� �̸��� ����Ͻÿ�.(11��)
--     EMPNO ENAME     
---------- ----------
--      7902 FORD      
--      7876 ADAMS     
--      7788 SCOTT   
select EMPNO, ENAME
from emp
where deptno in (select deptno
                from emp
                where ename like '%T%');
--6 �ڽ��� �޿��� ��ձ޿����� ����,�̸��� S�ڰ� ���� ����� ������
--  �μ����� �ٹ��ϴ� ��� ����� �����ȣ,�̸� �� �޿��� ����Ͻÿ�(4��)
--     EMPNO    ENAME      SAL
--    --------  --------  -------
--      7902     FORD       3000
--      7788     SCOTT      3000
--      7566     JONES      2975
--      7698     BLAKE     2850
select EMPNO, ENAME, SAL
from emp
where sal > (select avg(sal) from emp) and deptno in (select deptno
                                                      from emp
                                                      where ename like '%S%');

--7. 30�� �μ��� �ִ� ����� �߿��� ���� ���� ������ �޴� �������
--   ���� ������ �޴� ������� �̸�, �μ���ȣ, ������ ����Ͻÿ�. (4��)
--   (��, ALL �Ǵ� ANY �����ڸ� ����� ��)
--  �̸�    �μ���ȣ   ����
--------------------------------
--  JONES     20     2975
--  SCOTT     20     3000
--  KING       10     5000
--  FORD      20     3000
select ename as �̸�, deptno as �μ���ȣ, sal as ����
from emp
where sal >all (select sal from emp where deptno = 30);

--8. 'DALLAS'���� �ٹ��ϰ� �ִ� ����� ���� �μ����� ���ϴ� �����
--   �̸�, �μ���ȣ, ������ ����Ͻÿ�.(5��)
--ENAME          DEPTNO JOB      
---------- ---------- ---------
--FORD               20 ANALYST  
--ADAMS              20 CLERK    
--SCOTT              20 ANALYST  
--JONES              20 MANAGER  
--SMITH              20 CLERK 
select ENAME, DEPTNO, JOB
from emp
where deptno = (select deptno from dept where loc = 'DALLAS'); 
--9. SALES �μ����� ���ϴ� ������� �μ���ȣ, �̸�, ������ ����Ͻÿ�.(6��)
--    DEPTNO ENAME      JOB      
---------- ---------- ---------
--    30 JAMES      CLERK    
--    30 TURNER     SALESMAN 
--    30 BLAKE      MANAGER  
select DEPTNO, ENAME, JOB
from emp
where deptno = (select deptno from dept where dname = 'SALES');  
--10. 'KING'���� �����ϴ� ��� ����� �̸��� �޿��� ����Ͻÿ�. (3��)
--     (KING���� �����ϴ� ����̶� mgr�� KING�� ����� �ǹ���) 
--ENAME             SAL
---------- ----------
--CLARK            2450
--BLAKE            2850
--JONES            2975
select ENAME, SAL
from emp
where mgr = (select empno from emp where ename = 'KING');
--11. Ŀ�̼��� �޴� ����� / �μ���ȣ, ������ ���� �����
--    �̸�, ����, �μ���ȣ�� ����Ͻÿ�. (6��)
--	ALLEN	1600	30
--	MARTIN	1250	30
--	WARD	1250	30
--	JONES	2975	20
--	KING	5000	10
--	TURNER	1500	30
select ename as �̸�, sal as ����, deptno as �μ���ȣ
from emp
where comm is not null 
  and deptno in (select deptno from emp) 
  and sal in (select sal from emp);
  
select ename as �̸�, sal as ����, deptno as �μ���ȣ
from emp
where (sal, deptno) in (select sal, deptno from emp where comm is not null);
--12. 30�� �μ� ������ ���ް� Ŀ�̼��� ���� ����
--    ������� �̸�, ����, Ŀ�̼��� ����Ͻÿ�.(30�� �μ� ����) (2��)
--  ENAME      SAL    COMM
---------- ---------- ----------
--	JONES	2975	30
--	KING	5000	3500
select ENAME, SAL, COMM
from emp
where 
  sal !=all (select sal from emp where deptno = 30) 
  and comm !=all (select comm from emp where deptno = 30 and comm is not null);
--select ENAME, SAL, COMM
--from emp
--where sal not in (select sal from emp where deptno = 30)
--      and comm in (select comm from emp where deptno != 30);
  
***************************************************************
--4. �μ��� �ִ� ������ "�μ���", "�ִ����" ���� ����Ͻÿ�.(�ִ������ ū ��)
--6.�μ��� ��տ����� ����ϵ�, ��տ��ް� 2000����
-- ū �μ��� �μ� �̸��� ��տ����� ����Ͻÿ�.
--9. Ŀ�̼��� ������ ������ �߿��� �μ��� �ִ������ ����Ͻÿ�. 
--�ִ� ������ ���� ������ �����Ͽ� ����Ͻÿ�.

�� �������� ���� ������ �ǽ��Դϴ�. emp_dept ��� �̸��� �並 ����
�����ϴ� �ڵ�� ������ ���ϴ�. ���� ��Ī�� ������ ���̰� �並 ���鶧 � �÷�����
�����Ͽ� ������ �������� ���Ƿ� ���մϴ�.

13. ����� SQL
create view emp_dept(dname, sal, comm)
as
select dname, sal, comm
from emp join dept
using(deptno);
14. ���� 4�� ���ۼ�
select dname as �μ���, max(sal) as �ִ����
from emp_dept
group by dname
order by max(sal) desc;
15. ���� 6�� ���ۼ�
select dname as �μ���, avg(sal) as ��տ���
from emp_dept
group by dname
having avg(sal) > 2000;
16. ���� 9�� ���ۼ� 
select dname as �μ���, max(sal) as �ִ����
from emp_dept
where comm is not null
group by dname
order by max(sal) desc;

select avg(sell_price)
from goods
group by goods_classify;

select goods_classify, goods_name, sell_price
from goods s1
where sell_price > (select avg(sell_price)
                    from goods s2
                    where s1.goods_classify = s2.goods_classify
                    group by goods_classify);
                    
select goods_name, sell_price
from goods s
where exists (select * from storegoods ts
              where ts.store_id = '000C'
              and ts.goods_id = s.goods_id);
              
select goods_name, sell_price
from goods s
where goods_id in (select goods_id from storegoods ts
              where ts.store_id = '000C');
              
select goods_name, sell_price
from goods s
where not exists (select * from storegoods ts
                  where ts.store_id = '000A'
                  and ts.goods_id = s.goods_id);
                  
select goods_name, sell_price
from goods s
where goods_id not in (select goods_id from storegoods ts
                  where ts.store_id = '000A');
                  
select emp_id, emp_name, '������' as ����
from employee e
where exists (select null
              from employee
              where e.emp_id = mgr_id)
union
select emp_id, emp_name, '����' as ����
from employee e2
where not exists (select null
              from employee
              where e2.emp_id = mgr_id)
order by 3, 1;