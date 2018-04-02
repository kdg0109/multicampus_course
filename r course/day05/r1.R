library(ggplot2)
#p185
#x축 : 배기량
#y축 : 고속도로 연비
#설정해주는 것 aes
#ggplot(data=mpg, aes(x=mpg$displ, y=mpg$hwy)
#geom_point() : 포인트 찍어줌
#geom_line() : 값에 연결된 라인 그려줌
#xlim, ylim은 범위 넓히기
ggplot(data=mpg, aes(x=displ, y=hwy))+geom_point()+geom_line()+ylim(10,50)+xlim(2,9)

#fname <- 'c:\rproject\mygraph.png'
#savePlot(filename = fname, type='png')



#p188
#1
ggplot(data=mpg, aes(x=cty, y=hwy))+geom_point()

#2
ggplot(data=,midwest, aes(x=poptotal, y=popasian))+geom_point()+xlim(0,500000)+ylim(0,10000)


##개인 공공디비
#st <- read.csv('open_WiFi_DB_20180328_2.csv', header = T)
#ggplot(data=,st, aes(x=st$시도, y=st$KT))+geom_point()