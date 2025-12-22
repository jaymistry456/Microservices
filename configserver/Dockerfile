FROM eclipse-temurin:24-jre

LABEL "org.opencontainers.image.authors"="jaymistry181027"

WORKDIR /app

ARG JAR_FILE="build/libs/*.jar"
COPY ${JAR_FILE} app.jar

EXPOSE 8071

CMD ["java", "-jar", "app.jar"]