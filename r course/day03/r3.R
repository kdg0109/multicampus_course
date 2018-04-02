library('ggplot2')
midwest
class(midwest)
#p123 문제 해결
#1
df_midwest <- as.data.frame(midwest)
class(df_midwest)

#2
df_midwest <- rename(df_midwest,'total'='poptotal','asian'='popasian')
df_midwest

#3
df_midwest$percent <-(df_midwest$asian/df_midwest$total)*100
hist(df_midwest$percent)

#4
avg <- mean(df_midwest$percent)
df_midwest$percent_size <- ifelse(df_midwest$percent > avg, 'large', 'small')

#5
table(df_midwest$percent_size)
qplot(df_midwest$percent_size)



