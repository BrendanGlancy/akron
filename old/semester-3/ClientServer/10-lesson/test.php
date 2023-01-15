<?php
  // All primative datatypes in php
  $string = "Hello World";
  $int = 10;
  $float = 10.5;
  $bool = true;

  // Arrays
  $array = array("Hello", "World", 10, 10.5, true);
  $array2 = ["Hello", "World", 10, 10.5, true];

  // Associative Arrays
  $assoc = array("name" => "John", "age" => 20);
  
  // Objects
  $object = new stdClass();

  // Null
  $null = null;

  // Print out the variables

// 24
for ($x = 1; $x < 3; $x+=1) echo($x . " ");

// Get a field name gender passed by an HTTP post 
$gender = $_POST['gender']
echo($gender);


// How would you use PHP to instantiate (create) an object named $apple of the Fruit class.
$apple = new Fruit();

// Use PHP to declare an array named $days which is initialized to String values of the seven days of the week.
$days = array("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
?>

