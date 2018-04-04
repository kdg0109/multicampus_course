#    Hive 연동

hive_conn <- function() {
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
  sqlstr <- 'SELECT Year,Month,COUNT(*) 
              FROM airline_delay 
              where Month IN (1,2,3,4,6,7,8,9,10,11,12) 
              AND ArrDelay >0 
              GROUP BY Year,Month';
  # 4. ResultSet                    # 값 받기  이 때, data.frame으로 받음
  air <- dbGetQuery(conn, sqlstr);
  # 5. Close
  dbDisconnect(conn)
  
  air_06 <- air[air$year == '2006',]
  air_07 <- air[air$year == '2007',]
  air_08 <- air[air$year == '2008',]
  
  
  new_air_06 <- air_06[,c(-1)]
  new_air_07 <- air_07[,c(-1)]
  new_air_08 <- air_08[,c(-1)]
  
 # date06 <- paste(air_06$year, '_', air_06$month, sep="")
  #date06 <- air_06$month;
  #  date07 <- paste(air_07$year, '_', air_07$month, sep="")
  #date06 <- air_07$month;
  # date08 <- paste(air_08$year, '_', air_08$month, sep="")
  #date06 <- air_08$month;
  
  #new_air_06 <- data.frame(date = date06, cnt = air_06$`_c2`)
  #new_air_07 <- data.frame(date = date07, cnt = air_07$`_c2`)
  #new_air_08 <- data.frame(date = date08, cnt = air_08$`_c2`)
  
  
  
  ggplot(data=new_air_06, aes(x=new_air_06$month, y=new_air_06$`_c2`, group = 1))+
    geom_line()+geom_point()+
    geom_line(data=new_air_07, aes(x=new_air_07$month, y=new_air_07$`_c2`), colour="red")+
    geom_point(data=new_air_07, aes(x=new_air_07$month, y=new_air_07$`_c2`), colour="red")+
    geom_line(data=new_air_08, aes(x=new_air_08$month, y=new_air_08$`_c2`), colour="orange")+
    geom_point(data=new_air_08, aes(x=new_air_08$month, y=new_air_08$`_c2`), colour="orange")
}