package com.lcwd;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
@WebServlet("/EmailSending")
public class EmailSending extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Sender Details
		String senderEmail = "YOUR_EMAIL_ADDRESS";
		String appPassword = "YOUR_APP_PASSWORD";
		
		//Fetch Values From HTML
		String reciever=request.getParameter("receiver");
		String subject=request.getParameter("subject");
		String message=request.getParameter("message");
		
		//Get the Properties Object
		Properties properties=new Properties();
		
		//Set the Properties
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smtp.auth","true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");	
		
		
		// Get the Session Object

		Session session = Session.getInstance(properties, new Authenticator() {

		    protected PasswordAuthentication getPasswordAuthentication() {
		    	return new PasswordAuthentication(senderEmail, appPassword);
		       
		    }  
		});
		session.setDebug(true);
		
		//Compose the message
		MimeMessage m=new MimeMessage(session);
		try {
			//From
			m.setFrom(new InternetAddress(senderEmail));
			
			//Adding Recepient 
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(reciever));
			
			//Adding Suject To Message
			m.setSubject(subject);
			
			//Adding Message
			m.setText(message);
			
			//Send 
			Transport.send(m);
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h2>Email Sent Successfully!</h2>");
		}catch(Exception e) {
			e.printStackTrace();
			response.getWriter().println("Email Sending Failed!");
		}
	}
}
