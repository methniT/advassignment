

<!DOCTYPE html>
<html>
<head>
    <title>View Appointments</title>
        <style>

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
}
.nav{
    display: top;

}

body {
    background-image: url('b9.jpg');
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
.home-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
    padding: 30px;
    text-align: center;
        width: 900px;
        margin: 60px auto;
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
        
    </style>
</head>
<body>
<div class="home-container">
        <div class="center">
    <h1>View Appointments</h1>
    <table border="1">
        <tr>
            
            <th>User ID</th>
            <th>Appointment Date</th>
            <th>Appointment Time</th>
            <th>Consultant</th>
        </tr>
        <c:forEach items="${appointments}" var="appointment">
            <tr>
                <td>${appointment.appointmentId}</td>
                <td>${appointment.consultantId}</td>
                <td>${appointment.userId}</td>
                <td>${appointment.appointmentDate}</td>
                <td>${appointment.appointmentTime}</td>
            </tr>
        </c:forEach>
    </table>
    </div>
    </div>
</body>
</html>
