<?php
//complete code for index.php
$nav = "";
$info = "";

include_once "views/navigation.php";
include_once "classes/Page_Data.class.php";

$pageData = new Page_Data();
$pageData->setTitle("Building and processing HTML forms with PHP");
$pageData->setContent($nav);
$pageData->appendContent("<div>...and a form here</div>");

$navigationIsClicked = isset($_GET['page']);

if ($navigationIsClicked ) 
{
    $fileToLoad = $_GET['page'];
} 
else 
{
    $fileToLoad = "search";
}

include_once "views/$fileToLoad.php";

//echo "Vixe <br>";
//die($info);

$pageData->appendContent($info);

require "templates/page.php";
echo $page;
?>
