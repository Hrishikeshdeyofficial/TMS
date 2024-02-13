<%@page import="com.ty.tms.entity.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Dashboard</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }
    .task {
        margin-bottom: 20px;
        border: 1px solid #ccc;
        padding: 10px;
        border-radius: 5px;
        background-color: #f9f9f9;
    }
    .task input[type="checkbox"] {
        margin-right: 10px;
    }
    .task .description {
        font-size: 16px;
        margin-bottom: 5px;
    }
    .task .status {
        font-weight: bold;
    }
    .task input[type="checkbox"]:checked + label .status {
        color: green;
    }
    .submit-button {
        display: block;
        margin-top: 20px;
        padding: 10px 20px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
</style>

</head>
<body>

<div class="container">
<form action="employeedashboard">
    <h1>Employee Dashboard</h1>
    <div class="task">
    <form action = "">
    <%	List<Task> tasks = (List<Task>) request.getAttribute("UserTaskList");
	for(Task t: tasks)
	{ %>
        <div class="description">Task: <%= t.getDescription() %></div>
          <label for="task1" class="status"><%=t.getStatus() %></label>
      	 <button type="submit" class="submit-button" name="task_id" value = "<%= t.getId()  %>">Completed</button>
     	<br>
        <%
	}
        %>
        
        </form>
    </div>
   
   
    </form>
</div>
</body>
</html>