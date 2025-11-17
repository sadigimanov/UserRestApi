# User Management Service

A lightweight and clean **User Management REST API** built with **Spring Boot 3.5**, **Java 21**, **PostgreSQL**, **MapStruct**, and **OpenAPI**.  
The service supports full CRUD operations on users and is deployed on **Railway**.

---

## Swagger Documentation

**Swagger UI:**  
https://userrestapi-production.up.railway.app/swagger-ui/index.html

---

## Features

- Full CRUD operations for managing users  
- DTO validation using Jakarta Bean Validation  
- DTO ↔ Entity mapping with MapStruct  
- Auto-generated API documentation via Springdoc OpenAPI  
- PostgreSQL database support  
- Docker image generation using Google Jib  

---

## Technologies Used

- Java 21  
- Spring Boot 3.5.x  
  - Spring Web  
  - Spring Validation  
  - Spring Data JPA  
- MapStruct 1.6.3  
- Lombok  
- PostgreSQL  
- springdoc-openapi 2.8.14  
- Maven  
- Google Jib

---

## Project Structure

```text
src/main/java/dev/sadiq/user_management
│
├── controller
│   └── UserController.java
│
├── dto
│   ├── request
│   │   ├── CreateUserDto.java
│   │   └── UpdateUserDto.java
│   └── response
│       └── UserDto.java
│
├── entity
│   └── User.java
│
├── mapper
│   └── UserMapper.java
│
├── repository
│   └── UserRepository.java
│
├── service
│   ├── abstraction
│   │   └── UserService.java
│   └── handler
│       └── UserServiceImpl.java
│
└── OpenApiConfig.java
Getting Started (Local Development)
1. Create PostgreSQL Database
sql
Copy code
CREATE DATABASE user_management;
2. Configure application.yml
yaml
Copy code
spring:
  application:
    name: user-management

  datasource:
    url: jdbc:postgresql://localhost:5432/user_management
    username: postgres
    password: postgres
    driver-class-name: org.postgresql.Driver

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

server:
  port: 8080
3. Run the Application
bash
Copy code
mvn spring-boot:run
Application will start at:

arduino
Copy code
http://localhost:8080
Swagger documentation:

bash
Copy code
http://localhost:8080/swagger-ui/index.html
API Endpoints
Base Path: /user

Get All Users
GET /user

Get User by ID
GET /user/{id}

Create User
POST /user
Body: CreateUserDto

Update User
PUT /user/{id}
Body: UpdateUserDto

Delete User
DELETE /user/{id}
