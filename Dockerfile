FROM gradle:8.14-jdk17-alpine as DEPS
WORKDIR /app

copy build.gradle gradlew gradlew.bat settings.gradle  ./
RUN gradle dependencies

FROM gradle:8.14-jdk17-alpine as BUILDER

WORKDIR /app
COPY --from=DEPS app/ ./
COPY src ./src

RUN gradle bootJar --no-daemon -x test


FROM openjdk:17-alpine AS RUNNER

ENV SERVER_PORT=8080

ARG JAVA_FILE_NAME=build/libs/*.jar

COPY --from=BUILDER /app/${JAVA_FILE_NAME}  app.jar

EXPOSE ${SERVER_PORT}

ENTRYPOINT ["java", "-jar", "app.jar"]