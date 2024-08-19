<?php
include ("header.php");
require_once('db_getDataFunctions.php'); //db functions to retrieve data
echo "<h1>Unit 12 Games MySQL & PHP</h1>";
$errorCount = 0;
$name = validateInput($_POST['name'], 'name');
$email = validateInput($_POST['email'], 'email');
$console = validateInput($_POST['console'], 'console');
$game = validateInput($_POST['games'], 'games');

function calculateCost($game) {
    // getGame($game) is nested function that returns value
    // get the game record from database using game name selected
    // from drop down list
    $gameRecord = getGame($game);
    $gameCost = $gameRecord['price'];
    return $gameCost;
}

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
    echo "<p><a href=\"https://prometheus.gtc.edu/~tjelinek/PHP%20Web%20Programming/Unit12/u12gameOrder_TimothyJelinek.php\">Click here to re-enter info</a></p>";
}else{
    echo "<h2>Thank you $name For Your Order:</h2>";
    echo "Name: $name";
    echo "<br>";
    echo "E-mail: $email";
    echo "<br>";
    echo "Console: $console";
    echo "<br>";
    echo "Game Ordered: $game";
    echo "<br>";
    $cost = calculateCost($game);
    echo "<p id = 'cost'> Game Cost: $cost  </p>";
    }
include ("footer.php");
?>