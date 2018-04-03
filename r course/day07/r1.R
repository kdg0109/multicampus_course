install.packages('rJava')
install.packages('memoise')
install.packages('KoNLP')
install.packages('wordcloud')

#p264 데이터마이닝
#필요한 라이브러리 선언
library(memoise)
library(rJava)
library(KoNLP)
library(dplyr)
library(stringr) #특수문자 제거
library(wordcloud)
library(RColorBrewer) #좀더 다양한 색상 추가

useNIADic();
#txt <- readLines('hiphop.txt');
#txt <- readLines('kakao.txt');
#txt <- readLines('haha.txt');
txt <- readLines('dragon.txt');
#txt <- readLines('KakaoTalkChats.txt');
#txt <- readLines('http://news.naver.com/main/read.nhn?mode=LPOD&mid=sec&oid=001&aid=0010000299&isYeonhapFlash=Y&rc=N');
txt <- gsub('\\W', ' ', txt);                #특수문자를 제거하시오
txt <- gsub('\\^', ' ', txt);         #특수문자를 제거하시오
txt <- gsub('^ㅋ', ' ', txt);         #특수문자를 제거하시오
txt <- gsub('[a-z]', ' ', txt);         
txt <- gsub('[A-Z]', ' ', txt);         
noun <- extractNoun(txt);                   #명사만 추출
vc <- unlist(noun)                          #list 형을 vector로 바꾸기
wc <- table(vc)
wf <- as.data.frame(wc, stringsAsFactors = F)
#wf <- rename(wf, Var1 = vc, freq = Freq)
head(wf)
wf <- filter(wf, nchar(vc)>=2)            # 단어의 개수가 2개 이상
wf <- head(wf[order(wf$Freq, decreasing = T),], 80)

pal <- brewer.pal(8, 'Blues')[5:9];             # Dark2라는 통에서 여러 색상 가져오겠다
set.seed(1234);                             #1234 안에서의 난수를 추출해서 wordcloud모양을 바꿈

jpeg(filename = "dragon.jpg", width = 680, height = 680, quality = 100)

p = wordcloud(words = wf$vc,
          freq = wf$Freq,
          min.freq = 2,
          max.words = 150,
          random.order = F,
          color = pal,
          #scale=c(15, 0.3),
          scale=c(12, 1),
          rot.per = 0.1);                      #글자의 로테이션 빈도수
          

print(p);
dev.off();

