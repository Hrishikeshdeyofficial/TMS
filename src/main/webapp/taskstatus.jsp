<%@page import="com.ty.tms.entity.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View the status of Tasks</title>
</head>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
  }
  .container {
    max-width: 800px;
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
  table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
  }
  th, td {
    padding: 10px;
    border-bottom: 1px solid #ddd;
    text-align: left;
  }
  th {
    background-color: #007bff;
    color: #fff;
  }
  tr:nth-child(even) {
    background-color: #f2f2f2;
  }
</style>
<body>
	
</head>
<body>
  <div class="container">
    <h1>View Task Status</h1>
    <table>
      <thead>
        <tr>
          <th>Description</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody>
      <% 
      	List<Task> tasks = (List<Task>) request.getAttribute("TaskList");
			for(Task t: tasks)
			{
		%>
				
		 
        <tr>
          <td><%=t.getDescription()  %></td>
          <td><%=t.getStatus() %></td>
        </tr>
				
		<% 
			}
		%>
      
     
      
      </tbody>
    </table>
  </div>
</body>
</html>