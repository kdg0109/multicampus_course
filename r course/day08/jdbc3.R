#1. emp 회사의 근속 연수(오늘 날짜 기준 월)와
#   월급의 상관 관계를 그래프로 표현 하시오


library(rJava)
library(RJDBC)
library(DBI)
library(ggplot2)
library(dplyr)

drvName <- 'oracle.jdbc.driver.OracleDriver';
id <- 'ruser';
pwd <- '111111';
url <- 'jdbc:oracle:thin:@localhost:1521:XE';
# DB 접근 과정(Java도 똑같음)
# 1. Driver Loading
drv <- JDBC(driverClass = drvName, 
            classPath = 'C:\\java_hive_lib\\ojdbc6.jar')
# 2. Connection
conn <- dbConnect(drv, url, id, pwd)
# 3. Statement                    # sql문 작성 전송
sqlstr <- 'select Trunc(MONTHS_BETWEEN(sysdate, hiredate)) as mon, sal from emp';
# 4. ResultSet                    # 값 받기  이 때, data.frame으로 받음
emp <- dbGetQuery(conn, sqlstr);
# 5. Close
dbDisconnect(conn)

ggplot(data=emp, aes(x=MON, y=SAL))+geom_line()

