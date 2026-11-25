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
2. **Set the database password via environment variable** (`SPRING_DATASOURCE_PASSWORD`). Do not store real passwords in version control.

   PowerShell:
   ```powershell
   $env:SPRING_DATASOURCE_PASSWORD='your_mysql_password'
   ```

   Linux / macOS:
   ```bash
   export SPRING_DATASOURCE_PASSWORD='your_mysql_password'
   ```

3. **Run the application** from the project root directory:
   ```bash
   mvn spring-boot:run
   ```
4. **Open the application** in your browser at:
   ```text
   http://localhost:8080/users
   ```