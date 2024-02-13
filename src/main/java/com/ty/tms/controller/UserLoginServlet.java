package com.ty.tms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.tms.helper.LoginService;
@WebServlet(value = "/login")
public class UserLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String userName = req.getParameter("user_name");
		String userPassword = req.getParameter("user_password");
		
		if(LoginService.loginValidation(userName, userPassword).equalsIgnoreCase("Manager"))
		{
			resp.sendRedirect("manager.jsp");
		}
		else if(LoginService.loginValidation(userName, userPassword).equalsIgnoreCase("Employee"))
		{
			req.setAttribute("user_name", userName);
			req.setAttribute("user_password", userPassword);
			RequestDispatcher dispatcher = req.getRequestDispatcher("employeedashboard");
			dispatcher.forward(req, resp);
		}
		else
		{
			PrintWriter writer = resp.getWriter();
			writer.println("<h3>LOGIN FAILED!!</h3>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		}
	}
}
