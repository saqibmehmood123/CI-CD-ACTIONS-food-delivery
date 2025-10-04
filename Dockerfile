FROM openjdk:21-jdk-slim
RUN useradd -m -u 1000 spring
USER spring

WORKDIR /app
# Copy the built JAR file (you need to build it first with Maven)
COPY target/*.jar app.jar

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]

