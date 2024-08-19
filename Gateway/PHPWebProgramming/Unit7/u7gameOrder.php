<?php
echo "<h1>Retrieve data without validating data</h1>";
$name = $_POST['name'];
$email = $_POST['email'];
$console = $_POST['console'];
$game = $_POST['games'];
echo "<h2>Thank you $name for your order</h2>";
echo "Name: $name<br> E-mail: $email<br> Console: $console<br> Free Game: $game";
?>
<?php
echo "<h1>Retrieve data WITH validating data</h1>";
$errorCount = 0;
$name = validateInput($_POST['name'], 'name');
$email = validateInput($_POST['email'], 'email');
$console = validateInput($_POST['console'], 'console');
$game = validateInput($_POST['games'], 'games');

function validateInput($data, $fieldName){
    global $errorCount;
    if(empty($data)){
        displayRequired($fieldName);
        ++$errorCount;
        $returnValue = "";
    }else{
        $returnValue = trim($data);
        $returnValue = stripslashes($returnValue);
        $returnValue = htmlspecialchars($returnValue);
    }
    return($returnValue);
}
function displayRequired($fieldName){
    echo "The field \"$fieldName\" is required.<br>";
}
if ($errorCount > 0){
    echo "<p><a href=\"https://prometheus.gtc.edu/~tjelinek/PHP%20Web%20Programming/Unit7/u7gameOrder_TimothyJelinek.html\">Click here to re-enter info</a></p>";
}else{
    echo "<h2>Thank you $name For Your Order:</h2>";
    echo "Name: $name";
    echo "<br>";
    echo "E-mail: $email";
    echo "<br>";
    echo "Console: $console";
    echo "<br>";
    echo "Free Game: $game";
}
?>