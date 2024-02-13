<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style>
      fieldset {
        width: 400px;
        height: 750px;
        text-align: left;
        background-color: azure;
        border-radius: 20px;
        background: #9efff6;
      }
      label {
        font-style: normal;
        font-family: Georgia, "Times New Roman", Times, serif;
      }
      legend {
        font-size: large;
        font-family: san-serif, "Times New Roman", Times, serif;
        margin-bottom: 40px;
        text-align: center;
      }
      button {
        margin-left: 127px;
        padding: 20px;
        background-color: #388bfd;
        border-radius: 20px 10px;
        box-shadow: 2px 2px 2px 2px grey;
        color: #fff;
        font-weight:700;
      }
    </style>
</head>
<body>
	<center>
      <fieldset>
        <legend><b>USER REGISTRATION</b></legend>
        <form action="register" method = "post">
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
            type="text"
            id="name"
            name="user_password"
            placeholder="Password"
          />
           <br /><br />
          <label for="email">Email: </label>
          <input type="email" id="email" required name = "user_email" placeholder="Email"/><br /><br />
          
          
          <label for ="role">Role: </label>
		  <select name = "user_role" id = "role" >
		  <option name = "manager">Manager</option>
		  <option name = "employee">Employee</option>
		  </select>	          
           <br /><br />
            <label for="Position">Designation:</label>
          <input type ="text" name="user_designation" id="Position" placeholder="Designation">
           
          <br /><br />
          
          <label for="Salary">Salary:</label>
            <input type ="text" name="user_salary" id="Salary" placeholder="Salary">
         
         <br /><br />
         
         
          <button>REGISTER</button>
        </form>
      </fieldset>
    </center>

</body>
</html>