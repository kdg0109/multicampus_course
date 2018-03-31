select * from tab;
select * from countries;                  -- 나라 정보        나라id, 나라name, (지역id)
select * from departments;                -- 부서 정보        부서id, 부서name, 매니저id, (로케이션id)
select * from employees;                  -- 직원 정보        직원id, firstname, lastname, email, 폰번호, 입사날짜, jobid, 급여, 커미션, 매니저id, (부서id)
select * from emp_details_view;           -- 직원디테일 정보   직원id, jobid, 매니져id, (부서id), (로케이션id), (나라id), firstname, lastname, 급여, 커미션, 부서name, job타이틀, 도시, 도시주, country이름, 지역이름
select * from jobs;                       -- 직장 정보        jobid, job타이틀, 최소급여, 최대급여
select * from job_history;                -- 직장 이력        직원id, 시작날짜, 종료날짜, (jobid), (부서id)
select * from locations;                  -- 로케이션 정보    로케이션id, 도로주소, 우편code, 도시, 도시주, (나라id)
select * from regions;                    -- 지역 정보        지역id, 지역이름
insert into news values (news_seq.nextval, '김동건', '테스트', '테스트입니다', sysdate, 0);
insert into news values (news_seq.nextval, '이태우', '테스트2', '테스트입니다2', sysdate, 0);
commit;
select * from news;
select id, writer, title, content, writedate, cnt from news;
     컬럼사양 : id - 길이가 5인 숫자 타입 - primary key
                    writer - 한글 기준으로 최대 6자를 저장할 수 있게
                    title - 한글 기준으로 최대 40자를 저장할 수 있게
	    content - 한글 기준으로 최대 300자를 저장할 수 있게
                    writedate - 작성날짜 정보를 저장할 수 있게
                    cnt - 길이가 8인 숫자 타입
create table news (
  id number(5) primary key,
  writer varchar(18),
  title varchar(120),
  content varchar(900),
  writedate date,
  cnt number(8));
  commit;
-- 연습문제 1
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
--select ename as "이 름", sal as "월 급" from emp;

--연습문제 2
--select initcap(ename) as 사원이름 from emp;
--
--select ename as 사원이름, substr(ename, 2, 3) as "2-4문자" from emp;
--
--select length(ename) as "사원 이름의 문자 개수" from emp;
--
--select substr(ename, 1, 1) as 앞글자, substr(ename, -1) as 뒷글자 from emp;
--
--select round(3456.78, 1) from dual;
--
--select concat(to_char(sal*55, '999,999'),'원') as "계산 결과" from emp;
--
--select ename, nvl2(comm, '설정', '미정'), comm from emp;
--
--select * from emp;
--
--select ename, deptno, case when deptno = 10 then 'A 부서'
--                           when deptno = 20 then 'B 부서'
--                           when deptno = 30 then 'C 부서'
--                           else '없당'
--                      end as 부서명
--from emp;
--
--select ename, sal
--from emp
--where job = 'SALESMAN' and sal >= 1000;
--
--select sysdate, sysdate+10 from dual;
--
--select to_char(sysdate, 'yyyy"년" mm"월" dd"일" hh"시" mi"분"') as "현재 시간" from dual;
--
--select ename as 이름, sal as 월급여, (sal+200)*12 as 연봉 from emp;
--
--select ename || ', ' || job as "Employee and Job Title" from emp;
--
--select ename from emp where ename like '_A%';
--
--select ename as 이름, to_char(hiredate, 'yyyy"년"mm"월"dd"일"') as 입사일, to_char(hiredate, 'day') as 입사요일
--from emp
--order by to_char(hiredate-1, 'd');
--
--select ENAME, round(months_between(sysdate, hiredate)) as "MONTHS WORKED" from emp order by "MONTHS WORKED" asc;
--
--select ename, trunc((sysdate-hiredate)) || '일' as 근무일수 from emp;
--
--select ename, job, hiredate
--from emp
--where hiredate > to_date(1981, 'yyyy');
--
--select to_char(to_date('910109', 'rrmmdd'), 'day') as "요일" from dual;
--
--select months_between(sysdate, to_date('910109', 'rrmmdd')) from dual;
--
--select ename, sal, nvl(to_char(comm), '미정') as comm from emp;


--연습문제 3
--select ename as 이름, job as 직위, dname as 부서이름
--from emp join dept
--using(deptno);
--
--select ename as 이름, dname as 부서이름
--from emp join dept
--using(deptno)
--where ename like '%A%';
--
--select ename as 사원이름, dname as 부서명, sal as 월급
--from emp join dept
--using(deptno)
--where sal >= 3000;
--
--select job as 직위, ename as 사원이름, dname as 부서이름
--from emp join dept
--using(deptno)
--where job = 'SALESMAN';
--select * from salgrade;
--select empno as 사원번호, ename as 사원이름, sal*12 as 연봉, sal*12+comm as 실급여, grade as 급여등급
--from emp join dept
--using(deptno), salgrade
--where comm is not null and sal between losal and hisal;
--select * from emp;
--
--select deptno as 부서번호, dname as 부서이름, sal as 월급, grade as 급여등급
--from emp join dept
--using(deptno), salgrade
--where deptno = 10 and sal between losal and hisal;
--
--select nvl(ename, '미정') as 이름, deptno as 부서번호, dname as 부서이름
--from emp right join dept
--using(deptno);
--
--select nvl(ename, '미정') as 이름, nvl(to_char(deptno), '미정') as 부서번호, nvl(dname, '미정') as 부서이름
--from emp left join dept
--using(deptno);
--
--select nvl(ename, '미정') as 이름, case when nvl(ename, '미정') = '미정' then '미정'
--                                      else  nvl(to_char(deptno), '미정') end as 부서번호, nvl(dname, '미정') as 부서이름
--from emp full join dept
--using(deptno);
--select * from emp;
--select ENAME, COMM, DNAME, LOC
--from emp join dept
--using(deptno)
--where comm is not null;
--
--select ename as 이름, sal as 월급, grade as 등급
--from emp join dept using(deptno), salgrade
--where loc = 'DALLAS' and sal between losal and hisal;
--
--select e.empno as 사원번호, e.ename as 사원이름, p.mgr as 관리자번호, p.ename as 관리자이름
--from emp e, emp p
--where e.mgr = p.empno;


--연습문제 4
--select trunc(avg(sal), 2) as 평균월급 from emp;
--
--select sum(comm) as 평균월급 from emp;
--
--select * from dept;
--
--select '직원들은' || count(ename) || '명이고 월급의 합은 ' || sum(sal) || '입니다.' as 처리결과
--from emp join dept
--using(deptno)
--where loc = 'DALLAS';
--
--select dname as 부서명, max(sal) as 최대월급
--from emp join dept using(deptno)
--group by dname;
--
--select job as 직급명, min(sal) as 최소월급
--from emp
--where sal >= 3000
--group by job;
--
--select dname as 부서명, avg(sal) as 평균월급
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
--select job as 직급명, sum(sal) as 총월급
--from emp
--where job != 'MANAGER'
--group by job
--having sum(sal) > 5000;
--
--select dname as 부서명, max(sal) as 평균월급
--from emp join dept
--using(deptno)
--where comm is not null
--group by dname
--order by max(sal) desc;


--연습문제 6
select ENAME, SAL
from emp
where sal > (select sal from emp where ename = 'MARRY');

select ENAME, SAL, DEPTNO
from emp
where (ename, sal) in (select ename, sal from emp where deptno = 10);

-- 3번 문제
select ENAME, HIREDATE from emp join dept using(deptno) 
where dname = (select dname 
              from emp join dept using(deptno) 
              where ename = 'BLAKE') and ename != 'BLAKE';
              
select EMPNO, ENAME, SAL
from emp
where sal > (select avg(sal) from emp)
order by sal desc;

--5번 문제
select EMPNO, ENAME
from emp
where deptno in (select deptno from emp where ename like '%T%');

select EMPNO, ENAME, SAL
from emp
where sal > (select avg(sal) from emp) and deptno in (select deptno
                                                      from emp
                                                      where ename like '%S%');
select ename as 이름, deptno as 부서번호, sal as 월급
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

select ename as 이름, sal as 월급, deptno as 부서번호
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

select dname as 부서명, max(sal) as 최대월급
from emp_dept
group by dname;

select dname as 부서이름, avg(sal) as 평균월급
from emp_dept
group by dname
having avg(sal) > 2000;
select * from dept;

select max(sal), dname
from emp_dept
where comm is not null
group by dname
order by max(sal) desc;