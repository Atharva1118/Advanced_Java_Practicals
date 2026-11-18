# Practical 4 – Database-Driven Web Application using JSP and Servlets

## Aim
To implement a database-driven web application using JSP and Servlets.

## Technologies Used
- Java
- JSP (JavaServer Pages)
- Java Servlets
- JDBC
- MySQL
- Apache Tomcat 10.1
- Eclipse IDE

## Description
This practical demonstrates an Employee Registration System using JSP, Servlets, JDBC, and MySQL.

The application accepts employee details through a JSP registration form. The Servlet processes the submitted data and stores it in the MySQL database using JDBC and PreparedStatement.

## Employee Registration Details
- First Name
- Last Name
- Username
- Password
- Address
- Contact

## Database Details
- Database Name: `employee`
- Table Name: `employee`
- Primary Key: `id` (AUTO_INCREMENT)

## Application Workflow
1. The user opens the Employee Registration Form.
2. The user enters employee details.
3. The form submits data to `EmployeeServlet` using the POST method.
4. The Servlet retrieves form values using `request.getParameter()`.
5. JDBC establishes a connection with the MySQL database.
6. PreparedStatement prepares and executes the INSERT query.
7. Employee details are stored in the database.
8. A success message is displayed in the browser.

## Concepts Covered
- JSP Form Handling
- HTTP POST Request
- Java Servlets
- JDBC Connectivity
- MySQL Database Operations
- PreparedStatement
- executeUpdate()
- Exception Handling

## Outcome
Successfully implemented an Employee Registration System using JSP, Servlets, JDBC, and MySQL.