c2 <- c(1,2,3,NA,5);
mean(c2,na.rm = T)

f1 <- function(a,b){
  return (a+b);
}


b <- 0
f <- function() {
  a <- 1
  g <- function() {
    a <<- 2
    b <<- 2
      print(a)
      print(b)
  }
  g()
  print(a)
  print(b)
};

f()



cc <- c('1','1','1','1','1')
#mean(cc)
mean(as.numeric(cc))


ccc <- c(10, 40, 80, 20, 100, 70, 60)
#ccc[ccc <= 80 & ccc >= 60]
ccc[which(ccc%%2==0)]
ccc[1]

ccc <- c(12, 43, 84, 25, 101, 70, 60)
ccc[ccc%%2==0]



str4 <- c('a','b','c','d');
str4 <- paste(str4,collapse = ' ');
str4;