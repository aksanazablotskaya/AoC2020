<?php
  $fn = fopen("input.txt","r");
  
$search  = array('-', ':');
$replace = array(' ', '');

$min = array();
$max = array();
$character = array();
$password = array();
$correct_passwords = 0;
  
  while(! feof($fn))  {
	$line = str_replace($search, $replace, strtok(fgets($fn), "\n"));
	$parsed_line = explode(" ", $line);
	array_push($min,$parsed_line[0]);
	array_push($max,$parsed_line[1]);
	array_push($character,$parsed_line[2]);
	array_push($password,$parsed_line[3]);
  }

  for ($i = 0; $i < count($min); $i++) {
	  
	  $first_character =  $password[$i][$min[$i]-1];
	  $second_character =  $password[$i][$max[$i]-1];
	  
	  if ($first_character == $character[$i] xor $second_character == $character[$i])
	  {
		  $correct_passwords++;
	  }
	  

  }
  echo $correct_passwords;
  fclose($fn)
?>