<!DOCTYPE html>
<html lang="en">
<head>
<title>Chinese Zodiac for loop</title>
<link rel="stylesheet" type="text/css" href="ChineseZodiac.css" /> 
<meta charset="UTF-8" />
</head>
<body>
<h1>Chinese Zodiac for loop</h1>
<?php
   $SignNames = array(
         "Rat",
         "Ox",
         "Tiger",
         "Rabbit",
         "Dragon",
         "Snake",
         "Horse",
         "Goat",
         "Monkey",
         "Rooster",
         "Dog",
         "Pig");
   //5. start a new table & row
echo "<table>";
echo "<tr>";

   //6. loop while less than 12
      for($i = 0; $i<12; ++$i){
        
//7. echo out the signNames in the th
         echo "<th>" . $SignNames[$i] . "<br/>";
      //8. echo out the images from the images folder
         echo "<img src = 'Images/" . $SignNames[$i] . ".png' alt='" . $SignNames[$i] . "title = '" . $SignNames[$i] . "'/></th>";}

   //9. create a loop starting with 1912, end current year
   for ($i=1912; $i<=date("Y"); ++$i) {
       //10. determine which column year goes in by subtracting 1912 from the value of $i
       //only 12/12 will result in 0 EG: 1913-1912 = 1 1%12 =
	   //The Modulus is the remainder of the division of one number by another.
       // % is called the modulo operation.
       if ((($i-1912)%12)==0) {
           
         
          //11. if true, end row
          echo "</tr>";
         //12. start new row
         echo "<tr>";
      }//13. close for loop
   
      //14. echo value of i (current year)
      echo "<td>$i</td>";
   }//15. close the for loop
   //16. end row & table
echo "</tr>";
echo "</table>";
?>
</body>
</html>

