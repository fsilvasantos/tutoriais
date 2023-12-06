<?php
//complete code for index.php

//string $nav = ""; - desta forma não funciona!
//string $info = "";
$nav = "";
$info = "";

include_once "views/navigation.php";
$pageData = new stdClass();
$pageData->title = "Thomas Blom Hansen: Portfolio site";
$pageData->content = $nav;

//changes begin here
$navigationIsClicked = isset($_GET['page']);
if ($navigationIsClicked ) 
{
    $fileToLoad = $_GET['page'];
} 
else 
{
    $fileToLoad = "skills";
}

include_once "views/$fileToLoad.php";
$pageData->content .= $info;
require "templates/page.php";
echo $page;
?>
