# Spring Boot User CRUD Application

## 📌 Overview
Developed a backend RESTful web application using Spring Boot to manage user data efficiently. The application provides APIs to perform CRUD operations and follows a layered architecture for better scalability and maintainability.

## 🚀 Features
- Implemented REST APIs for user management
- Performed CRUD operations(create, Read, Update, Delete)
- Integrated MySQL database using spring Data JPA
- Implemented exception handling for bettr error management
- Tested APIs using Postman

## 🧠 My Contribution
-Designed and implemented backend architecture
- Developed controller,service, and repository layers
- Integrated database and handled data persistence
- Tested and debugged APIs using Postman

## 🛠️ Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs
- Maven

## 📂 Project Structure
- Controller Layer – Handles HTTP requests
- Service Layer – Contains business logic
- Repository Layer – Interacts with database
- Entity/Model – Represents user data

## 🔗 API Endpoints

| Method | Endpoint        | Description            |
|--------|---------------|------------------------|
| POST   | /users        | Create new user        |
| GET    | /users        | Get all users          |
| GET    | /users/{id}   | Get user by ID         |
| PUT    | /users/{id}   | Update user            |
| DELETE | /users/{id}   | Delete user            |

## ⚙️ How to Run
1. Import project into IntelliJ/Eclipse
2. Configure database in `application.properties`
3. Run the Spring Boot application
4. Use Postman to test APIs
   
## 📊 Future Improvements
- Add validation
- Implement security (Spring Security)
- Add frontend UI

## 👩‍💻 Author
Sreeja Reddy
