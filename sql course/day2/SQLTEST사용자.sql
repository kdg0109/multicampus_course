-- start �ϰ������Ű���� ���ϸ� (Ȯ���� ���� ����)
--start C:\projects\SQL\�����DB���̺�\CreateTableGoods
--select * from tab
--
--start C:\projects\SQL\�����DB���̺�\CreateTableGoods2
--
--desc goods
--
--select * from goods;
--select goods_id, goods_name, buy_price from goods;
--select goods_id, goods_name, goods_classify, sell_price, buy_price, register_date
--from goods;

--==============================================================================
--select goods_id as id, 
--      goods_name as "��ǰ��", 
--      goods_classify as "��ǰ�з�", 
--      sell_price as "�ǸŰ���", 
--      buy_price as "���Ű���", 
--      register_date as "�����"
--from goods;

--==============================================================================
--select '���¿�' as "���� ����", 
--      28 as "����",
--      '2018-01-15' as "��¥"
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
--select chr from Chars where chr > '2';    -- ���ڿ� '2'�� ���� ����
---- ���������� ���ϴ°�. ���ڿ� 34�� 2�� ���� ��, ���� 3�� 2���ϰ� ũ�� �״��� 4�� 2��
--select chr from Chars order by chr desc;    -- ��������
--select chr from Chars order by chr asc;     -- ��������

--select goods_name, buy_price
--from goods
--where buy_price is not null;

--1
select goods_name, register_date
from goods
where register_date >= '09/04/28';

--2
--1, 2, 3 null�� ������� �� �� ���⿡ �ƹ��� ���� ��Ÿ���� �ʴ´�.

--3 
select goods_name, sell_price, buy_price
from goods
where goods_name = 'Ƽ����'
or goods_name = '���̼���'
or goods_name = '�з¼�';

select goods_name, sell_price, buy_price
from goods
where goods_name like '%����'
or goods_name = '�з¼�';

--4
select goods_name, goods_classify, (sell_price  * 0.9)- buy_price as profit
from goods
where (sell_price  * 0.9)- buy_price > 100
and (goods_classify = '�ֹ��ǰ' or goods_classify = '�繫��ǰ');