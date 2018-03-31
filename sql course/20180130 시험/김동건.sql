-- 1
select e.employee_id as ���, e.first_name as "��� �̸�", e.manager_id as "�Ŵ��� ���", y.first_name as "�Ŵ��� �̸�"
from employees e, employees y
where e.department_id is null and e.manager_id = y.employee_id;
select * from visitor;
select name, writedate, memo from visitor;
-- 2 
select to_char(hire_date, 'month') as �Ի��, to_char(max(salary), '999,999,999') || '��' as �ְ�޿�
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
select to_char(hire_date, 'rr') as �Ի�⵵, count(employee_id) as "���ǿ� �´� ������"
where salary >= 5000 and salary <= 10000
group by to_char(hire_date, 'rr')
having count(employee_id) >= 7
order by to_char(hire_date, 'rr');

-- 4
select first_name as �̸�, department_name as �μ��̸�, '��-�Ի����' as ���ϸ޽���
from employees join departments using (department_id)
where to_char(hire_date, 'mm') = '06'
order by first_name;

-- 5
select max(salary) as �ִ����, min(salary) as �ּҿ���, round(avg(salary), -2) as �������
from employees join departments using (department_id)
where department_name = (select department_name 
                        from employees left join departments using (department_id) 
                        where first_name = 'Den');