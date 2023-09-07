<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>LOGIN</title>

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

.login-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
    padding: 30px;
    text-align: center;
        width: 300px;
}

.login-form {
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

</head>

<body>
    <div class="login-container">
        <div class="login-header">
            <h1>Login</h1><br>
        </div>
        <form action="LoginServlet" method="post" class="login-form">
            <input type="text" name="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
            <button type="submit"><b>Login</b></button><br><br>
            <p class="error-message">${errorMessage}</p>
        </form>
                <div>
                     <p>If you don't have an account...</p><br>
                <form action="registerpage.jsp">
                    <button type="submit"><b>Register</b></button>
                </form>
                </div> <br>  
    
    <form action="welcomepage.jsp">
        <button type="submit"><b>Back</b></button>
    </form><br><br>

                  <div>
                 <h6>Admin or Staff... Click the button</h6><br>
               <form action="home.jsp">
                   <button type="submit"><b>Staff Login</b></button>
               </form>
            </div> <br>   
            
                      <%
        String error = request.getParameter("error");
        if (error != null) {
                out.println("<p>Error occurred.</p>");
            }
    %>      
        </div>  
        
                  
</body> 

</html>



