--select * from SampleMath;
--select m, abs(m) as abs_col from SampleMath;
--select n, p, mod(n, p) as mod_col from SampleMath;
--select m, n, round(m, n) as round_col from SampleMath;
--
--select round(5678.666, 0), round(5678.666, -1), round(5678.666, -2), round(5678.666, -3) from dual;
--select trunc(5678.666, 0), trunc(5678.666, -1), trunc(5678.666, -2), trunc(5678.666, -3) from dual;

select * from SampleStr;

Select str1, str2, str1 || str2 AS str_concat
from sampleStr;


select length(null),length('abc'), length('������') from dual;
select lengthb(null),lengthb('abc'), lengthb('������') from dual;

select str1, str2, str3, replace(str1, str2, str3) as rep_str from sampleStr;
select str1, substr(str1, -2, 2) as sub_str from SampleStr;
select str1, substr(str1, 1, 2) as sub_str from SampleStr;
select substrb('����Ŭ�ŴϾ�', -7, 9) from dual;
select instr('abcabc', 'abdc', 2) from dual;

select LPAD(str1, 10, '*') from SampleStr;
select 'Oracle mania', TRIM('O' from 'Oracle mania') from dual;
select Trim('  Oracle mania    ') from dual;

select sysdate-1, sysdate, sysdate+2 from dual;

select hiredate, round(sysdate - hiredate) from emp;

select last_day(sysdate) from dual;

select round(sysdate, 'month') from dual;
select trunc(sysdate, 'month') from dual;

select round(sysdate, 'hh') from dual;

select hiredate, trunc(hiredate, 'month') from emp;

select next_day(sysdate, '������') from dual;
select next_day(sysdate, '��') from dual;
select next_day(sysdate, 'monday') from dual;
select next_day(sysdate, 2) from dual;

select coalesce(comm, 0) from emp;
select coalesce(comm1,comm2,comm3, 0) from emp;

select coalesce(comm, 0) from emp;

select nvl(comm, 0) from emp;
select nvl2(comm, '����', '�̤�') from emp;

select goods_name,
  case goods_classify when '�Ƿ�'
       then 'A: ' || goods_classify
       when '�繫��ǰ'
       then 'B: ' || goods_classify
       else null
  end as abc_goods_classify
from goods;

select goods_name,
  case when goods_classify = '�Ƿ�'
       then 'A: ' || goods_classify
       when goods_classify = '�繫��ǰ'
       then 'B: ' || goods_classify
       when goods_classify = '�ֹ��ǰ'
       then 'C: ' || goods_classify
       else null
  end as abc_goods_classify
from goods;

select goods_name,
  Decode(goods_classify,
      '�Ƿ�',     'A: ' || goods_classify,
      '�繫��ǰ',  'B: ' || goods_classify,
      '�ֹ��ǰ',  'C: ' || goods_classify,
      null) as abc_goods_classify
from goods;

select * from goods where buy_price = to_number('5000');
select * from goods where buy_price = to_number('500', '9,999');
select * from goods where buy_price = 5000;

select * from goods;
select goods_name
from goods
where register_date ='20091111';

select goods_name
from goods
where register_date = to_date('11112009', 'ddmmyyyy');

select goods_name
from goods
where register_date = to_date('2009��11��11��', 'yyyy"��"mm"��"dd"��"');

select sysdate, to_char(sysdate, 'ddd') from dual;
select sysdate, to_char(sysdate, 'dd') from dual;
select sysdate, to_char(sysdate, 'd') from dual;
select sysdate, to_char(sysdate, 'yyyy"��"fmmm"��"dd"��"hh"��"mi"��"') from dual;
select sysdate, to_char(sysdate, 'yyyy"��"fmmm"��"dd"��"hh"��"mi"��"') || to_char(sysdate, 'yyyy"��"mm"��"dd"��"hh"��"mi"��"') from dual;