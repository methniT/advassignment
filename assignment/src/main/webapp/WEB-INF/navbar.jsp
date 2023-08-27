<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Navigation Bar</title>
        <style>
        nav {    
            background-color: #4a4a4a ;
            overflow: hidden;
        }

        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }

        li {
            float: right;
        }

        li a {
            display: block;
            color: white;
            text-align: center;
            font-weight: bold;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover {
            background-color: #0d82ff;
        }
    </style>
</head>
<body>
    <nav>
        <ul>
            <li><a href="contactpage.jsp">Contact</a></li>
            
            <li><a href="aboutpage.jsp">About</a></li>
            <li><a href="home.jsp">Home</a></li>


        </ul>
    </nav>
</body>
</html>
