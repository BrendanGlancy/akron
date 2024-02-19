stock_prices <- c(10, 7, 20, 12, 75, 15, 9, 18, 4, 12, 8, 14)

# Mean
mean(stock_prices)

# median
median(stock_prices)

# Mode
getmode <- function(v) {
  uniqv <- unique(v)
  uniqv[which.max(tabulate(match(v, uniqv)))]
}

mode <- getmode(stock_prices)
mode

sd(stock_prices)

# min-max
normalized <- (20 - min(stock_prices)) / (max(stock_prices) - min(stock_prices))
normalized

z_score <- (20 - mean(stock_prices)) / sd(stock_prices)
z_score
outlier_z_score <- stock_prices[abs(z_score) > 3]

IQR_value <- IQR(stock_prices)
Q1 <- quantile(stock_prices, 0.25)
Q3 <- quantile(stock_prices, 0.75)
lower_bound <- Q1 - 1.5 * IQR_value
upper_bound <- Q3 + 1.5 * IQR_value
outliers_iqr <- stock_prices[stock_prices < lower_bound | stock_prices > upper_bound]

stock_prices_no_outlier <- stock_prices[stock_prices != 75]

# Mean and Median with and without the outlier
mean_with <- mean(stock_prices)
median_with <- median(stock_prices)
mean_without <- mean(stock_prices_no_outlier)
median_without <- median(stock_prices_no_outlier)
