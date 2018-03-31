--                                            집약 함수
select count(nvl(buy_price,0))
from goods;

select count(*)
from goods;

select count(*), count(buy_price), count(register_date)
from goods;

select sum(sell_price)
from goods;

select avg(buy_price)
from goods;

select avg(nvl(buy_price, 0))
from goods;

select max(sell_price), min(buy_price)
from goods;
select * from goods;

--                                            Group by
select buy_price, count(*)
from goods
group by buy_price;

select distinct buy_price
from goods;

--                                            Having
select goods_classify, count(*)
from goods
group by goods_classify
having count(*) = 2;

select goods_classify, count(*)
from goods
where goods_name != '티셔츠'
group by goods_classify
having goods_classify = '의류';


select goods_classify, count(*)
from goods
group by goods_classify
having goods_classify = '의류';

select count(*)
from goods
where goods_classify = '의류';

select goods_classify, count(*)
from goods
group by goods_classify
having count(*) = 2;