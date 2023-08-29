<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit User</title>
</head>
<body>
    <h2>Edit User</h2>
    <form action="EditServlet" method="post">
        <!-- Form fields for editing user data -->
        <!-- Include appropriate input fields pre-filled with user data -->
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" value="${user.username}" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="${user.email}" required><br><br>
        
        <!-- Include a hidden input field to store the user's ID -->
        <input type="hidden" name="id" value="${user.id}">
        
        <input type="submit" value="Update User">
    </form>
</body>
</html>
