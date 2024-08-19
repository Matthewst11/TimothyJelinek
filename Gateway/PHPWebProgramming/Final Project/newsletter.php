<?php
include ("header.php");
include ("navigation.php");
require_once('db_getDataFunctions.php');
?>


<h2>Want to Sign Up For Our Newsletter?</h2>
<br>
<img src = "news.png" alt = "News paper" style = "float: right; width:12%; height:12%">
<form  action="validateform.php" method="post">
    <p>
        <label>Name:</label>
        <br>
        <input type="text" name = "name"><br>
    </p>
       <p>
       <label>E-mail:</label>
       <br>
        <input type="text" name = "email"><br>
    </p>
    <br>
    <input type = "reset" class = "button" value = "Clear Form">
    <input type = "submit" class = "button">
    </form>
<?php
include ("footer.php");
?>