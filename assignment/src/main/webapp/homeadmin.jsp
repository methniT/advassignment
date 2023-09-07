<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME ADMIN</title>

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
    background-image: url('b3.jpg');
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
        
    </style>

</head>

<body>

    <div class="navbar">
    <jsp:include page="navbaradmin.jsp" />
    </div>
    
<div class="home-container">
				<div class="center">
				<h1>The Jobs</h1><br><br>
				
				<p>Welcome to the Job Advice Center, your dependable advisor on career development and employment.</p><br><br>
				

        </div>


</div>

</body>
</html>