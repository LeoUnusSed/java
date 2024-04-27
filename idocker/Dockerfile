FROM ubuntu:latest
LABEL authors="leore"
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]