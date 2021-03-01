<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<a href="index.html">Home</a>
<a href="login.jsp">Login</a>
${errors }
<form action="register" method="post">
    <h2>Registration Form</h2>
    Name: <input type="text" name="name" placeholder="Enter name" required>
    <br>
    Surname: <input type="text" name="surname" placeholder="Enter surname" required>
    <br>
    E-mail: <input type="text" name="email" placeholder="Enter email" required>
    <br>
    Username: <input type="text" name="username" placeholder="Enter username" required>
    <br>
    Password: <input type="text" name="password" placeholder="Enter password" required>
    <br>
    <input type="submit" value="ADD">

</form>
</body>
</html>
