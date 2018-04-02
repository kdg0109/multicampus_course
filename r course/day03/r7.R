#p145
exam
#class 별 math 평균
aggregate(math~class,exam, mean)

#class 별 math의 평균
exam %>%
  group_by(class) %>%
  summarise(mean_math=mean(math))




#class 별 math의 평균, english의 합, science의 평균, n은 카운트
ex1 <- exam %>%
  group_by(class) %>%
  summarise(
    mean_math=mean(math),
    sum_english=sum(english),
    mean_science=mean(science),
    n=n()
  )

mpg %>%
  group_by(manufacturer, drv) %>%
  summarise(
    mcty=mean(cty)) %>%
    head(5)
  

#p150  
#1
mpg %>%
  group_by(class) %>%
  summarise(
    cty_avg=mean(cty)
  )

#2
mpg %>%
  group_by(class) %>%
  summarise(
    cty_avg=mean(cty)
  ) %>%
  arrange(desc(cty_avg))

#3
mpg %>%
  group_by(class) %>%
  summarise(
    hwy_avg=mean(hwy)
  ) %>%
  head(3)

#4
compact_mpg <- mpg %>%  filter(mpg$class == 'compact')

compact_mpg %>%
  group_by(manufacturer) %>%
  summarise(
    count=n()
  ) %>%
  arrange(count)
