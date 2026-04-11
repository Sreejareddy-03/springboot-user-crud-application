# Spring Boot User CRUD Application

## 📌 Overview
This project is a RESTful web application built using Spring Boot that performs CRUD (Create, Read, Update, Delete) operations on user data.

## 🚀 Features
- Create new user
- Retrieve all users
- Retrieve user by ID
- Update existing user
- Delete user

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
Sreeja Gogireddy
