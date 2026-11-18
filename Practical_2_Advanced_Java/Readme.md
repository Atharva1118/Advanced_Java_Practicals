# Practical 2: User Session Management System Using HttpSession

## Aim
To develop a User Session Management System using the `HttpSession` API in Java Servlets to maintain user information across multiple web pages.

## Technologies Used
- Java
- Jakarta Servlet API
- HTML
- Apache Tomcat 10.1
- Eclipse IDE

## Description
This practical demonstrates session management in Java web applications using the `HttpSession` interface.

A user registration form is divided into three different pages. The information entered by the user is stored in an HTTP session and maintained while navigating between these pages.

### Registration Process

1. **Personal Details**
   - Name
   - Age

2. **Contact Details**
   - Email Address
   - Mobile Number

3. **Educational Details**
   - College Name
   - Branch

After completing all three forms, the application retrieves the stored session attributes and displays the complete student information on the final page.

## Concepts Used

| Method / Concept | Purpose |
|---|---|
| `request.getParameter()` | Retrieves form data |
| `request.getSession()` | Creates or retrieves an HTTP session |
| `session.setAttribute()` | Stores data in the session |
| `session.getAttribute()` | Retrieves stored session data |
| `response.sendRedirect()` | Redirects the user to another page |
| `session.invalidate()` | Invalidates the session |

## Application Flow

```text
Personal.html
     |
     v
PersonalServlet
     |
     | Store Name and Age
     v
Contact.html
     |
     v
ContactServlet
     |
     | Store Email and Phone
     v
Education.html
     |
     v
EducationServlet
     |
     | Store College and Branch
     | Retrieve all session data
     v
Display Complete Student Details
```

## Project Structure

```text
Practical_2_Advanced_Java/
│
├── src/
│   └── com/session/
│       ├── PersonalServlet.java
│       ├── ContactServlet.java
│       └── EducationServlet.java
│
├── Personal.html
├── Contact.html
├── Education.html
│
└── README.md
```

*Note: The exact location of HTML files may vary depending on the Eclipse project structure.*

## How to Run the Project

1. Open Eclipse IDE.
2. Import the project into the workspace.
3. Configure Apache Tomcat 10.1 server.
4. Run the project on the server.
5. Open the Personal Details page in a web browser.
6. Enter personal, contact and educational details.
7. Submit each form to proceed to the next page.
8. View the complete student information on the final page.

## Expected Output

The application displays the complete student details entered through the three registration forms:

- Name
- Age
- Email
- Mobile Number
- College Name
- Branch

## Learning Outcomes

- Understood the concept of session management in Java Servlets.
- Learned how to create and retrieve an HTTP session.
- Learned to store and retrieve session attributes.
- Understood how to transfer data across multiple web pages.
- Gained practical experience in developing Java web applications.

---

**Experiment:** 02  
**Subject:** Advanced Java  
**Author:** Atharva Ghorpade
