#======================================================================================

pressure2 <- pressure*2

ggplot(pressure, aes(x=temperature, y=pressure))+
  geom_line()+geom_point()+
  geom_line(data=pressure2, aes(x=temperature, y=pressure/2), colour="red")+
  geom_point(data=pressure2, aes(x=temperature, y=pressure/2), colour="red")


#======================================================================================



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
sqlstr <- 'select st.main,total_num,total_area,round(score,1) as HAPPY
from status st join satisfaction sa
on st.year = sa.year
where st.main=sa.main
order by score';
# 4. ResultSet                    # 값 받기  이 때, data.frame으로 받음
emp <- dbGetQuery(conn, sqlstr);
# 5. Close
dbDisconnect(conn)

ggplot(data=emp, aes(x=MAIN, y=HAPPY*1000, group = 1))+
  geom_line()+geom_point()+
  geom_line(data=emp, aes(x=MAIN, y=TOTAL_AREA), colour="red")+
  geom_point(data=emp, aes(x=MAIN, y=TOTAL_AREA), colour="red")