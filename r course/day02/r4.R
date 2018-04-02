library(ggplot2)
data <- c(10,10,20,30,30,30)
qplot(data)

qplot(data=mpg, y=hwy, x=drv, geom = "line")
qplot(data=mpg, y=hwy, x=drv, geom = "boxplot")
qplot(data=mpg, y=hwy, x=drv, geom = "boxplot", colour = drv)