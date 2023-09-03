<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Error</title>
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

.add-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
    padding: 30px;
    text-align: left;
    width: 400px;
    font-weight: bold;
}

.add-header {
text-align: center;
}

.add-form {
    display: flex;
    flex-direction: column;
}

h2 {
    margin-bottom: 20px;
    color: #333;
}

input[type="text"],
input[type="password"] {
    padding: 7px;
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
    text-align: center;
}

button:hover {
    background-color: #0056b3;
}

.back-btn{
            font-size: 24px;
            font-weight: bold;
            text-align: center;
}

.add-btn{
            font-size: 24px;
            font-weight: bold;
            text-align: center;
}

.error-message {
    color: #ff3d3d;
}

    </style>
<body>
<div class="add-container">
        <div class="add-header">
            <h1>Error</h1><br><br>
            <p>Sorry, an error occurred. Try again later. </p>
        </div>
    
    
</body>
</html>
