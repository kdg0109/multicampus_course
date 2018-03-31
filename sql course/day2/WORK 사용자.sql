start C:\projects\실습또는과제\SQL\실습용DB테이블\work_db

--1
select * from tab;

--2
desc bonus;
desc dept;
desc emp;
desc salgrade;

--3
select * from emp;

--4
select empno, ename, sal from emp;

--5
select distinct sal from emp;

--6
select ename as "이 름", sal as "월 급" from emp;

--7
select ename, sal, sal+comm as "실급여"
from emp
where sal+comm is not null;

--8
select empno, ename, sal from emp where ename = 'SCOTT';

--9
select empno, ename, job
from emp 
where job = 'SALESMAN';

--10
select empno, ename, sal
from emp
where empno = '7499' or empno = '7521' or empno = '7654'; --where empno in('7499','7521', '7654');

--11
select empno, ename, sal
from emp
where sal >= 1500 and sal <= 3000; -- where sal between 1500 and 3000

--12
select ename
from emp
where deptno is null;

--13
select * 
from emp
order by sal desc;