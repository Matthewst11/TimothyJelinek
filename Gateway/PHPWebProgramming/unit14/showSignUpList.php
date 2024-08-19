<?php
$myfile = fopen("food.txt", "r") or die("Unable to open file!");
echo fread($myfile,filesize("food.txt"));
fclose($myfile);
?>