
#exam$class가 2인 것들의 행, englich, math 칼럼 추출
exam[exam$class==2, c('english', 'math')]

temp <- c(3,1,3,5,4,2,3)
sort(temp, decreasing = T)

exam[order(exam$math, decreasing = T),] #디폴트가 내림



exam[order(exam$class, exam$math, decreasing = T),] #디폴트가 내림
#desc 높은거부터
exam3 <- exam %>% arrange(class, desc(math)) #높은 순
ex4 <- head(exam3,5)



#각 반 별 3과목 평균이 높은 사람 순으로 정렬 하시오

#각 반 별 3과목 평균
#avg <- (exam$math+exam$english+exam$science)/3;


avg <- rowMeans(exam[,c(3:5)]);

exam_test <- aggregate(avg, exam, sum);
exam_test <- rename(exam_test,'avg'=x);

exam_test <- exam_test %>% arrange(class, desc(avg))

#p141
#1
audi_mpg <- mpg[mpg$manufacturer == 'audi',]
audi_mpg <- audi_mpg %>% arrange(desc(hwy)) %>% head(5)


#2
audi_mpg2 <- mpg %>% filter(mpg$manufacturer == 'audi')
audi_mpg2 <- audi_mpg2 %>% arrange(desc(hwy)) %>% head(5)



#p144
#1
mpgdplyr<-mpg
mpgdplyr <- mpgdplyr %>% mutate(ctyhwy=cty+hwy)

#2
mpgdplyr <- mpgdplyr %>% mutate(avg=ctyhwy/2)

#3
mpgdplyr <- mpgdplyr %>% arrange(desc(avg)) %>% head(3)
#4
mpgdplyr<- mpgdplyr %>% mutate(ctyhwy=cty+hwy, avg=ctyhwy/2)%>%
  arrange(desc(avg)) %>% head(3)
mpgdplyr

