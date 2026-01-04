FROM eclipse-temurin:24-jre

WORKDIR /app

LABEL "org.opencontainers.image.authors"="jaymistry181027"

ARG JAR_FILE="build/libs/*.jar"
COPY ${JAR_FILE} app.jar

EXPOSE 8070

CMD ["java", "-jar", "app.jar"]