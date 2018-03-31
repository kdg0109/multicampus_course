select avg(sell_price)
from goods
group by goods_classify;

select goods_classify, goods_name, sell_price
from goods s1
where sell_price > (select avg(sell_price)
                    from goods s2
                    where s1.goods_classify = s2.goods_classify
                    group by goods_classify);
                    
select goods_name, sell_price
from goods s
where exists (select * from storegoods ts
              where ts.store_id = '000C'
              and ts.goods_id = s.goods_id);
              
select goods_name, sell_price
from goods s
where goods_id in (select goods_id from storegoods ts
              where ts.store_id = '000C');
              
select goods_name, sell_price
from goods s
where not exists (select * from storegoods ts
                  where ts.store_id = '000A'
                  and ts.goods_id = s.goods_id);
                  
select goods_name, sell_price
from goods s
where goods_id not in (select goods_id from storegoods ts
                  where ts.store_id = '000A');
                  
select emp_id, emp_name, '包府磊' as 备盒
from employee e
where exists (select null
              from employee
              where e.emp_id = mgr_id)
union
select emp_id, emp_name, '流盔' as 备盒
from employee e2
where not exists (select null
              from employee
              where e2.emp_id = mgr_id)
order by 3, 1;