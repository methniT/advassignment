<!DOCTYPE html>
<html>
<head>
    <title>APPOINTMENT</title>
</head>

<style>

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
}

body {
    background-image: url('b3.jpg');
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

.appointment-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
    padding: 30px;
    text-align: center;
        width: 300px;
}

.appointment-form {
    display: flex;
    flex-direction: column;
}

h2 {
    margin-bottom: 20px;
    color: #333;
}

.navbar {
            width: 100%;
            color: #fff;
            position: fixed;
            padding: 10px;
            top: 0;
            left: 0;
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

    <div class="navbar">
    <jsp:include page="navbaradmin.jsp" />
    </div>

<div class="appointment-container">
        <div class="appointment-header">
        <div class="center">
            <h1>APPOINTMENT </h1><br><br><br>
        </div>
       

        <form action="ManageApServlet" method="post">
        
       
        <button type="submit" name="button" value="add">Add Appointment</button><br><br>
        <button type="submit" name="button" value="cancel">Cancel Appointment</button>
        

    </form>
</div>

    </div>
</body>
</html>
