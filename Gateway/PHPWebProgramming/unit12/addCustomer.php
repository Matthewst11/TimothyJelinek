<?php
require_once('db_getDataFunctions.php');
// Get the customer data
$name = $_POST['name'];
$email =$_POST['email'];

// Validate inputs
if ($name == null || $email == null || $email == false) {
	echo "Invalid product data. Check all fields and try again.";
} else {
	//call function to insert customer record
	addCustomer($name, $email);
	// Display the Game Order page
	include('u12gameOrder.php');
}
?>
