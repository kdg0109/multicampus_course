library('googleVis')
head(Fruits)

class(Fruits)

# 데이터 안에 몇 개가 있는지 안다는 전제하에 가능하다
banana <- Fruits[Fruits$Fruit == 'Bananas',]
result <- sum(banana$Sales)

###############################################################################
df1 <- aggregate(Sales~Fruit,Fruits,sum)        #과일 별 매출 합계
df2 <- aggregate(Profit~Year,Fruits,sum)        #연도 별 이익 합계
df3 <- aggregate(Profit~Fruit+Year,Fruits,sum)  #과일 별, 연도 별 이익 합계
df4 <- aggregate(Profit~Year+Fruit,Fruits,sum)  #연도 별, 과일 별 이익 합계

###############################################################################
df5 <- Fruits[,c(4:6)]
colSums(df5)
apply(df5,2, sum)                               #열 별 합계





# 1. Fruits 데이터를 기반으로
# 연도별 월별 Sales의 합을 구하라
df_test1 <- aggregate(Sales~Year+substr(Date, 6, 7),Fruits,sum)
df_test2 <- aggregate(Profit~Year+substr(Date, 6, 7),Fruits,sum)
# 2. 1번의 결과를 기반으로 순이익(Psales) 칼럼을 추가한다.
# 공식 (Sales - Profit) * 1.83
df_test3 <- cbind(df_test1, Psales=((df_test1$Sales - df_test2$Profit) * 1.83))


#df_test1$Psales <- cbind(df_test1, ((df_test1$Sales - df_test2$Profit) * 1.83))




# 3. 연월 월 별 세금을 계산 한다.
#세금은
#(총 판매액(Sales)-총 수익(Profit))*0.1이다.
YEAR <- substr(Fruits$Date, 1,4)
Month <- substr(Fruits$Date, 6, 7)

Fee <-  (Fruits$Sales-Fruits$Profit)*0.1

df_test3 <- aggregate(Fee~YEAR+Month, Fruits, sum)
df_test3 <- aggregate(Fee~YEAR+Month, Fruits, sum)
colnames(df_test3) <- c('Year', 'Month', 'Fee')

