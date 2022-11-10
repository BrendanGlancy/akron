<!--
The PHP file must accept the forms data from the HTML file (GlancyBrendanAssignment3.html) and use the following criteria to calculate the total cost of renting a car.
1. If a user chooses to rent a full size car, the charge is going to be 54.99 per day.
2. If a user chooses to rent a mid-size car, the charge is going to be 45.99 per day.
3. If a user chooses to rent a compact car, the charge is going to be 36.99 per day.

Calculate the total cost of renting a car by multiplying the number of days by the cost per day.  For example, if a user chooses to rent a full size car for 5 days, the total cost is going to be 5 * 54.99 = 274.95.

The following values should also be displayed:
- Customer Name
- Customer Email
- Customer Phone
- Number of days the car is being rented
- Cost per day
- Total cost of renting the car
-->

<?php

$customerName = $_POST['customerName'];
$customerEmail = $_POST['customerEmail'];
$customerPhone = $_POST['customerPhone'];
$carType = $_POST['carSize'];
$numberOfDays = $_POST['numberOfDays'];

if ($carType == "Full") {
    $costPerDay = 39.99;
} else if ($carType == "Medium") {
    $costPerDay = 30.99;
} else if ($carType == "Small") {
    $costPerDay = 25.99;
}

$totalCost = $numberOfDays * $costPerDay;

// Create a new database 
$database = new SQLite3('CarRental.db');

// Create a mysql database connection user: root, password: password, database: GlancyBrendanAssignment5
$conn = new mysqli('localhost', 'root', 'password', 'CarRental');
// Check to see if the database exists
$sqlCheck = "CREATE DATABASE IF NOT EXISTS CarRental";
$conn->query($sqlCheck);

// check to see if the table exists and create it if it doesn't
$sqlCreate = "CREATE TABLE IF NOT EXISTS CarRental.car_rental (
    customerName VARCHAR(255) NOT NULL,
    customerEmail VARCHAR(255) NOT NULL,
    customerPhone VARCHAR(255) NOT NULL,
    carType VARCHAR(255) NOT NULL,
    numberOfDays INT NOT NULL,
    costPerDay FLOAT NOT NULL,
    totalCost FLOAT NOT NULL
)";

$conn->query($sqlCreate);

// Check if the connection was successful
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}

// Create a SQL query to insert the data into the database
$sql = "INSERT INTO car_rental (customerName, customerEmail, customerPhone, carType, numberOfDays, costPerDay, totalCost) VALUES ('$customerName', '$customerEmail', '$customerPhone', '$carType', '$numberOfDays', '$costPerDay', '$totalCost')";
$result = mysqli_query($conn, $sql);

// Check if the query was successful
if (!$result) {
    die("Query failed: " . mysqli_error($connection));
}

// make new variables to store the data from the database
$customerNameFromDB = "";
$customerEmailFromDB = "";
$customerPhoneFromDB = "";
$carTypeFromDB = "";
$numberOfDaysFromDB = "";
$costPerDayFromDB = "";
$totalCostFromDB = "";

// Create a SQL query to select the data from the database
$sql = "SELECT * FROM car_rental";
$result = mysqli_query($conn, $sql);

// Check if the query was successful
if (!$result) {
    die("Query failed: " . mysqli_error($connection));
}

// Loop through the database and store the data in the variables
while ($row = mysqli_fetch_assoc($result)) {
    $customerNameFromDB = $row['customerName'];
    $customerEmailFromDB = $row['customerEmail'];
    $customerPhoneFromDB = $row['customerPhone'];
    $carTypeFromDB = $row['carType'];
    $numberOfDaysFromDB = $row['numberOfDays'];
    $costPerDayFromDB = $row['costPerDay'];
    $totalCostFromDB = $row['totalCost'];
}

// Close the connection
mysqli_close($conn);
?>

<!DOCTYPE html>
  <head>
    <title>Car Rental</title>
    <!-- use Bootstrap for styling -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
  </div class="table">
   <table class="table table-striped">
      <tr>
        <th>Customer Name From Database</th>
        <th>Customer Email From Database</th>
        <th>Customer Phone From Database</th>
        <th>Car Type From Database</th>
        <th>Number of Days From Database</th>
        <th>Cost Per Day From Database</th>
        <th>Total Cost From Database</th>
      </tr>
      <tr>
        <!-- Display the data from the database -->
        <td><?php echo $customerNameFromDB; ?></td>
        <td><?php echo $customerEmailFromDB; ?></td>
        <td><?php echo $customerPhoneFromDB; ?></td>
        <td><?php echo $carTypeFromDB; ?></td>
        <td><?php echo $numberOfDaysFromDB; ?></td>
        <td><?php echo $costPerDayFromDB; ?></td>
        <td><?php echo $totalCostFromDB; ?></td>
      </tr>
    </table>
  </div>
  <div class="container">
    <a href="GlancyBrendanCarForm.html" class="btn btn-primary">Back</a>
  </div>
</body>
</html>
