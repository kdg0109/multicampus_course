#1. Data 수집
# - 서울시 or 공공데이터
# 문서화하기
# 팀원들과 공유하기 (데이터와 명제)
#2. R로 Load

#3. Analisys

#x
exdata <- function() {
  library(ggplot2)
  data <- read.csv('open_WiFi_DB_2016.csv', stringsAsFactors = F);
  return (data);
}
data <- exdata();


class(data$통신사)
#통신사별 와이파이 현황수
wifi_kt <- nrow(data[data$통신사 == 'KT',])
wifi_lgu <- nrow(data[data$통신사 == 'LGU+',])
wifi_skt <- nrow(data[data$통신사 == 'SKT',])

names <- c('KT','LGU','SKT');
count <- c(wifi_kt, wifi_lgu, wifi_skt);


#광역시 별 카운트 뽑기
#KT 광역시 카운트
do_kt1 <- nrow(data[data$광역시도.국문. == '강원도' & data$통신사 == 'KT',]);
do_kt2 <- nrow(data[data$광역시도.국문. == '경기도' & data$통신사 == 'KT',]);
do_kt3 <- nrow(data[data$광역시도.국문. == '경상남도' & data$통신사 == 'KT',]);
do_kt4 <- nrow(data[data$광역시도.국문. == '경상북도' & data$통신사 == 'KT',]);
do_kt5 <- nrow(data[data$광역시도.국문. == '광주광역시' & data$통신사 == 'KT',]);
do_kt6 <- nrow(data[data$광역시도.국문. == '대구광역시' & data$통신사 == 'KT',]);
do_kt7 <- nrow(data[data$광역시도.국문. == '대전광역시' & data$통신사 == 'KT',]);
do_kt8 <- nrow(data[data$광역시도.국문. == '부산광역시' & data$통신사 == 'KT',]);
do_kt9 <- nrow(data[data$광역시도.국문. == '서울특별시' & data$통신사 == 'KT',]);
do_kt10 <- nrow(data[data$광역시도.국문. == '세종특별자치시' & data$통신사 == 'KT',]);
do_kt11 <- nrow(data[data$광역시도.국문. == '울산광역시' & data$통신사 == 'KT',]);
do_kt12 <- nrow(data[data$광역시도.국문. == '인천광역시' & data$통신사 == 'KT',]);
do_kt13 <- nrow(data[data$광역시도.국문. == '전라남도' & data$통신사 == 'KT',]);
do_kt14 <- nrow(data[data$광역시도.국문. == '전라북도' & data$통신사 == 'KT',]);
do_kt15 <- nrow(data[data$광역시도.국문. == '제주특별자치도' & data$통신사 == 'KT',]);
do_kt16 <- nrow(data[data$광역시도.국문. == '충청남도' & data$통신사 == 'KT',]);
do_kt17 <- nrow(data[data$광역시도.국문. == '충청북도' & data$통신사 == 'KT',]);

#LGU+ 광역시 카운트
do_lgu1 <- nrow(data[data$광역시도.국문. == '강원도' & data$통신사 == 'LGU+',]);
do_lgu2 <- nrow(data[data$광역시도.국문. == '경기도' & data$통신사 == 'LGU+',]);
do_lgu3 <- nrow(data[data$광역시도.국문. == '경상남도' & data$통신사 == 'LGU+',]);
do_lgu4 <- nrow(data[data$광역시도.국문. == '경상북도' & data$통신사 == 'LGU+',]);
do_lgu5 <- nrow(data[data$광역시도.국문. == '광주광역시' & data$통신사 == 'LGU+',]);
do_lgu6 <- nrow(data[data$광역시도.국문. == '대구광역시' & data$통신사 == 'LGU+',]);
do_lgu7 <- nrow(data[data$광역시도.국문. == '대전광역시' & data$통신사 == 'LGU+',]);
do_lgu8 <- nrow(data[data$광역시도.국문. == '부산광역시' & data$통신사 == 'LGU+',]);
do_lgu9 <- nrow(data[data$광역시도.국문. == '서울특별시' & data$통신사 == 'LGU+',]);
do_lgu10 <- nrow(data[data$광역시도.국문. == '세종특별자치시' & data$통신사 == 'LGU+',]);
do_lgu11 <- nrow(data[data$광역시도.국문. == '울산광역시' & data$통신사 == 'LGU+',]);
do_lgu12 <- nrow(data[data$광역시도.국문. == '인천광역시' & data$통신사 == 'LGU+',]);
do_lgu13 <- nrow(data[data$광역시도.국문. == '전라남도' & data$통신사 == 'LGU+',]);
do_lgu14 <- nrow(data[data$광역시도.국문. == '전라북도' & data$통신사 == 'LGU+',]);
do_lgu15 <- nrow(data[data$광역시도.국문. == '제주특별자치도' & data$통신사 == 'LGU+',]);
do_lgu16 <- nrow(data[data$광역시도.국문. == '충청남도' & data$통신사 == 'LGU+',]);
do_lgu17 <- nrow(data[data$광역시도.국문. == '충청북도' & data$통신사 == 'LGU+',]);

#SKT 광역시 카운트    
do_skt1 <- nrow(data[data$광역시도.국문. == '강원도' & data$통신사 == 'SKT',]);
do_skt2 <- nrow(data[data$광역시도.국문. == '경기도' & data$통신사 == 'SKT',]);
do_skt3 <- nrow(data[data$광역시도.국문. == '경상남도' & data$통신사 == 'SKT',]);
do_skt4 <- nrow(data[data$광역시도.국문. == '경상북도' & data$통신사 == 'SKT',]);
do_skt5 <- nrow(data[data$광역시도.국문. == '광주광역시' & data$통신사 == 'SKT',]);
do_skt6 <- nrow(data[data$광역시도.국문. == '대구광역시' & data$통신사 == 'SKT',]);
do_skt7 <- nrow(data[data$광역시도.국문. == '대전광역시' & data$통신사 == 'SKT',]);
do_skt8 <- nrow(data[data$광역시도.국문. == '부산광역시' & data$통신사 == 'SKT',]);
do_skt9 <- nrow(data[data$광역시도.국문. == '서울특별시' & data$통신사 == 'SKT',]);
do_skt10 <- nrow(data[data$광역시도.국문. == '세종특별자치시' & data$통신사 == 'SKT',]);
do_skt11 <- nrow(data[data$광역시도.국문. == '울산광역시' & data$통신사 == 'SKT',]);
do_skt12 <- nrow(data[data$광역시도.국문. == '인천광역시' & data$통신사 == 'SKT',]);
do_skt13 <- nrow(data[data$광역시도.국문. == '전라남도' & data$통신사 == 'SKT',]);
do_skt14 <- nrow(data[data$광역시도.국문. == '전라북도' & data$통신사 == 'SKT',]);
do_skt15 <- nrow(data[data$광역시도.국문. == '제주특별자치도' & data$통신사 == 'SKT',]);
do_skt16 <- nrow(data[data$광역시도.국문. == '충청남도' & data$통신사 == 'SKT',]);
do_skt17 <- nrow(data[data$광역시도.국문. == '충청북도' & data$통신사 == 'SKT',]);


#각 도별 갯수 파악'
count_do1 <- c(do_kt1,do_lgu1,do_skt1);
count_do2 <- c(do_kt2,do_lgu2,do_skt2);
count_do3 <- c(do_kt3,do_lgu3,do_skt3);
count_do4 <- c(do_kt4,do_lgu4,do_skt4);
count_do5 <- c(do_kt5,do_lgu5,do_skt5);
count_do6 <- c(do_kt6,do_lgu6,do_skt6);
count_do7 <- c(do_kt7,do_lgu7,do_skt7);
count_do8 <- c(do_kt8,do_lgu8,do_skt8);
count_do9 <- c(do_kt9,do_lgu9,do_skt9);
count_do10 <- c(do_kt10,do_lgu10,do_skt10);
count_do11 <- c(do_kt11,do_lgu11,do_skt11);
count_do12 <- c(do_kt12,do_lgu12,do_skt12);
count_do13 <- c(do_kt13,do_lgu13,do_skt13);
count_do14 <- c(do_kt14,do_lgu14,do_skt14);
count_do15 <- c(do_kt15,do_lgu15,do_skt15);
count_do16 <- c(do_kt16,do_lgu16,do_skt16);
count_do17 <- c(do_kt17,do_lgu17,do_skt17);



dfff <- data.frame('통신사'=names, '와이파이 현황수'=count,
                   "강원도"=count_do1, "경기도"=count_do2,
                   "경상남도"=count_do3,"경상북도"=count_do4,
                   "광주광역시"=count_do5,"대구광역시"=count_do6,
                   "대전광역시"=count_do7,"부산광역시"=count_do8,
                   "서울특별시"=count_do9,"세종특별자치시"=count_do10,
                   "울산광역시"=count_do11,"인천광역시"=count_do12,
                   "전라남도"=count_do13,"전라북도"=count_do14,
                   "제주특별자치도"=count_do15,"충청남도"=count_do16,
                   "충청북도"=count_do17
                   );


writedata <- function(df){
  write.csv(df, file='open_WiFi_DB_20180328.csv');
}
writedata(dfff);
#df_store <- dfff$통신사;
#df_kt <- dfff[1,c(-1,-2)];
#df_lgu <- dfff[1,c(-1,-2)];
#df_skt <- dfff[1,c(-1,-2)];

#as.data.frame(df_store)
#as.data.frame(df_kt)
#class(df_store)

#store <- data.frame('df_store'=df_store, 'df_kt'=df_kt);















qqplot(data=dfff, aes(y='통신사', x='강원도')) +geom_col()


data <- exdata()
data$avg <- round(rowMeans(data[,c(4:6)]), 2)

writedata(data);

newdata <- read.csv('result0328.csv', header=F, stringsAsFactors = F, encoding = 'UTF-8')