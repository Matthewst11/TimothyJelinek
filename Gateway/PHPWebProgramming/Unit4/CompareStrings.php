<!DOCTYPE html>
<html lang = "en">
    <head>
        <title>Validate Credit Card</title>
    </head>
    <body>
    <h1>Validate Credit Cards</h1>
    <?php
    $firstString = "Geek2Geek";
    $secondString = "Geezer2Geek";
    if (!empty($firstString) && !empty($secondString)) {
        if ($firstString == $secondString) {
    echo 'Both strings are the same.';
        } else {
    echo "<p>Both strings have " . similar_text($firstString,
    $secondString) . " character(s) in common.<br />";
    echo "<p>You must change " . levenshtein($firstString,
    $secondString) .
    " character(s) to make the strings the same.<br />";
    }
    } else {
    echo "<p>Either the \$firstString variable or the \$secondString
    variable does not contain a value so the two strings cannot be
    compared.</p>";
}
?>
</body>
</html>