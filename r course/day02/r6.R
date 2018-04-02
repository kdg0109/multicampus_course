exdata <- function(){
  library(readxl);
  #data <- read_excel('excel_exam_nohead.xlsx', col_name = F);
  data <- read_excel('excel_exam_3.xlsx', sheet=2);
  return (data);
}
data <- exdata();
colnames(data) <- c('a','b','c','d','e')
mean(data$math)
colnames(dat)