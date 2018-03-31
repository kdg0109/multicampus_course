Desc product;

select * from visitor;
select name, writedate, memo from visitor where memo like '%³ª%';

select ename, to_char(sal, '999,999') from emp;

desc product;
select name, writedate, memo from visitor;
select lpad('dd', 0) from product;
delete from VISITOR where name = 'µÑ¸®1';
select name, to_char(writedate, 'yyyy') year, memo from visitor order by year desc;
commit;
select * from tab;
select name, to_char(writedate, 'yyyy'), memo from visitor;

desc picture;
select * from picture;
create table picture (
  name varchar(30),
  content blob
);
  
alter table picture add (id number(5) primary key);

create sequence picture_seq
start with 1
increment by 1;