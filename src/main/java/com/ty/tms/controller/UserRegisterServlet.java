package com.ty.tms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.tms.dao.UserDAO;
import com.ty.tms.entity.UserInfo;

public class UserRegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("user_name");
		String userPassword= req.getParameter("user_password");
		String userEmail= req.getParameter("user_email");
		String userRole = req.getParameter("user_role");
		String userDesignation = req.getParameter("user_designation");
		double userSalary =  Double.parseDouble(req.getParameter("user_salary")); 
		
		HttpSession session = req.getSession();
		
		UserInfo user = new UserInfo();
		
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setUserEmail(userEmail);
		user.setRole(userRole);
		user.setUserDesignation(userDesignation);
		user.setUserSalary(userSalary);
		
		UserDAO.addUserDetails(user);
		resp.sendRedirect("login.jsp");
		
			
	}
}
