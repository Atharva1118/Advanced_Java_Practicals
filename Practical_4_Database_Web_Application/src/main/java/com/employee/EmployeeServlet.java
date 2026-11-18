package com.employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String sql = "INSERT INTO employee "
                + "(first_name, last_name, username, password, address, contact) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee",
                    "root",
                    "YOUR_MYSQL_PASSWORD");

                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, first_name);
                ps.setString(2, last_name);
                ps.setString(3, username);
                ps.setString(4, password);
                ps.setString(5, address);
                ps.setString(6, contact);

                int result = ps.executeUpdate();

                if (result > 0) {
                    out.println("<h2>Employee Registered Successfully!</h2>");
                } else {
                    out.println("<h2>Registration Failed!</h2>");
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("<h2>Something went wrong during registration.</h2>");
        }
    }
}
