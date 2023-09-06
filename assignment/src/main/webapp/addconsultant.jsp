<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ADD CONSULTANT</title>

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

</head>

<body>
    <div class="add-container">
        <div class="add-header">
            <h1>Add Consultant</h1><br><br>
        </div>
        <form action="AddConServlet" method="post">
    
    	<label for="id">ID:
    	<span style="white-space: pre;"> </span>
    	<span style="white-space: pre;"> </span>
    	<span style="white-space: pre;"> </span>
    	<span style="white-space: pre;"> </span>
    	<span style="white-space: pre;"> </span>
    	<span style="white-space: pre;"> </span></label>
        <input type="text" id="id" name="id" required><br><br>
    
        <label for="fullname">Full Name:</label>
        <input type="text" id="fullname" name="fullname" required><br><br>
        
        <label for="mobilenumber">Mobile No:</label>
        <input type="text" id="mobilenumber" name="mobilenumber" required><br><br>
        
        <label for="email">Email:
        <span style="white-space: pre;"> </span>
        <span style="white-space: pre;"> </span>
        <span style="white-space: pre;"> </span>
        <span style="white-space: pre;"> </span></label>
        <input type="text" id="email" name="email" required><br><br>
        
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        
		<label for="password">Password:</label>
        <input type="text" id="password" name="password" required><br><br>
        
<div class="add-btn">
            <button type="submit"><b>Add</b></button><br><br>
        </div>
        
        <div class="back-btn">
            <button type="submit"><b>Back</b></button>
        </div> 

        <%
        String error = request.getParameter("error");
        if (error != null) {
            out.println("<p>An error occurred. Please try again later.</p>");
        }
        %>
    </form>
</div>
        
                  
</body> 

</html>



