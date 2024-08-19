<!--Unit 5 Functions Assigment-->
<!--Timothy Jelinek -->
<!DOCTYPE html>
<html>
<head>
	<title>Product Discount Calculator</title>
	<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
<!--*******TOP PART OF FORM USER FILLS OUT***************-->
	<main>
		<h1>Product Discount Calculator</h1>
		<form action="discountform.php" method="post">

			<div id="data">
				<label>Product Description:</label>
				<input type="text" name="product_description"><br>

				<label>List Price:</label>
				<input type="text" name="list_price"><br>

				<label>Discount Percent:</label>
				<input type="text" name="discount_percent"><span>%</span><br>
			</div>

			<div id="buttons">
				<label>&nbsp;</label>
				<input type="submit" name="Submit" value="Calculate Discount"><br>
			</div>

		</form>
	</main>
<!--*******END OF TOP PART OF FORM USER FILLS OUT***************-->
<!--**DO NOT CHANGE ANYTHING IN LINES 1-44 *****-->
<?php
$display_result = FALSE;//don't display result screen until submit button clicked
$discount_percent = 0;
$list_price = 0;

if (isset($_POST['Submit'])) {
	$product_description = filter_input(INPUT_POST, 'product_description');
	$list_price = filter_input(INPUT_POST, 'list_price');
	$discount_percent = filter_input(INPUT_POST, 'discount_percent');
	//if submit button clicked, show result part of form
	$display_result = TRUE;


} else {
	$display_result = FALSE;
}


//******TO DO CODE GOES HERE************
//Create 2 separate functions utilizing given code below
//You decide which lines of code are needed to calculate discount and
//which code is needed to display the output

	function discountmath($list_price, $discount_percent){
	global $discount;
	global $discount_price;
	global $list_price;
	global $discount_percent;
	$discount = (float)$list_price * (float)$discount_percent * .01;
	$discount_price = (float)$list_price - (float)$discount;
	return $discount_price;
	}
	function displaydiscount($list_price, $discount_percent, $discount, $discount_price){
		global $list_price_f, $discount_percent_f, $discount_f, $discount_price_f;
	$list_price_f = "$".number_format($list_price, 2);
	$discount_percent_f = $discount_percent."%";
	$discount_f = "$".number_format($discount, 2);
	$discount_price_f = "$".number_format($discount_price, 2);
	}
	
	$discountmath = discountmath($list_price, $discount_percent);
	displaydiscount($list_price, $discount_percent, $discount, $discount_price);


//call 2 functions - 1 function to calculate discount returns a value, takes 2 parameters
//other function displays the output takes 4 parameters


//***DO NOT CHANGE ANY CODE BELOW THIS LINE***
//need to close php here to add html to display the outputs
//if the if condition is true, html below will display output
if($display_result){
?>
<main>
	<h1>Product Discount Results</h1>

	<label>Product Description:</label>
	<span><?php echo htmlspecialchars($product_description); ?></span><br>

	<label>List Price:</label>
	<span><?php echo htmlspecialchars($list_price_f); ?></span><br>

	<label>Standard Discount:</label>
	<span><?php echo htmlspecialchars($discount_percent_f); ?></span><br>

	<label>Discount Amount:</label>
	<span><?php echo $discount_f; ?></span><br>

	<label>Discount Price:</label>
	<span><?php echo $discount_price_f; ?></span><br>
</main>
<?php
}//closes if statement: if($display_result)
echo "<p><a href=\"discountform.php\">Refresh The Page</a></p>";//hyperlink to refresh page
?>
</body>
</html>
