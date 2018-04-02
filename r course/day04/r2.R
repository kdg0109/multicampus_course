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




