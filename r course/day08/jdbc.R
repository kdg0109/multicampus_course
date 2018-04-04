library(sqldf)
library(ggplot2)
library(dplyr)
str(iris)
head(iris)
class(iris)

mydata <- sqldf('SELECT * FROM iris WHERE Species = "setosa"')

mydaya2 <- iris[iris$Species == "setosa",]


mydaya2 <- iris[iris$Species == "setosa",]

colMeans(mydaya2[,c(1:4)])

colnames(iris) <- c('sl', 'sw', 'pl', 'pw', 's')
mydata3 <- sqldf('SELECT s, avg(sl), 
                avg(sw), 
                avg(pl), 
                avg(pw) FROM iris group by s');

mydata2 <- apply(iris[,c(1:4)],2,aggregate(sw~s, iris, mean))

mydata2 <- sapply(iris[,c(1:4)], mean)


mydata2 <- iris %>%
            group_by(s) %>%
            summarise(sl_mean = mean(sl),
                      sw_mean = mean(sw),
                      pl_mean = mean(pl),
                      pw_mean = mean(pw)
            )
ggplot(data=iris, aes(x=sw, y=pw))+geom_line()
ggplot(data=iris, aes(x=sl, y=pl))+geom_line()