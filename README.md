Employee Management Website
A user-friendly web application for managing employees, offering features like login authentication, adding, updating, deleting, and editing employee records.

Features
User Authentication:
Secure login system for administrators and authorized personnel.
Employee Management:
Add Employee: Create new employee records with essential details such as name, position, and contact information.
Edit Employee: Update existing employee information.
Delete Employee: Remove employee records from the database.
View Employee List: Display all employee data in a structured and searchable format.

Technologies Used
Frontend:
HTML5, CSS3, JavaScript, Bootstrap
Backend:
Spring Boot (Java)
Database:
MySQL
Authentication:
Spring Security

Setup Instructions
1.Clone the Repository:
git clone https://github.com/yourusername/Employee-Management.git
cd Employee-Management

2.Configure the Database:
Open application.properties in the project directory.
Update the database credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/employee-directory
spring.datasource.username=your_username
spring.datasource.password=your_password

3.Run the Application:
Build and run the Spring Boot application:
./mvnw spring-boot:run

4.Access the Website:
Open your browser and navigate to:
http://localhost:8080
