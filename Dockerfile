# Use Java 21 image
FROM eclipse-temurin:21-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file from target folder to the container
COPY target/student-0.0.1-SNAPSHOT.jar app.jar

# Expose port (match your Spring Boot app port)
EXPOSE 8081

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
