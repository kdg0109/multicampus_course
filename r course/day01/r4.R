v1 <- c(70, 80, 90, 100);
names(v1) <- c('ko', 'en', 'si', 'ma');
v1;
vv <- v1[2:4]
result <- mean(v1[-2:-3])
result
print(result)

print(length(v1))

print(NROW(v1))
nrow(v1)

vv2 <- v1[c('ko', 'ma')]
vv2
vv2 <- v1[c(1, 4)]
vv2
vv2 <- v1[-2:-3]
vv2
vv2 <- v1[c(-2,-3)]
vv2

v1[names(v1)[2]]