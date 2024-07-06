# Retail Discount Calculator

This is a Spring Boot application that calculates the net price on a retail bill considering various discount rules. It includes unit tests and code coverage reports using SonarQube.

## Prerequisites

- Java 17
- Maven 3.6.3 or later
- SonarQube (installed and running locally or on a remote server)
- SonarScanner (installed and configured)

## Getting Started

### Clone the Repository
```bash
git clone https://github.com/your-username/retail-discount-calculator.git
cd retail-discount-calculator
```

### Build the Project
To build the project, run the following Maven command:
```bash
mvn clean install
```

### Run the Application
To run the Spring Boot application, use the following Maven command:
```bash
mvn spring-boot:run
```
The application will start on http://localhost:8080

### Run Tests
To execute the unit tests, run:
```bash
mvn test
```

### Run static code analysis
You can run the Checkstyle analysis with the following Maven command:
```bash
mvn checkstyle:check
```

### Generate Test Coverage Report
To generate a test coverage report, you can use the JaCoCo Maven plugin. The report will be generated in the target/site/jacoco directory.
```bash
mvn clean test jacoco:report
```
Open the index.html file in the target/site/jacoco directory to view the coverage report.