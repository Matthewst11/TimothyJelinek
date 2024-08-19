<?php
require_once("database.php");
function getGameInventory(){
    $queryCategory = 'SELECT * FROM games';
    $statement1 = $GLOBALS['db']->prepare($queryCategory);
    $statement1->execute();
    $gameInventory = $statement1->fetchAll();
    $statement1->closeCursor();
    return $gameInventory;
}

function getGame($game) {
    $queryGame = 'SELECT * FROM games where gameTitle = game';
    $statement1 = $GLOBALS['db']->prepare($queryGame);
    $statement1->bindValue(':game', $game);
    $statement1->execute();
    $game = $statement1->fetchAll();
    return $game[0];
}

function getCustomers() {
    $queryAllCustomers = 'SELECT * FROM customer';
    $statement2 = $GLOBALS['db']->prepare($queryAllCustomers);
    $statement2->execute();
    $customers = $statement2->fetchAll();
    $statement2->closeCurrent();
    return $customers;
}

function addCustomer($name, $email) {
    // Add customer to the database
    $query = 'INSERT INTO customer(name, email)
              VALUES(:name, :email)';
    $statement = $GLOBALS['db']->prepare($query);
    $statement->bindValue(':name', $name);
    $statement->bindValue(':email', $email);
    $statement->execute();
    $statement->closeCursor();
}
?>