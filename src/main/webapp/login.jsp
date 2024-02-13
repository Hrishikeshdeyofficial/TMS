<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Here</title>
</head>
<style>	`
      fieldset {
        width: 400px;
        height: 750px;
        text-align: left;
        background-color: azure;
        border-radius: 20px;
        background: #9efff6;
      }
      label {
        font-style: san-serif;
       
        font-family: Georgia, "Times New Roman", Times, serif;
      }
      legend {
        font-size: large;
        font-family: Georgia, "Times New Roman", Times, serif;
        margin-bottom: 40px;
        text-align: center;
        
      }
      button {
        margin-left: 60px;
        background-color: #388bfd;
        padding-left: 40px;
        padding-right: 40px;
        padding-top: 5px;
        padding-bottom: 5px;
        border-radius: 20px;
        box-shadow: 2px 2px 2px 2px grey;
        color: #fff;
         font-weight:700;
         
         
      }
    </style>
<body>
<center>
      <fieldset>
        <legend><b>LOGIN</b></legend>
        <form action="login" method = post>
          <label for="name">User Name: </label>
          <input
            type="text"
            id="name"
            name="user_name"
            placeholder="FirstName"
          />
            <br /><br />
             <label for="name">Password: </label>
          <input
            type="password"
            id="name"
            name="user_password"
            placeholder="Password"
          />
           <br /><br />
         
         
          <button>LOGIN</button>
        </form>
      </fieldset>
    </center>
</body>
</html>