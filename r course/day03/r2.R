library('ggplot2')
str(mpg)
View(mpg)


tf <- data.frame(x=c(1:5),y=c(6:10))

tfc <- tf

colnames(tfc) <- c('Col1','Col2')

#rownames(tfc) <- c('a','b','c','d','e')
#install.packages('dplyr')
library(dplyr)


#colnames는 한번에 다넣어야 함 rename은 각각 임의 값만 변경 가능
tfc <- rename(tf,'XX1'=x,'YY1'=y)

View(mpg)
mpg <- rename(mpg,'city'='cty','highway'='hwy')

mpg$total <-(mpg$city+mpg$highway)/2

hist(mpg$total)

#20이 넘으면 PASS 아니면, FAIL
mpg$test <- ifelse(mpg$total >= 20, 'PASS', 'FAIL')

#특정 컬럼 기준으로 count 뽑기
table(mpg$test)
#count로 뽑은 컬럼을 막대 그래프로
qplot(mpg$test)

class(table(mpg$test))
abc <- as.vector(table(mpg$test))
class(abc)


# total 연비를 3등급으로 나누고자 한다.
# 30이상 A
# 20~29  B
# 20미만 C
# grade라는 컬럼을 만들어 추가 한다.
# grade를 기준으로 그래프를 그린다.

mpg$grade <- ifelse(mpg$total >= 30, 'A', ifelse(mpg$total >= 20, 'B', 'C'))
qplot(mpg$grade)
