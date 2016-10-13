<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 13.10.2016
  Time: 0:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Driver</title>
    <link rel="stylesheet" href="styles.css" />
</head>
<body>
<body>
    <form action="/UpdateDriverServlet" method="get">
        <p>First name
            <input type="text" name="firstName" value="${firstName}" /></p>
        <p>Last name
            <input type="text" name="lastName" value="${lastName}"/></p>
        <p>worked hours
            <input type="text" name="workedHours" value="${workedHours}"/></p>
        <p>status
            <input type="text" name="status" value="${status}"/></p>
        <p>Submit button.
            <input type="submit" name="update" value="submit" /></p>
        <p>Cancel button.
            <input type="button" name="Cancel" value="submit" /></p>
    </form>
</body>
</body>
</html>
