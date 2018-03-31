-- DDL 테이블 작성
CREATE TABLE Goods2
(goods_id     CHAR(4)      NOT NULL,
 goods_name    VARCHAR(100) NOT NULL,
 goods_classify VARCHAR(32)  NOT NULL,
 sell_price  INTEGER      ,
 buy_price  INTEGER      ,
 register_date      DATE         ,
 PRIMARY KEY (goods_id));

-- DML 데이터 등록

INSERT INTO Goods2 VALUES ('0001', '티셔츠' ,'의류', 1000, 500, '2009-09-20');
INSERT INTO Goods2 VALUES ('0002', '펀칭기', '사무용품', 500, 320, '2009-09-11');
INSERT INTO Goods2 VALUES ('0003', '와이셔츠', '의류', 4000, 2800, NULL);
INSERT INTO Goods2 VALUES ('0009', '장갑', '의류', 800, 500, NULL);
INSERT INTO Goods2 VALUES ('0010', '주전자', '주방용품', 2000, 1700, '2009-09-20');

COMMIT;


-- DDL 테이블 새성
CREATE TABLE Chars
(chr CHAR(3) NOT NULL,
PRIMARY KEY (chr));

-- DML 데이터 등록

INSERT INTO Chars VALUES ('1');
INSERT INTO Chars VALUES ('2');
INSERT INTO Chars VALUES ('3');
INSERT INTO Chars VALUES ('10');
INSERT INTO Chars VALUES ('11');
INSERT INTO Chars VALUES ('222');

COMMIT;

-- DDL: 테이블 작성
CREATE TABLE SampleStr
(str1  VARCHAR(40),
 str2  VARCHAR(40),
 str3  VARCHAR(40));

-- DML: 데이터 등록

INSERT INTO SampleStr (str1, str2, str3) VALUES ('가나다',	'라마'	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('abc'	,	'def'	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('김'	,	'철수'  ,	'입니다');
INSERT INTO SampleStr (str1, str2, str3) VALUES ('aaa'	,	NULL    ,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES (NULL	,	'가가가',	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('@!#$%',	NULL	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('ABC'	,	NULL	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('aBC'	,	NULL	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('abc철수',	'abc'	,	'ABC');
INSERT INTO SampleStr (str1, str2, str3) VALUES ('abcdefabc','abc'	,	'ABC');
INSERT INTO SampleStr (str1, str2, str3) VALUES ('아이우',	'이', '우');

COMMIT;

-- DDL 테이블 생성
CREATE TABLE SampleMath
(m  NUMERIC (10,3),
 n  INTEGER,
 p  INTEGER);

-- DML 데이터 등록

INSERT INTO SampleMath(m, n, p) VALUES (500,  0,    NULL);
INSERT INTO SampleMath(m, n, p) VALUES (-180, 0,    NULL);
INSERT INTO SampleMath(m, n, p) VALUES (NULL, NULL, NULL);
INSERT INTO SampleMath(m, n, p) VALUES (NULL, 7,    3);
INSERT INTO SampleMath(m, n, p) VALUES (NULL, 5,    2);
INSERT INTO SampleMath(m, n, p) VALUES (NULL, 4,    NULL);
INSERT INTO SampleMath(m, n, p) VALUES (8,    NULL, 3);
INSERT INTO SampleMath(m, n, p) VALUES (2.27, 1,    NULL);
INSERT INTO SampleMath(m, n, p) VALUES (5.555,2,    NULL);
INSERT INTO SampleMath(m, n, p) VALUES (NULL, 1,    NULL);
INSERT INTO SampleMath(m, n, p) VALUES (8.76, NULL, NULL);

COMMIT;


-- DDL 테이블 생성
CREATE TABLE SampleLike
( strcol VARCHAR(6) NOT NULL,
  PRIMARY KEY (strcol));

-- DML 데이터 등록

INSERT INTO SampleLike (strcol) VALUES ('abcddd');
INSERT INTO SampleLike (strcol) VALUES ('dddabc');
INSERT INTO SampleLike (strcol) VALUES ('abdddc');
INSERT INTO SampleLike (strcol) VALUES ('abcdd');
INSERT INTO SampleLike (strcol) VALUES ('ddabc');
INSERT INTO SampleLike (strcol) VALUES ('abddc');

COMMIT;

-- DDL 테이블 생성
CREATE TABLE StoreGoods
(store_id  CHAR(4)       NOT NULL,
 store_name  VARCHAR(200) NOT NULL,
 goods_id CHAR(4)       NOT NULL,
 num     INTEGER       NOT NULL,
 PRIMARY KEY (store_id, goods_id));

-- DML 데이터 등록

INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000A',	'서울',		'0001',	30);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000A',	'서울',		'0002',	50);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000A',	'서울',		'0003',	15);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'대전',	'0002',	30);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'대전',	'0003',	120);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'대전',	'0004',	20);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'대전',	'0006',	10);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'대전',	'0007',	40);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000C',	'부산',		'0003',	20);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000C',	'부산',		'0004',	50);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000C',	'부산',		'0006',	90);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000C',	'부산',		'0007',	70);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000D',	'대구',		'0001',	100);

COMMIT;

-- DDL 테이블 생성
CREATE TABLE StockGoods
( storage_id		CHAR(4)      NOT NULL,
  goods_id     CHAR(4)      NOT NULL,
  stock_num	INTEGER      NOT NULL,
  PRIMARY KEY (storage_id, goods_id));

-- DML 데이터 등

INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S001',	'0001',	0);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S001',	'0002',	120);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S001',	'0003',	200);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S001',	'0004',	3);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S001',	'0005',	0);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S001',	'0006',	99);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S001',	'0007',	999);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S001',	'0008',	200);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S002',	'0001',	10);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S002',	'0002',	25);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S002',	'0003',	34);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S002',	'0004',	19);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S002',	'0005',	99);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S002',	'0006',	0);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S002',	'0007',	0);
INSERT INTO StockGoods (storage_id, goods_id, stock_num) VALUES ('S002',	'0008',	18);

COMMIT;