<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 11/8/2022
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Register</title>
</head>
<body>
<div class="rgt">
    <h1>Register</h1>

    <form action="Register" method="post" class="FormRegister">
        Username: <input type="text" placeholder="Username"> <br><br>
        Password: <input type="password" placeholder="Password"> <br><br>
        Confirm: <input type="password" placeholder="Confirm"> <br><br>
        Email: <input type="email" placeholder="Email"> <br><br>
        Phone: <input type="text" placeholder="Phone Number"> <br><br>

        <input type="submit" value="Back">
        <input type="submit" value="Register">
        <input type="submit" value="Next">

        <h2>${message}</h2>
    </form>
</div>
</body>
</html>
