FROM openjdk:17
ADD target/books-crud-0.0.1-SNAPSHOT.jar bookscrud.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/bookscrud.jar"]