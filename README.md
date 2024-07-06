# Parking API

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white"/>
  <img src="http://img.shields.io/static/v1?label=TESTS&message=%3E100&color=GREEN&style=for-the-badge"/>
  <img src="http://img.shields.io/static/v1?label=STATUS&message=IN%20DEVELOPMENT&color=RED&style=for-the-badge"/>
</p>

## Project Status: 🔧 In Development

### Description

This API was developed to test my knowledge of back-end development and assist me in practicing during my studies in Java and Spring Boot. It is not perfect, but I am constantly evolving and developing. I welcome tips and improvements to the code or different ways I could have developed it.

The purpose of this API is to control a parking lot, with the functionalities listed below.

### ⚙️ Features

The Parking API has the following functionalities:

- Registration of establishments.
- Registration of vehicles.
- Control of vehicle entry and exit.

### 📚 Documentation

This API has documentation with its routes, but to access it, you need to start the application as it does not yet have an online link. After starting the application, simply access the following link to view the documentation:

[Swagger Docs](http://localhost:8080/swagger-ui.html) - **http://localhost:8080/swagger-ui.html**

### 📝 Table of Contents

- [Getting Started](#-getting-started)
- [How to Run](#how-to-run)
- [Development](#-development)
- [Authors](#authors)

## 🚀 Getting Started

First, you need to clone the project to your machine. To do this, open Git in any terminal and run the following command:

```sh
$ git clone https://github.com/henrique-leme/backend-test-java.git
```

### 📋 Prerequisites

To run and install the project, you need to have installed:

- Java 8
- PostgreSQL
- Insomnia or Postman
- Git
- IDE of your choice (I recommend IntelliJ or VS Code)

### 🔧 Installation

With the prerequisites met, you will open the project in your IDE.

- In the case of VS Code, it is recommended that you have the Java environment configured. I recommend following the steps in the video below until 5:20 minutes, after which you can open the project in VS Code normally:

  [Java Environment Setup](https://www.youtube.com/watch?v=K2OD-3NBE6s&ab_channel=HélioKamakawa)

- To open the project in IntelliJ, it will automatically detect that it is a Maven project and will configure the dependencies. If you encounter any problems or difficulties, consult the links below:

  [Import Project or Module Wizard](https://www.jetbrains.com/help/idea/import-project-or-module-wizard.html)
  [Importing a Project](https://www.jetbrains.com/idea/guide/tutorials/working-with-maven/importing-a-project/)

### 🔌 Database Setup

To properly run the project, you need to configure the database according to your environment. To do this, go to the **application.properties** file and change the following lines:

```properties
# Create a PostgreSQL database with the name (api_parking)
spring.datasource.url=jdbc:postgresql://localhost:5432/api_parking

# Replace (your_username) with your database username or use the project's default username (postgres)
spring.datasource.username=your_username

# Replace (your_password) with your database password or use the project's default password (postgres)
spring.datasource.password=your_password
```

## ⚙️ How to Run

After configuring and starting your database, navigate to the **RestapiApplication** file to run the project:

```sh
restapi/src/main/java/com/parking/restapi/RestapiApplication.java
```

### 🛠 How to Test Endpoints

To test the endpoints and routes, you can import the configurations from the repository directory and test the requests in Insomnia or Postman (Insomnia is recommended).

- [Json Model]()
- [Har Model]()

## 📦 Development

To implement this API in a live system, simply connect it to a database and use the API endpoints.

### 🛠️ Built With

The following tools were used to develop this project:

- [IntelliJ IDEA](https://www.jetbrains.com/idea/) - The development environment
- [Maven](https://maven.apache.org/) - Dependency Management
- [Spring Boot](https://spring.io/projects/spring-boot) - The framework used
- [PostgreSQL](https://www.postgresql.org) - The database used

### 📌 Version

This project is in its first version and is under constant development. If you find any bugs, report them to the project developer.

## ✒️ Authors

Below are the authors of the project, Henrique who developed it and Rodrigo who instructed the development by providing feedback for improvements.

- **Henrique Leme de Brito** - _Developer_ - [GitHub](https://github.com/henrique-leme)
- **Rodrigo Rodrigues** - _Project Leader_
