#    Hive 연동

library(rJava)
library(RJDBC)
library(DBI)
library(ggplot2)
library(dplyr)

drvName <- 'org.apache.hive.jdbc.HiveDriver';
id <- 'root';
pwd <- '111111';
url <- 'jdbc:hive2://192.168.111.100:10000';

#라이브러리 디렉토리를 클래스 path로 지정합니다.
hive_lib <- 'C:\\java_hive_lib';
.jinit();
#hive lib에 있는 파일을 클래스파일로 하겠다.
.jaddClassPath(dir(hive_lib, full.names = T)); 
.jclassPath();

# DB 접근 과정(Java도 똑같음)
# 1. Driver Loading
drv <- JDBC(driverClass = drvName, 
            classPath = 'hive-jdbc-1.0.1.jar')
# 2. Connection
conn <- dbConnect(drv, url, id, pwd)
# 3. Statement                    # sql문 작성 전송
sqlstr <- 'select * from airline_delay limit 10';
# 4. ResultSet                    # 값 받기  이 때, data.frame으로 받음
air <- dbGetQuery(conn, sqlstr);
# 5. Close
dbDisconnect(conn)

ggplot(data=emp, aes(x=MON, y=SAL))+geom_line()