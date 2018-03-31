-- 집합 연산
select goods_id, goods_name
from goods
intersect 
select goods_id, goods_name
from goods2;

-- Join(결합)
select * 
from emp, dept
where emp.deptno = dept.deptno;

-- Join(결합)
select emp.ename, dept.dname
from emp, dept
where emp.deptno = dept.deptno;

-- Join(결합)
select e.ename, d.dname, d.dname
from emp e, dept d
where e.deptno = d.deptno;

-- Inner Join(결합)
select e.ename, d.dname, d.dname
from emp e, dept d
where e.deptno = d.deptno;

-- Inner Join(결합)
select *
from emp join dept 
using (deptno);

-- Inner Join(결합)
select e.ename, d.dname
from emp e join dept d 
on e.deptno = d.deptno;

-- Inner Join(결합)
select e.ename, d.dname, d.dname
from emp e join dept d 
using (deptno);

-- Inner Join(결합)
select ts.store_id, ts.store_name, ts.goods_id, s.goods_name, s.sell_price 
from storegoods ts inner join goods s 
on ts.goods_id = s.goods_id
where ts.store_id = '000A';

-- Right Join(결합)
select ts.store_id, ts.store_name, ts.goods_id, s.goods_name, s.sell_price 
from storegoods ts right join goods s 
on ts.goods_id = s.goods_id;

-- left Join(결합)
select store_id, store_name, goods_id, goods_name, sell_price 
from storegoods ts left outer join goods s
using(goods_id);

--3개 이상의 테이블 Join(결합)
select ts.store_id, ts.store_name, ts.goods_id, s.goods_name, s.sell_price , zs.stock_num
from storegoods ts inner join goods s
on ts.goods_id = s.goods_id
  inner join stockgoods zs
  on ts.goods_id = zs.goods_id
where zs.storage_id = 'S001';

--3개 이상의 테이블 Join(결합)
select ts.store_id, ts.store_name, goods_id, s.goods_name, s.sell_price , zs.stock_num
from storegoods ts inner join goods s
using(goods_id)
  inner join stockgoods zs
  using(goods_id)
where zs.storage_id = 'S001';

select * from storegoods;
select * from goods;
select * from stockgoods;

--s001 창고에 보관되어 있는 상품들의 이름과 판매가격을 알고 싶다.
select s.goods_name as "상품 이름", s.sell_price as "판매가격"
from stockgoods zs left join goods s
using (goods_id)
where zs.storage_id = 'S001';

--s002 창고에 보관되어 있는 상품들의 이름과 판매점포명을 알고 싶다.
select s.goods_name as "상품 이름", ts.store_name as "판매점포명"
from stockgoods zs 
left join goods s         using (goods_id)
inner join storegoods ts  using (goods_id)
where zs.storage_id = 'S002';
