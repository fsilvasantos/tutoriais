<?php
//complete code for index.php
include_once "views/navigation.php";
$pageData = new stdClass();
$pageData->title = "Thomas Blom Hansen: Portfolio site";
$pageData->content = $nav;

//changes begin here
$navigationIsClicked = isset($_GET['page']);
if ($navigationIsClicked ) {
    $fileToLoad = $_GET['page'];
    include_once "views/$fileToLoad.php";
    $pageData->content .= $info;
}

//end of changes
require "templates/page.php";
echo $page;
?>
