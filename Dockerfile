# Use Maven with JDK 21 to build the application
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app
COPY . .

# Run Maven clean and package, skipping tests
RUN mvn clean package -DskipTests

# Use a lightweight JDK 21 image to run the app
FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "-Dserver.port=8080", "app.jar"]
