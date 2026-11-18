# Practical 1: Handling HTTP Requests Using Java Servlets

## Aim

To develop a web application using Java Servlets to handle HTTP requests, accept user details through an HTML form, and display the submitted details on the browser.

## Technologies Used

- Java
- Jakarta Servlet API
- HTML
- Apache Tomcat 10.1
- Eclipse IDE

## Description

This practical demonstrates how to handle HTTP requests using Java Servlets.

A user registration form is created using HTML to collect personal information such as Name and Age.

When the user submits the form, an HTTP POST request is sent to the `PersonalServlet`. The servlet retrieves the submitted information using the `request.getParameter()` method and displays the details in the browser using `PrintWriter`.

## Application Flow

```text
Personal.html
     |
     | User enters Name and Age
     |
     v
Submit Form
     |
     | HTTP POST Request
     |
     v
PersonalServlet
     |
     | Retrieve form data
     | using getParameter()
     |
     v
Generate HTTP Response
     |
     v
Display Personal Details
```

## Concepts Used

| Method / Concept | Purpose |
|---|---|
| HTTP Request | Sends user data to the servlet |
| HTTP Response | Sends output back to the browser |
| `doPost()` | Handles HTTP POST requests |
| `request.getParameter()` | Retrieves submitted form data |
| `Integer.parseInt()` | Converts age from String to int |
| `response.setContentType()` | Sets the response content type |
| `response.getWriter()` | Obtains a PrintWriter |
| `PrintWriter` | Displays output in the browser |

## Project Structure

```text
Practical_1_Advanced_Java/
│
├── src/
│   └── com/HandlingRequest/
│       └── PersonalServlet.java
│
├── Personal.html
├── .classpath
└── .project
```

*Note: The exact location of HTML files depends on the Eclipse project structure.*

## How to Run the Project

1. Open Eclipse IDE.
2. Import the project into the workspace.
3. Configure Apache Tomcat 10.1 server.
4. Run the project on the Tomcat server.
5. Open the Personal Details HTML page in a web browser.
6. Enter your Name and Age.
7. Click the Submit button.
8. View the submitted personal details in the browser.

## Expected Output

After submitting the form, the browser displays the entered information.

**Example:**

```text
Personal Details

Name: Atharva
Age: 21
```

## Learning Outcomes

- Understood the basics of HTTP requests and responses.
- Learned how to handle HTTP POST requests using Java Servlets.
- Learned to retrieve HTML form data using `request.getParameter()`.
- Understood the use of `PrintWriter` to generate browser output.
- Gained practical experience in developing Java web applications.

---

**Experiment:** 01  
**Subject:** Advanced Java  
**Author:** Atharva Ghorpade