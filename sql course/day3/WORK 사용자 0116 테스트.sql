--QUESTION
--1. ��� ���̺��� ����̸��� ù���ڴ� �빮�ڷ�, �������� �ҹ��ڷ� ����Ͻÿ�.
-- [���]       ����̸�
--           ---------------------
--                  Smith
select initcap(ename) as ����̸� from emp;

--2. ������̺��� ����̸��� �̰� �� �̸��� �ι�° ���ں��� �׹�° ���ڱ���
-- ����Ͻÿ�.
-- [���]         ����̸�    2-4����
--                  ---------------------
--                  SMITH        MIT
select ename as ����̸�, 
        substr(ename, 2, 3) as "2-4����" 
from emp;

--3. ������̺��� ��� �̸��� ���� ������ ����Ͻÿ�.
select ename as ����̸�, 
        length(ename) as "���� ����" 
from emp;
        
--4. ������̺��� ��� �̸��� �� ���� �ϳ��� ������ ���� �ϳ��� ����ϵ� 
-- ��� �ҹ��ڷ� ���� ����Ͻÿ�.
select  lower(substr(ename, 1, 1)) as "�� ����",  
        lower(substr(ename, -1, 1)) as "������ ����" 
from emp;

--5. 3456.78�� �ݿø��Ͽ� �Ҽ��� �Ʒ� ù��° �ڸ� ������ ��Ÿ���ÿ�.
select round(3456.78, 1) as �ݿø� 
from dual;

--6. ���޿� 55�� ���ϰ� �ʴ����� �����Ͽ� ����ϴµ� ���޵ڿ� '��'�� ���̰� 
--    õ�������� ','�� �ٿ��� ����Ѵ�.
--[���]	��� ���
-----------------
--          	40,000��
--	80,000��
-- 	62,500��
--	148,700��
select concat(to_char(trunc(sal*55, -2), '999,999'), '��') as "��� ���" 
from emp;

--7. ���� �̸��� Ŀ�̼� ���� ���θ� ����ϴµ� �����Ǿ����� '����'
--    �������� �ʾ����� '����'�� ����Ͻÿ�.
--    	SMITH	����	
--	ALLEN	����	300
--	WARD	����	200
--	JONES	����	30
select ename, nvl2(comm, '����', '����'), comm
from emp;

--8. ���� �̸��� �μ���ȣ �׸��� �μ���ȣ�� ���� �μ����� ����Ͻÿ�.
--    �μ��� ���� ������ '����' �� ����Ͻÿ�.
--    (�μ��� : 10 �̸� 'A �μ�', 20 �̸� 'B �μ�', 30 �̸� 'C �μ�')
select ename, deptno,
      decode(deptno, 10, 'A �μ�',
                      20, 'B �μ�',
                      30, 'C �μ�',
                      '����') as �μ���
from emp;

--9. ������ 'SALESMAN'�̰� ������ 1000�̻��� �����
-- �̸��� ������ ����Ͻÿ�.
select ename as �̸�, sal as ����
from emp
where job = 'SALESMAN' and sal >= 1000;
--10. ���ó�¥�� ���ó�¥���� 10���� ���� ��¥�� ����Ͻÿ�.
select sysdate, sysdate + 10 from dual;
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
select ename, sal, sal*12+12*200 as ���� from emp;
--13.  ��������2_�߰�.docx �� ��ü
select ename as �̸�, sal as ����, 
                    case when sal < 1000 then 'A'
                    when sal < 2000 and sal >= 1000 then 'B'
                    when sal < 3000 and sal >= 2000 then 'C'
                    when sal < 4000 and sal >= 3000 then 'D'
                    else 'E' 
                    end as �ڵ�
from emp;
--14. ��������2_��.docx �� ��ü
select ename as �̸�, deptno as �μ���ȣ,
      decode(deptno, 10, 'A',
                      20, 'B',
                      30, 'C',
                      40, 'E',
                      'F') as �ڵ�
from emp;

--15.  ���̸��� Employee and Job Title�̰�, �޸��� �������� ���е� �����̸��� 
--������ ����ǵ��� �ϴ� ���Ǹ� �ۼ��Ͻÿ�.
select ename || ', ' || job as "Employee and Job Title"
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
select ename as �̸�, 
      to_char(hiredate, 'yyyy"��"fmmm"��"dd"��"') as �Ի���, 
      to_char(hiredate, 'day') as �Ի���� 
from emp
order by decode (TO_CHAR(hiredate, 'day'), '������', 1,
                                            'ȭ����', 2,
                                            '������', 3,
                                            '�����', 4,
                                            '�ݿ���', 5,
                                            '�����', 6,
                                            7) asc;
--order by to_char(hiredate-1,'d')

--�̸�                �Ի���              �Ի����
---------------------------------------------------
--MARTIN         1981��9��28��        ������




--18.   ��� ������ �̸��� ��������� �Ի�Ⱓ�� ������(���� ����� ���� �ݿø��� ��)�� 
--   ��ȸ�ϴ� ���Ǹ� �ۼ��Ͻÿ�
--   (�̶�, �Ի�Ⱓ�� �ش��ϴ� ����Ī�� ��MONTHS WORKED���� �ϰ�, 
--    �Ի�Ⱓ�� ���� ���� ���������� �����մϴ�.)
select ENAME, round(months_between(sysdate, hiredate), 0) as "MONTHS WORKED"
from emp
order by round(months_between(sysdate, hiredate), 0) asc;
--order by 2 asc;
--��¿�)
--ENAME         MONTHS WORKED
--------------------------------
--ADAMS            284
--SCOTT            286
--MILLER           348


--19. ������̺��� ����̸��� ������� ���� ��¥������ �ٹ��ϼ��� ���Ͻÿ�.
select ename as ����̸�, round(sysdate - hiredate) || '��' as �ٹ��ϼ�
from emp;
--����̸�   �ٹ��ϼ�
-- -----------------------
--SMITH    12474��
--ALLEN    12409��
--WARD    12407��
--JONES    12368��
--MARTIN    12189��
--BLAKE    12369��

--20. 1981�⵵�� �Ի��� �������� �̸�, ���� �׸��� �Ի�����
--         �Ի��� ������ ����Ͻÿ�.

select ename as �̸�, job as ����, to_char(hiredate, 'dd') as �Ի���
from emp
where to_char(hiredate, 'yyyy') = 1981 
--where hiredate like '1981%'
order by hiredate;

--21. �������� �������� ������ ����ϴ� SQL  ����� �ۼ��Ͻÿ�.
select to_char(to_date('19910109', 'yyyymmdd'), 'day') as ���� from dual;
--22. ���縦 �������� ���� �¾�� �� ���� �Ǿ����� �� �� �ִ� 
--      SQL ����� �ۼ��Ͻÿ�.
select trunc(months_between(sysdate, to_date('19910109', 'yyyymmdd')), 0) as ���� from dual;

--23. �������� �̸��� ���� �׸��� Ŀ�̼� ������ ����ϴµ�
--     Ŀ�̼��� �������� ���� ������ "����"�̶�� ����Ͻÿ�.
select ename as �̸�, sal as ����, nvl(to_char(comm), '����') as "Ŀ�̼� ����" from emp;

--24. ������̺��� �̸��� ù���ڰ� A�̰� ������ ���ڰ� N�� �ƴ� �����
-- �̸��� ����Ͻÿ�.
select ename as �̸�
from emp
where ename like 'A%' and substr(ename, -1) != 'N';
--where ename like 'A%' and ename not like '%N';

--25. ������ �̸�, �Ի� ��¥ �׸��� �⵵�� �������� �Ͽ� �ݿø��� ��¥��
--     ����Ͻÿ�.        
select ename as �̸�, hiredate as "�Ի� ��¥", round(hiredate, 'year') from emp;
