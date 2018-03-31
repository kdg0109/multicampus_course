--ANSI 조인(오라클 조인)

-- 파일명 : exercise_3.sql

select * from emp;
select * from dept;
select * from salgrade;
select * from bonus;

-- 1. DALLAS에서 근무하는 사원의 이름, 직위, 부서번호, 부서이름을 출력하시오.(5개)
--이름         직위        부서이름          
---------- --------- --------------
--SMITH      CLERK     RESEARCH      
--JONES      MANAGER   RESEARCH      
--SCOTT      ANALYST   RESEARCH      
--ADAMS      CLERK     RESEARCH      
--FORD       ANALYST   RESEARCH
select ename as "이름", job as "직위", deptno as "부서번호", dname as "부서이름"
from emp join dept
using(deptno)
where loc = 'DALLAS';

select e.ename as "이름", e.job as "직위", e.deptno as "부서번호", d.dname as "부서이름"
from emp e, dept d
where e.deptno = d.deptno and loc = 'DALLAS';


-- 2. 이름에 'A'가 들어가는 사원들의 이름과 부서이름을 출력하시오.(7개)
--이름         부서이름          
---------- --------------
--ALLEN      SALES         
--WARD       SALES         
--MARTIN     SALES        
select ename as "이름", dname as "부서이름"
from emp join dept
using(deptno)
where ename like '%A%';

select e.ename as "이름", d.dname as "부서이름"
from emp e, dept d
where e.deptno = d.deptno and e.ename like '%A%';

-- 3. 사원이름과 그 사원이 속한 부서의 부서명, 그리고 월급을 
--출력하는데 월급이 3000이상인 사원을 출력하시오. (3개)
--사원이름       부서명                    월급
---------- -------------- ----------
--KING       ACCOUNTING           5000
--FORD       RESEARCH             3000
--SCOTT      RESEARCH             3000
select ename as "이름", dname as "부서명", sal as "월급"
from emp join dept
using(deptno)
where sal >= 3000;

select e.ename as "이름", d.dname as "부서명", e.sal as "월급"
from emp e, dept d
where e.deptno = d.deptno and e.sal >= 3000;

-- 4. 직위가 'SALESMAN'인 사원들의 직위와 그 사원이름, 그리고
-- 그 사원이 속한 부서 이름을 출력하시오. (4개)
--직위        사원이름       부서이름          
--------- ---------- --------------
--SALESMAN  TURNER     SALES         
--SALESMAN  MARTIN     SALES         
--SALESMAN  WARD       SALES         
--SALESMAN  ALLEN      SALES       
select job as "직위", ename as "사원이름", dname as "부서이름"
from emp join dept
using(deptno)
where job = 'SALESMAN';

select e.job as "직위", e.ename as "사원이름", d.dname as "부서이름"
from emp e, dept d
where e.deptno = d.deptno and job = 'SALESMAN';

-- 5. 커미션이 책정된 사원들의 사원번호, 이름, 연봉, 연봉+커미션,
-- 급여등급을 출력하되, 각각의 컬럼명을 '사원번호', '사원이름',
-- '연봉','실급여', '급여등급'으로 하여 출력하시오. (6개)
--  사원번호 사원이름               연봉        실급여       급여등급
---------- ---------- ---------- ---------- ----------
--  7521 WARD            15000      15200          2
--  7654 MARTIN          15000      15300          2
--  7844 TURNER          18000      18000          3
select empno as "사원번호", ename as "이름", sal*12 as "연봉", sal*12+comm as "실급여", grade as "급여등급"
from emp, salgrade
where sal between losal and hisal 
  and comm is not null;
  
  select e.empno as "사원번호", e.ename as "이름", e.sal*12 as "연봉", e.sal*12+comm as "실급여", s.grade as "급여등급"
from emp e, salgrade s
where sal between losal and hisal 
  and e.comm is not null;

-- 6. 부서번호가 10번인 사원들의 부서번호, 부서이름, 사원이름,
-- 월급, 급여등급을 출력하시오. (3개)
--   부서번호 부서이름           사원이름               월급       급여등급
---------- -------------- ---------- ---------- ----------
--      10 ACCOUNTING     CLARK            2450          4
--      10 ACCOUNTING     KING             5000          5
--      10 ACCOUNTING     MILLER           1300          2 
select deptno as "부서번호", dname as "부서이름", ename as "사원이름", sal as "월급", grade as "급여등급"
from emp join dept using(deptno), salgrade
where sal between losal and hisal 
  and deptno = 10;
  
select e.deptno as "부서번호", d.dname as "부서이름", e.ename as "사원이름", e.sal as "월급", s.grade as "급여등급"
from emp e, dept d, salgrade s
where e.deptno = d.deptno and sal between losal and hisal 
  and e.deptno = 10;

-- 7. 부서번호가 10번, 20번인 사원들의 부서번호, 부서이름, 
-- 사원이름, 월급, 급여등급을 출력하시오. 그리고 그 출력된 
-- 결과물을 부서번호가 낮은 순으로, 월급이 높은 순으로 정렬하시오. (8개)
--   부서번호 부서이름           사원이름               월급       급여등급
---------- -------------- ---------- ---------- ----------
--    10 ACCOUNTING     KING             5000          5
--    10 ACCOUNTING     CLARK            2450          4
select deptno as "부서번호", dname as "부서이름", ename as "사원이름", sal as "월급", grade as "급여등급"
from emp join dept using(deptno), salgrade
where sal between losal and hisal 
  and (deptno = 10 or deptno = 20)
order by deptno asc, sal desc;

select e.deptno as "부서번호", d.dname as "부서이름", e.ename as "사원이름", e.sal as "월급", s.grade as "급여등급"
from emp e, dept d, salgrade s
where e.deptno = d.deptno and sal between losal and hisal 
  and (e.deptno = 10 or e.deptno = 20)
order by e.deptno asc, sal desc;

-- 8. 사원들의 이름, 부서번호, 부서이름을 출력하시오. (15개) 
-- 단, 직원이 없는 부서도 출력하며 이경우 이름을 '미정'이라고
-- 출력한다.        
--이름               부서번호 부서이름          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH      
select nvl(ename, '미정') as "이름", deptno as "부서번호", dname as "부서이름"
from emp right join dept
using(deptno);

select nvl(e.ename, '미정') as "이름", d.deptno as "부서번호", d.dname as "부서이름"
from emp e, dept d
where d.deptno = e.deptno(+);

-- 9. 사원들의 이름, 부서번호, 부서이름을 출력하시오. (15개) 
-- 단, 아직 부서 배치를 못받은 직원도  출력하며 이경우 부서번호는  0 으로
-- 출력한다.        
--이름               부서번호 부서이름          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH      
select ename as "이름", nvl(deptno, 0) as "부서번호", dname as "부서이름"
from emp left join dept d
using(deptno);

select e.ename as "이름", nvl(e.deptno, 0) as "부서번호", d.dname as "부서이름"
from emp e, dept d
where e.deptno = d.deptno(+);

-- 10. 사원들의 이름, 부서번호, 부서이름을 출력하시오. (16개) 
-- 단, 직원이 없는 부서도 출력하며 이경우 이름과 부서번호를 '미정'이라고
-- 출력한다. 아직 부서 배치를 못받은 직원도  출력하며 부서 번호와 부서 이름을
-- '미정' 이라고 출력한다.     
--이름               부서번호 부서이름          
---------- ---------- --------------
--SMITH              20 RESEARCH      
--ALLEN              30 SALES         
--WARD               30 SALES         
--JONES              20 RESEARCH    
select nvl(ename, '미정') as "이름", 
    case when ename is null then '미정' 
    when deptno is null then '미정' 
    else to_char(deptno)
    end as "부서번호", nvl(to_char(dname), '미정') as "부서이름"
from emp full join dept
using(deptno);

--from emp e, dept d
--where e.deptno = d.deptno(+);
--union
--rom emp e, dept d
--where d.deptno = e.deptno(+);

--11. 보너스를 받는 모든 직원의 이름, 보너스, 부서이름, 위치를 조회하는 질의를 작성하시오.

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

-- 12. DALLAS에서 근무하는 사원의 이름,  월급, 등급을 출력하시오.(5개)
--이름         월급        등급          
---------- --------- --------------
--SMITH      800         1      
--JONES      2975       4   
--SCOTT            
--ADAMS           
--FORD             
select ename as "사원이름", sal as "월급", grade as "등급"
from emp join dept using(deptno), salgrade
where sal between losal and hisal 
  and loc = 'DALLAS';
  
select e.ename as "사원이름", e.sal as "월급", s.grade as "등급"
from emp e, dept d, salgrade s
where d.deptno = e.deptno and sal between losal and hisal 
  and d.loc = 'DALLAS';

--13. 사원번호와 사원이름, 그리고 그 사원을 관리하는 관리자의 
-- 사원번호와 사원이름을 출력하되 각각의 컬럼명을 '사원번호',
-- '사원이름', '관리자번호', '관리자이름'으로 하여 출력하시오. (15개)
--      관리자가 없으면 '없음'을 대신 출력한다.
--    사원번호 사원이름            관리자번호 관리자이름     
---------- ---------- ---------- ----------
--  7902 FORD             7566 JONES     
--  7788 SCOTT            7566 JONES     
--   7900 JAMES            7698 BLAKE 

select empno as "사원번호", e.ename as "사원이름", nvl(to_char(e.mgr), '없음') as "관리자번호", nvl(to_char(e.mgr), '없음') as "관리자이름"
from emp e left join emp m
using(empno);

select e.empno as "사원번호", e.ename as "사원이름", nvl(to_char(e.mgr), '없음') as "관리자번호", nvl(to_char(e.mgr), '없음') as "관리자이름"
from emp e, emp m
where e.empno = m.empno;
