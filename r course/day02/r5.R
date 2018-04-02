name <- c('김지훈', '이유진', '박동현', '김민지')
gender <- c('m', 'f', 'm', 'f')
ko <- c(90, 80, 70, 60)
ma <- c(50, 60, 100, 20)
si <- c(87, 54, 79, 89)
en <- c(54, 67, 87, 88)
add <- c('서울시', '광주시', '대전시', '부산시');

df <- data.frame(name, gender, ko, ma, si, en, add)
df

range <- df[,c(3:6)]
range2 <- df[,c(3,6)]

stu_avg <- rowMeans(range); #학생별 평균
names (stu_avg) <- df$name;
course <- colMeans(range);  #과목별 평균

#1
#학생 별 국어와 영어의 평균을 구하시오
#Vector로 표현 하시오
#단, 컬럼 명은 학생의 이름으로 표시하시오

ko_en_avg <- rowMeans(range2)
names (ko_en_avg) <- df$name;


#2
#여학생들의 과목 별 평균을 구하시오
#Vector로 표현 하시오
#단, 컬럼 명은 과목 명이 표시 된다.
r1 <- colMeans(df[gender == 'f',][,c(3:6)])
df

names (r1) <- colnames(df[,c(3:6)]);

result1 <- df[df$gender=='f',]
r1 <- colMeans(result1[,c(3:6)])

result2 <- df[df$gender=='m',]
r2 <- colMeans(result2[,c(3:6)])

result3 <- rbind(r1, r2)
class(result3)
result4 <- as.data.frame(result3)
as.data.frame(result4)
class(result4)



colnames(df[,c(3:6)])

stu_avg
course


temp <- df[, 'add']
#문자열의 벡터로 만드는 기법
temp2 <- as.character(temp)

class(temp2)

df$add <- substr(temp2, 1, 2)
df$add2 <- substr(temp2, 3, 3)

dfm <- df[gender == 'm',]
dff <- df[gender == 'f',]

dfm
dff

mavg <- colMeans(dfm[,c(3:6)])

favg <- colMeans(dff[,c(3:6)])



qplot(y=mavg, x=names(mavg))


df2 <- data.frame(stu_avg, course)
df2;

qplot(data=df2, y=stu_avg, x=course, geom = "boxplot")