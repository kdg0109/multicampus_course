#############################################################
# p213
# 09-2 성별에 따른 월급 차이 - "성별에 따라 월급이 다를까?"


#############################################################

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





# 성별 변수 검토 및 전처리
class(welfare$sex)
table(welfare$sex)


# 이상치 확인
table(welfare$sex)

# 이상치 결측 처리
welfare$sex <- ifelse(welfare$sex == 9, NA, welfare$sex)

# 결측치 확인
table(is.na(welfare$sex))



#성별 항목 이름 부여
welfare$sex <- ifelse(welfare$sex == 1, "male", "female")
table(welfare$sex)

qplot(welfare$sex)







#p216
# 월급 변수 검토 및 전처리
# 변수 검토
class(welfare$income)

summary(welfare$income)

qplot(welfare$income)

qplot(welfare$income) + xlim(0, 1000)

# 전처리
summary(welfare$income)

# 이상치 결측 처리
welfare$income <- ifelse(welfare$income %in% c(0, 9999), NA, welfare$income)

# 결측치 확인
table(is.na(welfare$income))

#p218
# 성별에 따른 월급 차이 분석하기
# 1. 성별 월급 평균표 만들기
sex_income <- welfare %>%
  filter(!is.na(income)) %>%
  group_by(sex) %>%
  summarise(mean_income = mean(income))

sex_income

# 2. 그래프 만들기
ggplot(data = sex_income, aes(x = sex, y = mean_income)) + geom_col()