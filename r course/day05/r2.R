#p189
library(dplyr)
View(mpg)
mpg2 <- mpg[,c('drv', 'hwy')]


#dry 별 hwy의 평균
result <- aggregate(hwy~drv,mpg2,mean)

#reorder을 이용하여 순차적으로 정렬
#오름차순
ggplot(data=result, aes(x=reorder(drv, hwy), y=hwy))+geom_col();
#내림차순
ggplot(data=result, aes(x=reorder(drv, -hwy), y=hwy))+geom_col();
#단순 카운트 셀 때 x축의 항목에 맞춰서 그려준다. p192
#빈도 막대 그래프
ggplot(data=mpg, aes(x=hwy))+geom_bar()


#p193
aggregate()
suv_mpg <- mpg[mpg$class=='suv',]
suv_mpg <- mpg[order(mpg$cty, decreasing = T),]


ggplot(data=mpg, aes(x=class))+geom_bar()