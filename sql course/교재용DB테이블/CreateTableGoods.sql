CREATE TABLE Goods
(goods_id     CHAR(4)      NOT NULL,
 goods_name    VARCHAR(100) NOT NULL,
 goods_classify VARCHAR(32)  NOT NULL,
 sell_price  INTEGER ,
 buy_price  INTEGER ,
 register_date      DATE ,
 PRIMARY KEY (goods_id));

INSERT INTO Goods VALUES ('0001', 'Ƽ����' ,'�Ƿ�', 1000, 500, '2009-09-20');
INSERT INTO Goods VALUES ('0002', '��Ī��', '�繫��ǰ', 500, 320, '2009-09-11');
INSERT INTO Goods VALUES ('0003', '���̼���', '�Ƿ�', 4000, 2800, NULL);
INSERT INTO Goods VALUES ('0004', '��Į', '�ֹ��ǰ', 3000, 2800, '2009-09-20');
INSERT INTO Goods VALUES ('0005', '�з¼�', '�ֹ��ǰ', 6800, 5000, '2009-01-15');
INSERT INTO Goods VALUES ('0006', '��ũ', '�ֹ��ǰ', 500, NULL, '2009-09-20');
INSERT INTO Goods VALUES ('0007', '����', '�ֹ��ǰ', 880, 790, '2008-04-28');
INSERT INTO Goods VALUES ('0008', '����', '�繫��ǰ', 100, NULL, '2009-11-11');

COMMIT;