<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>VIEW APPOINTMENT</title>
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
    font-size: 15px;
    
}
.navbar {
            width: 100%;
            color: #fff;
            position: fixed;
            padding: 10px;
            top: 0;
            left: 0;
        }


.view-container {
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

.view-form {
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
<body>



    <div class="view-container">
        <div class="view-header">

            <h1>VIEW APPOINTMENT</h1><br><Br>
            </div>

    
    <form action="ViewAppointmentsServlet" method="GET">
        <label for="id">User ID:</label><br>
        <input type="text" id="id" name="id" required><br><br>
       <button type="submit"><b>View Appointment</b></button><br><br><br>
    </form>
    
    
    <p><strong>Date:</strong> ${date2}</p><br>
    <p><strong>Time:</strong> ${time2}</p><br>
    <p><strong>Consultant:</strong> ${consultant2}</p><br>

    </div>


</body>
</html>

