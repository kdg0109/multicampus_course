# r7

name <- c('lee', 'kim', 'park', 'jang', 'hong');
age <- c(10, 20, 30, 40, 50);
weight <- c(40, 50, 60, 70, 80);
df <- data.frame(name, age, weight);
df
dim(df)
nrow(df)
ncol(df)





typeof(df)

df2 <- df[c(1:3),]
df2
mean(df2[,2])

colMeans(df2[,c('age','weight')]);


mean(df$age[1:3])

c <- df$age
c
which(df$age == 50)
mx <- -which(df$age == max(df$age));
mn <- -which(df$age == min(df$age));
mean(df$age[c(mx, mn)])


df$height <- c(180, 170, 160, 150, 155)
# weight / (height)*(height) * 10000
# bmi
df


df$bmi <- df$weight / (df$height ^2)*10000

df2

df2 <- df[df$weight >= 80 & df$weight <= 50,]
df2

df2[df2$height == max(df2$height),]

ww <- df2$weight
ww
hh <- df2$height