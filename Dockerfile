FROM openjdk:18-alpine
COPY target/minimum-image.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]