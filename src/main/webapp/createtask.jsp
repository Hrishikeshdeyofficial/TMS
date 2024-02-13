<%@page import="com.ty.tms.entity.UserInfo"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="javax.persistence.Query"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%!	
	 UserInfo u = null;
 %>
<head>
<meta charset="ISO-8859-1">
<title>Create your Task</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
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
  form {
    display: flex;
    flex-direction: column;
    gap: 10px;
  }
  label {
    font-weight: bold;
  }
  input[type="text"],
  select {
    padding: 8px;
    border: 1px solid #ccc;
    border-radius: 5px;
  }
  input[type="submit"] {
    padding: 10px 20px;
    background-color: #007bff;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }
  input[type="submit"]:hover {
    background-color: #0056b3;
  }
</style>
</head>
<body>
	 <div class="container">
    <h1>Create New Task</h1>
    <form action="createnewtask" method="post">
      <label for="description">Description:</label>
      <input type="text" id="description" name="employee_description" placeholder="Enter task description" required>

     
      
       <label for="employeeName">Employee:</label>
      <select id="employee" name="employee_id" required>
      <option value = "">Employee List</option>
      	<% 
      	List<UserInfo> users = (List<UserInfo>) request.getAttribute("UserList");
			for(UserInfo u: users)
			{
		%>
				<option value = "<%=u.getUserID() %>"><%= u.getUserName() %></option>
				
		<% 
			}
		%>
      	</select>
      	
    	  	 <label for="status">Status:</label>
     		 <select id="status" name="employee_status" required>
       		<option value="">Select Status</option>
        	<option value="pending">Pending</option>
        	<option value="assigned">Assigned</option>
      		</select>
      	
      
     

      <input type="submit" value="Create Task">
    </form>
  </div>
</body>
</html>