<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>THE JOBS</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-image: url('bg1.png');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            
        }
        .container {
            margin-top: 100px;
        }
        h1 {
            font-family: Lucida Sans;
            color: #016AAA ;
        }
        
        button {

    padding: 10px;
    background-color:#007bff;
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
    <div class="container">
        <h1>Welcome to "The Jobs"</h1>
        <h3>...One Step To Your Future Starts Here...</h3>
    </div><br><br>
    
     <form action="loginpage.jsp">
                   <button type="submit"><b>Get Started</b></button>
               </form>



</body>
</html>

