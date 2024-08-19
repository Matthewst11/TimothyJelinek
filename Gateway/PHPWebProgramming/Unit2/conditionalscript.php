<!DOCTYPE html>
<html lang="en">
<head>
<title>Conditional Script</title>
<meta charset="UTF-8"/>
</head>
<body>
    <?php
    $IntVariable = 75;
    if($IntVariable > 100){
        echo "$IntVariable is greater than 100.";
    }else{
        echo "$IntVariable is less than 100";
    }
    ?>
</body>
</html>