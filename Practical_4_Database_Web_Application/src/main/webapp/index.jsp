<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Registration Form</title>
</head>
<body>

    <h2>Employee Registration Form</h2>

    <form action="EmployeeServlet" method="post">

        First Name:
        <input type="text" name="first_name"
               placeholder="Enter Your First Name" required>
        <br><br>

        Last Name:
        <input type="text" name="last_name"
               placeholder="Enter Your Last Name" required>
        <br><br>

        Username:
        <input type="text" name="username" required>
        <br><br>

        Password:
        <input type="password" name="password" required>
        <br><br>

        Address:
        <textarea name="address" required></textarea>
        <br><br>

        Contact:
        <input type="tel" name="contact" required>
        <br><br>

        <input type="submit" value="Register">

    </form>

</body>
</html>