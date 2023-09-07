<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE</title>
</head>


<style>

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
}

body {
    background-image: url('b3.png');
    background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;

}
.navbar {
            width: 100%;
            color: #fff;
            position: fixed;
            padding: 10px;
            top: 0;
            left: 0;
        }

.update-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
    padding: 30px;
    text-align: left;
        width: 300px;
}

.update-form {
    display: flex;
    flex-direction: column;
}

h2 {
    margin-bottom: 20px;
    color: #333;
}

input[type="text"],
input[type="password"] {
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
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
    
<body>

<div class="update-container">
        <div class="update-header">
        <form action="UpdateRecepServlet" method="post">
        

            <h1>UPDATE RECEPTIONIST </h1><br><br>
                Receptionist ID: <input type="text" name="consultantId"><br>
    			New Name: <input type="text" name="fullname"><br>
    			Mobile Number: <input type="text" name="mobilenumber"><br>
    			Email Address: <input type="text" name="email"><br>
    			Username: <input type="text" name="username"><br>
    			Password: <input type="text" name="password"><br>
        
        <button type="submit">Update</button>
</form>
</div>
</div>

</body>
</html>
