<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->

<html>
    <head>
        <title>Add New Driver</title>
        <link rel="stylesheet" href="styles.css" />
    </head>

    <body>
        <form action="/AddNewDriverServlet" method="get">
            <p>First name
                <input type="text" name="firstName" /></p>
            <p>Last name
                <input type="text" name="lastName" /></p>
            <p>worked hours
                <input type="text" name="workedHours" /></p>
            <p>status
                <input type="text" name="status" /></p>
            <p>Submit button.
                <input type="submit" name="addDriver" value="submit" /></p>
            <p>Cancel button.
                <input type="button" name="Cancel" value="submit" /></p>
        </form>
    </body>
</html>
