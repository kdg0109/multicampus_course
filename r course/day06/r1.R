#209 ~ 261
#install.packages('foreign')
#install.packages('readxl')

library(foreign)
library(dplyr)
library(ggplot2)
library(readxl)

# 데이터 불러오기
raw_welfare <- read.spss(file = "Koweps_hpc10_2015_beta1.sav", to.data.frame = T)

# 복사본 만들기
welfare <- raw_welfare

# 데이터 검토하기
head(welfare)
tail(welfare)
View(welfare)
dim(welfare)
str(welfare)
summary(welfare)

# 컬럼 개수 구하기
length(colnames(welfare))

#변수명(컬럼명) 바꾸기
welfare <- rename(welfare,
                  sex = h10_g3,                  # 성별
                  birth = h10_g4,                # 태어난 연도
                  marriage = h10_g10,            # 혼인 상태
                  religion = h10_g11,            # 종교
                  income = p1002_8aq1,           # 월급
                  code_job = h10_eco9,           # 직업 코드
                  code_region = h10_reg7)        # 지역 코드


##데이터 분석 절차                            # NA가 존재하는지 꼭 확인
# 남자 여자 테이블
gender <- table(welfare$sex)
# 값 바꾸기
welfare$sex <- ifelse(welfare$sex==1, 'male', 'female')
qplot(welfare$sex)