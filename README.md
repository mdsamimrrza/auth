# 🔒 Auth Service

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.0-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Build](https://img.shields.io/badge/build-passing-brightgreen.svg)]()

A modern authentication microservice built with **Spring Boot** and **Java 17**. Easily plug in user registration, login, and secure JWT-based authentication to your apps.

---

## 🚀 Features

- **JWT Authentication**: Secure, stateless sessions for your API.
- **Role-Based Access Control**: Assign roles and permissions to users.
- **RESTful API**: Clean, production-ready endpoints.
- **MySQL & Hibernate**: Robust data layer with JPA and Hibernate.
- **Spring Security**: Battle-tested security integration.
- **Easy Customization**: Built with extensibility in mind.

---

## 📦 Project Structure

```
auth/
├── src/
│   └── main/
│       ├── java/
│       └── resources/
├── pom.xml
└── README.md
```

---

## ⚡️ Quickstart

1. **Clone the repository**
    ```bash
    git clone https://github.com/mdsamimrrza/auth.git
    cd auth
    ```

2. **Configure MySQL**
   - Create a database (e.g., `auth_db`)
   - Set your DB credentials in `src/main/resources/application.properties`:
     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/auth_db
     spring.datasource.username=youruser
     spring.datasource.password=yourpassword
     ```

3. **Run the application**
    ```bash
    mvn spring-boot:run
    ```

---

## 🛠️ Example Usage

- **Register User**
    ```http
    POST /api/auth/register
    Content-Type: application/json

    {
      "username": "alice",
      "password": "securepassword"
    }
    ```

- **Login**
    ```http
    POST /api/auth/login
    Content-Type: application/json

    {
      "username": "alice",
      "password": "securepassword"
    }
    ```
    Response: `{ "token": "<JWT token>" }`

- **Access Protected Endpoint**
    ```http
    GET /api/user/me
    Authorization: Bearer <JWT token>
    ```

---

## 🤝 Contributing

Pull requests and issues are welcome! If you have ideas to improve security, add OAuth, or support other databases, open an issue or submit a PR.

---

> Created with ❤️ by [mdsamimrrza](https://github.com/mdsamimrrza)
