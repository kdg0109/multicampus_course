--create table goodsins (
--  goods_id  char(4)  not null,
--  goods_name  varchar(100)  not null,
--  goods_classify  varchar(32) not null,
--  sell_price  integer  default 0,
--  buy_price integer ,
--  register_date date,
--  primary key (goods_id));

--Insert into goodsins (goods_id, goods_name, goods_classify, sell_price, buy_price, register_date) 
--values ('0001', 'Ƽ����', '�Ƿ�', 1000, 5000, '2009-09-20');
--
--Insert into goodsins (goods_id, goods_name, goods_classify, sell_price, buy_price, register_date) 
--values ('0005', '�з¼�', '�ֹ��ǰ', 6800, 5000, '2009-01-15');
--Insert into goodsins values ('0002', '��Ī��', '�繫��ǰ', 500, 320, '2009-09-11');
--
--Insert into goodsins (goods_id, goods_name, goods_classify, sell_price, buy_price, register_date) 
--values ('0006', '��ũ', '�ֹ��ǰ', 500, null, '2009-09-20');
--
--select * from goodsins;
--
--Insert into goodsins (goods_id, goods_name, goods_classify, buy_price, register_date) 
--values ('0007', '����', '�ֹ��ǰ', 790, '2009-04-28');


create table goodscopy (
  goods_id  char(4)  not null,
  goods_name  varchar(100)  not null,
  goods_classify  varchar(32) not null,
  sell_price  integer  default 0,
  buy_price integer ,
  register_date date,
  primary key (goods_id));
  
insert into goodscopy(goods_id, goods_name, goods_classify, sell_price, buy_price, register_date)
select goods_id, goods_name, goods_classify, sell_price, buy_price, register_date
from goods;

select * from goodsins;
select * from goodscopy;
delete from goodscopy;


select * from goodscopy;
update goodscopy
set sell_price = sell_price / 10
where goods_classify = '�ֹ��ǰ';

update goodscopy
set sell_price = null
where goods_name = 'Ƽ����';


select * from goodscopy;
update goodscopy
set sell_price = sell_price + 3000 ,
    buy_price = buy_price - 500
where goods_classify = '�ֹ��ǰ';

select * from goodscopy;

create table imsi (
  name varchar2(30),
  birthday date
);
select * from imsi;
delete from imsi;
insert into imsi values ('��浿', sysdate);
insert into imsi values ('�Ѹ�1',  to_date('88-03-10', 'yy-mm-dd'));
insert into imsi values ('�Ѹ�2',  to_date('88-03-10', 'rr-mm-dd'));
insert into imsi values ('��ġ1',  to_date('33-03-10', 'yy-mm-dd'));
insert into imsi values ('��ġ2',  to_date('33-03-10', 'rr-mm-dd'));
insert into imsi values ('�����',  sysdate);
grant create view to sqltest, work, jdbctest;
update imsi set name='��ũ';
commit;
select * from goods;
--select * from goodsSum;
create view goodsSum (goods_classify, cnt_goods)
as
  select goods_classify, count(*)
    from goods
    group by goods_classify;
    
select goods_classify, cnt_goods
from goodssum;
drop view goodsSum;


select goods_id, goods_name, sell_price
from goods
where sell_price > (select avg(sell_price)
from goods);

select goods_classify, cnt_goods
  from (select goods_classify, count(*) as cnt_goods
        from goods
        group by goods_classify);

select goods_classify, cnt_goods
  from (select *
        from (select goods_classify, count(*) as cnt_goods
              from goods
              group by goods_classify)
        where cnt_goods = 4);
        
select goods_id, goods_name, sell_price
from goods
where sell_price > (select avg(sell_price)
                      from goods);
                      
select goods_id,
      goods_name,
      sell_price,
      (select avg(sell_price)
      from goods) as avg_price
from goods;

select goods_classify, avg(sell_price)
from goods
group by goods_classify
having avg(sell_price) > (select avg(sell_price) from goods);

select * from emp;

select empno, ename, deptno
from emp
where sal in (select min(sal)
              from emp
              group by deptno);
              
select empno, ename, job, sal
from emp
where sal < any ( select sal
                  from emp
                  where job='SALESMAN')
                  and job <> 'SALESMAN';
                  
select empno, ename, job, sal
from emp
where sal < all ( select sal
                  from emp
                  where job='SALESMAN')
                  and job <> 'SALESMAN';