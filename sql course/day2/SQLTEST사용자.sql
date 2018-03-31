-- start 일괄수행시키려는 파일명 (확장자 생략 가능)
--start C:\projects\SQL\교재용DB테이블\CreateTableGoods
--select * from tab
--
--start C:\projects\SQL\교재용DB테이블\CreateTableGoods2
--
--desc goods
--
--select * from goods;
--select goods_id, goods_name, buy_price from goods;
--select goods_id, goods_name, goods_classify, sell_price, buy_price, register_date
--from goods;

--==============================================================================
--select goods_id as id, 
--      goods_name as "상품명", 
--      goods_classify as "상품분류", 
--      sell_price as "판매가격", 
--      buy_price as "구매가격", 
--      register_date as "등록일"
--from goods;

--==============================================================================
--select '이태우' as "파일 주인", 
--      28 as "나이",
--      '2018-01-15' as "날짜"
--from goods;

--==============================================================================
--select goods_name, sell_price,
--      sell_price * 2 as "sell_price_X2"
--from goods;

--==============================================================================
--select goods_name, 10+20 from goods;

--==============================================================================
--select 10+20 from dual;

--==============================================================================
--select sysdate from dual;

--==============================================================================
--select buy_price, nvl(buy_price, 0) * 0.01 from goods

--==============================================================================
--select goods_name, sell_price, sell_price * 2 as "sell_price_x2"
--from goods;

--==============================================================================
--select goods_name, goods_classify, sell_price
--from goods
--where sell_price = 500;

--==============================================================================
--select goods_name, goods_classify, sell_price
--from goods
--where sell_price >= 1000;

--==============================================================================
--select goods_name, sell_price, buy_price
--from goods
--where sell_price - buy_price >= 500;

--==============================================================================
--select * from Chars;
--desc Chars;
--select chr from Chars where chr > '2';    -- 문자열 '2'를 비교한 것임
---- 사전순으로 비교하는것. 문자열 34과 2를 비교할 때, 먼저 3과 2비교하고 크면 그다음 4와 2비교
--select chr from Chars order by chr desc;    -- 내림차순
--select chr from Chars order by chr asc;     -- 오름차순

--select goods_name, buy_price
--from goods
--where buy_price is not null;

--1
select goods_name, register_date
from goods
where register_date >= '09/04/28';

--2
--1, 2, 3 null은 등가연산을 할 수 없기에 아무런 값이 나타나지 않는다.

--3 
select goods_name, sell_price, buy_price
from goods
where goods_name = '티셔츠'
or goods_name = '와이셔츠'
or goods_name = '압력솥';

select goods_name, sell_price, buy_price
from goods
where goods_name like '%셔츠'
or goods_name = '압력솥';

--4
select goods_name, goods_classify, (sell_price  * 0.9)- buy_price as profit
from goods
where (sell_price  * 0.9)- buy_price > 100
and (goods_classify = '주방용품' or goods_classify = '사무용품');