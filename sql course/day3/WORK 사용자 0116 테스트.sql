--QUESTION
--1. 사원 테이블에서 사원이름을 첫글자는 대문자로, 나머지는 소문자로 출력하시오.
-- [결과]       사원이름
--           ---------------------
--                  Smith
select initcap(ename) as 사원이름 from emp;

--2. 사원테이블에서 사원이름을 뽑고 또 이름의 두번째 글자부터 네번째 글자까지
-- 출력하시오.
-- [결과]         사원이름    2-4문자
--                  ---------------------
--                  SMITH        MIT
select ename as 사원이름, 
        substr(ename, 2, 3) as "2-4문자" 
from emp;

--3. 사원테이블의 사원 이름의 문자 개수를 출력하시오.
select ename as 사원이름, 
        length(ename) as "문자 개수" 
from emp;
        
--4. 사원테이블에서 사원 이름의 앞 글자 하나와 마지막 글자 하나만 출력하되 
-- 모두 소문자로 각각 출력하시오.
select  lower(substr(ename, 1, 1)) as "앞 글자",  
        lower(substr(ename, -1, 1)) as "마지막 글자" 
from emp;

--5. 3456.78을 반올림하여 소수점 아래 첫번째 자리 까지만 나타내시오.
select round(3456.78, 1) as 반올림 
from dual;

--6. 월급에 55를 곱하고 십단위는 절삭하여 출력하는데 월급뒤에 '원'을 붙이고 
--    천단위마다 ','를 붙여서 출력한다.
--[결과]	계산 결과
-----------------
--          	40,000원
--	80,000원
-- 	62,500원
--	148,700원
select concat(to_char(trunc(sal*55, -2), '999,999'), '원') as "계산 결과" 
from emp;

--7. 직원 이름과 커미션 설정 여부를 출력하는데 설정되었으면 '설정'
--    설정되지 않았으면 '미정'을 출력하시오.
--    	SMITH	미정	
--	ALLEN	설정	300
--	WARD	설정	200
--	JONES	설정	30
select ename, nvl2(comm, '설정', '미정'), comm
from emp;

--8. 직원 이름과 부서번호 그리고 부서번호에 따른 부서명을 출력하시오.
--    부서가 없는 직원은 '없당' 을 출력하시오.
--    (부서명 : 10 이면 'A 부서', 20 이면 'B 부서', 30 이면 'C 부서')
select ename, deptno,
      decode(deptno, 10, 'A 부서',
                      20, 'B 부서',
                      30, 'C 부서',
                      '없당') as 부서명
from emp;

--9. 직위가 'SALESMAN'이고 월급이 1000이상인 사원의
-- 이름과 월급을 출력하시오.
select ename as 이름, sal as 월급
from emp
where job = 'SALESMAN' and sal >= 1000;
--10. 오늘날짜와 오늘날짜에서 10일을 더한 날짜를 출력하시오.
select sysdate, sysdate + 10 from dual;
--11. 현재 시간을 "....년 ..월 ..일 ..시 ..분" 으로 출력하시오.
select to_char(sysdate, 'yyyy"년" mm"월" dd"일" hh"시" mi"분"') as "현재 시간" 
from dual;
--12. 직원의 이름, 월급여, 연봉을 조회하는 질의를 작성하시오.
--(단, 직원의 연봉은 $200의 월 보너스를 포함하여 계산합니다.)

--이름              월급여               연봉
---------------------------------------------------
--SMITH             800                 12000
--ALLEN            1600                 21600
--WARD             1250                 17400
select ename, sal, sal*12+12*200 as 연봉 from emp;
--13.  연숩문제2_추가.docx 로 대체
select ename as 이름, sal as 월급, 
                    case when sal < 1000 then 'A'
                    when sal < 2000 and sal >= 1000 then 'B'
                    when sal < 3000 and sal >= 2000 then 'C'
                    when sal < 4000 and sal >= 3000 then 'D'
                    else 'E' 
                    end as 코드
from emp;
--14. 연숩문제2_추.docx 로 대체
select ename as 이름, deptno as 부서번호,
      decode(deptno, 10, 'A',
                      20, 'B',
                      30, 'C',
                      40, 'E',
                      'F') as 코드
from emp;

--15.  열이름이 Employee and Job Title이고, 콤마와 공백으로 구분된 직원이름과 
--직무를 연결되도록 하는 질의를 작성하시오.
select ename || ', ' || job as "Employee and Job Title"
from emp;
--Employee and Job Title
---------------------------
--SMITH, CLERK
--ALLEN, SALESMAN


--16. 이름의 두번째 문자가 “A”인 모든 직원의 이름을 조회하는 질의를 작성하시오 
select ENAME
from emp
where ename like '_A%';
--ENAME
----------
--WARD 
--MARTIN
--JAMES



--17. 이름, 입사일, 입사한 요일을 조회하는 질의를 작성하시오
--입사한 요일을 기준으로 오름차순 정렬합니다.(이때 기준요일은 월요일로 합니다)
--(이때, 이름, 입사일 입사요일 별칭을 사용합니다.)
select ename as 이름, 
      to_char(hiredate, 'yyyy"년"fmmm"월"dd"일"') as 입사일, 
      to_char(hiredate, 'day') as 입사요일 
from emp
order by decode (TO_CHAR(hiredate, 'day'), '월요일', 1,
                                            '화요일', 2,
                                            '수요일', 3,
                                            '목요일', 4,
                                            '금요일', 5,
                                            '토요일', 6,
                                            7) asc;
--order by to_char(hiredate-1,'d')

--이름                입사일              입사요일
---------------------------------------------------
--MARTIN         1981년9월28일        월요일




--18.   모든 직원의 이름과 현재까지의 입사기간을 월단위(가장 가까운 월로 반올림할 것)로 
--   조회하는 질의를 작성하시오
--   (이때, 입사기간에 해당하는 열별칭은 “MONTHS WORKED”로 하고, 
--    입사기간이 가장 적은 직원순으로 정렬합니다.)
select ENAME, round(months_between(sysdate, hiredate), 0) as "MONTHS WORKED"
from emp
order by round(months_between(sysdate, hiredate), 0) asc;
--order by 2 asc;
--출력예)
--ENAME         MONTHS WORKED
--------------------------------
--ADAMS            284
--SCOTT            286
--MILLER           348


--19. 사원테이블에서 사원이름과 사원들의 오늘 날짜까지의 근무일수를 구하시오.
select ename as 사원이름, round(sysdate - hiredate) || '일' as 근무일수
from emp;
--사원이름   근무일수
-- -----------------------
--SMITH    12474일
--ALLEN    12409일
--WARD    12407일
--JONES    12368일
--MARTIN    12189일
--BLAKE    12369일

--20. 1981년도에 입사한 직원들의 이름, 직위 그리고 입사일을
--         입사한 순으로 출력하시오.

select ename as 이름, job as 직위, to_char(hiredate, 'dd') as 입사일
from emp
where to_char(hiredate, 'yyyy') = 1981 
--where hiredate like '1981%'
order by hiredate;

--21. 내생일을 기준으로 요일을 출력하는 SQL  명령을 작성하시오.
select to_char(to_date('19910109', 'yyyymmdd'), 'day') as 요일 from dual;
--22. 현재를 기준으로 내가 태어난지 몇 개월 되었는지 알 수 있는 
--      SQL 명령을 작성하시오.
select trunc(months_between(sysdate, to_date('19910109', 'yyyymmdd')), 0) as 개월 from dual;

--23. 직원들의 이름과 월급 그리고 커미션 정보를 출력하는데
--     커미션이 정해지지 않은 직원은 "미정"이라고 출력하시오.
select ename as 이름, sal as 월급, nvl(to_char(comm), '미정') as "커미션 정보" from emp;

--24. 사원테이블에서 이름의 첫글자가 A이고 마지막 글자가 N이 아닌 사원의
-- 이름을 출력하시오.
select ename as 이름
from emp
where ename like 'A%' and substr(ename, -1) != 'N';
--where ename like 'A%' and ename not like '%N';

--25. 직원의 이름, 입사 날짜 그리고 년도를 기준으로 하여 반올림한 날짜를
--     출력하시오.        
select ename as 이름, hiredate as "입사 날짜", round(hiredate, 'year') from emp;
