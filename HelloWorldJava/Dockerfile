FROM eclipse-temurin:24-jdk-alpine

FROM eclipse-temurin:24-jdk-alpine

WORKDIR /app

COPY out/production ./out
COPY lib ./lib

CMD ["java", "-cp", "out:lib/*", "com.Main"]
