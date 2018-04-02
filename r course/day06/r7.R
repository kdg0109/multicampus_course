#############################################################
# p240
# 09-7 성별 직업 빈도-"성별로 어떤 직업이 가장 많을까?"


#############################################################

#p240
# 성별 직업 빈도 분석하기
# 1. 성별 직업 빈도표 만들기
# 남성 직업 빈도 상위 10개 추출
job_male <- welfare %>%
  filter(!is.na(job) & sex == "male") %>%
  group_by(job) %>%
  summarise(n = n()) %>%
  arrange(desc(n)) %>%
  head(10)

job_male


# 여성 직업 빈도 상위 10개 추출
job_female <- welfare %>%
  filter(!is.na(job) & sex == "female") %>%
  group_by(job) %>%
  summarise(n = n()) %>%
  arrange(desc(n)) %>%
  head(10)

job_female

# 2. 그래프 만들기
# 남성 직업 빈도 상위 10개 직업
ggplot(data = job_male, aes(x = reorder(job, n), y =n)) +
  geom_col() +
  coord_flip()

# 여성 직업 빈도 상위 10개 직업
ggplot(data = job_female, aes(x = reorder(job, n), y =n)) +
  geom_col() +
  coord_flip()

