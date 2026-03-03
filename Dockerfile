FROM maven:3.9.4-eclipse-temurin-17 AS builder
LABEL authors="eemelham"
WORKDIR /app
COPY pom.xml .

COPY . /app

RUN mvn package
CMD ["java", "-jar", "TemperatureConverter-1.0-SNAPSHOT.jar"]