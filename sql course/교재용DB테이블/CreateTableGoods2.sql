-- DDL ���̺� �ۼ�
CREATE TABLE Goods2
(goods_id     CHAR(4)      NOT NULL,
 goods_name    VARCHAR(100) NOT NULL,
 goods_classify VARCHAR(32)  NOT NULL,
 sell_price  INTEGER      ,
 buy_price  INTEGER      ,
 register_date      DATE         ,
 PRIMARY KEY (goods_id));

-- DML ������ ���

INSERT INTO Goods2 VALUES ('0001', 'Ƽ����' ,'�Ƿ�', 1000, 500, '2009-09-20');
INSERT INTO Goods2 VALUES ('0002', '��Ī��', '�繫��ǰ', 500, 320, '2009-09-11');
INSERT INTO Goods2 VALUES ('0003', '���̼���', '�Ƿ�', 4000, 2800, NULL);
INSERT INTO Goods2 VALUES ('0009', '�尩', '�Ƿ�', 800, 500, NULL);
INSERT INTO Goods2 VALUES ('0010', '������', '�ֹ��ǰ', 2000, 1700, '2009-09-20');

COMMIT;


-- DDL ���̺� ����
CREATE TABLE Chars
(chr CHAR(3) NOT NULL,
PRIMARY KEY (chr));

-- DML ������ ���

INSERT INTO Chars VALUES ('1');
INSERT INTO Chars VALUES ('2');
INSERT INTO Chars VALUES ('3');
INSERT INTO Chars VALUES ('10');
INSERT INTO Chars VALUES ('11');
INSERT INTO Chars VALUES ('222');

COMMIT;

-- DDL: ���̺� �ۼ�
CREATE TABLE SampleStr
(str1  VARCHAR(40),
 str2  VARCHAR(40),
 str3  VARCHAR(40));

-- DML: ������ ���

INSERT INTO SampleStr (str1, str2, str3) VALUES ('������',	'��'	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('abc'	,	'def'	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('��'	,	'ö��'  ,	'�Դϴ�');
INSERT INTO SampleStr (str1, str2, str3) VALUES ('aaa'	,	NULL    ,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES (NULL	,	'������',	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('@!#$%',	NULL	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('ABC'	,	NULL	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('aBC'	,	NULL	,	NULL);
INSERT INTO SampleStr (str1, str2, str3) VALUES ('abcö��',	'abc'	,	'ABC');
INSERT INTO SampleStr (str1, str2, str3) VALUES ('abcdefabc','abc'	,	'ABC');
INSERT INTO SampleStr (str1, str2, str3) VALUES ('���̿�',	'��', '��');

COMMIT;

-- DDL ���̺� ����
CREATE TABLE SampleMath
(m  NUMERIC (10,3),
 n  INTEGER,
 p  INTEGER);

-- DML ������ ���

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


-- DDL ���̺� ����
CREATE TABLE SampleLike
( strcol VARCHAR(6) NOT NULL,
  PRIMARY KEY (strcol));

-- DML ������ ���

INSERT INTO SampleLike (strcol) VALUES ('abcddd');
INSERT INTO SampleLike (strcol) VALUES ('dddabc');
INSERT INTO SampleLike (strcol) VALUES ('abdddc');
INSERT INTO SampleLike (strcol) VALUES ('abcdd');
INSERT INTO SampleLike (strcol) VALUES ('ddabc');
INSERT INTO SampleLike (strcol) VALUES ('abddc');

COMMIT;

-- DDL ���̺� ����
CREATE TABLE StoreGoods
(store_id  CHAR(4)       NOT NULL,
 store_name  VARCHAR(200) NOT NULL,
 goods_id CHAR(4)       NOT NULL,
 num     INTEGER       NOT NULL,
 PRIMARY KEY (store_id, goods_id));

-- DML ������ ���

INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000A',	'����',		'0001',	30);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000A',	'����',		'0002',	50);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000A',	'����',		'0003',	15);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'����',	'0002',	30);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'����',	'0003',	120);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'����',	'0004',	20);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'����',	'0006',	10);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000B',	'����',	'0007',	40);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000C',	'�λ�',		'0003',	20);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000C',	'�λ�',		'0004',	50);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000C',	'�λ�',		'0006',	90);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000C',	'�λ�',		'0007',	70);
INSERT INTO StoreGoods (store_id, store_name, goods_id, num) VALUES ('000D',	'�뱸',		'0001',	100);

COMMIT;

-- DDL ���̺� ����
CREATE TABLE StockGoods
( storage_id		CHAR(4)      NOT NULL,
  goods_id     CHAR(4)      NOT NULL,
  stock_num	INTEGER      NOT NULL,
  PRIMARY KEY (storage_id, goods_id));

-- DML ������ ��

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