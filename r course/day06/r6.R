#############################################################
# p233
# 09-6 직업별 월급 차이-"어떤 직업이 월급을 가장 많이 받을까?"


#############################################################
# 엑셀을 불러오기 위해 라이브러리 호출
library(readxl)

#p223
# 직업 변수 검토 및 전처리하기
# 1. 변수 검토하기
class(welfare$code_job)
#code_job은 직업 코드
table(welfare$code_job)

# 2. 전처리
list_job <- read_excel("Koweps_Codebook.xlsx", col_names = T, sheet = 2)
head(list_job)
# 출력 결과를 보면, 직업분류코드 목록이 코드와 직업몇 두 변수로 구성되어 있음
dim(list_job)

# xlsx 내용과 직업코드 결합
welfare <- left_join(welfare, list_job, id = "code_job")

## Joining, by = "code_job"

welfare %>%
  filter(!is.na(code_job)) %>%
  select(code_job, job) %>%
  head(10)

#p235
# 직업별 월급 차이 분석하기
# 1. 직업별 월급 평균표 만들기
job_income <- welfare %>%
  filter(!is.na(job) & !is.na(income)) %>%
  group_by(job) %>%
  summarise(mean_income = mean(income))

head(job_income)

# 2. 월급 내림차순 정렬
top10 <- job_income %>%
  arrange(desc(mean_income)) %>%
  head(10)

top10

# 3. 그래프 만들기      coord_flip()를 이용하여 막대를 오른쪽으로 90도 회전
ggplot(data = top10, aes(x = reorder(job, mean_income), y = mean_income)) +
  geom_col() +
  coord_flip()

# 4. 하위 10위에 해당하는 직업 추출
# 하위 10위 추출
bottom10 <- job_income %>%
  arrange(mean_income) %>%
  head(10)

bottom10

# 그래프 만들기
ggplot(data = bottom10, aes(x = reorder(job, -mean_income),
                            y = mean_income)) +
  geom_col() +
  coord_flip() +
  ylim(0, 850)