<?php

$dsn = 'mysql:host=prometheus.gtc.edu;dbname=tjelinek_elPadreNewsletterSignUp';
$username = 'tjelinek';
$password = 'Q+rEq6wP';

try {
    $db = new PDO($dsn, $username, $password);
} catch (PDOException $e) {
    $error_message = $e->getMessage();
    include('database_error.php');
    exit();
}
?>