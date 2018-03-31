CREATE TABLE Goods
(goods_id     CHAR(4)      NOT NULL,
 goods_name    VARCHAR(100) NOT NULL,
 goods_classify VARCHAR(32)  NOT NULL,
 sell_price  INTEGER ,
 buy_price  INTEGER ,
 register_date      DATE ,
 PRIMARY KEY (goods_id));

INSERT INTO Goods VALUES ('0001', '萍寂明' ,'狼幅', 1000, 500, '2009-09-20');
INSERT INTO Goods VALUES ('0002', '戚莫扁', '荤公侩前', 500, 320, '2009-09-11');
INSERT INTO Goods VALUES ('0003', '客捞寂明', '狼幅', 4000, 2800, NULL);
INSERT INTO Goods VALUES ('0004', '侥漠', '林规侩前', 3000, 2800, '2009-09-20');
INSERT INTO Goods VALUES ('0005', '拘仿架', '林规侩前', 6800, 5000, '2009-01-15');
INSERT INTO Goods VALUES ('0006', '器农', '林规侩前', 500, NULL, '2009-09-20');
INSERT INTO Goods VALUES ('0007', '档付', '林规侩前', 880, 790, '2008-04-28');
INSERT INTO Goods VALUES ('0008', '杭奇', '荤公侩前', 100, NULL, '2009-11-11');

COMMIT;