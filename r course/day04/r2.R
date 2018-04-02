library(ggplot2)
library(dplyr)

#p160
#1 미성년 인구 백분율
df_midwest <- as.data.frame(midwest)
class(df_midwest)
df_midwest$pop_percent <-100-((df_midwest$popadults/df_midwest$poptotal)*100)


#2
df_midwest %>%
  select(county)  %>% 
  arrange(desc(df_midwest$pop_percent)) %>%
  head(5)

#3
df_midwest <- df_midwest %>% mutate(range = ifelse(pop_percent >= 40, "large", 
                                            ifelse(pop_percent >= 30, "middle", "small")))

df_midwest %>%
  group_by(range) %>%
  summarise(n= n())


#4
df_midwest$pop_asian_percent <-((df_midwest$popasian/df_midwest$poptotal)*100)

df_midwest %>%
  select(state, county,pop_asian_percent)  %>% 
  arrange(df_midwest$pop_asian_percent) %>%
  head(10)


df_midwest$pop_asian_percent <-((df_midwest$popasian/df_midwest$poptotal)*100)
head(df_midwest[order(df_midwest$pop_asian_percent), c('state', 'county', 'pop_asian_percent')], 10)




########################################################################################v















st <- read.csv('csv_exam.csv', header = F)
colnames(st) <- c('id','class','ko','en','ma')
View(st)

# class에 NA가 몇 개있는지 확인
table(is.na(st$class))

#NA를 제외한 숫자들만 평균을 낸다
mean(st$ko, na.rm = T)

#학생 정보를 조회 하시오

#단 id, class, ko 결측치(NA)가 있는 학생은 빼시오
st[,c(1:3)]
##1
df_st <- st %>% filter(!is.na(class) & !is.na(ko))
df_st[,c(1:3)]
##2
st[!is.na(st$class) & !is.na(st$ko), c(1:3)]
##3 omit은 결측치가 있는 컬럼 자체를 알아서 빼줌
na.omit(st[,c(1:3)])



# 국어, 영어, 수학 성적의 평균을 구하여
# vector를 만든다.
##1              ##1과 ##2는 총 20개에서 결측치 4개를 뺀 16개 데이터에 대해 평균
st_na <- na.omit(st)
colMeans(st_na[,c(3:5)]);
##2
st_na <- na.omit(st)
c(mean(st_na[,c('ko')]),mean(st_na[,c('en')]),mean(st_na[,c('ma')]))
##3 총 20개에서 결측치 4개를 포함한 20개 데이터에 대해 평균 결측치는 데이터 없음..
avg <- colMeans(st[,c('ko','en','ma')], na.rm = T)

# NA 값을 모두 1으로 바꾸시오

st$class <- ifelse(is.na(st$class), 1, st$class)
st$ko <- ifelse(is.na(st$ko), 1, st$ko)
st$en <- ifelse(is.na(st$en), 1, st$en)
st$ma <- ifelse(is.na(st$ma), 1, st$ma)

#한번에 1로 바꾸기 (id, class도 NA인거 고려해줘야 함)
st[is.na(st)]=1
boxplot(st$ko)
hist(st$ko)