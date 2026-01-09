FROM eclipse-temurin:25-jre

LABEL "org.opencontainers.image.authors"="jaymistry181027"

WORKDIR /app

RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

ARG JAR_FILE="build/libs/*.jar"
COPY ${JAR_FILE} app.jar

EXPOSE 9010

CMD ["java", "-jar", "app.jar"]