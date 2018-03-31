--제출파일명 : exercise_4.sql
--QUESTION
select * from emp;
select * from dept;
select * from salgrade;
select * from bonus;

--1. 모든 직원들 월급의 평균을 구하시오. 
--       (소수점 이하 둘째자리까지만 나타내고 셋째자리 부터는 절삭하시오)
select trunc(avg(sal), 2) as "월급 평균"
from emp;

--2. 모든 직원들이 받는 커미션의 합을 구하시오.
select sum(comm) as "커미션 합"
from emp;

--3. 'DALLAS'에서 근무중인 직원의 명수와 월급의 합을 다음과 같은 형식으로 추출하시오.
select '직원들은 ' || count(*) || '명이고 ' || '월급의 ' || '합은 ' || sum(sal) || '입니다.' as "처리 결과"
from emp join dept
using(deptno)
where loc = 'DALLAS';

--4. 부서별 최대 월급을 "부서명", "최대월급" 으로 출력하시오.(최대월급이 큰 순)
select dname as 부서명, max(sal) as 최대월급
from emp join dept
using(deptno)
group by dname
order by max(sal) desc;

--5. 직급별 최소 월급이 3000 이상이 되는 직급의 직급명과 최소 월급을  출력하시오. 
select job as 직급명, min(sal) as "최소 월급"
from emp
group by job
having min(sal) >= 3000;


--6. 부서별 평균월급을 출력하되, 평균월급가 2000보다
-- 큰 부서의 부서 이름과 평균월급을 출력하시오.
select dname as 부서명, avg(sal) as 평균월급
from emp join dept
using(deptno)
group by dname
having avg(sal) > 2000;


--7. 각 직급별로 총월급을 출력하되 총월급이 낮은 순으로 출력하시오.
select job as 직급, sum(sal) as 총월급
from emp
group by job
order by sum(sal);


--8. 직급별 총월급을 출력하되, 직급이 'MANAGER'인 직원들은 제외하시오. 
--   그리고 그 총월급이 5000보다 큰 직급와 총월급만 출력하시오.
select job as 직급명, sum(sal) as 총월급
from emp
where job != 'MANAGER'
group by job
having sum(sal) > 5000;



--9. 커미션이 정해진 직원들 중에서 부서별 최대월급을 출력하시오. 
--최대 월급이 높은 순으로 정렬하여 출력하시오.
select dname as 부서명, max(sal) as 최대월급
from emp join dept
using(deptno)
where comm is not null
group by dname
order by max(sal) desc;




  