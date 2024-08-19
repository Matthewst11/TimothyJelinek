<?php
include('header.php');
require_once('db_getDataFunctions.php'); // db functions to retrieve data

// function that returns a value to variable $gameInventory
$gameInventory = getGameInventory();

?>
    <h1>Complete the form to select a free game:</h1>
    <form  action="addCustomer.php" method="post">
        <p>
        <label>Name:</label>
        <input type="text" name = "name"><br>
    </p>
       <p>
       <label>E-mail:</label>
        <input type="text" name = "email"><br>
    </p> 
        <p>Select your console:</p>
        <input type="radio" name = "console" value="Xbox">
        <label>Xbox</label>
        <input type="radio" name = "console" value="PlayStation">
        <label>PlayStation</label>
        <input type="radio" name = "console" value="Nintendo">
        <label>Nintendo</label><br>
    
        <select name ="games">
            <?php foreach ($gameInventory as $item) :
            echo "<option value ='$item[gameTitle]'>$item[gameTitle]</option>";
            endforeach;
            ?>
    </select>
    <br>
    <input type = "reset" class = "button" value = "Clear Form">
    <input type = "submit" class = "button">
    </form>
    </main>
</body>
</html>