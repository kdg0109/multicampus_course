-- ���� ����
select goods_id, goods_name
from goods
intersect 
select goods_id, goods_name
from goods2;

-- Join(����)
select * 
from emp, dept
where emp.deptno = dept.deptno;

-- Join(����)
select emp.ename, dept.dname
from emp, dept
where emp.deptno = dept.deptno;

-- Join(����)
select e.ename, d.dname, d.dname
from emp e, dept d
where e.deptno = d.deptno;

-- Inner Join(����)
select e.ename, d.dname, d.dname
from emp e, dept d
where e.deptno = d.deptno;

-- Inner Join(����)
select *
from emp join dept 
using (deptno);

-- Inner Join(����)
select e.ename, d.dname
from emp e join dept d 
on e.deptno = d.deptno;

-- Inner Join(����)
select e.ename, d.dname, d.dname
from emp e join dept d 
using (deptno);

-- Inner Join(����)
select ts.store_id, ts.store_name, ts.goods_id, s.goods_name, s.sell_price 
from storegoods ts inner join goods s 
on ts.goods_id = s.goods_id
where ts.store_id = '000A';

-- Right Join(����)
select ts.store_id, ts.store_name, ts.goods_id, s.goods_name, s.sell_price 
from storegoods ts right join goods s 
on ts.goods_id = s.goods_id;

-- left Join(����)
select store_id, store_name, goods_id, goods_name, sell_price 
from storegoods ts left outer join goods s
using(goods_id);

--3�� �̻��� ���̺� Join(����)
select ts.store_id, ts.store_name, ts.goods_id, s.goods_name, s.sell_price , zs.stock_num
from storegoods ts inner join goods s
on ts.goods_id = s.goods_id
  inner join stockgoods zs
  on ts.goods_id = zs.goods_id
where zs.storage_id = 'S001';

--3�� �̻��� ���̺� Join(����)
select ts.store_id, ts.store_name, goods_id, s.goods_name, s.sell_price , zs.stock_num
from storegoods ts inner join goods s
using(goods_id)
  inner join stockgoods zs
  using(goods_id)
where zs.storage_id = 'S001';

select * from storegoods;
select * from goods;
select * from stockgoods;

--s001 â�� �����Ǿ� �ִ� ��ǰ���� �̸��� �ǸŰ����� �˰� �ʹ�.
select s.goods_name as "��ǰ �̸�", s.sell_price as "�ǸŰ���"
from stockgoods zs left join goods s
using (goods_id)
where zs.storage_id = 'S001';

--s002 â�� �����Ǿ� �ִ� ��ǰ���� �̸��� �Ǹ��������� �˰� �ʹ�.
select s.goods_name as "��ǰ �̸�", ts.store_name as "�Ǹ�������"
from stockgoods zs 
left join goods s         using (goods_id)
inner join storegoods ts  using (goods_id)
where zs.storage_id = 'S002';
