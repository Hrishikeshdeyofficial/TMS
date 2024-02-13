<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
    margin-top: 14%;
  }
  .container {
    max-width: 600px;
    margin: 50px auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }
  h1 {
    text-align: center;
    margin-bottom: 20px;
  }
  p {
    font-size: 18px;
    margin-bottom: 15px;
  }
  a {
    color: #007bff;
    text-decoration: none;
    transition: color 0.3s ease;
  }
  a:hover {
    color: #0056b3;
  }
</style>

</head>
<body>
	
	<center>
	
	 <h1 style="font-size: 18px">WELCOME TO USER-TASK MANAGEMENT SYSTEM</h1>
	  <p>If you are a new user, please <a href="register.jsp">REGISTER</a> here.</p>
 	 <p>If you already have an account, you can <a href="login.jsp">LOGIN</a> here.</p>
	</center>
</body>
</html>