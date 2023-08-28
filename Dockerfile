FROM amazoncorretto:17-alpine-jdk
VOLUME /customer-service
RUN mkdir microservices
WORKDIR microservices
COPY target/customer-service-0.0.1-SNAPSHOT.jar customer-service.jar
ENTRYPOINT ["java","-jar","customer-service.jar"]
EXPOSE 8088