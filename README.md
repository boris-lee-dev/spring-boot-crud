# Spring Boot CRUD Application

A user management CRUD web application migrated from Spring MVC to Spring Boot, built with Spring Data JPA, Thymeleaf, Jakarta Bean Validation, and MySQL.

## Tech Stack

- **Java** (project target compatibility: Java 17)
- **Spring Boot** (embedded Tomcat, auto-configuration, Spring Web)
- **Spring Data JPA / Hibernate** (`JpaRepository` data access layer)
- **Thymeleaf** (server-side HTML templates and forms)
- **Jakarta Validation** (`@NotBlank`, `@Size`, `@Email`)
- **MySQL** (relational database)
- **Maven** (build and dependency management)

## Features & Endpoints

- `GET /users` — view all users
- `GET /users/new` — display the create user form
- `POST /users` — create a new user with field validation
- `GET /users/{id}/edit` — display the edit user form
- `PATCH /users/{id}` — update an existing user
- `DELETE /users/{id}` — delete a user

## Setup and Running

1. **Create a MySQL database** (default database name in configuration: `crud_app_db`).
2. **Configure database and MVC settings** in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.datasource.url=jdbc:mysql://localhost:3306/crud_app_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
   spring.datasource.username=root
   spring.datasource.password=YOUR_PASSWORD

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.mvc.hiddenmethod.filter.enabled=true