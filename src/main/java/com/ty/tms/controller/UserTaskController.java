package com.ty.tms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.tms.dao.TaskDao;
import com.ty.tms.entity.UserInfo;
import com.ty.tms.helper.EmployeeList;
import com.ty.tms.helper.TaskStatusList;

@WebServlet(value = "/createnewtask")
public class UserTaskController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<UserInfo> userLists = EmployeeList.getEmployeeList();
		req.setAttribute("UserList", userLists);
		
		
		
		 RequestDispatcher dispatcher = req.getRequestDispatcher("createtask.jsp");
		 dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String employeeDescription = req.getParameter("employee_description");
		int employeeId = Integer.parseInt(req.getParameter("employee_id"));
		String employeeStatus = req.getParameter("employee_status");
		
		TaskDao.addTaskToEmployee(employeeDescription, employeeId, employeeStatus);
		
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Task Assigned Successfully!!</h1>");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("manager.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	

}
