<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	
<head>
	<title>
		this is page for Employee entry
	</title>
</head>
<body>
	<h1>Emplyee attendance SYstemm</h1>
	
	
	<form action="/employee" method="post">
	<label for="name">Employee Name:- </label>
	<input type="text" placeholder="enter name here..." id="name" name="name">
	<br><br>
	
	
	<label for="avl">Availablity :- </label>
	<input type="text" placeholder="availiblity..." id="avl" name="avl">
	<br><br>
	
	<button type="submit">save</button>
	<button type="reset">reset</button>
	
		</form>
</body>
</html>