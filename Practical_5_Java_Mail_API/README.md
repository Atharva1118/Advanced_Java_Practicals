# Email Sending Using JavaMail API

## Aim
To develop a Java web application that sends emails using the JavaMail API and SMTP configuration.

## Technologies Used
- Java
- Java Servlets
- HTML
- JavaMail API 1.6.2
- Java Activation Framework 1.1.1
- Apache Tomcat 10.1

## Features
- Accepts receiver email address.
- Accepts email subject.
- Accepts message content.
- Sends emails using the JavaMail API.
- Displays success or failure response.

## Project Structure
```text
Email_Sending/
├── src/
│   └── com/lcwd/
│       └── EmailSending.java
├── WebContent/
│   ├── index.html
│   └── WEB-INF/
│       └── lib/
│           ├── javax.mail-1.6.2.jar
│           └── activation-1.1.1.jar
└── README.md
```

## Dependencies
- JavaMail API 1.6.2
- Java Activation Framework 1.1.1

## SMTP Configuration
The application uses SMTP server properties to establish an email connection.

Required configuration includes:
- SMTP Host
- SMTP Port
- SMTP Authentication
- SSL/TLS settings

## How to Run
1. Import the project into Eclipse IDE.
2. Add the required JAR files to the project.
3. Configure the SMTP settings.
4. Set the email credentials securely using environment variables.
5. Run the project on Apache Tomcat Server.
6. Open the email sending form in your browser.
7. Enter the receiver address, subject, and message.
8. Click the Send button.

## Security Note
- Never store email passwords or App Passwords directly in source code.
- Never upload credentials to GitHub.
- Use environment variables to manage sensitive information.

## Expected Output
Displays **Email Sent Successfully!** when the email is sent successfully.

## Author
Atharva Ghorpade
