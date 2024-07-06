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

## SonarQube
After installing SonarQube and SonarScanner and adding sonar plugin to pom.

### Run SonarQube Analysis
```bash
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=Retail-Discount-Calculator \
  -Dsonar.projectName='Retail Discount Calculator' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=squ_2e1dcd886a6f6ce68133f7d11e0b12fa39dea366
```
Check screenshot in root folder with name "SonarCubeResult.png" to preview the result.