package com.HandlingRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PersonalServlet
 */
@WebServlet("/PersonalServlet")
public class PersonalServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>Personal Details</h2>");
		out.println("Name: "+name+"<br>");
		out.println("Age: "+age);
	}

}
