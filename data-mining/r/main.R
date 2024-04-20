# Part 1: Creating the Tree Model
carseatsSpam <- read.csv("CarseatsSpam.csv", stringsAsFactors = TRUE)

# Checking dimensions and missing data
print(dim(carseatsSpam))
print(sum(is.na(carseatsSpam)))

# Extracting the Spam attribute
sp <- carseatsSpam$Spam
carseatsSpam <- data.frame(carseatsSpam)

# Installing and loading necessary package
if (!require("tree")) install.packages("tree")
library(tree)

# Creating the tree model
tree.Spam <- tree(Spam ~ ., carseatsSpam)
print(summary(tree.Spam))

# Plotting the tree
plot(tree.Spam)
text(tree.Spam, pretty = 0)

# Part 2: Assessing the Model Performance
tree.Spam.predict <- predict(tree.Spam, carseatsSpam[,-11], type = "class")

# Installing and loading the caret package
if (!require("caret")) install.packages("caret")
library(caret)

# Confusion matrix and accuracy calculation
print(confusionMatrix(carseatsSpam$Spam, tree.Spam.predict))
print(mean(carseatsSpam$Spam == tree.Spam.predict))

# Part 3: Train and Test Set Cross Validation
set.seed(123)

# Creating training and testing subsets
trainSpam <- sample(1:nrow(carseatsSpam), dim(carseatsSpam)[1]/2)
carseatsSpam.train <- carseatsSpam[trainSpam,]
carseatsSpam.test <- carseatsSpam[-trainSpam,]

# Adjusting test set
sp.test <- carseatsSpam.test$Spam

# Creating the validation model
tree.carseats.tt <- tree(Spam ~ ., carseatsSpam.train)
tree.sp.predict <- predict(tree.carseats.tt, carseatsSpam.test, type="class")

# Confusion matrix and accuracy calculation for the validation model
print(confusionMatrix(sp.test, tree.sp.predict))
print(mean(sp.test == tree.sp.predict))

# Part 4: K-fold Validation and Pruning
set.seed(234)

# Cross-validation to determine the optimal level of tree complexity
cv.spam <- cv.tree(tree.carseats.tt, FUN = prune.misclass)

# Plotting the cross-validation results
plot(cv.spam$size, cv.spam$dev, type = "b")
plot(cv.spam$k, cv.spam$dev, type = "b")

# Pruning the tree
prune.spam <- prune.misclass(tree.carseats.tt, best = 13)
plot(prune.spam)
text(prune.spam, pretty = 0)

# Testing the pruned tree and recalculating the metrics
tree.kvsp.predict <- predict(prune.spam, carseatsSpam.test, type="class")
print(confusionMatrix(sp.test, tree.kvsp.predict))
print(mean(sp.test == tree.kvsp.predict))
