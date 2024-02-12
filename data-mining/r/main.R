churn <- read.csv("churn.csv")

dim(churn)

summary(churn)

table(churn$Churn)
pop.churn <- sum(churn$Churn == "TRUE") / length(churn$Churn)
pop.churn 

sum.churn <- table(churn$Churn)
sum.churn

barplot(sum.churn, ylim = c(0, 3000), ylab = "Counts", main = "bar plot", col = "lightblue")

sumtable <- addmargins(counts.intl, FUN = sum)
sumtable

