<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>View User Profile</title>
</head>
<body>
    <h1>Enter User ID</h1>
    <form action="UserPServlet" method="GET">
        <label for="id">User ID:</label>
        <input type="text" id="id" name="id" required>
        <input type="submit" value="View Profile">
    </form>
</body>
</html>
