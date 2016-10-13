<%--<!--<%&#45;&#45;-->--%>
  <%--<!--Created by IntelliJ IDEA.-->--%>
  <%--<!--User: 123-->--%>
  <%--<!--Date: 10.10.2016-->--%>
  <%--<!--Time: 22:25-->--%>
  <%--<!--To change this template use File | Settings | File Templates.-->--%>
<%--<!--&#45;&#45;%>-->--%>

<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->

<html>
<head>
    <title>Add New Truck</title>
    <link rel="stylesheet" href="styles.css" />
</head>
<body>
<form action="/AddNewTruckServlet" method="get">

  <p>Duty Size
    <input type="text" name="dutySize" /></p>

  <p>Capasity
    <input type="text" name="capasity" /></p>

  <p>status
    <input type="text" name="status" /></p>

  <p>Reg Number
    <input type="text" name="regNumber" /></p>

  <p>Submit button.
    <input type="submit" name="addTruck" value="submit" /></p>

  <p>Cancel button.
    <input type="button" name="Cancel" value="submit" /></p>
</form>
</body>
</html>
