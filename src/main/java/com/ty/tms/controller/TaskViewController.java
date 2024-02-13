package com.ty.tms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.tms.helper.TaskStatusList;

@WebServlet(value = "/taskstatus")
public class TaskViewController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("TaskList", TaskStatusList.getTaskList());
		RequestDispatcher dispatcher = req.getRequestDispatcher("taskstatus.jsp");
		dispatcher.forward(req, resp);
		
	}
}
