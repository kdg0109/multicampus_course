m1 <- matrix(c(80, 80, 90, 99,
               90, 99, 78, 89,
               70, 78, 82, 78,
               100, 72, 78, 90), nrow=4)

colnames(m1) <- c('ko','en','si', 'ma')
rownames(m1) <- c('kim','lee','hong', 'jang')

m1

mm1 <- m1[,mean(c(1:4))]
mm1;
mm2 <- m1[mean(c(1:4)),]

mm1;
mm2;

avg_name <- c(mean(m1[1,]),mean(m1[2,]),mean(m1[3,]),mean(m1[4,]))
avg_sub <- c(mean(m1[,1]),mean(m1[,2]),mean(m1[,3]),mean(m1[,4]))
avg_name
avg_sub

rm<- rowMeans(m1);
rm;
cm<- colMeans(m1);
cm