<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CONTACT US</title>

    <style>

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
}

body {
    background-image: url('b10.jpg');
    background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
    font-family: Georgia;
    background-color: #f5f5f5;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    flex-direction: column;

}

        .navbar {
            width: 100%;
            color: #fff;
            position: fixed;
            padding: 10px;
            top: 0;
            left: 0;
            }

.contact-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
    padding: 30px;
    text-align: left;
        width: 400px;
}

.contact-form {
    display: flex;
    flex-direction: column;
}

h2 {
    margin-bottom: 20px;
    color: #333;
}


.center {
     text-align: center;
     margin-top: 20px; 
        }

button {
    padding: 10px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

button:hover {
    background-color: #0056b3;
}

.error-message {
    color: #ff3d3d;
}

    </style>

</head>

<body>

    <h2>Manage User Data</h2>
    
    <!-- Add a button to add a new user -->
    <a href="addconsultant.jsp">Add User</a>
    
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Email</th>
            <th>Action</th>
        </tr>
        <!-- Loop through user data retrieved from the database and display it in rows -->
        <c:forEach items="${userData}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.email}</td>
                <td>
                    <!-- Add buttons to edit and delete user records -->
                    <a href="editconsultant.jsp?id=${user.id}">Edit</a>
                    <a href="DeleteConsultantServlet?id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
        
</body> 

</html>



