
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<a href="index.html">Home</a>
<a href="registrationPage.jsp">Registration</a>

<form action="login" method="post">
    <h2>Login Form</h2>
    Username: <input type="text" name="login" placeholder="Enter username" required>
    <br/>
    Password: <input type="text" name="pwd" placeholder="Enter password" required>
    <br>
    <input type="submit" value="Login">
</form>

</body>
</html>
