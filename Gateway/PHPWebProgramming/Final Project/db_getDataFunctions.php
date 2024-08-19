<?php
require_once("database.php");
function addCustomer($name, $email) {
    $query = 'INSERT INTO Customer(CustomerID, name, email)
              VALUES(:name, :email)';
    $statement = $GLOBALS['db']->prepare($query);
    $statement->bindValue(':name', $name);
    $statement->bindValue(':email', $email);
    $statement->execute();
    $statement->closeCursor();
}
?>