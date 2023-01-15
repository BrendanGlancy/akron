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
    $costPerDay = 54.99;
} else if ($carType == "Medium") {
    $costPerDay = 45.99;
} else if ($carType == "Small") {
    $costPerDay = 36.99;
}

$totalCost = $numberOfDays * $costPerDay;

?>

<!DOCTYPE html>
  <head>
    <title>Car Rental</title>
    <!-- use Bootstrap for styling -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
  <div class="table">
    <table class="table table-striped">
      <tr>
        <th>Customer Name</th>
        <th>Customer Email</th>
        <th>Customer Phone</th>
        <th>Car Type</th>
        <th>Number of Days</th>
        <th>Cost Per Day</th>
        <th>Total Cost</th>
      </tr>
      <tr>
        <td><?php echo $customerName; ?></td>
        <td><?php echo $customerEmail; ?></td>
        <td><?php echo $customerPhone; ?></td>
        <td><?php echo $carType; ?></td>
        <td><?php echo $numberOfDays; ?></td>
        <td><?php echo $costPerDay; ?></td>
        <td><?php echo $totalCost; ?></td>
      </tr>
    </table>
  </div>
</body>
</html>
