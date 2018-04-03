#install.packages('RgoogleMaps')

g1 <- function(a){  
  library(RgoogleMaps)
  library(readxl)
  library(dplyr)
  mycenter = c(37.525083, 127.055982)
  #지도 그리기
  mymap <- GetMap(
    center=mycenter,
    zoom=11,
    maptype='road',
    format='roadmap',
    destfile = 'mymap.jpg'
    
  )
  
  # 데이터 불러오기
  raw_welfare <- read.csv(file = "seoul.csv", header=TRUE, sep = ',')
  
  if(a == 1){
    jpg_name <- "wifi_kt.jpg"
    com_name <- "KT"
  }else if(a == 2){
    jpg_name <- "wifi_lg.jpg"
    com_name <- "LGU+"
  }else{
    jpg_name <- "wifi_skt.jpg"
    com_name <- "SKT"
  }
  
  new_welfare <- raw_welfare %>%
    filter(raw_welfare$com == com_name);
  jpeg(filename = jpg_name, width = 680, height = 680, quality = 100)
  
  wifi_lat <- new_welfare$lat;
  wifi_lon <- new_welfare$lon;
  
  p <- PlotOnStaticMap(mymap,
                       lat= new_welfare$lat,
                       lon= new_welfare$lon,
                       cex=1, pch=10,col='red'
  )
  
  print(p);
  dev.off();

}