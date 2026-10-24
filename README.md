# Room Reservation App

## Overview

The **Room Reservation App** is a Java-based web application designed to support room management and reservation workflows. It provides a foundation for managing rooms, handling reservation requests, and organizing access to reservation-related functionality.

The project uses Spring Boot and is organized into multiple service modules, separating responsibilities such as room management, reservation management, configuration, and request routing.

## Features

- **Room Management:** Manage room-related information and operations.
- **Room Reservations:** Support reservation-related workflows.
- **User Registration:** Includes a signup page and user-related functionality.
- **Reservation Access:** Separate service modules for reservation-related access.
- **Configuration Service:** Dedicated module for application configuration.
- **Request Routing:** An edge service intended to handle communication with application services.
- **Overlap Engine:** A separate module for reservation overlap-related logic.
- **Database Support:** The demo application can run with an in-memory H2 database.
- **Web Interface:** HTML templates provide the user-facing interface.

## Technologies Used

- Java 17
- Spring Boot 3
- Maven
- H2 Database
- HTML and Thymeleaf templates
- Git and GitHub

## Project Structure

The project contains the following modules:

```text
Project2-Team5/
└── room-reservation-sprint2/
    ├── config-service/
    ├── edge-service/
    ├── event-processor/
    ├── overlap-engine/
    ├── reservation-access/
    ├── reservation-manager/
    ├── room-access/
    ├── room-manager/
    └── demo/
```

Each module has a specific responsibility within the overall application. The `demo` module contains the web application that can be launched independently for local testing.

## Prerequisites

Before running the application, install:

1. **Java JDK 17** or a compatible Java 17 installation.
2. **Git** to clone the repository.
3. A terminal such as macOS Terminal, or an IDE such as IntelliJ IDEA.

The demo module includes a Maven Wrapper, so a separate Maven installation is not required to run it.

Verify your Java installation:

```bash
java -version
```

The output should indicate Java 17.

## Getting Started

### 1. Clone the repository

Replace `YOUR_USERNAME` with your GitHub username and use your repository's actual URL.

```bash
git clone https://github.com/YOUR_USERNAME/Room-Reservation-App.git
```

### 2. Navigate to the project

```bash
cd Room-Reservation-App/room-reservation-sprint2
```

### 3. Run the demo application

Navigate to the `demo` module:

```bash
cd demo
```

Start the application using the Maven Wrapper:

```bash
./mvnw spring-boot:run
```

On macOS or Linux, if the wrapper does not have execute permission, run:

```bash
chmod +x mvnw
./mvnw spring-boot:run
```

Wait for the application startup message in the terminal.

### 4. Open the application

Once the application starts, open your browser and visit:

**http://localhost:8081**

The demo application uses port `8081` and can run with the H2 in-memory database profile.

### 5. Access the H2 database console

If the H2 console is enabled, visit:

**http://localhost:8081/h2-console**

Use the JDBC URL and any database settings configured in the application's configuration files. The default H2 connection details may depend on the active configuration.

## Running Tests

To run the tests for an individual module, navigate to its directory and execute Maven.

For example, to test `room-manager`:

```bash
cd room-reservation-sprint2/room-manager
mvn test
```

To test the `demo` module using its Maven Wrapper:

```bash
cd room-reservation-sprint2/demo
./mvnw test
```

Repeat the process for other modules that contain a Maven `pom.xml` file.

**Note:** A successful build does not necessarily mean that every feature has automated test coverage.

## Running the Other Services

The repository also contains separate modules for configuration, routing, room management, reservation management, access control, event processing, and overlap handling.

To investigate or start an individual service:

1. Open its directory.
2. Check its `pom.xml` and application configuration.
3. Review the configured port, database settings, and service dependencies.
4. Start it using the module's documented run command.

For a Spring Boot module with the necessary Maven configuration, the command is typically:

```bash
mvn spring-boot:run
```

The full multi-service application may require multiple services to be running and correctly configured. The exact startup order, ports, and dependencies should be verified from the individual module configurations.

## Troubleshooting

### Java version issues

Check the installed Java version:

```bash
java -version
```

Install or select Java 17 if the project fails because of an incompatible Java version.

### Maven command fails

Make sure you are in a module directory containing a `pom.xml` file. The `./mvnw` command is available in the `demo` module.

### Port 8081 is already in use

Stop the other application using port `8081`, or configure the demo application to use a different port.

### Application starts but a feature does not work

Check the terminal logs, active Spring profile, database configuration, and whether any required dependent services are running.


## Author
Susan Noorzai
