m1 <- matrix(c(80, 80, 90, 99,
               90, 99, 78, 89,
               70, 78, 82, 78,
               100, 72, 78, 90), nrow=4);


colnames(m1) <- c('ko','en','si', 'ma');
rownames(m1) <- c('kim','lee','hong', 'jang');

m1 <- rbind(m1, avg=round(colMeans(m1)));
m1 <- cbind(m1, avg=round(rowMeans(m1),1));
m1 <- cbind(m1, sum=round(rowSums(m1[,-5])));
            
m1
            