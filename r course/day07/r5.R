#install.packages('RgoogleMaps')
##############################
#
#
#         googleMap 사용
#
#
##############################
library(RgoogleMaps)
mycenter = c(37.525083, 127.055982)

#지도 그리기
mymap <- GetMap(
  center=mycenter,
  zoom=11,
  maptype='road',
  format='roadmap',
  destfile = 'mymap.jpg'
  
)


jpeg(filename = "mypoint.jpg", width = 680, height = 680, quality = 100)

mydata <- data.frame(a=c(1:5),
                     lat=c(37.515083, 37.535073, 
                           37.553063, 37.572053, 37.591043),
                     lon=c(127.015982, 127.035972, 
                           127.055962, 127.076952, 127.095942)
                      );
p <- PlotOnStaticMap(mymap,
                lat= mydata$lat,
                lon= mydata$lon,
                cex=1, pch=10,col='red'
                )

print(p);
dev.off();