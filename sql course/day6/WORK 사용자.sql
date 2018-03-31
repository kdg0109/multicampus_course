--QUESTION
--1. ��� ���̺��� ����̸��� ù���ڴ� �빮�ڷ�, �������� �ҹ��ڷ� ����Ͻÿ�.
-- [���]       ����̸�
--           ---------------------
--                  Smith
select INITCAP(ename) as ����̸� 
from emp;

--2. ������̺��� ����̸��� �̰� �� �̸��� �ι�° ���ں��� �׹�° ���ڱ���
-- ����Ͻÿ�.
-- [���]         ����̸�    2-4����
--                  ---------------------
--                  SMITH        MIT
select ename as ����̸�, SUBSTR(ename,2,3) as "2-4����"
from emp;

--3. ������̺��� ��� �̸��� ���� ������ ����Ͻÿ�.
select LENGTH(ename) as "��� �̸��� ���� ����"
from emp;

--4. ������̺��� ��� �̸��� �� ���� �ϳ��� ������ ���� �ϳ��� ����ϵ� 
-- ��� �ҹ��ڷ� ���� ����Ͻÿ�.
select substr(ename, 1, 1) as "�� ����", substr(ename, -1) as "������ ����"
from emp;

--5. 3456.78�� �ݿø��Ͽ� �Ҽ��� �Ʒ� ù��° �ڸ� ������ ��Ÿ���ÿ�.
select round(3456.78, 1)
from dual;

--6. ���޿� 55�� ���ϰ� �ʴ����� �����Ͽ� ����ϴµ� ���޵ڿ� '��'�� ���̰� 
--    õ�������� ','�� �ٿ��� ����Ѵ�.
--[���]	��� ���
-----------------
--          	40,000��
--	80,000��
-- 	62,500��
--	148,700��
select to_char(trunc(sal*55, -1), '999,999') || '��' as "��� ���"
from emp;

--7. ���� �̸��� Ŀ�̼� ���� ���θ� ����ϴµ� �����Ǿ����� '����'
--    �������� �ʾ����� '����'�� ����Ͻÿ�.
--    	SMITH	����	
--	ALLEN	����	300
--	WARD	����	200
--	JONES	����	30
select ename as "���� �̸�", nvl2(comm, '����', '����') as "���� ����"
from emp;

--8. ���� �̸��� �μ���ȣ �׸��� �μ���ȣ�� ���� �μ����� ����Ͻÿ�.
--    �μ��� ���� ������ '����' �� ����Ͻÿ�.
--    (�μ��� : 10 �̸� 'A �μ�', 20 �̸� 'B �μ�', 30 �̸� 'C �μ�')
select ename as "���� �̸�", deptno as "�μ���ȣ",
    case when deptno = 10 then 'A �μ�'
          when deptno = 20 then 'B �μ�'
          when deptno = 30 then 'C �μ�'
          else '����'
    end as "�μ���"
from emp;
    
select * from emp;
select * from dept;
--9. ������ 'SALESMAN'�̰� ������ 1000�̻��� �����
-- �̸��� ������ ����Ͻÿ�.
select ename as �̸�, sal as ����
from emp
where job = 'SALESMAN' and sal >= 1000;

--10. ���ó�¥�� ���ó�¥���� 10���� ���� ��¥�� ����Ͻÿ�.
select sysdate as ���ó�¥, (sysdate + 10) as "10�� ���� ��¥"
from dual;

--11. ���� �ð��� "....�� ..�� ..�� ..�� ..��" ���� ����Ͻÿ�.
select to_char(sysdate, 'yyyy"��" mm"��" dd"��" hh"��" mi"��"') as "���� �ð�"
from dual;

--12. ������ �̸�, ���޿�, ������ ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ�.
--(��, ������ ������ $200�� �� ���ʽ��� �����Ͽ� ����մϴ�.)

--�̸�              ���޿�               ����
---------------------------------------------------
--SMITH             800                 12000
--ALLEN            1600                 21600
--WARD             1250                 17400
select ename as  �̸�, sal as ���޿�, (sal+200)*12 as ����
from emp;

--13.  ��������2_�߰�.docx �� ��ü

--14. ��������2_��.docx �� ��ü


--15.  ���̸��� Employee and Job Title�̰�, �޸��� �������� ���е� �����̸��� 
--������ ����ǵ��� �ϴ� ���Ǹ� �ۼ��Ͻÿ�.
select (ename || ', ' || job) as "Employee and Job Title"
from emp;
--Employee and Job Title
---------------------------
--SMITH, CLERK
--ALLEN, SALESMAN



--16. �̸��� �ι�° ���ڰ� ��A���� ��� ������ �̸��� ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ� 
select ENAME
from emp
where ename like '_A%';
--ENAME
----------
--WARD 
--MARTIN
--JAMES



--17. �̸�, �Ի���, �Ի��� ������ ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ�
--�Ի��� ������ �������� �������� �����մϴ�.(�̶� ���ؿ����� �����Ϸ� �մϴ�)
--(�̶�, �̸�, �Ի��� �Ի���� ��Ī�� ����մϴ�.)

--�̸�                �Ի���              �Ի����
---------------------------------------------------
--MARTIN         1981��9��28��        ������
select ename as �̸�, to_char(hiredate, 'yyyy"��"fmmm"��"dd"��"') as �Ի���, to_char(hiredate, 'day') as �Ի����
from emp
order by next_day(HIREDATE,'������') - hiredate desc;
--HIREDATE�� ���� ����� �����Ͽ� �ش��ϴ� ��¥�� �����̰� �ű⼭ hiredate �� ����.

--18.   ��� ������ �̸��� ��������� �Ի�Ⱓ�� ������(���� ����� ���� �ݿø��� ��)�� 
--   ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ�
--   (�̶�, �Ի�Ⱓ�� �ش��ϴ� ����Ī�� ��MONTHS WORKED���� �ϰ�, 
--    �Ի�Ⱓ�� ���� ���� ���������� �����մϴ�.)

--��¿�)
--ENAME         MONTHS WORKED
--------------------------------
--ADAMS            284
--SCOTT            286
--MILLER           348
select ENAME, round(months_between(sysdate, hiredate), 0) as "MONTHS WORKED"
from emp;


--19. ������̺��� ����̸��� ������� ���� ��¥������ �ٹ��ϼ��� ���Ͻÿ�.
--����̸�   �ٹ��ϼ�
-- -----------------------
--SMITH    12474��
--ALLEN    12409��
--WARD    12407��
--JONES    12368��
--MARTIN    12189��
--BLAKE    12369��
select ENAME as ����̸�, round(sysdate-hiredate, 0) || '��' as �ٹ��ϼ�
from emp;

--20. 1981�⵵�� �Ի��� �������� �̸�, ���� �׸��� �Ի�����
--         �Ի��� ������ ����Ͻÿ�.
select ename as �̸�, job as ����, hiredate as �Ի���
from emp
where to_char(hiredate, 'yyyy') = '1981';

--21. �������� �������� ������ ����ϴ� SQL  ����� �ۼ��Ͻÿ�.
select to_char(to_date('19910109'), 'day') as ���� from dual;
--22. ���縦 �������� ���� �¾�� �� ���� �Ǿ����� �� �� �ִ� 
--      SQL ����� �ۼ��Ͻÿ�.

select months_between(sysdate, to_date('19910109')) as ���� from dual;

--23. �������� �̸��� ���� �׸��� Ŀ�̼� ������ ����ϴµ�
--     Ŀ�̼��� �������� ���� ������ "����"�̶�� ����Ͻÿ�.
select ename as �̸�, sal as ����, nvl(to_char(comm), '����') as ������
from emp;

--24. ������̺��� �̸��� ù���ڰ� A�̰� ������ ���ڰ� N�� �ƴ� �����
-- �̸��� ����Ͻÿ�.
select ename as ���
from emp
where ename like 'A%' and ename not like '%N';
--25. ������ �̸�, �Ի� ��¥ �׸��� �⵵�� �������� �Ͽ� �ݿø��� ��¥��
--     ����Ͻÿ�.        
select ename as �̸�, hiredate as "�Ի� ��¥", round(hiredate, 'year') as �ݿø�
from emp;