<!-- Introduction to php, display hello world -->

<?php
  echo "Hello World";

  // Example of a function in PHP
  public function FunctionName(Type $var = null) {
    # code...
    return null
  }

  /**
   * Example of Datatypes in PHP
   */
  $string = "Hello World";

  $int = 1;

  $float = 1.1;

  $boolean = true;

  $array = array("Hello", "World");

  $object = new Object();

  $null = null;

  $resource = fopen("file.txt", "r");

  /**
   * Example of a post request
   * $_POST is a super global variable
   */
  if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST["name"];
    $email = $_POST["email"];
    $message = $_POST["message"];
  }


?>
