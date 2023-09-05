<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CONTACT US</title>

    <style>

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
}

body {
    background-image: url('b10.jpg');
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

.contact-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
    padding: 30px;
    text-align: left;
        width: 400px;
}

.contact-form {
    display: flex;
    flex-direction: column;
}

h2 {
    margin-bottom: 20px;
    color: #333;
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

.error-message {
    color: #ff3d3d;
}

    </style>

</head>

<body>

    <div class="navbar">
    <jsp:include page="navbarstaff.jsp" />
    </div>


    <div class="contact-container">
        <div class="center">
				<h1>Contact Us</h1><br><br>
        </div>

    <form action="ContactStServlet" method="post">
        <label for="username">Username:
        <span style="white-space: pre;"> </span>
        <span style="white-space: pre;"> </span>
        <span style="white-space: pre;"> </span>
        <span style="white-space: pre;"> </span>
        <span style="white-space: pre;"> </span></label>
        <input type="text" id="name" name="username" required><br><br>

        <label for="email">Email Address:<span style="white-space: pre;"> </span>
        <span style="white-space: pre;"> </span></label>
        <input type="text" id="email" name="email" required><br><br>
        
        
        <label for="phone">Mobile Number:<span style="white-space: pre;"> </span></label>
        <input type="text" id="phone" name="phone" required><br><br>
        
        <label for="message">Message:</label><br>
        <textarea id="text" name="message" rows="6" cols="40" required></textarea>
        </form>
        
        
				<div class="center">
                <form action="contactconfirmationst.jsp">
                    <button type="submit"><b>Submit</b></button>

                </form>
                </div>


        <%
        	String error = request.getParameter("error");
        		if (error != null) {
                out.println("<p>An error occurred. Please try again later.</p>");
            }

        %>      
        </div>  
        
                  
</body> 

</html>



