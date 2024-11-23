FROM openjdk:latest

WORKDIR /app

COPY target/image-gallery-0.0.1-SNAPSHOT.jar imagegallery.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","imagegallery.jar"]