<?php
include ("header.php");
echo "<h1>Potluck Registration</h1>";
$errorCount = 0;
$firstname = validateInput($_POST['firstname'], 'firstname');
$lastname = validateInput($_POST['lastname'], 'lastname');
$department = validateInput($_POST['department'], 'department');
$food = validateInput($_POST['food'], 'food');

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
    echo "<p><a href=\"https://prometheus.gtc.edu/~tjelinek/PHP%20Web%20Programming/unit14/volunteerregistration.html\">Click here to re-enter info</a></p>";
}else{
    echo "<h2>$firstname $lastname has been registered for the upcoming dinner.</h2>";
    }
$myfile = fopen("food.txt", "a") or die("Unable to open file!");
$txt = "$lastname, $firstname, $department, $food<br>";
fwrite($myfile, $txt);
fclose($myfile);
$myfile = fopen("food.txt", "r") or die("Unable to open file!");
echo fread($myfile,filesize("food.txt"));
fclose($myfile);
include ("footer.php");
?>