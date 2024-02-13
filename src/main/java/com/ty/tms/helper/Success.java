package com.ty.tms.helper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Success extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		writer.println("" + "" + ""		+ "Details Added Successfully" + "" + ""	+ "");
		
		writer.println("<h1> Do You wish to update your account: </h1>");
		
		writer.println("<h1> Do You wish to delete your account: </h1>");
		
		
		
	}
}
