<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
</head>
<body>

    <h1>Student Registration</h1>

    <form action="/student" method="post">

        <label>Name:</label>
        <input type="text" name="name">

        <br><br>

        <label>Age:</label>
        <input type="number" name="age">

        <br><br>

        <button type="submit">Submit</button>

    </form>

</body>
</html>