<!DOCTYPE html>
<html lang="en">
<head>
<title>Games form</title>
<meta charset="UTF-8"/>
<link rel="stylesheet" href="main.css">
</head>
<body>
<main>
    <h1>Complete the form to select a free game:</h1>
    <form  action="u9gameOrder.php" method="post">
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
            <?php
                $games = array("Madden", "Fifa", "Call Of Duty", "Fortnite");

                foreach ($games as $item) {
                echo '<option value ="' . $item . '">' . $item . '</option>';
}
            ?>
        <!-- <option>Games:
        <option>Madden
        <option>Fifa
        <option>Rocket League</option>
        -->
    </select>
    <br>
    <input type = "submit" class = "button">
    <p><a href="showSignUPList.php">Show Registered Volunteers</a></p>
    </form>
    </main>
</body>
</html>