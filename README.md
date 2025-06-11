# 4.1.-SpringFrameworkB_N2
This project is a simple Spring Boot application that demonstrates how to use REST controllers with path and request parameters.

## Features
/salute?name=YourName\
This method will respond to GET requests.
Returns a greeting using the name query parameter (default value: UNKNOWN) via @RequestParam.
It returns, for example, Hello, name, you're executing a Gradle project.

/salute2/{name}\
This method will also respond to GET request.
Returns a greeting using the name as a PathVariable. The parameter name will be optional.
It returns, for example, Hello, name, you're executing a Gradle project.

## Requirements
- Java 17+
- Gradle
- IntelliJ

## Links
- https://www.baeldung.com/spring-request-param
- https://www.baeldung.com/spring-optional-path-variables
