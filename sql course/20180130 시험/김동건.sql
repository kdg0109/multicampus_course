-- 1
select e.employee_id as 사번, e.first_name as "사원 이름", e.manager_id as "매니저 사번", y.first_name as "매니저 이름"
from employees e, employees y
where e.department_id is null and e.manager_id = y.employee_id;
select * from visitor;
select name, writedate, memo from visitor;
-- 2 
select to_char(hire_date, 'month') as 입사월, to_char(max(salary), '999,999,999') || '원' as 최고급여
from employees
where salary >= 10000
group by to_char(hire_date, 'month')
order by max(salary) desc;
select * from news;
-- 3
select * from user_sequences;
create sequence news_seq
start with 1
increment by 1;
select to_char(hire_date, 'rr') as 입사년도, count(employee_id) as "조건에 맞는 직원수"
where salary >= 5000 and salary <= 10000
group by to_char(hire_date, 'rr')
having count(employee_id) >= 7
order by to_char(hire_date, 'rr');

-- 4
select first_name as 이름, department_name as 부서이름, '축-입사기념달' as 축하메시지
from employees join departments using (department_id)
where to_char(hire_date, 'mm') = '06'
order by first_name;

-- 5
select max(salary) as 최대월급, min(salary) as 최소월급, round(avg(salary), -2) as 월급평균
from employees join departments using (department_id)
where department_name = (select department_name 
                        from employees left join departments using (department_id) 
                        where first_name = 'Den');