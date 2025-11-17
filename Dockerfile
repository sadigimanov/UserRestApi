FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/user-management-0.0.1-SNAPSHOT.jar user-management-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]
