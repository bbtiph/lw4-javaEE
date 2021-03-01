<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
    <title>Register</title>
</head>
<body>

<h3>User Info</h3>
<table cellpadding="2" cellspacing="2" border="1">
    <tr>
        <td>Name</td>
        <td>${user.name }</td>
    </tr>
    <tr>
        <td>Surname</td>
        <td>${user.surname }</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${user.email }</td>
    </tr>
    <tr>
        <td>Username</td>
        <td>${user.username }</td>
    </tr>
    <tr>
        <td>password</td>
        <td>${user.password }</td>
    </tr>
</table>

</body>
</html>
