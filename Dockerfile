# Stage 1: Build the application using Maven
FROM maven:3.8.5-eclipse-temurin-17 AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the application and skip tests
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the port on which the service will run
EXPOSE 5454

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
