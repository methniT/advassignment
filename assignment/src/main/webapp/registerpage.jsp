<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>REGISTER</title>

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
    font-size: 15px;
    
}

.register-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
    padding: 30px;
    text-align: left;
    width: 300px;
}

.paragraph {
    font-size: 16px;
}

.register-form {
    display: flex;
    flex-direction: column;
}

h3 {
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
    transition: background-color 0.8s ease;
    text-align: center;
    
}

button:hover {
    background-color: #0056b3;
}

.error-message {
    color: #ff3d3d;
}

.register-header {
            font-size: 16px;
            font-weight: bold;
            text-align: center;
   }         
.back-btn{
            font-size: 24px;
            font-weight: bold;
            text-align: center;
}

    </style>

</head>
<body>
    <div class="register-container">
        <div class="register-header">
            <h1>Register</h1><br><br>
            </div>
    
        <form action="RegistrationServlet" method="post" class="register-form">

                       
            <label for="email"><b>Email:</b></label>
            <input type="text" name="email" placeholder="Email" required>
            
            <label for="username"><b>Username:</b></label>
            <input type="text" name="username" placeholder="Username" required>
            
            <label for="password"><b>Password:</b></label>
            <input type="password" name="password" placeholder="Password" required>
            
            <label for="id"><b>ID:</b></label>
            <input type="text" name="id" placeholder="ID" required><br>
            
            <button type="submit"><b>Register</b></button><br><br>
            <p class="error-message">${errorMessage}</p>
            
        </form>
                  <div class="back-btn">
                <form action="loginpage.jsp">
                    <button type="submit"><b>Back</b></button>
                </form>
                </div> 
                                          <%
        String error = request.getParameter("error");
        if (error != null) {
                out.println("<p>Error occurred.</p>");
            }
        
    %>  
                
                </div>
</body>
</html>



