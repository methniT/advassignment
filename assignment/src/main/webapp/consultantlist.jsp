<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Consultants List</title>
</head>
<body>
    <h1>Consultants List</h1>
    <table border="1">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>mobile number</th>
            <th>email</th>
            <th>username</th>
            <th>password</th>
        </tr>
        <c:forEach items="${consultants}" var="consultant">
            <tr>
                <td>${consultant.id}</td>
                <td>${consultant.name}</td>
                <td>${consultant.mobilenumber}</td>
                <td>${consultant.email}</td>
                <td>${consultant.username}</td>
                <td>${consultant.password}</td>
                <td>
                    <form action="DeleteConsultantServlet" method="post">
                        <input type="hidden" name="consultantId" value="${consultant.id}">
                        <input type="submit" value="Delete">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
