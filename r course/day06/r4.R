#############################################################
# p225
# 09-4 연령대에 따른 월급 차이-"어떤 연령대의 월급이 가장 많을까?"


#############################################################

#p225
# 연령대 변수 검토 및 전처리하기
# 파생변수 만들기 - 연령대
welfare <- welfare %>%
  mutate(ageg = ifelse(age < 30, "young",
                       ifelse(age <= 59, "middle", "old")))

table(welfare$ageg)

qplot(welfare$ageg)

#p226
# 연령대에 따른 월급 차이 분석하기
# 1. 연령대 별 월급 평균표 만들기
ageg_income <- welfare %>%
  filter(!is.na(income)) %>%
  group_by(ageg) %>%
  summarise(mean_income = mean(income))

ageg_income

# 2. 그래프 만들기
ggplot(data = ageg_income, aes(x = ageg, y = mean_income)) + geom_col()

# 순서 정하기
ggplot(data = ageg_income, aes(x = ageg, y = mean_income)) + geom_col() +
  scale_x_discrete(limits = c("young", "middle", "old"))
