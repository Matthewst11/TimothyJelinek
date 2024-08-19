<!DOCTYPE html>
<html lang="en">
<head>
<title>Odd Numbers</title>
<meta charset="UTF-8"/>
</head>
<body>
<?php
$counter = 1;
while($counter < 101){
    $counter/2;
    if($counter%2){
        echo $counter;
        echo "<br>";
    }
    $counter += 1;
}
?>
</body>
</html>