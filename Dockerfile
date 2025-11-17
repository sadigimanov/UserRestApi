# ====== Build stage ======
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

COPY . .

# Fix mvnw permission issue
RUN chmod +x mvnw

# Build project
RUN ./mvnw clean package -DskipTests

# ====== Run stage ======
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
