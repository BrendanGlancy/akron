# Given values for the calculations
total_columns = 16  # 80m / 5m per square

# Random numbers provided by the user
random_numbers = [391, 401, 182, 196, 54, 77, 79, 373, 366, 214, 324, 328, 389]


# Function to calculate 'up' and 'right' counts based on a grid number
def calculate_counts(number, cols):
    # Adjust the number to start from 0 index
    number_adjusted = number - 1
    # Calculate the 'up' (row) and 'right' (column) counts
    up_count = number_adjusted // cols
    right_count = number_adjusted % cols
    return up_count, right_count


# Calculate 'up' and 'right' counts for each random number
for number in random_numbers:
    up, right = calculate_counts(number, total_columns)
    print(f"Number {number}: Up = {up}, Right = {right}")
