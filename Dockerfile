FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/app-0.1.jar app-0.1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app-0.1.jar"]
#FROM maven:3.5-jdk-8-alpine
#WORKDIR /app
#COPY / /app/
#ENTRYPOINT ["mvn", "clean", "install","spring-boot:run"]