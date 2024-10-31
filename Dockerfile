# Use OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY build/libs/remainigFitness-0.0.1-SNAPSHOT.jar /app/app1.jar

# Expose port 8083 (or the port your app uses)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app1.jar"]
