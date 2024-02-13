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
import com.ty.tms.entity.Task;
import com.ty.tms.helper.EmployeeTaskList;
import com.ty.tms.helper.SortedTaskBasedOnStatus;

@WebServlet(value = "/employeedashboard")
public class EmployeeTaskController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("user_name");
		String userPassword = req.getParameter("user_password");
		
		List<Task> userTaskList = EmployeeTaskList.getEmployeeTaskList(userName, userPassword);
		
		userTaskList = SortedTaskBasedOnStatus.sortTask(userTaskList);
		
		req.setAttribute("UserTaskList", userTaskList);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		int task_id = Integer.parseInt(req.getParameter("task_id"));
		
		TaskDao.updateTaskOfEmployee(task_id);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
		
		dispatcher.include(req, resp);
		
	}
	
}
