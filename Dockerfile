FROM eclipse-temurin:17-jdk-alpine as build

WORKDIR /DemoProject-0.0.1

COPY pom.xml ./
COPY src ./src

RUN apk add --no-cache maven && mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=build /DemoProject-0.0.1/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
