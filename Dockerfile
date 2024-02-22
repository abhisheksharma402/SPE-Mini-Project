FROM openjdk:17
MAINTAINER abhishek
COPY target/calculator-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","/app.jar"]
