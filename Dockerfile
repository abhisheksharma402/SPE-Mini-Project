FROM openjdk:17
MAINTAINER abhishek
COPY target/calculator-1.0-SNAPSHOT.jar app.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-1.0-SNAPSHOT.jar", "org.example.Main"]
