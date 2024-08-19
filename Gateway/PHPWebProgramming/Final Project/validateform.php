<?php
include ("header.php");
include ("navigation.php");
require_once('db_getDataFunctions.php');
$errorCount = 0;
$name = validateInput($_POST['name'], 'name');
$email = validateInput($_POST['email'], 'email');

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
    echo "<p><a href=\"https://prometheus.gtc.edu/~tjelinek/PHP%20Web%20Programming/Final%20Project/newsletter.php\">Click here to re-enter info</a></p>";
}else{
    echo "<h1>Thank You For Signing Up For Our News Letter!</h1>";
    echo "<p>You will hear from us soon!</p>";
    echo "Name: $name";
    echo "<br>";
    echo "E-mail: $email";
    }
include ("footer.php");
?>