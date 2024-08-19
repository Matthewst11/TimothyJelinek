<?php
$TickerSymbol = $_GET["t"];
header("Cache-Control: no-cache");
header("Content-Type: text/csv");
$Quote = "https://sandbox.iexapis.com/stable/stock/$TickerSymbol/batch?types=quote&range=1m&last=10&token=Tsk_d5ea71c8c07e42938ef76260650e269a";
$QuoteString = file_get_contents($Quote);
echo $QuoteString;
?>