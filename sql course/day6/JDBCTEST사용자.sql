-- jdbctest 라는 사용자로 접속해서 이 테이블들을 생성한다.
-- exercise_5.sql
--1. 테이블명 : visitor
--    컬럼 사양 : name - 한글 기준으로 최대 6자를 저장할 수 있게
--                     writedate - 날짜를 저장할 수 있게 
--                     memo - 한글 기준으로 최대 60자를 저장할 수 있게
--
--                    [visitor 테이블에 데이터를 3개 행을 입력]
--	    날짜 데이터 : 1개 : 현재시간,  
--                                         1개 : 2016년 12월 25일, 
--                                         1개 : 1999년 8월 11일

create table visitor (
  name  varchar(18),
  writedate date,
  memo varchar(180));

insert into visitor (name, writedate, memo) values ('안드로이드', sysdate, '사과는 맛있어');
insert into visitor values ('페이스북', to_date('2016년 12월 25일', 'yyyy"년" mm"월" dd"일"'), '내가 좋아하는 빨간색');
insert into visitor values ('손흥민', to_date('1999년 8월 11일', 'yyyy"년" mm"월" dd"일"'), '나는 야구선수');
commit;
--
-- 2. 테이블명 : member
--    컬럼 사양 : memId -  영문 기준으로 최대 12자를 저장할 수 있게 - primary key
--	     memPwd - 영문 기준으로 최대 12자를 저장할 수 있게 - not null
--	     memName - 한글 기준으로 최대 6자를 저장할 수 있게  - not null
--                     memPic - 이미지(바이너리 형식)를 저장할 수 있게(blob 타입)     바이너리 라지 오브젝트             
--                     joindate - 가입날짜 정보를 저장할 수 있게 - 기본값 설정(현재 날짜) sysdate

create table member (
  memId varchar(12) primary key,
  memPwd varchar(12) not null,
  memName varchar(18) not null,
  memPic blob,                
  joindate date default sysdate);
  
-- 3. 테이블명 : news
--     컬럼사양 : id - 길이가 5인 숫자 타입 - primary key
--                    writer - 한글 기준으로 최대 6자를 저장할 수 있게
--                    title - 한글 기준으로 최대 40자를 저장할 수 있게
--	    content - 한글 기준으로 최대 300자를 저장할 수 있게
--                    writedate - 작성날짜 정보를 저장할 수 있게
--                    cnt - 길이가 8인 숫자 타입

create table news (
  id number(5) primary key,
  writer varchar(18),
  title varchar(120),
  content varchar(900),
  writedate date,
  cnt number(8));