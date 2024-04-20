**CLASSIFICATION – DECISION TREES**
**SPRING 2024**
**LABORATORY ASSIGNMENT # 3**

**Data File:** `carseatsSpam.csv`
- **Variables:** 11 (10 predictors, 1 target)
- **Records:** 400
- **Predictors:** CompPrice, Income, Advertising, Population, Price, ShelveLoc, Age, Education, Urban, US
- **Target Variable:** Spam (Categorical)

**Objective:** Analyze the data to classify emails as spam or not spam using a decision tree model.

**Tools Required:** R Software, MS Word

### Part 1: Creating the Tree Model (10 points)
1. **Read the data:**
   ```R
   carseatsSpam <- read.csv("carseatsSpam.csv", stringsAsFactors = TRUE)
   ```
2. **Check data dimensions:**
   ```R
   dim(carseatsSpam)  # Should be 400, 11
   ```
3. **Check for missing data:**
   ```R
   sum(is.na(carseatsSpam))
   ```
4. **Ensure strings are read as factors.**
5. **Extract the target variable:**
   ```R
   sp <- carseatsSpam$Spam
   ```
6. **Ensure data is a data frame:**
   ```R
   carseatsSpam <- data.frame(carseatsSpam)
   ```
7. **Install and load the `tree` package:**
   ```R
   install.packages("tree")
   library(tree)
   ```
8. **Create the tree model:**
   ```R
   tree.Spam <- tree(Spam ~ ., carseatsSpam)
   ```
9. **Print the summary of the tree:**
   ```R
   summary(tree.Spam)
   ```
10. **Plot the tree and add labels:**
    ```R
    plot(tree.Spam)
    text(tree.Spam, pretty = 0)
    ```

### Part 2: Assessing the Model Performance (5 points)
11. **Predict using the tree model:**
    ```R
    tree.Spam.predict <- predict(tree.Spam, carseatsSpam[,-c(11)], type = "class")
    ```
12. **Install and load the `caret` package for performance metrics:**
    ```R
    install.packages("caret")
    library(caret)
    ```
13. **Create a confusion matrix and calculate accuracy:**
    ```R
    confusionMatrix(carseatsSpam$Spam, tree.Spam.predict)
    mean(carseatsSpam$Spam == tree.Spam.predict)
    ```

### Part 3: Train and Test Set Cross Validation (5 points)
14. **Initialize random number generator:**
    ```R
    set.seed(123)
    ```
15. **Create training and testing subsets:**
    ```R
    trainSpam <- sample(1:nrow(carseatsSpam), dim(carseatsSpam)[1]/2)
    carseatsSpam.test <- carseatsSpam[-trainSpam,]
    carseatsSpam.test <- carseatsSpam.test[, -c(11)]
    sp.test <- sp[-trainSpam]
    ```
16. **Validation model creation and assessment:**
    ```R
    tree.carseats.tt <- tree(Spam ~ ., carseatsSpam, subset = trainSpam)
    tree.sp.predict <- predict(tree.carseats.tt, carseatsSpam.test, type="class")
    confusionMatrix(sp.test, tree.sp.predict)
    mean(sp.test == tree.sp.predict)
    ```

### Part 4: K-fold Validation and Pruning (10 points)
17. **Reinitialize the random number generator:**
    ```R
    set.seed(234)
    ```
18. **Perform k-fold cross validation to find optimal tree complexity:**
    ```R
    cv.spam <- cv.tree(tree.carseats.tt, FUN = prune.misclass)
    plot(cv.spam$size, cv.spam$dev, type = "b")
    plot(cv.spam$k, cv.spam$dev, type = "b")
    ```
19. **Prune the tree and assess the pruned model:**
    ```R
    prune.spam <- prune.misclass(tree.carseats.tt, best = 13)
    plot(prune.spam)
    text(prune.spam, pretty = 0)
    tree.kvsp.predict <- predict(prune.spam, carseatsSpam.test, type="class")
    confusionMatrix(sp.test, tree.kvsp.predict)
    mean(sp.test == tree.k

