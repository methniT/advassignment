<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ABOUT US</title>

    <style>

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
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

.about-container {
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
    padding: 20px;
    text-align: center;
        width: 1200px;
}

.center {
     text-align: center;
     margin-top: 20px; 
        }
        
    </style>

</head>

<body>
    <div class="navbar">
    <jsp:include page="navbar.jsp" />
    </div>
    
    <div class="about-container">
        <div class="center">
				<h1>About Us</h1><br><br>
        </div>

    <form action="AboutServlet" method="post">

        </form>

        <p>Welcome to the Job Advice Center, your dependable advisor on career development and employment.</p>
		<p>Jobs is aware of how difficult it can be to locate the ideal work and successfully transition 
		into an international career. We are here to assist because of this.</p>
		<br><br><br>
		
		<h3>Who we are</h3><br>
		<p>We are a renowned consulting company in the core of Colombo city committed to assisting job 
		seekers in realizing their goal of working overseas. Our staff consists of a committed group of 
		part-time career counselors, with each member specializing in particular countries and job sectors. 
		They provide knowledgeable advice to assist you in making defensible choices about your international 
		career. Helping job seekers like you navigate the path to international work is our passion.</p>
		<br><br><br>
		
		<h3>Our Commitment</h3><br>	
		<p>At The Jobs, we are committed to helping you take the first steps towards your international career. 
		Whether you are a recent graduate, a seasoned professional looking for new opportunities, or looking to 
		explore international job markets, we have the expertise to guide you.</p>
		<p>Thank you for choosing Career Counseling Center as your career partner. We look forward to helping 
		you achieve your career aspirations and succeed in your international job search.</p><br>
   
        </div>  
                         
</body> 

</html>



