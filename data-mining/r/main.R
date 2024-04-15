# Load the necessary library
library(class)

# Assuming the dataset and relevant features are loaded correctly
# You may need to adjust the names and indexing based on your specific dataset structure

# Load the data (replace with correct path and filename as necessary)
data <- read.csv("data/CARSEATSPAM.csv")

# Prepare the data for kNN
# Assuming the first and second attributes are named `Attribute1` and `Attribute2`
attributes <- data[, c("Attribute1", "Attribute2")]

# Normalize the data
maxs <- apply(attributes, 2, max)
mins <- apply(attributes, 2, min)
scaled_attributes <- scale(attributes, center = mins, scale = maxs - mins)

# Define the test instance
test_instance <- c((9.1 - mins[1]) / (maxs[1] - mins[1]), (11.0 - mins[2]) / (maxs[2] - mins[2]))

# Compute the k-nearest neighbors
neighbors <- knn(train = scaled_attributes, test = matrix(test_instance, nrow = 1), cl = data$Class, k = 5)
print("5-nearest neighbors:")
print(neighbors)
