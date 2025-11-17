User Management Service

A simple, clean User Management REST API built with Spring Boot 3.5, Java 21, PostgreSQL, MapStruct, and OpenAPI documentation.
The service supports full CRUD operations and is deployed on Railway.

Swagger UI:
https://userrestapi-production.up.railway.app/swagger-ui/index.html

Features

Create, retrieve, update, delete users

Validation with Jakarta Bean Validation

DTO mapping with MapStruct

API documentation with OpenAPI (springdoc)

PostgreSQL integration

Docker image build support using Google Jib

Technologies Used

Java 21

Spring Boot 3.5.x

Spring Web

Spring Validation

Spring Data JPA

PostgreSQL

MapStruct 1.6.3

Lombok

springdoc-openapi 2.8.14

Maven

Jib (for building Docker images)

Project Structure
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

Build & Run Locally
1. Configure PostgreSQL

Create a database:

CREATE DATABASE user_management;

2. Update application.yml (development)
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

3. Run the project
mvn spring-boot:run


App will run at:

http://localhost:8080


Swagger:

http://localhost:8080/swagger-ui/index.html

API Endpoints

Base URL: /user

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
