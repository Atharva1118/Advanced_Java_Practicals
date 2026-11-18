package com.session;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EducationServlet
 */
@WebServlet("/EducationServlet")
public class EducationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String college=request.getParameter("college");
		String branch=request.getParameter("branch");
		HttpSession session = request.getSession();
		session.setAttribute("college", college);
		session.setAttribute("branch", branch);
		String name=(String)session.getAttribute("name");
		int age=(Integer)session.getAttribute("age");
		String phone=(String)session.getAttribute("phone");
		String email=(String)session.getAttribute("email");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>STUDENT DETAILS<h2>");
		out.println("Name: "+name+"<br>");
		out.println("Age: "+ age+"<br>");
		out.println("Email: "+email+"<br>");
		out.println("Mobile Number: "+phone+"<br>");
		out.println("College Name: "+college+"<br>");
		out.println("Branch: "+branch);
		
	}

}
