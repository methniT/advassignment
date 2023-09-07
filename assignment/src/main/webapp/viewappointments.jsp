<!DOCTYPE html>
<html>
<head>
    <title>View Appointments</title>
</head>
<body>
    <h1>View Appointments</h1>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Date</th>
            <th>Time</th>
            <th>Consultant</th>
        </tr>
        <c:forEach var="appointment" items="${appointments}">
            <tr>
                <td>${appointment.id}</td>
                <td>${appointment.date}</td>
                <td>${appointment.time}</td>
                <td>${appointment.consultant}</td>
            </tr>
        </c:forEach>
    </table>

    <a href="home.jsp">Back to Home</a>
</body>
</html>
