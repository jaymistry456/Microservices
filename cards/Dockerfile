FROM eclipse-temurin:25-jre

LABEL "org.opencontainers.image.authors"="jaymistry181027"

WORKDIR /app

ARG JAR_FILE="build/libs/*.jar"
COPY ${JAR_FILE} app.jar

EXPOSE 9000

CMD ["java", "-jar", "app.jar"]